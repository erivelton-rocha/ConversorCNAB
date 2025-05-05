
package br.com.friorio.conversorcnab.conversorcnab;
import br.com.friorio.conversorcnab.utils.CNABUtils;

public class CNABHeader {
    
    public static final int ID_REGRITRO = 0; // POS 1 A 1 - LEN(1)
    public static final int ID_REGISTRO_RETORNO = 2;  // POS 2 A 2 - LEN(1)
    public static final String LRETORNO = "RETORNO"; //pos 3 a 9 - len(7)
    public static final int ID_SERVICO = 1; // pos 10 a 11 - len(2)
    public static final String LSERVICO = "COBRANCA"; // pos 12 a 26 - len(15)
    public static final Integer BANCO = 237; // POS 77 a 79 - len(3)
    
    
    public static String generateHeader(){
       StringBuilder header = new StringBuilder();
       
       header.append(CNABUtils.preencherCampo(ID_REGRITRO, 1, 'D', '0', CNABUtils.ETipoValor.NUMBER));
       header.append(CNABUtils.preencherCampo(ID_REGISTRO_RETORNO, 1, 'D', '0', CNABUtils.ETipoValor.NUMBER));
       header.append(CNABUtils.preencherCampo(LRETORNO, 7, 'E', ' ', CNABUtils.ETipoValor.STRING));
       header.append(CNABUtils.preencherCampo(ID_SERVICO, 2, 'D', '0', CNABUtils.ETipoValor.NUMBER));
       header.append(CNABUtils.preencherCampo(LSERVICO,15, 'E', ' ', CNABUtils.ETipoValor.STRING));
       // complemento em branco pos 26 a 77
       header.append(CNABUtils.preencherCampo(" ", 50
               , 'E', ' ', CNABUtils.ETipoValor.STRING));
       header.append(CNABUtils.preencherCampo(BANCO, 3, 'D', '0', CNABUtils.ETipoValor.NUMBER));
      
       return header.toString();
    }
        
}
