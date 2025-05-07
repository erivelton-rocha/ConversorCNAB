/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.friorio.conversorcnab.utils;

/**
 *
 * @author ANALISTA_SISTEMA
 */
public class InfoTitulo {
    private String empresa;
    private String numeroBancario;

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getNumeroBancario() {
        return numeroBancario;
    }

    public void setNumeroBancario(String numeroBancario) {
        this.numeroBancario = numeroBancario;
    }

    
    /**
     * Constructor
     * @param empresa
     * @param numeroBancario 
     */
    public InfoTitulo(String empresa, String numeroBancario) {
        this.empresa = empresa;
        this.numeroBancario = numeroBancario;
    }
    
    

}
