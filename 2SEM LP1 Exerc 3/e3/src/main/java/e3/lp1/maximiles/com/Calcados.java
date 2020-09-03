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
public  class  Calcados
{
    private String tipo;
    private String marca;
    private String modelo;
    private String valor;
    private String cor;
		
	// construtor	
	public Calcados(String tipo, String marca, String modelo, String valor, String cor)
        {
            this.tipo = tipo;
            this.marca = marca;
            this.modelo = modelo;
            this.valor = valor;
            this.cor = cor;
        }
	   
	public  Calcados(){}
	   	   
	// SETTER
	public  void  setTipo(String  tipo){this.tipo = tipo;}
	public  void  setMarca(String  marca){this.marca = marca;}
        public  void  setModelo(String  modelo){this.modelo = modelo;}
        public  void  setValor(String valor){this.valor = valor;}
        public  void  setCor(String cor){this.cor = cor;}
	
	// GET    
	public  String  getTipo(){return tipo;}
        public  String  getMarca(){return marca;}
        public  String  getModelo(){return modelo;}
        public  String  getValor(){return valor;}
        public  String  getCor(){return cor;}
	    	        
	// MetÃ³dos
	public  void  calcar(){System.out.println( "Vou calçar o " + tipo );}
        public  void  comprar(){System.out.println( "Vou comprar..." );}
        public  void  vender(){System.out.println( "Estou vendendo este "+ tipo);}
       
}