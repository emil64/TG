package application;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private JFXTextField username;

    @FXML
    private JFXPasswordField pass;

    @FXML
    private JFXButton login;

    @FXML
    private JFXButton signup;

    @FXML
    private Label status;

    public void LoginClicked() throws IOException{
    	
    	
    	if(MySQL.isValid(username.getText(), pass.getText())){
    		
    		status.setText("login successfull!");
    		status.setTextFill(Color.GREEN);
    		Parent root;
    		User.setUsername(username.getText());
    		//User.init();
			root = FXMLLoader.load(getClass().getResource("menu.fxml"));
			Scene scene = new Scene(root);
			Stage stage = Main.getStage();
			stage.close();
			stage.setScene(scene);
			stage.show();
			
    	}
    	else {
    		
    		status.setText("Error!");
    		status.setTextFill(Color.RED);
    	}
    }
    public void RegisterClicked() throws IOException{
    	
    	Parent root;
    	root = FXMLLoader.load(getClass().getResource("Register.fxml"));
		Scene scene = new Scene(root);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
    	
    }
    
}
