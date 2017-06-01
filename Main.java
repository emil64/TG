package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	

	static Stage stage;
	
	public static Stage getStage(){
		return stage;
	}
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		
		Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
		stage = primaryStage;
		/*RegisterController rg = new RegisterController();
		rg.verify("Emil64");*/
		  
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
