/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.friorio.conversorcnab.conversorcnab;

import br.com.friorio.conversorcnab.utils.CNABUtils;

/**
 *
 * @author ANALISTA_SISTEMA
 */
public class CNABTrailer {

    private final int ID_REGISTRO = 9; // pos 1 a 1 size(1)
    private final int ID_RETORNO = 2; // pos 2 a 2 size(1)
    private final int ID_TIPO_REGISTRO = 1; // pos 3 a 4 size(2)
    private final int COD_BANCO = 237; // pos 5 a 7 size(3)
    private int qtdTitulosCobranca; // pos 18 a 25 size(8)
    private Double valorTotalCobranca; //pos 26 a 39 size(14)

    /*
    * Construtor
    * @param quantidade de titulos.
    * @param valor total da(s) cobrança(s).
    */
    public CNABTrailer(int qtdTitulosCobranca, Double valorTotalCobranca) {
        this.qtdTitulosCobranca = qtdTitulosCobranca;
        this.valorTotalCobranca = valorTotalCobranca;
    }

      
    
    // Getters and setters
    public int getQtdTitulosCobranca() {
        return qtdTitulosCobranca;
    }

    public void setQtdTitulosCobranca(int qtdTitulosCobranca) {
        this.qtdTitulosCobranca = qtdTitulosCobranca;
    }

    public Double getValorTotalCobranca() {
        return valorTotalCobranca;
    }

    public void setValorTotalCobranca(Double valorTotalCobranca) {
        this.valorTotalCobranca = valorTotalCobranca;
    }

    /*
    * Gera uma linha trailer no layout cnab.
    *
    * @return A linha de trailer formatada com string.
    */
    public String generateTrailer() {
        StringBuilder trailer = new StringBuilder();

        trailer.append(CNABUtils.preencherCampo(ID_REGISTRO, 1, 'D', '0', 'N'));
        trailer.append(CNABUtils.preencherCampo(ID_RETORNO, 1, 'D', '0', 'N'));
        trailer.append(CNABUtils.preencherCampo(ID_TIPO_REGISTRO, 1, 'D', '0', 'N'));
        trailer.append(CNABUtils.preencherCampo(COD_BANCO, 3, 'D', '0', 'N'));
        // branco 10 posicoes
        trailer.append(CNABUtils.preencherCampo(' ', 10, 'E', ' ', 'S'));
        trailer.append(CNABUtils.preencherCampo(this.qtdTitulosCobranca, 8, 'D', '0', 'N'));
        trailer.append(CNABUtils.preencherCampo(this.valorTotalCobranca, 14, 'D', '0', 'N'));

        return trailer.toString();
    }

}
