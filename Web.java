package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class Web implements Initializable{

	Scene scene;
	Stage stage = new Stage();
	WebView webView = new WebView();
	WebEngine engine = new WebEngine();
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	public Web(String url){
		engine = webView.getEngine();
		engine.setUserAgent("Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2");
		webView.setPrefHeight(700);
		webView.setPrefWidth(1000);
		HBox root = new HBox(webView);
		scene = new Scene(root);
		stage.setScene(scene);
		engine.load(url);
		stage.show();
	}
	
	
}
