/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.friorio.conversorcnab.conversorcnab;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author ANALISTA_SISTEMA
 */
public interface GeradorCNAB {
  

    public void gerarArquivoCNAB(File arquivoExcel, String caminhoSaida);
}
