package yourcad;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import yourcad.DBConexao.*;
import yourcad.PesqClienteController.*;

/**
 * FXML Controller class
 *
 * @author mateu
 */
public class Form_CadClienteController implements Initializable {

//    public Form_CadClienteController(MenuBar menuBar_TelaInicial, MenuItem menuItem_CadCliente, MenuItem menuItem_CadConta, MenuItem menuItem_CadConcessionaria, AnchorPane ancPane_TelaInicio, TextField txtFld_NomeCliente, TextField txtFld_ApelidoCliente, TextField txtFld_DocCliente, TextField txtFld_CepCliente, TextField txtFld_NumEndCliente, TextField txtFld_ComplEndCliente, TextField txtFld_EndCliente, TextField txtFld_CidadeEndCliente, TextField txtFld_UfEndCliente, Button btn_CadCliente, Button btn_NovoEstabelecimento, Button btn_NovoInstalacao, Button btn_LimparCliente, MenuItem menuItem_PesqCliente, MenuItem menuItem_PesqConta, MenuItem menuItem_PesqConcessionaria) {
//        this.menuBar_TelaInicial = menuBar_TelaInicial;
//        this.menuItem_CadCliente = menuItem_CadCliente;
//        this.menuItem_CadConta = menuItem_CadConta;
//        this.menuItem_CadConcessionaria = menuItem_CadConcessionaria;
//        this.ancPane_TelaInicio = ancPane_TelaInicio;
//        this.txtFld_NomeCliente = txtFld_NomeCliente;
//        this.txtFld_ApelidoCliente = txtFld_ApelidoCliente;
//        this.txtFld_DocCliente = txtFld_DocCliente;
//        this.txtFld_CepCliente = txtFld_CepCliente;
//        this.txtFld_NumEndCliente = txtFld_NumEndCliente;
//        this.txtFld_ComplEndCliente = txtFld_ComplEndCliente;
//        this.txtFld_EndCliente = txtFld_EndCliente;
//        this.txtFld_CidadeEndCliente = txtFld_CidadeEndCliente;
//        this.txtFld_UfEndCliente = txtFld_UfEndCliente;
//        this.btn_CadCliente = btn_CadCliente;
//        this.btn_NovoEstabelecimento = btn_NovoEstabelecimento;
//        this.btn_NovoInstalacao = btn_NovoInstalacao;
//        this.btn_LimparCliente = btn_LimparCliente;
//        this.menuItem_PesqCliente = menuItem_PesqCliente;
//        this.menuItem_PesqConta = menuItem_PesqConta;
//        this.menuItem_PesqConcessionaria = menuItem_PesqConcessionaria;
//    }

    @FXML
    private MenuBar menuBar_TelaInicial;
    @FXML
    private MenuItem menuItem_CadCliente;
    @FXML
    private MenuItem menuItem_CadConta;
    @FXML
    private MenuItem menuItem_CadConcessionaria;
    @FXML
    private AnchorPane ancPane_TelaInicio;
    @FXML
    private TextField txtFld_NomeCliente;
//    private TextField txtFld_ApelidoCliente;
    @FXML
    private TextField txtFld_DocCliente;
//    private TextField txtFld_CepCliente;
//    private TextField txtFld_NumEndCliente;
//    private TextField txtFld_ComplEndCliente;
//    private TextField txtFld_EndCliente;
//    private TextField txtFld_CidadeEndCliente;
//    private TextField txtFld_UfEndCliente;
    @FXML
    private Button btn_CadCliente;
    @FXML
    private Button btn_NovoEstabelecimento;
    @FXML
    private Button btn_NovoInstalacao;
    @FXML
    private Button btn_LimparCliente;
    @FXML
    private MenuItem menuItem_PesqCliente;
    @FXML
    private MenuItem menuItem_PesqConta;
    @FXML
    private MenuItem menuItem_PesqConcessionaria;

    Form_CadClienteController(String string, String string0, String string1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
        // INICIO MENU BAR //
    // FUNÇÃO PARA ABRIR TELA A PARTIR DE MENU BAR 
    @FXML
    public void gotoCliente(ActionEvent event) throws IOException{ 
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("Form_CadCliente.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) menuBar_TelaInicial.getScene().getWindow();  
        app_stage.hide();
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }

    @FXML
    private void gotoConta(ActionEvent event) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("Form_CadConta.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) menuBar_TelaInicial.getScene().getWindow();  
        app_stage.hide();
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }

    @FXML
    private void gotoConcessionaria(ActionEvent event) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("Form_CadConcessionaria.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) menuBar_TelaInicial.getScene().getWindow();  
        app_stage.hide();
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }
    
    @FXML
    private void gotoPesqCliente(ActionEvent event) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("PesqCliente.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) menuBar_TelaInicial.getScene().getWindow();  
        app_stage.hide();
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }
    
    @FXML
    private void gotoPesqConta(ActionEvent event) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("PesqConta.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) menuBar_TelaInicial.getScene().getWindow();  
        app_stage.hide();
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }
    
    @FXML
    private void gotoPesqConcessionaria(ActionEvent event) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("PesqConcessionaria.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) menuBar_TelaInicial.getScene().getWindow();  
        app_stage.hide();
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }    
    
    // ---------- FIM MENU BAR ------------ ///

    @FXML
    private void insertCliente(ActionEvent event) throws Exception {
        String NomeCliente;
        String DocumentoCliente;
        
        NomeCliente = txtFld_NomeCliente.getText();
        DocumentoCliente = txtFld_DocCliente.getText();
        
        Connection conn = null;
        DBConexao c = new DBConexao();
        conn = DBConexao.abrirConexao();
        Statement stm = conn.createStatement();
        String query;
        query = "INSERT INTO cliente(cliente_nome,\n" +
                "cliente_documento) VALUES "
                + "('"+ NomeCliente +"','"
                + DocumentoCliente +"');";
        
//        System.out.println(query);  // TESTE DE FUNCIONAMENTO
        stm.executeUpdate(query);
        System.out.println("Dados Cadastrados com sucesso!!!");
    }
    
    

}
