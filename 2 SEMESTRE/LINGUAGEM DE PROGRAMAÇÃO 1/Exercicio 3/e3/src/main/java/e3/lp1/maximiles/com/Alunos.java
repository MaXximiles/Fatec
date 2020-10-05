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
public  class  Alunos
{
    private String nome;
    private String curso;
    private String escola;
    private String polo;
    private String periodo;
		
	// construtor	
	public Alunos(String nome, String curso, String escola, String polo, String periodo)
        {
            this.nome = nome;
            this.curso = curso;
            this.escola = escola;
            this.polo = polo;
            this.periodo = periodo;
        }
	   
	public  Alunos(){}
	   	   
	// SETTER
	public  void  setNome(String  nome){this.nome = nome;}
	public  void  setCurso(String  curso){this.curso = curso;}
        public  void  setEscola(String  escola){this.escola = escola;}
        public  void  setPolo(String polo){this.polo = polo;}
        public  void  setPeriodo(String periodo){this.periodo = periodo;}
	
	// GET    
	public  String  getNome(){return nome;}
        public  String  getCurso(){return curso;}
        public  String  getEscola(){return escola;}
        public  String  getPolo(){return polo;}
        public  String  getPeriodo(){return periodo;}
	    	        
	// MetÃ³dos
	public  void  estudar(){System.out.println( "Vou estudar hoje" );}
        public  void  faltar(){System.out.println( "Não vou estudar hoje" );}
        public  void  aprender(){System.out.println( "Vou aprender hoje!");}
       
}