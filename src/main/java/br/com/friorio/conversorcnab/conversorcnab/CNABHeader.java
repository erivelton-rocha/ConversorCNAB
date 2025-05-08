package br.com.friorio.conversorcnab.conversorcnab;

import br.com.friorio.conversorcnab.utils.CNABUtils;

public class CNABHeader {

    public static final int ID_REGRITRO = 0; // POS 1 A 1 - LEN(1)
    public static final int ID_REGISTRO_RETORNO = 2;  // POS 2 A 2 - LEN(1)
    public static final String LRETORNO = "RETORNO"; //pos 3 a 9 - len(7)
    public static final int ID_SERVICO = 1; // pos 10 a 11 - len(2)
    public static final String LSERVICO = "COBRANCA"; // pos 12 a 26 - len(15)
    public static final Integer BANCO = 237; // POS 77 a 79 - len(3)
    public static final Integer SEQ_REGISTRO = 1;

    public static String generateHeader() {
        StringBuilder header = new StringBuilder();

        // identificacao do registro
        // 1 a 1 - 1
        header.append(CNABUtils.preencherCampo(ID_REGRITRO, 1, 'D', '0', 'N'));

        // identificacao do arquivo retorno
        // 2 a 2 -1
        header.append(CNABUtils.preencherCampo(ID_REGISTRO_RETORNO, 1, 'D', '0', 'N'));

        // literal retorno
        // 3 a 9 - 7: RETORNO
        header.append(CNABUtils.preencherCampo(LRETORNO, 7, 'E', ' ', 'S'));

        // codigo do serviço
        // 10 a 11 - 2: 01
        header.append(CNABUtils.preencherCampo(ID_SERVICO, 2, 'D', '0', 'N'));

        // Literal serviço = COBRANCA
        // 12 a 26 = 15
        header.append(CNABUtils.preencherCampo(LSERVICO, 15, 'E', ' ', 'S'));

        // codigo da empresa
        // zeros 27 a 46 - 20
        header.append(CNABUtils.preencherCampo(0, 20, 'D', '0', 'N'));
        
        // razao social da empresa
        // 47 a 76 - 30 espaços
        header.append(CNABUtils.preencherCampo(" ", 30, 'E', ' ', 'S'));
        
        // CODIGO DO BANCO
        header.append(CNABUtils.preencherCampo(BANCO, 3, 'D', '0', 'N'));

        // espaços 386 a 394 - 9
        header.append(CNABUtils.preencherCampo(" ", 9, 'E', ' ', 'S'));

        // sequencial do registro 000001
        // 395 a 400
        header.append(CNABUtils.preencherCampo(SEQ_REGISTRO, 10, 'D', '0', 'N'));
        return header.toString();
    }

}
