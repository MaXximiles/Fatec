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
public  class  Profissionais
{
    private String profissao;
    private String salario;
    private String local_trabalho;
    private String cargo;
    private String escolaridade;
		
	// construtor	
	public Profissionais(String profissao, String salario, String local_trabalho, String cargo, String escolaridade)
        {
            this.profissao = profissao;
            this.salario = salario;
            this.local_trabalho = local_trabalho;
            this.cargo = cargo;
            this.escolaridade = escolaridade;
        }
	   
	public  Profissionais(){}
	   	   
	// SETTER
	public  void  setProfissao(String  profissao){this.profissao = profissao;}
	public  void  setSalario(String  salario){this.salario = salario;}
        public  void  setLocal_trabalho(String  local_trabalho){this.local_trabalho = local_trabalho;}
        public  void  setCargo(String cargo){this.cargo = cargo;}
        public  void  setEscolaridade(String escolaridade){this.escolaridade = escolaridade;}
	
	// GET    
	public  String  getProfissao(){return profissao;}
        public  String  getSalario(){return salario;}
        public  String  getLocal_trabalho(){return local_trabalho;}
        public  String  getCargo(){return cargo;}
        public  String  getEscolaridade(){return escolaridade;}
	    	        
	// MetÃ³dos
	public  void  trabalhar(){System.out.println( "Vou trabalhar hoje" );}
        public  void  faltar(){System.out.println( "Não vou trabalhar hoje" );}
        public  void  folgar(){System.out.println( "Estou de folga hoje!");}
       
}