package application;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ResourceBundle;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXToggleButton;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class RegisterController implements Initializable{

	@FXML
	private Label status;

	@FXML
	private JFXTextField user;

	@FXML
    private JFXPasswordField pass;

    @FXML
    private JFXPasswordField passConfirm;

    @FXML
    private JFXTextField avatar;

    @FXML
    private Hyperlink link;

    @FXML
    private JFXToggleButton comm;

    @FXML
    private JFXButton finish;

	public void checkPass(){
		
		if(!pass.getText().equals(passConfirm.getText())){
			
			status.setText("Parolele introduse nu corespund!");
			status.setTextFill(Color.RED);
		}
	}
    
	public boolean verify(String username) throws MalformedURLException, IOException{
		
		URL url = new URL("http://www.infoarena.ro/forum/index.php?topic=11015");
		URLConnection con = url.openConnection();
		con.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2");
		InputStream in = con.getInputStream();
		String encoding = con.getContentEncoding();
		encoding = encoding == null ? "UTF-8" : encoding;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		byte[] buf = new byte[8192];
		int len = 0;
		while ((len = in.read(buf)) != -1) {
		    baos.write(buf, 0, len);
		}
		String body = new String(baos.toByteArray(), encoding);
		username = username.toLowerCase();
		body = body.toLowerCase();
		System.out.println(username);
		if(body.contains(username))
        	return true;
		return false;
		
	}
	
	public void checkForum() throws MalformedURLException, IOException{
		
		if(verify(user.getText())){
			finish.setDisable(false);
		}
		else{
			comm.setSelected(false);
		}
	}
	
	public void gataBa(){
		
		if(MySQL.isValid(user.getText(), pass.getText())){
			status.setText("Userul este deja in baza nastra de date!");
			status.setTextFill(Color.RED);
		}
		else{
			MySQL.baga(user.getText(), pass.getText());
			status.setText("Userul a fost inregistrat cu succes!");
			status.setTextFill(Color.GREEN);
		}
	
	}

	public void clickOnLink(){
		
			Web w = new Web("http://www.infoarena.ro/forum/index.php?topic=11015");
		
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		status.setText("");
	}
	
	public void userModified(){
		status.setText("");
		
	}
}
