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
    private String tpnaemp; // empresa pos 38 a 40
    private String documento; // pos 41 a 49 - size 9
//    dprivate String serie; //serie  / pos 47-48 - size 1
//    private String parcela; // pos 48 - size 2
    private int tpnabco; //identificacao do titulo pos 71-82 - size 12
    private int tpnaocor; // id ocorrencia pos 109 - size 2
    private LocalDate tpnadpag; // data ocorrenci no banco / pos 111 - size 6 DDMMAA
    private LocalDate tpnavenc; // data vencimento / pos 147-152 - size 6 DDMMAA
    private Double valorTitulo; // valor do titulo / pos 153-165 - size 13
    private Double tpandsp; // despesa cobranca para codigo ocorrencia / pos 176-188 - size 13 
    private Double tpnaodsp; // outras despesas / pos 189-201 - size 13
    private Double tpnaabat; // valor abatimento / pos 228-240 - size 13
    private Double tpnavalo; // valor pago/ pos 254-266 - size 13
    private Double tpnajuro; // juros de mora / pos 267-279 - size 13
    private LocalDate tpnadcrd; //data do credito / pos 296 - size 6 DDMMAA
    private int tpnamotv; // motivo da rejeicao / pos 319 a 328 - size 10

    /**
     *
     * @param documento  documento
     * @param tpnaemp codigo empresa
     * @param idbanco codigo do banco
     * @param tpnaocor  id ocorrencia no banco
     * @param tpnadpag  data ocorrencia no banco
     * @param tpnavenc  data vencimento
     * @param valorTitulo  valor do titulo
     * @param tpandsp  valor despesa para codigo de ocorrencia
     * @param tpnaodsp  outras despesas
     * @param tpnaabat  valor abatimento
     * @param tpnavalo  valor pago
     * @param tpnajuro juros de mora
     * @param tpnadcrd  data de credito
     * @param tpnamotv  motivo rejeicao
     */
    public CNABDetalhe(String documento,String tpnaemp ,int idbanco, int tpnaocor, LocalDate tpnadpag, LocalDate tpnavenc, Double valorTitulo, Double tpandsp, Double tpnaodsp, Double tpnaabat, Double tpnavalo, Double tpnajuro, LocalDate tpnadcrd, int tpnamotv) {
        this.documento = documento;
        this.tpnaemp = tpnaemp;
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

    /**
     * ID ocorrencia.
     *
     * @return
     */
    public int getTpnaocor() {
        return tpnaocor;
    }

    /**
     * ID ocorrencia.
     *
     * @param tpnaocor
     */
    public void setTpnaocor(int tpnaocor) {
        this.tpnaocor = tpnaocor;
    }

    /**
     * Data ocorrencia no banco
     *
     * @return DDMMAA
     */
    public LocalDate getTpnadpag() {
        return tpnadpag;
    }

    /**
     * Data pagamento.
     *
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
     *
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

    /**
     * Set valor do titulo
     *
     * @param valorTitulo
     */
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

    public int getTpnamotv() {
        return tpnamotv;
    }

    public void setTpnamotv(int tpnamotv) {
        this.tpnamotv = tpnamotv;
    }

    public String generateDetalhe() {

        StringBuilder detalhe = new StringBuilder();

        // pos 1 ID_REGISTRO
        detalhe.append(CNABUtils.preencherCampo(ID_REGISTRO, 1, 'D', '0', 'N'));
        // 01- CPF / 02-CNPJ pos 2 a 3
        detalhe.append(CNABUtils.preencherCampo(TIPO_INSCRICAO, 2, 'D', '0', 'N'));

        // ZEROS 4 a 40
        detalhe.append(CNABUtils.preencherCampo("0", 37, 'E', '0', 'S'));
        // documento pos 41 a 49 - size 9
        detalhe.append(CNABUtils.preencherCampo(documento, 9, 'D', ' ', 'S'));

        // branco 50 a 63
        detalhe.append(CNABUtils.preencherCampo(" ", 13, 'E', ' ', 'S'));

        // zeros 64 A 70
        detalhe.append(CNABUtils.preencherCampo(0, 8, 'E', '0', 'S'));

        // id do banco 71 a 73
        detalhe.append(CNABUtils.preencherCampo(tpnabco, 3, 'D', '0', 'N'));
        
        detalhe.append(CNABUtils.preencherCampo(valorTitulo, 9, 'D', '0', 'N'));

        // zeros 83 a 92 - size 10 - uso do banco
        detalhe.append(CNABUtils.preencherCampo(0, 10, 'E', '0', 'S'));
        
        
        // zeros 93 a 104 - size 12
         detalhe.append(CNABUtils.preencherCampo("0", 12, 'E', '0', 'S'));
        
        
        // branco 105 - size 1
        detalhe.append(CNABUtils.preencherCampo(" ", 1, 'E', ' ', 'S'));

        // zero pos 106 - a 108
        detalhe.append(CNABUtils.preencherCampo("0", 1, 'E', '0', 'S'));

        // id ocorrencia pos 109 110 - size 2 
        detalhe.append(CNABUtils.preencherCampo(tpnaocor, 2, 'D', '0', 'N'));

        // data ocorrenci no banco / pos 111 a 116 - size 6 DDMMAA
        detalhe.append(CNABUtils.preencherCampo(tpnadpag, 6, 'E', ' ', 'D'));

        // documento pos 117 a 126
        detalhe.append(CNABUtils.preencherCampo(documento, 9, 'E', '0', 'S'));

        // branco pos 127 - size 1
        detalhe.append(CNABUtils.preencherCampo(" ", 1, 'E', ' ', 'S'));

        // data vencimento / pos 147-152 - size 6 DDMMAA
        detalhe.append(CNABUtils.preencherCampo(tpnavenc, 6, 'E', ' ', 'D'));

        // valor do titulo / pos 153-165 - size 13
        detalhe.append(CNABUtils.preencherCampo(valorTitulo, 13, 'D', ' ', 'N'));

        // branco pos 166 a 175
        detalhe.append(CNABUtils.preencherCampo(" ", 9, 'E', ' ', 'S'));

        // despesa cobranca para codigo ocorrencia / pos 176-188 - size 13 
        detalhe.append(CNABUtils.preencherCampo(tpandsp, 13, 'D', '0', 'N'));

        // outras despesas / pos 189-201 - size 13
        detalhe.append(CNABUtils.preencherCampo(tpnaodsp, 13, 'D', '0', 'N'));

        // branco pos 202 a 227
        detalhe.append(CNABUtils.preencherCampo(" ", 25, 'E', ' ', 'S'));

        // valor abatimento / pos 228-240 - size 13
        detalhe.append(CNABUtils.preencherCampo(tpnaabat, 12, 'D', '0', 'N'));

        // branco pos 241 a 253
        detalhe.append(CNABUtils.preencherCampo(" ", 36, 'E', ' ', 'S'));

        // valor pago/ pos 254-266 - size 13
        detalhe.append(CNABUtils.preencherCampo(tpnavalo, 13, 'D', '0', 'N'));

        // juros de mora / pos 267-279 - size 13
        detalhe.append(CNABUtils.preencherCampo(tpnajuro, 13, 'D', '0', 'N'));

        // branco 280 a 295
        detalhe.append(CNABUtils.preencherCampo(" ", 15, 'E', ' ', 'S'));

        //data do credito / pos 296 a 301 - size 6 DDMMAA
        detalhe.append(CNABUtils.preencherCampo(tpnadcrd, 6, 'E', ' ', 'D'));

        // branco 302 a 318
        detalhe.append(CNABUtils.preencherCampo(" ", 16, 'E', ' ', 'S'));
        // motivo da rejeicao / pos 319 a 328 - size 10
        detalhe.append(CNABUtils.preencherCampo(tpnamotv, 10, 'D', '0', 'N'));
        return detalhe.toString();
    }

    @Override
    public String toString() {
        return "CNABDetalhe{" + "documento=" + documento + ", tpnabco=" + tpnabco + ", tpnaocor=" + tpnaocor + ", tpnadpag=" + tpnadpag + ", tpnavenc=" + tpnavenc + ", valorTitulo=" + valorTitulo + ", tpandsp=" + tpandsp + ", tpnaodsp=" + tpnaodsp + ", tpnaabat=" + tpnaabat + ", tpnavalo=" + tpnavalo + ", tpnajuro=" + tpnajuro + ", tpnadcrd=" + tpnadcrd + ", tpnamotv=" + tpnamotv + '}';
    }

}
