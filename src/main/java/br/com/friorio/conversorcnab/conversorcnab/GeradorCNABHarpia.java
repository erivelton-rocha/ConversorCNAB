/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.friorio.conversorcnab.conversorcnab;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author ANALISTA_SISTEMA
 */
public class GeradorCNABHarpia implements GeradorCNAB {

    private int qtdTitulos;
    private double valorTitulos;
    private double totalVlrTitulos;
    private double totalEncargos;

    /*
    * @return Quantidade total de titulos
     */
    @Override
    public int getQtdTitulos() {
        return qtdTitulos;
    }

    /*
    * @return Total dos titulos normal até vencimento
     */
    @Override
    public double getValorTitulos() {
        return valorTitulos;
    }

    /**
     * *
     *
     * @return Total valor pago
     */
    @Override
    public double getTotalVlrTitulos() {
        return totalVlrTitulos;
    }

    /*
    * @return Total de Juros.
     */
    @Override
    public double getTotalEncargos() {
        return totalEncargos;
    }

    public GeradorCNABHarpia() {

    }

    @Override
    public void gerarArquivoCNAB(File arquivoExcel, String output, JTable tabela) {

        this.qtdTitulos = 0;
        this.valorTitulos = 0.0;
        this.totalVlrTitulos = 0.0;
        this.totalEncargos = 0.0;

        try (FileInputStream fis = new FileInputStream(arquivoExcel); Workbook wb = new XSSFWorkbook(fis)) {

            Sheet sheet = wb.getSheetAt(0);

            // Tabela
            // Obtenha o modelo da tabela
            // Suponha que você tenha um método para criar o modelo de dados baseado nas linhas do Excel
            DefaultTableModel tableModel = (DefaultTableModel) tabela.getModel();
            tableModel.setRowCount(0); // Limpa a tabela antes de adicionar novos

            // Define novos títulos para as colunas
            String[] novosTitulos = {"Sacado", "Documento", "Vencimento", "Valor", "Encargos", "Valor Pago", "Data Pagamento", "Tipo Liquidação"};
            tableModel.setColumnIdentifiers(novosTitulos);

            // Total de titulos
            this.qtdTitulos = sheet.getLastRowNum();

            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);

                // Verifica se a linha não é nula
                if (row != null) {

                    String sacado = getCellValueAsString(row.getCell(0));
                    String documento = getCellValueAsString(row.getCell(1));
                    LocalDate vencimento = getCellValueAsDate(row.getCell(2));
                    double valor = getCellValueAsDouble(row.getCell(3));
                    // somar os valores de titulos
                    this.valorTitulos += valor;
                    double encargos = getCellValueAsDouble(row.getCell(4));
                    // somar os encargos
                    this.totalEncargos += encargos;
                    double valorPago = valor - encargos;
                    // somar valr pago
                    this.totalVlrTitulos += valorPago;
                    LocalDate dataPagamento = getCellValueAsDate(row.getCell(5));
                    String tipoLiquidacao = getCellValueAsString(row.getCell(6));

                    // Preencher tabela
                    // Adiciona uma nova linha ao modelo da tabela
                    tableModel.addRow(new Object[]{sacado, documento, vencimento, valor, encargos, valorPago, dataPagamento, tipoLiquidacao});
                    // Exemplo: imprimir os valores
                    System.out.println("Sacado: " + sacado + ", Documento: " + documento
                            + ", Vencimento: " + vencimento + ", Valor: " + valor
                            + ", Encargos: " + encargos + ", data Pagamento: " + dataPagamento
                            + ", valor pago: " + valorPago + ", Tipo Liquidação: " + tipoLiquidacao);
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(GeradorCNABHarpia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GeradorCNABHarpia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String getCellValueAsString(Cell cell) {
        if (cell == null || cell.getCellType() == CellType.BLANK) {
            return "";
        } else if (cell.getCellType() == CellType.STRING) {
            return cell.getStringCellValue();
        } else if (cell.getCellType() == CellType.NUMERIC) {
            return Double.toString(cell.getNumericCellValue());
        } else {
            return "";
        }
    }

    private double getCellValueAsDouble(Cell cell) {
        if (cell == null || cell.getCellType() == CellType.BLANK) {
            return 0.0;
        } else if (cell.getCellType() == CellType.NUMERIC) {
            return cell.getNumericCellValue();
        } else if (cell.getCellType() == CellType.STRING) {
            try {
                return Double.parseDouble(cell.getStringCellValue());
            } catch (NumberFormatException e) {
                return 0.0;
            }
        } else {
            return 0.0;
        }
    }

    private LocalDate getCellValueAsDate(Cell cell) {
        if (cell == null || cell.getCellType() == CellType.BLANK) {
            // Retorna uma data padrão caso a célula seja nula ou vazia
            return LocalDate.of(1990, 1, 1);
        }

        try {
            // Verifica se a célula contém uma data
            if (DateUtil.isCellDateFormatted(cell)) {
                // Converte a data do Excel para um java.util.Date
                Date date = cell.getDateCellValue();
                // Converte java.util.Date para LocalDate
                return LocalDate.ofInstant(date.toInstant(), ZoneId.systemDefault());
            } else {
                // Se não for uma data, tenta converter o valor como string para uma data
                String dateString = cell.getStringCellValue();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                return LocalDate.parse(dateString, formatter);
            }
        } catch (DateTimeParseException e) {
            // Se a conversão falhar, retorna a data padrão
            return LocalDate.of(1990, 1, 1);
        } catch (Exception e) {
            // Tratamento de erro genérico caso ocorra algo inesperado
            e.printStackTrace();
            return LocalDate.of(1990, 1, 1);
        }
    }
}
