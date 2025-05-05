/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.friorio.conversorcnab.conversorcnab;

import java.time.LocalDate;

/**
 *
 * @author ANALISTA_SISTEMA
 */
public class CNABDetalhe {
    public static final Integer ID_REGISTRO = 1;
    public static final Integer TIPO_INSCRICAO = 2; // 01- CPF / 02-CNPJ
    private String documento; // pos 41 - size 6
    private String serie; //serie  / pos 47-48 - size 1
    private String parcela; // pos 48 - size 2
    private String idbanco; //identificacao do titulo pos 71-82 - size 12
    private String tpnaocor; // pos 109 - size 2
    private LocalDate tpnadpag; // data ocorrenci no banco / pos 111 - size 6 DDMMAA
    private LocalDate tpnavenc; // data vencimento / pos 147-152 - size 6 DDMMAA
    private Double valorTitulo; // valor do titulo / pos 153-165 - size 13
    private Double tpandsp; // despesa cobranca para codigo ocorrencia / pos 176-188 - size 13 
    private Double tpnaodsp; // outras despesas / pos 189-201 - size 13
    private Double tpnaabat; // valor abatimento / pos 228-240 - size 13
    private Double tpnavalo; // valor pago/ pos 254-266 - size 13
    private Double tpnajuro; // juros de mora / pos 267-279 - size 13
    private LocalDate tpnadcrd; // / pos 296 - size 6 DDMMAA
    private String tpnamotv; // motivo da rejeicao / pos 319 - size 2

    public CNABDetalhe(String documento, String serie, String parcela, String idbanco, String tpnaocor, LocalDate tpnadpag, LocalDate tpnavenc, Double valorTitulo, Double tpandsp, Double tpnaodsp, Double tpnaabat, Double tpnavalo, Double tpnajuro, LocalDate tpnadcrd, String tpnamotv) {
        this.documento = documento;
        this.serie = serie;
        this.parcela = parcela;
        this.idbanco = idbanco;
        this.tpnaocor = tpnaocor;
        this.tpnadpag = tpnadpag;
        this.tpnavenc = tpnavenc;
        this.valorTitulo = valorTitulo;
        this.tpandsp = tpandsp;
        this.tpnaodsp = tpnaodsp;
        this.tpnaabat = tpnaabat;
        this.tpnavalo = tpnavalo;
        this.tpnajuro = tpnajuro;
        this.tpnadcrd = tpnadcrd;
        this.tpnamotv = tpnamotv;
    }

    public CNABDetalhe() {
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getParcela() {
        return parcela;
    }

    public void setParcela(String parcela) {
        this.parcela = parcela;
    }

    public String getIdbanco() {
        return idbanco;
    }

    public void setIdbanco(String idbanco) {
        this.idbanco = idbanco;
    }

    public String getTpnaocor() {
        return tpnaocor;
    }

    public void setTpnaocor(String tpnaocor) {
        this.tpnaocor = tpnaocor;
    }

    public LocalDate getTpnadpag() {
        return tpnadpag;
    }

    public void setTpnadpag(LocalDate tpnadpag) {
        this.tpnadpag = tpnadpag;
    }

    public LocalDate getTpnavenc() {
        return tpnavenc;
    }

    public void setTpnavenc(LocalDate tpnavenc) {
        this.tpnavenc = tpnavenc;
    }

    public Double getValorTitulo() {
        return valorTitulo;
    }

    public void setValorTitulo(Double valorTitulo) {
        this.valorTitulo = valorTitulo;
    }

    public Double getTpandsp() {
        return tpandsp;
    }

    public void setTpandsp(Double tpandsp) {
        this.tpandsp = tpandsp;
    }

    public Double getTpnaodsp() {
        return tpnaodsp;
    }

    public void setTpnaodsp(Double tpnaodsp) {
        this.tpnaodsp = tpnaodsp;
    }

    public Double getTpnaabat() {
        return tpnaabat;
    }

    public void setTpnaabat(Double tpnaabat) {
        this.tpnaabat = tpnaabat;
    }

    public Double getTpnavalo() {
        return tpnavalo;
    }

    public void setTpnavalo(Double tpnavalo) {
        this.tpnavalo = tpnavalo;
    }

    public Double getTpnajuro() {
        return tpnajuro;
    }

    public void setTpnajuro(Double tpnajuro) {
        this.tpnajuro = tpnajuro;
    }

    public LocalDate getTpnadcrd() {
        return tpnadcrd;
    }

    public void setTpnadcrd(LocalDate tpnadcrd) {
        this.tpnadcrd = tpnadcrd;
    }

    public String getTpnamotv() {
        return tpnamotv;
    }

    public void setTpnamotv(String tpnamotv) {
        this.tpnamotv = tpnamotv;
    }
    
    
    
    
}
