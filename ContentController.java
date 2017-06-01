package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class ContentController implements Initializable{
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
				
		
	}
	
	public void click(ActionEvent e){
				
		String btn = e.getSource().toString();
		if(btn.contains("BFS")){
			Problems p = new Problems("BFS");
			
		}
		if(btn.contains("Hamilton")){
			Problems p = new Problems("Hamilton");
			
		}
		if(btn.contains("DFS")){
			Problems p = new Problems("DFS");
			
		}
		if(btn.contains("Djikstra")){
			Problems p = new Problems("Dijkstra");
			
		}
		if(btn.contains("LCA")){
			Problems p = new Problems("LCA");
			
		}
		if(btn.contains("2-SAT")){
			Problems p = new Problems("tSAT");
			
		}
		if(btn.contains("Tare")){
			Problems p = new Problems("TareConexe");
			
		}
		if(btn.contains("Bell")){
			Problems p = new Problems("Bell");
			
		}
		if(btn.contains("Flux")){
			Problems p = new Problems("FMDCM");
			
		}
		if(btn.contains("Euler")){
			Problems p = new Problems("Euler");
			
		}
		if(btn.contains("MaxFlow")){
			Problems p = new Problems("MaxFlow");
			
		}
		if(btn.contains("ad-hoc")){
			Problems p = new Problems("AdHoc");
			
		}
		if(btn.contains("Floyd")){
			Problems p = new Problems("RoyFolyd");
			
		}
		if(btn.contains("Cuplaj")){
			Problems p = new Problems("Cuplaj");
			
		}
		if(btn.contains("Sortare")){
			Problems p = new Problems("SortareT");
			
		}
		if(btn.contains("Biconexe")){
			Problems p = new Problems("Biconexe");
			
		}
		if(btn.contains("Cycle")){
			Problems p = new Problems("Cycle");
			
		}
		if(btn.contains("Liniarizare")){
			Problems p = new Problems("Linearizare");
			
		}
		if(btn.contains("APM")){
			Problems p = new Problems("APM");
			
		}
		if(btn.contains("Lazy")){
			Problems p = new Problems("LAZY");
			
		}
		if(btn.contains("Planar")){
			Problems p = new Problems("Planar");
			
		}
		if(btn.contains("Corolare")){
			Problems p = new Problems("Corolare");
			
		}
		
		/*for(int i = 0; i<130; i++){
			
			problems[i] = new Label(User.p[i]);	
			if(User.isProblemSolved(i))
				problems[i].setTextFill(Color.RED);
			container.getChildren().addAll(problems[i]);
			
			
		}*/

	}

}
