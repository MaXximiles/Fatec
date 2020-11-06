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
public class ClassProfissional 
{
    String profissional_nome;
    String profissional_profissao;
    String profissional_salario;
    String profissional_areaAtuacao;
    String profissional_cargo;

    public String getProfissional_nome() { return profissional_nome;}

    public void setProfissional_nome(String profissional_nome) { this.profissional_nome = profissional_nome;}

    public String getProfissional_profissao() { return profissional_profissao;}

    public void setProfissional_profissao(String profissional_profissao) { this.profissional_profissao = profissional_profissao;}

    public String getProfissional_salario() { return profissional_salario;}

    public void setProfissional_salario(String profissional_salario) { this.profissional_salario = profissional_salario;}

    public String getProfissional_areaAtuacao() { return profissional_areaAtuacao;}

    public void setProfissional_areaAtuacao(String profissional_areaAtuacao) { this.profissional_areaAtuacao = profissional_areaAtuacao; }

    public String getProfissional_cargo() { return profissional_cargo;}

    public void setProfissional_cargo(String profissional_cargo) { this.profissional_cargo = profissional_cargo;}

    public ClassProfissional(String profissional_nome, String profissional_profissao, String profissional_salario, String profissional_areaAtuacao, String profissional_cargo) 
    {
        this.profissional_nome = profissional_nome;
        this.profissional_profissao = profissional_profissao;
        this.profissional_salario = profissional_salario;
        this.profissional_areaAtuacao = profissional_areaAtuacao;
        this.profissional_cargo = profissional_cargo;
    }
    
    
}
