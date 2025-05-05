/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.friorio.conversorcnab.conversorcnab;

/**
 *
 * @author ANALISTA_SISTEMA
 */
public class FabricaGeradorCNAB {
    public static GeradorCNAB criarGerador(EBanco banco){
        switch(banco){
            case BANCO_HARPIA:
                return new GeradorCNABHarpia();
            default:
                throw new IllegalArgumentException("Banco não suportado:" + banco);
        }
    }
}
