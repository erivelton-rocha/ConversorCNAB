/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.friorio.conversorcnab.conversorcnab;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ANALISTA_SISTEMA
 */
public abstract class GeradorCNABBase implements GeradorCNAB {
    
 protected void salvarArquivo(String caminho, String conteudo) throws IOException {
        try (FileWriter writer = new FileWriter(caminho);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            bufferedWriter.write(conteudo);
        }
    }
    
}
