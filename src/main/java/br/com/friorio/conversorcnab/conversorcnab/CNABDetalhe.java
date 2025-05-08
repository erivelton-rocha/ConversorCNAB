/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.friorio.conversorcnab.conversorcnab;

import java.time.LocalDate;
import br.com.friorio.conversorcnab.utils.CNABUtils;
import org.openxmlformats.schemas.drawingml.x2006.main.STBlipCompression;

/**
 *
 * @author ANALISTA_SISTEMA
 */
public class CNABDetalhe {

    public static final Integer ID_REGISTRO = 1;
    public static final Integer TIPO_INSCRICAO = 2; // 01- CPF / 02-CNPJ
    private String tpnaemp; // empresa pos 38 a 41
    private String documento; // pos 41 a 49 - size 9
//    dprivate String serie; //serie  / pos 47-48 - size 1
//    private String parcela; // pos 48 - size 2
    private String tpnabco; //numero bancario do titulo pos 71-73 - size 3
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
    private int qtdregistros; // quantidade de registros 394 a 400

    /**
     *
     * @param tpnaemp
     * @param documento
     * @param tpnabco
     * @param tpnaocor
     * @param tpnadpag
     * @param tpnavenc
     * @param valorTitulo
     * @param tpandsp
     * @param tpnaodsp
     * @param tpnaabat
     * @param tpnavalo
     * @param tpnajuro
     * @param tpnadcrd
     * @param tpnamotv
     * @param qtdregistros
     */
    public CNABDetalhe(String tpnaemp, String documento, String tpnabco, int tpnaocor, LocalDate tpnadpag, LocalDate tpnavenc, Double valorTitulo, Double tpandsp, Double tpnaodsp, Double tpnaabat, Double tpnavalo, Double tpnajuro, LocalDate tpnadcrd, int tpnamotv, int qtdregistros) {
        this.tpnaemp = tpnaemp;
        this.documento = documento;
        this.tpnabco = tpnabco;
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
        this.qtdregistros = qtdregistros;
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

    public String getTpnabco() {
        return tpnabco;
    }

    public void setTpnabco(String tpnabco) {
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

    public String getTpnaemp() {
        return tpnaemp;
    }

    public void setTpnaemp(String tpnaemp) {
        this.tpnaemp = tpnaemp;
    }

    public int getQtdregistros() {
        return qtdregistros;
    }

    public void setQtdregistros(int qtdregistros) {
        this.qtdregistros = qtdregistros;
    }

    /**
     * Gerar Detalhe de registro
     *
     * @return detalhe
     */
    public String generateDetalhe() {

        StringBuilder detalhe = new StringBuilder();

        // pos 1 ID_REGISTRO 1 - 1
        detalhe.append(CNABUtils.preencherCampo(ID_REGISTRO, 1, 'D', '0', 'N'));

        // 01- CPF / 02-CNPJ pos 2 a 3 -2
        detalhe.append(CNABUtils.preencherCampo(TIPO_INSCRICAO, 2, 'D', '0', 'N'));

        // Zeros
        detalhe.append(CNABUtils.preencherCampo(0, 34, 'D', '0', 'N'));

        // empresa
        detalhe.append(CNABUtils.preencherCampo(tpnaemp, 3, 'D', '0', 'N'));

        // documento 38 A 50
        detalhe.append(CNABUtils.preencherCampo(documento, 9, 'E', '0', 'S'));

        // espaços 50 a 62 - 13
        detalhe.append(CNABUtils.preencherCampo(" ", 13, 'E', ' ', 'S'));

        // zeros 63 a 70 
        detalhe.append(CNABUtils.preencherCampo(0, 8, 'D', '0', 'N'));

        // documento 71 a 82 - 12
        detalhe.append(CNABUtils.preencherCampo(tpnabco, 12, 'E', '0', 'S'));

        // zeros 83 a 104
        detalhe.append(CNABUtils.preencherCampo(0, 22, 'D', '0', 'N'));

        // branco 105 a 105 -1
        detalhe.append(CNABUtils.preencherCampo(" ", 1, 'E', ' ', 'S'));

        // zeros 106 a 107 -2
        detalhe.append(CNABUtils.preencherCampo(0, 2, 'E', '0', 'S'));

        // carteira 108 a 108 - 1        
        detalhe.append(CNABUtils.preencherCampo(0, 1, 'E', '0', 'S'));

        // identificação ocorrencia 109 a 110 - 2
        detalhe.append(CNABUtils.preencherCampo(tpnaocor, 2, 'D', '0', 'N'));

        // data ocorrencia no banco 
        // 111 a 116 - 6
        detalhe.append(CNABUtils.preencherCampo(tpnadpag, 6, 'D', '0', 'D'));

        // identificação do titulo 117 a 126 - 10
        detalhe.append(CNABUtils.preencherCampo(documento, 10, 'E', ' ', 'S'));

     
        // identficação bancaria
        // numero bancario - 127 a 146 - 20
        detalhe.append(CNABUtils.preencherCampo(tpnabco, 20, 'D', '0', 'S'));

        // vencimento do titulo 147 a 152 - 6
        detalhe.append(CNABUtils.preencherCampo(tpnavenc, 6, 'E', '0', 'D'));

        // valor do titulo 
        // 153 A 165 - 13
        detalhe.append(CNABUtils.preencherCampo(valorTitulo, 13, 'D', '0', 'N'));

        // zeros 166 a 168 - 3
        detalhe.append(CNABUtils.preencherCampo(0, 3, 'D', '0', 'N'));

        // agencia cobradora
        //zeros 169 a 173 - 5
          detalhe.append(CNABUtils.preencherCampo(0, 5, 'D', '0', 'N'));
          
        // especie do titulo
        // 174 a 175 - 2
        detalhe.append(CNABUtils.preencherCampo(" ", 2, 'E', ' ', 'S'));
        
        // despesas de cobrança para os codigos de ocorrencia
        // 176 a 188 - 13
        detalhe.append(CNABUtils.preencherCampo(0, 13, 'D', '0', 'N'));
        
        // outras despesas | custo de protesto
        // 189 a 201 - 13
        detalhe.append(CNABUtils.preencherCampo(0, 13, 'D', '0', 'N'));
        
        // juros opereção em atraso
        // 202 a 214 - 13
        detalhe.append(CNABUtils.preencherCampo(0, 13, 'D', '0', 'N'));
        
        // iof devido
        // 215 a 227 - 13
        detalhe.append(CNABUtils.preencherCampo(0, 13, 'D', '0', 'N'));
        
        // abatimento concedido sobre o tituLo
        // 228 a 240 - 13
        detalhe.append(CNABUtils.preencherCampo(0, 13, 'D', '0', 'N'));
        
        // desconto concedido
        // 241 a 253 - 13
        detalhe.append(CNABUtils.preencherCampo(0, 13, 'D', '0', 'N'));
        
        
        // valor pago
        // 254 a 266 - 13
        detalhe.append(CNABUtils.preencherCampo(tpnavalo, 13, 'D', '0', 'N'));
        
        // juros de mora
        // 267 a 279 - 13
        detalhe.append(CNABUtils.preencherCampo(tpnajuro, 13, 'D', '0', 'N'));
        
        // outros creditos
        // 280 a 292 - 13
        detalhe.append(CNABUtils.preencherCampo(0, 13, 'D', '0', 'N'));
        
        // espacços 293 a 294 - 2
        detalhe.append(CNABUtils.preencherCampo(" ", 2, 'E', ' ', 'S'));
         
        // motivo do codigo de ocorrencia 25
        // 295 a 295 - 1: A - Aceito | D - Desprezado
        detalhe.append(CNABUtils.preencherCampo(" ", 1, 'E', ' ', 'S'));
        
        // data do credito
        // 296 a 301 - 6 DDMMAA
        detalhe.append(CNABUtils.preencherCampo(tpnadcrd, 6, 'E', ' ', 'D'));
        
        // espaços 305 a 314 - 10
        detalhe.append(CNABUtils.preencherCampo(" ", 10, 'E', ' ', 'S'));
        
        
        // quando cheque bradesco
        // 315 a 318 - 4
        detalhe.append(CNABUtils.preencherCampo(0, 4, 'D', '0', 'N'));
        /**
         * motivo de rejeições para codigos de ocorrencia das posicoes 109 a 110
         * 319 a 328 - 10
          *
         */
        detalhe.append(CNABUtils.preencherCampo(0, 10, 'D', '0', 'N'));
        
        // espaços 329 a 368 - 40
         detalhe.append(CNABUtils.preencherCampo(" ", 40, 'E', ' ', 'S'));
         
        // numero do cartorio
        // 369 a 370 - 2    
        detalhe.append(CNABUtils.preencherCampo(0, 2, 'D', '0', 'N'));
        
        // numero do protocolo
        // 371 a 380 - 10
        detalhe.append(CNABUtils.preencherCampo(" ", 10, 'E', ' ', 'S'));
        
        // especaços 381 a 394 - 14
         detalhe.append(CNABUtils.preencherCampo(" ", 14, 'E', ' ', 'S'));
        
        // numero sequencial de registro
        // 395 a 400 - 6
        detalhe.append(CNABUtils.preencherCampo(qtdregistros, 6, 'D', '0', 'N'));

        // 
        /**
         * Return
         */
        return detalhe.toString();
    }

    @Override
    public String toString() {
        return "CNABDetalhe{" + "documento=" + documento + ", tpnabco=" + tpnabco + ", tpnaocor=" + tpnaocor + ", tpnadpag=" + tpnadpag + ", tpnavenc=" + tpnavenc + ", valorTitulo=" + valorTitulo + ", tpandsp=" + tpandsp + ", tpnaodsp=" + tpnaodsp + ", tpnaabat=" + tpnaabat + ", tpnavalo=" + tpnavalo + ", tpnajuro=" + tpnajuro + ", tpnadcrd=" + tpnadcrd + ", tpnamotv=" + tpnamotv + '}';
    }

}
