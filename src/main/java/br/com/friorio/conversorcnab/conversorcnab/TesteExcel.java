/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.friorio.conversorcnab.conversorcnab;

import java.io.IOException;


/**
 *
 * @author ANALISTA_SISTEMA
 */
public class TesteExcel {
    
    public static void main(String[] args) throws IOException{
        EBanco banco = EBanco.BANCO_HARPIA;
        
        FabricaGeradorCNAB fabrica = (FabricaGeradorCNAB) FabricaGeradorCNAB.criarGerador(banco);

    }
}
