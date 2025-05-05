/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.friorio.conversorcnab.conversorcnab;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author ANALISTA_SISTEMA
 */
public class GeradorCNABHarpia implements GeradorCNAB {

    public GeradorCNABHarpia() {
    }

    @Override
    public void gerarArquivoCNAB(File arquivoExcel, String output) {

        try (FileInputStream fis = new FileInputStream(arquivoExcel); Workbook wb = new XSSFWorkbook(fis)) {

            Sheet sheet = wb.getSheetAt(0);
            
            String header = CNABHeader.generateHeader();
            
            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);

                // Verifica se a linha não é nula
                if (row != null) {

                    String sacado = getCellValueAsString(row.getCell(0));
                    String documento = getCellValueAsString(row.getCell(1));
                    String vencimento = getCellValueAsString(row.getCell(2));
                    double valor = getCellValueAsDouble(row.getCell(3));
                    double encargos = getCellValueAsDouble(row.getCell(4));
                    String pagamento = getCellValueAsString(row.getCell(5));
                    String tipoLiquidacao = getCellValueAsString(row.getCell(6));

                    // Exemplo: imprimir os valores
                    System.out.println("Sacado: " + sacado + ", Documento: " + documento + 
                                       ", Vencimento: " + vencimento + ", Valor: " + valor +
                                       ", Encargos: " + encargos + ", Pagamento: " + pagamento + 
                                       ", Tipo Liquidação: " + tipoLiquidacao);
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
}
