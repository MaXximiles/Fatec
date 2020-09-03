package e3.lp1.maximiles.com;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author info-chefe
 */
public class Teste 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {       
        // TODO code application logic here
        
        //////////////////Lugares/////////////////////////////////
        
        Lugares[] cidade = new Lugares[3];
        cidade[0] = new Lugares("São José dos Campos", "Brasil", "Tropical", "Ponte Estaiada", 700000);
        cidade[1] = new Lugares("Caçapava", "Brasil", "Tropical", "Nada", 80000);
        cidade[2] = new Lugares("Jacarei", "Brasil", "Tropical", "Nada", 100000);
        
        Pessoas[] pessoa = new Pessoas[3];
        pessoa[0] = new Pessoas("Horacio P Maquetetas","1,80","78kg","23 anos","Masculino");
        pessoa[1] = new Pessoas("Queresvanildo Junqueira","1,67","108kg","47 anos","Masculino");
        pessoa[2] = new Pessoas("Solineia Roberta Parreira","1,68","59kg","21 anos","Feminino");
        
        Alunos[] aluno = new Alunos[3];
        aluno[0] = new Alunos("Geriswaldonilson Robalo Junqueira","Banco de Dados","FATEC","SJC","Noturno");
        aluno[1] = new Alunos("Hermanotéia Jamile","Analise de Sistemas","FATEC","SJC","Manhã");
        aluno[2] = new Alunos("Pascoal Pereira","Mecanico de Aeronaves","FATEC","SJC","Noturno");
        
        Profissionais[] profissional = new Profissionais[3];
        profissional[0] = new Profissionais("Militar","Cabo","Superior Incompleto","Exército","3000");
        profissional[1] = new Profissionais("Enfermeira","Enfermeira Padrão","Superior Completo","Hospital","2800");
        profissional[2] = new Profissionais("Bombeiro","Soldado","Superior Completo","Posto de Bombeiros","3600");
        
        Calcados[] calcado = new Calcados[3];
        calcado[0] = new Calcados("Sapato","Social","Preto","Ferracini","300");
        calcado[1] = new Calcados("Tenis","Corrida","Azul","Nike","650");
        calcado[2] = new Calcados("Sapato","Salto Alto","Vermelho","Vizzano","350");
        
        System.out.println("---------- LUGARES ----------------");
        for(int i=0;i <3; i++)
        {
            System.out.println(i + " Cidade de " + cidade[i].getNome() + ", " + cidade[i].getPais()+ ", de clima " + cidade[i].getClima()+ ", tendo como ponto turistico " + cidade[i].getPonto_Turistico()+ ", com população de " + cidade[i].getPopulacao() + " pessoas.");          
        }
        
        System.out.println("---------- PESSOAS ----------------");
        for(int i=0;i <3; i++)
        {    
            System.out.println(i + " Nome: " + pessoa[i].getNome() + " Idade: " + pessoa[i].getIdade() + " Altura: " + pessoa[i].getAltura() + " Peso:" + pessoa[i].getPeso()+ " Sexo: " + pessoa[i].getSexo());
        }  
        
        System.out.println("---------- ALUNOS ----------------");
        for(int i=0;i <3; i++)
        {   
            System.out.println(i + " Nome: " + aluno[i].getNome() + " Curso: " + aluno[i].getCurso() + " Escola: " + aluno[i].getEscola() + " Polo: " + aluno[i].getPolo() + " Periodo: " + aluno[i].getPeriodo());
        }
        
        System.out.println("---------- PROFISSIONAIS ----------------");
        for(int i=0;i <3; i++)
        {    
            System.out.println(i + " Profissão: " + profissional[i].getProfissao() + " Cargo: " + profissional[i].getCargo() + " Graduação: " + profissional[i].getEscolaridade() + " Local de Trabalho: " + profissional[i].getLocal_trabalho() +" Salário " + profissional[i].getSalario());
        }
        
        System.out.println("---------- CALÇADOS ----------------");
        for(int i=0;i <3; i++)
        {    
            System.out.println(i + " Tipo: " + calcado[i].getTipo() + " Modelo: " +calcado[i].getModelo()+ " Cor: " +calcado[i].getCor()+ " Marca: " +calcado[i].getMarca()+ " Valor: " + calcado[i].getValor());
        }
    }
   
    
}
