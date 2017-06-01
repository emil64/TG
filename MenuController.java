package application;

import java.io.IOException;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXProgressBar;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class MenuController implements Initializable{

    @FXML
    private ImageView avatar;

    @FXML
    private Label user;

    @FXML
    private Label solved;

    @FXML
    private Label smecherie;

    @FXML
    private JFXProgressBar progress;

    @FXML
    private JFXButton settings;

    @FXML
    private JFXButton teorie;

    @FXML
    private JFXButton editor;

    @FXML
    private JFXButton iesire;

    @FXML
    private JFXButton probleme;
    
    @Override
	public void initialize(java.net.URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		//Image img = new Image("http://www.shunvmall.com/data/out/206/47905223-simple-images.png");
		//avatar.setImage(img);
		new Thread(){
			
			public void run(){
				Image img;
				if(User.getAvatar() == null){
						img = new Image("https://cdn2.iconfinder.com/data/icons/user/539/login_user_password_username.png");
				}
				else{
					img = new Image(User.getAvatar());
				}
				avatar.setImage(img);
			}
		}.start();
		user.setText("User: " + User.getUser());
		solved.setText("Probleme rezolvate: " + User.getProblemsSolved());
		progress.setProgress((double)((double) User.getProblemsSolved())/(double)(170));
		smecherie.setText("Coeficient de smecherie: " + User.getSmecherie());
		
	}
    
   
    public void exitClicked() {
    	System.exit(0);
    }


    public void graphEditorClicked() throws IOException {
    	Runtime.getRuntime().exec("java -jar algo_v0.1.jar");
    }


    public void problemeClicked() throws IOException {
    	Parent root;
    	root = FXMLLoader.load(getClass().getResource("Content.fxml"));
		Scene scene = new Scene(root);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
    }

    public void settingsClicked() throws IOException {
    	Parent root;
    	root = FXMLLoader.load(getClass().getResource("Settings.fxml"));
		Scene scene = new Scene(root);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
    	
    }

    public void teorieClicked() throws IOException {
    	Web teorie = new Web("http://www.infoarena.ro/arhiva-educationala");
    }

}

