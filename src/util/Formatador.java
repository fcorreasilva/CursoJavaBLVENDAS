/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author fcorr
 */
/**
 * converte a vírgula de uma string
 * @author fcorr
 */

public class Formatador {
    
    public double converterVirgulaParaPontoReturnDouble(String pString) {
        String retorno = new String();
        int tamanhoString = pString.length();
        for(int i = 0; i < tamanhoString; i++) {
            if(pString.charAt(i) == ',') {
                retorno += '.';
            } else {
                retorno += pString.charAt(i);
            }
        }
        
    return Double.parseDouble(retorno);
    }
    
}
