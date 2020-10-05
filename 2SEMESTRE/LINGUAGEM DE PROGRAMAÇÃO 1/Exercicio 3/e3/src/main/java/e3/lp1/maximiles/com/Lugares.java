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
public  class  Lugares 
{
    private String nome;
    private String pais;
    private String clima;
    private String ponto_Turistico;
    private int populacao;
		
	// construtor	
	public Lugares(String nome, String pais, String clima, String ponto_Turistico, int populacao)
        {
            this.nome = nome;
            this.pais = pais;
            this.clima = clima;
            this.ponto_Turistico = ponto_Turistico;
            this.populacao = populacao;
        }
	   
	public  Lugares(){}
	   	   
	// SETTER
	public  void  setNome(String  nome){this.nome = nome;}
	public  void  setPais(String  pais){this.pais = pais;}
        public  void  setClima(String  clima){this.clima = clima;}
        public  void  setPonto_Turistico(String  ponto_Turistico){this.ponto_Turistico = ponto_Turistico;}
        public  void  setPopulacao(int  populacao){this.populacao = populacao;}
	
	// GET    
	public  String  getNome(){return nome;}
        public  String  getPais(){return pais;}
        public  String  getClima(){return clima;}
        public  String  getPonto_Turistico(){return ponto_Turistico;}
        public  int  getPopulacao(){return populacao;}
	    	        
	// MetÃ³dos
	public  void  viajar(){System.out.println( "Partiu viajar para" + nome );}
        public  void  ver_Clima(){System.out.println( "Hoje esta sol !" );}
        public  void  conhecer(){System.out.println( "Vamos conhecer !" + nome );}
       
}