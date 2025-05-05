/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.friorio.conversorcnab.utils;

/**
 *
 * @author ANALISTA_SISTEMA
 */
public class CNABUtils {

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
    public static String preencherCampo(Object valor, int tamanho, char alinhamento, char preenchimento, ETipoValor tipoValor) {
        String valorStr = (valor == null) ? "" : valor.toString();

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
        if (tipoValor == ETipoValor.NUMBER) {
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

        return resultado.toString();
    }
    
    public enum ETipoValor{
    NUMBER,
    STRING;
}
}
