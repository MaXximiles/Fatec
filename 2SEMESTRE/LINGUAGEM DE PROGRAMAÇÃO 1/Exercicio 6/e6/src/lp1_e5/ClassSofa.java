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
public class ClassSofa 
{
    String sofa_modelo;
    String sofa_cor;
    String sofa_tecido;
    String sofa_tamanho;
    String sofa_valor;

    public String getSofa_modelo() { return sofa_modelo;}

    public void setSofa_modelo(String sofa_modelo) { this.sofa_modelo = sofa_modelo;}

    public String getSofa_cor() { return sofa_cor;}

    public void setSofa_cor(String sofa_cor) { this.sofa_cor = sofa_cor;}

    public String getSofa_tecido() { return sofa_tecido;}

    public void setSofa_tecido(String sofa_tecido) { this.sofa_tecido = sofa_tecido;}

    public String getSofa_tamanho() { return sofa_tamanho;}

    public void setSofa_tamanho(String sofa_tamanho) { this.sofa_tamanho = sofa_tamanho;}

    public String getSofa_valor() { return sofa_valor;}

    public void setSofa_valor(String sofa_valor) { this.sofa_valor = sofa_valor; }

    public ClassSofa(String sofa_modelo, String sofa_cor, String sofa_tecido, String sofa_tamanho, String sofa_valor) 
    {
        this.sofa_modelo = sofa_modelo;
        this.sofa_cor = sofa_cor;
        this.sofa_tecido = sofa_tecido;
        this.sofa_tamanho = sofa_tamanho;
        this.sofa_valor = sofa_valor;
    }
    
    
}
