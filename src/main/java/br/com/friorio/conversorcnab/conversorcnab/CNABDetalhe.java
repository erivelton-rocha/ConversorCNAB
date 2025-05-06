/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.friorio.conversorcnab.conversorcnab;

import java.time.LocalDate;
import br.com.friorio.conversorcnab.utils.CNABUtils;
/**
 *
 * @author ANALISTA_SISTEMA
 */
public class CNABDetalhe {
    public static final Integer ID_REGISTRO = 1;
    public static final Integer TIPO_INSCRICAO = 2; // 01- CPF / 02-CNPJ
    private String documento; // pos 41 a 49 - size 9
//    private String serie; //serie  / pos 47-48 - size 1
//    private String parcela; // pos 48 - size 2
    private int tpnabco; //identificacao do titulo pos 71-82 - size 12
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

    public CNABDetalhe(String documento, int idbanco, String tpnaocor, LocalDate tpnadpag, LocalDate tpnavenc, Double valorTitulo, Double tpandsp, Double tpnaodsp, Double tpnaabat, Double tpnavalo, Double tpnajuro, LocalDate tpnadcrd, String tpnamotv) {
        this.documento = documento;
       
        this.tpnabco = idbanco;
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
//
//    public String getSerie() {
//        return serie;
//    }
//
//    public void setSerie(String serie) {
//        this.serie = serie;
//    }
//
//    public String getParcela() {
//        return parcela;
//    }
//
//    public void setParcela(String parcela) {
//        this.parcela = parcela;
//    }

    public int getTpnabco() {
        return tpnabco;
    }

    public void setTpnabco(int tpnabco) {
        this.tpnabco = tpnabco;
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

    /**
     * Data pagamento.
     * @param tpnadpag 
     */
    public void setTpnadpag(LocalDate tpnadpag) {
        this.tpnadpag = tpnadpag;
    }

    /**
     * 
     * @return data vencimento.
     */
    public LocalDate getTpnavenc() {
        return tpnavenc;
    }

    /**
     * Data vencimento.
     * @param tpnavenc 
     */
    public void setTpnavenc(LocalDate tpnavenc) {
        this.tpnavenc = tpnavenc;
    }

    /*
    * @return Valor do titulo.
    */
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
    
    
    public String generateDetalhe(){
        
        StringBuilder detalhe = new StringBuilder();
        
        // pos 1 ID_REGISTRO
        detalhe.append(CNABUtils.preencherCampo(ID_REGISTRO, 1, 'D', '0', 'N'));
        // 01- CPF / 02-CNPJ
        
        // documento pos 41 a 49 - size 9
        
        return null;
    }
    
}
