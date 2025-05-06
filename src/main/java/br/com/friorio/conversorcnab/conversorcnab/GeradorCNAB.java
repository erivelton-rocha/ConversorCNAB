/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.friorio.conversorcnab.conversorcnab;

import java.io.File;
import java.io.IOException;
import javax.swing.JTable;

/**
 *
 * @author ANALISTA_SISTEMA
 */
public interface GeradorCNAB {

    // Getters
    /**
     *
     * @return Quantidade de titulos.
     */
    int getQtdTitulos();

    /**
     * 
     * @return Valor total normal
     */
    double getValorTitulos();

    /**
     *
     * @return Valor Total pago.
     */
    double getTotalVlrTitulos();

    /**
     * 
     * @return Total de mora de juros
     */
    double getTotalEncargos();

    public void gerarArquivoCNAB(File arquivoExcel, String caminhoSaida, JTable tabela);
}
