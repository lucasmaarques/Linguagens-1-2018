/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contatos;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author 16.01203-8
 */
public class FXMLCadastrarController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private Label label1;
    
    @FXML
    private TextField txtNome;
    
    @FXML
    private TextField txtEmail;
        
    @FXML
    private TextField txtTelefone;
    
    private ArrayList<Contato> listadecontatos;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        Contato c1 = new Contato(txtNome.getText());
        c1.setEmail(txtEmail.getText());
        c1.setTelefone(txtTelefone.getText());
        listadecontatos.add(c1);
        label1.setText("Cadastro realizado!");
    }
    
    @FXML
    private void ExibirLista(ActionEvent event) {
        for (Contato contato : listadecontatos) {
            System.out.println("-------------------------------\n" + contato);
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        listadecontatos = new ArrayList<>();
    }    
    
}
