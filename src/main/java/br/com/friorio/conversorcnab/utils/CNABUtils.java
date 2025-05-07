/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.friorio.conversorcnab.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author ANALISTA_SISTEMA
 */
public class CNABUtils {

    public static InfoTitulo info;

    /**
     * Preenche um campo de string de acordo com as especificações CNAB.
     *
     * @param valor O valor a ser inserido.
     * @param tamanho O tamanho total que o campo deve ter.
     * @param alinhamento 'D' para direita, 'E' para esquerda.
     * @param preenchimento Caractere usado para preencher espaços vazios.
     * @param tipoValor 'N' para numérico, 'A' para alfanumérico.
     * @return String formatada conforme as especificações.
     */
    public static String preencherCampo(Object valor, int tamanho, char alinhamento, char preenchimento, char tipoValor) {
        String valorStr;

        // Tratamento especial para LocalDate
        if (valor instanceof LocalDate data) {
            // Para tipoValor 'D', formatamos direto como DDMMAA
            if (tipoValor == 'D') {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyy");
                valorStr = data.format(formatter);
            } else {
                // Caso não seja do tipo 'D', usamos o formato padrão do toString()
                valorStr = valor.toString();
            }
        } else {
            // Se não for LocalDate, mantém o comportamento padrão
            valorStr = (valor == null) ? "" : valor.toString();
        }

        // Trunca o valor se for maior que o tamanho especificado
        if (valorStr.length() > tamanho) {
            valorStr = valorStr.substring(0, tamanho);
        }

        StringBuilder resultado = new StringBuilder();

        // Alinhamento à direita (D) ou à esquerda (E)
        if (alinhamento == 'D') {
            // Preenche à esquerda com o caractere especificado
            for (int i = valorStr.length(); i < tamanho; i++) {
                resultado.append(preenchimento);
            }
            resultado.append(valorStr);
        } else {
            // Alinhamento à esquerda
            resultado.append(valorStr);
            // Preenche à direita com o caractere especificado
            for (int i = valorStr.length(); i < tamanho; i++) {
                resultado.append(preenchimento);
            }
        }

        // Para valores numéricos, garante que só existam dígitos
        switch (tipoValor) {
            case 'N' -> {
                String resultadoStr = resultado.toString();
                StringBuilder apenasNumeros = new StringBuilder();
                for (int i = 0; i < resultadoStr.length(); i++) {
                    char c = resultadoStr.charAt(i);
                    if (Character.isDigit(c) || c == preenchimento) {
                        apenasNumeros.append(c);
                    }
                }
                return apenasNumeros.toString();
            }

            default -> {
                // Para outros tipos de valores, retorna o resultado sem alterações
                return resultado.toString();
            }
        }
    }

    public static InfoTitulo getTituloInfo(String titulo, int codigoBanco) {

        String url = "jdbc:postgresql://10.147.18.2:5432/GIX"; // URL de conexão para PostgreSQL
        String user = "frioriobi";
        String password = "FR5aB2ClHG3i";

        if (titulo == null || titulo.trim().isEmpty()) {
            return null;
        }

    

            try (Connection conn = DriverManager.getConnection(url, user, password)) {
                String query = "SELECT crecempe, crecnbco "
                        + "FROM arqcrec "
                        + "WHERE crecdocu = ? "
                        + "AND crecbanc = ? "
                        + "ORDER BY crecemis DESC "
                        + "LIMIT 1";
            

                try (PreparedStatement stmt = conn.prepareStatement(query)) {
                    stmt.setString(1, titulo);
                    stmt.setInt(2, codigoBanco);

                    try (ResultSet rs = stmt.executeQuery()) {
                        if (rs.next()) {
                            String codigoEmpresa = rs.getString("crecempe");
                            String numeroBancario = rs.getString("crecnbco");
                          

                            info = new InfoTitulo(codigoEmpresa, numeroBancario);
                        }
                    }
                }
            }
        catch (NumberFormatException e) {
//            System.out.println("Erro: O parâmetro 'titulo' não é um número válido.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados ou executar a consulta: " + e.getMessage());
            e.printStackTrace();
        }

        return info;
    }


//    public enum ETipoValor{
//    NUMBER,
//    STRING;
//}
}
