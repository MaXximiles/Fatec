/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e3.lp1.maximiles.com;

/**
 *
 * @author info-chefe
*/
public  class  Pessoas
{
    private String nome;
    private String idade;
    private String peso;
    private String altura;
    private String sexo;
		
	// construtor	
	public Pessoas(String nome, String idade, String peso, String altura, String sexo)
        {
            this.nome = nome;
            this.idade = idade;
            this.peso = peso;
            this.altura = altura;
            this.sexo = sexo;
        }
	   
	public  Pessoas(){}
	   	   
	// SETTER
	public  void  setNome(String  nome){this.nome = nome;}
	public  void  setIdade(String  idade){this.idade = idade;}
        public  void  setPeso(String  peso){this.peso = peso;}
        public  void  setAltura(String  altura){this.altura = altura;}
        public  void  setSexo(String  sexo){this.sexo = sexo;}
	
	// GET    
	public  String  getNome(){return nome;}
        public  String  getIdade(){return idade;}
        public  String  getPeso(){return peso;}
        public  String  getAltura(){return altura;}
        public  String  getSexo(){return sexo;}
	    	        
	// MetÃ³dos
	public  void  andar(){System.out.println( "Estou andando");}
        public  void  pular(){System.out.println( "Vamos pular" );}
        public  void  abaixar(){System.out.println( "Vou me abaixar");}
       
}