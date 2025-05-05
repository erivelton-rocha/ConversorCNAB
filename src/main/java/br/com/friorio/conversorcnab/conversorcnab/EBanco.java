/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package br.com.friorio.conversorcnab.conversorcnab;

/**
 *
 * @author ANALISTA_SISTEMA
 */
public enum EBanco {
    BANCO_HARPIA("Banco AR3/Harpia"),
    BANCO_GARSON("Banco Garson"); 
    
    
    private final String nome;
    
    EBanco(String nome){
        this.nome = nome;
    
    }
    
    @Override
    public String toString(){
        return nome;
    }
    
    
}
