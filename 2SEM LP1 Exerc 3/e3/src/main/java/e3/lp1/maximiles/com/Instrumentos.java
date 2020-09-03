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
public  class  Instrumentos
{
    private String nome;
    private String familia;
    private String marca;
    private String ano_fabrica;
    private String lugar_fabrica;
		
	// construtor	
	public Instrumentos(String nome, String familia, String marca, String ano_fabrica, String lugar_fabrica)
        {
            this.nome = nome;
            this.familia = familia;
            this.ano_fabrica = ano_fabrica;
            this.lugar_fabrica = lugar_fabrica;
            this.marca = marca;
        }
	   
	public  Instrumentos(){}
	   	   
	// SETTER
	public  void  setNome(String  nome){this.nome = nome;}
	public  void  setFamilia(String  familia){this.familia = familia;}
        public  void  setMarca(String  marca){this.marca = marca;}
        public  void  setAno_fabrica(String ano_fabrica){this.ano_fabrica = ano_fabrica;}
        public  void  setLugar_fabrica(String Lugar_fabrica){this.lugar_fabrica = Lugar_fabrica;}
	
	// GET    
	public  String  getNome(){return nome;}
        public  String  getFamilia(){return familia;}
        public  String  getMarca(){return marca;}
        public  String  getAno_fabrica(){return ano_fabrica;}
        public  String  getLugar_fabrica(){return lugar_fabrica;}
	    	        
	// MetÃ³dos
	public  void  tocar(){System.out.println( "Tocando meu instrumento..." );}
        public  void  limpar(){System.out.println( "Limpando meu Instrumento..." );}
        public  void  guardar(){System.out.println( "Guardando meu instrumento");}
       
}