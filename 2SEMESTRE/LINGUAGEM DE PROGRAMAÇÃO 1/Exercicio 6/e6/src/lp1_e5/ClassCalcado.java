/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp1_e5;

/**
 *
 * @author info-chefe
 */
public class ClassCalcado 
{
    String calcado_marca;
    String calcado_modelo;
    String calcado_valor;
    String calcado_tipo;
    String calcado_cor;

    public String getCalcado_marca(){ return calcado_marca;}

    public void setCalcado_marca(String calcado_marca){ this.calcado_marca = calcado_marca;}

    public String getCalcado_modelo(){ return calcado_modelo;}

    public void setCalcado_modelo(String calcado_modelo){ this.calcado_modelo = calcado_modelo;}

    public String getCalcado_valor(){ return calcado_valor;}

    public void setCalcado_valor(String calcado_valor){ this.calcado_valor = calcado_valor;}

    public String getCalcado_tipo(){ return calcado_tipo;}

    public void setCalcado_tipo(String calcado_tipo){ this.calcado_tipo = calcado_tipo;}

    public String getCalcado_cor(){ return calcado_cor;}

    public void setCalcado_cor(String calcado_cor){ this.calcado_cor = calcado_cor;}

    public ClassCalcado(String calcado_marca, String calcado_modelo, String calcado_valor, String calcado_tipo, String calcado_cor) 
    {
        this.calcado_marca = calcado_marca;
        this.calcado_modelo = calcado_modelo;
        this.calcado_valor = calcado_valor;
        this.calcado_tipo = calcado_tipo;
        this.calcado_cor = calcado_cor;
    }
    
    
}
