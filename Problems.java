package application;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Problems {
	
	public static final String[] BFS = {"ai", "alee", "amici2", "apdm", "atac2", "autobuze", "autobuze3", "banana", "barbar", "berarii2", "camionas", "car", "cifre", "cobai", "coborare2", "dragoni", "dreptunghiuri2", "figuri", "fof", "graf", "insule", "jungla", "kdrum", "mz", "markon", "miting", "muzeu", "padure", "pixy", "reinvent", "rover", "satana", "sate", "semafoare", "superp", "tsunami", "vila"};
	public static final String[] Hamilton = {"adn", "santa", "segmente"};
	public static final String[] DFS = {"aiacupalindroame", "andrei", "arbore", "arbore3", "arbpal", "asmax", "asmin", "atac", "autobuze3", "banana", "bcolor", "berarii2", "brazi", "biti", "cerc", "cerere", "clepsidra", "color2", "compania", "concurs", "critice2", "curent", "delay", "dep", "domino", "dominouri", "dreptunghiuri2", "drumuri", "easygraph", "grab", "harta3", "heavypath", "import", "intensitate", "karb2", "lesbulan", "mesaj3", "mesaj4", "padure", "party", "permlcs", "petrica", "petsoft", "pictura", "pioni", "pirati", "razboi", "salvare", "sediu", "srevni"};
	public static final String[] Dijkstra = {"banuti", "base3", "biomech", "boom", "camionas", "catun", "dragoni", "dmin", "lanterna", "mine", "patrol", "pitici", "retea", "robot", "team", "triliant", "ubuntzei", "volum"};
	public static final String[] LCA = {"atac", "concurs", "constant", "critice2", "ct", "delay", "pirati", "radiatie", "viteza"};
	public static final String[] tSAT = {"aladdin", "andrei", "party"};
	public static final String[] TareConexe = {"andrei", "control", "party", "plan", "plimbare"};
	public static final String[] Bell = {"atac2", "ciclu", "ciob", "dragoni", "import", "lanterna", "traseu", "ubuntzei"};
	public static final String[] FMDCM = {"adapost", "bal2", "cc", "monede", "renovare", "smen", "traseu"};
	public static final String[] Euler = {"biti", "domino", "johnie", "tester", "ulei"};
	public static final String[] MaxFlow = {"algola", "critice", "drumuri2", "fear", "joc4", "harta"};
	public static final String[] AdHoc = {"amenzi", "apdm", "arbpal", "arbciclu", "autobuze3", "caroiaj", "color", "colorare2", "distante", "frunze", "grarb", "grazing", "incurcatura", "oras", "soc", "tj", "tree2"};
	public static final String[] RoyFloyd = {"coach", "mmo", "rfinv", "rf", "traseu"};
	public static final String[] Cuplaj = {"adapost", "album", "atac2", "caroiaj", "circulatie", "java", "paznici", "plan", "senat"};
	public static final String[] SortareT = {"easygraph", "path", "volum"};
	public static final String[] Biconexe = {"clepsidra", "ro", "santa"};
	public static final String[] Cycle = {"robotei"};
	public static final String[] Linearizare = {"arbfind", "cli", "ct", "culori", "euler", "omizi", "radiatie"};
	public static final String[] APM = {"autobuze3", "elicoptere", "radiatie", "rutier"};
	public static final String[] Lazy = {"car", "padure"};
	public static final String[] Planar = {"cerc", "count", "nowhere-zero"};
	public static final String[] Corolare = {"nowhere-zero"};
	
	
	JFXButton[] problem = new JFXButton[60];
	HBox root = new HBox();
	VBox container1 = new VBox(0);
	VBox container2 = new VBox(0);
	Scene pb = new Scene(root, 1000, 700);
	Stage prb = new Stage();
	Label label = new Label();
	
	public Problems(String categorie){
		
		label.setText(categorie);
		label.setFont(new Font("System", 32));
		
		if(categorie.equals("BFS")){
			
			for(int i = 0; i<BFS.length/2; i++){
				
				problem[i] = new JFXButton(BFS[i]);
				container1.getChildren().add(problem[i]);
			}
			for(int i = BFS.length/2; i<BFS.length; i++){
				
				problem[i] = new JFXButton(BFS[i]);
				if(User.isProblemSolved(BFS[i]))
					problem[i].setStyle("-fx-background-color: #5ff442;");
				container2.getChildren().add(problem[i]);
			}
			root.getChildren().addAll(container1, container2, label);
		}

		if(categorie.equals("DFS")){
			
			for(int i = 0; i<DFS.length/2; i++){
				
				problem[i] = new JFXButton(DFS[i]);
				container1.getChildren().add(problem[i]);
			}
			for(int i = DFS.length/2; i<DFS.length; i++){
				
				problem[i] = new JFXButton(DFS[i]);
				if(User.isProblemSolved(DFS[i]))
					problem[i].setStyle("-fx-background-color: #5ff442;");
				container2.getChildren().add(problem[i]);
			}
			root.getChildren().addAll(container1, container2, label);
		}
		if(categorie.equals("Hamilton")){
			
			for(int i = 0; i<Hamilton.length; i++){
				
				problem[i] = new JFXButton(Hamilton[i]);
				container1.getChildren().add(problem[i]);
				
			}
			root.getChildren().addAll(container1, label);
		}
		if(categorie.equals("Dijkstra")){
					
				for(int i = 0; i<Dijkstra.length; i++){
						
					problem[i] = new JFXButton(Dijkstra[i]);
					container1.getChildren().add(problem[i]);
						
				}
				root.getChildren().addAll(container1, label);
		}
		if(categorie.equals("LCA")){
			
			for(int i = 0; i<LCA.length; i++){
				
				problem[i] = new JFXButton(LCA[i]);
				container1.getChildren().add(problem[i]);
				
			}
			root.getChildren().addAll(container1, label);
		}
		if(categorie.equals("tSAT")){
			
			for(int i = 0; i<tSAT.length; i++){
				
				problem[i] = new JFXButton(tSAT[i]);
				container1.getChildren().add(problem[i]);
				
			}
			root.getChildren().addAll(container1, label);
		}
		if(categorie.equals("TareConexe")){
			
			for(int i = 0; i<TareConexe.length; i++){
				
				problem[i] = new JFXButton(TareConexe[i]);
				container1.getChildren().add(problem[i]);
				
			}
			root.getChildren().addAll(container1, label);
		}
		if(categorie.equals("Bell")){
			
			for(int i = 0; i<Bell.length; i++){
				
				problem[i] = new JFXButton(Bell[i]);
				container1.getChildren().add(problem[i]);
				
			}
			root.getChildren().addAll(container1, label);
		}
		if(categorie.equals("FMDCM")){
			
			for(int i = 0; i<FMDCM.length; i++){
				
				problem[i] = new JFXButton(FMDCM[i]);
				container1.getChildren().add(problem[i]);
				
			}
			root.getChildren().addAll(container1, label);
		}
		if(categorie.equals("Euler")){
			
			for(int i = 0; i<Euler.length; i++){
				
				problem[i] = new JFXButton(Euler[i]);
				container1.getChildren().add(problem[i]);
				
			}
			root.getChildren().addAll(container1, label);
		}
		if(categorie.equals("MaxFlow")){
			
			for(int i = 0; i<MaxFlow.length; i++){
				
				problem[i] = new JFXButton(MaxFlow[i]);
				container1.getChildren().add(problem[i]);
				
			}
			root.getChildren().addAll(container1, label);
		}
		if(categorie.equals("AdHoc")){
			
			for(int i = 0; i<AdHoc.length; i++){
				
				problem[i] = new JFXButton(AdHoc[i]);
				container1.getChildren().add(problem[i]);
				
			}
			root.getChildren().addAll(container1, label);
		}
		if(categorie.equals("RoyFloyd")){
			
			for(int i = 0; i<RoyFloyd.length; i++){
				
				problem[i] = new JFXButton(RoyFloyd[i]);
				container1.getChildren().add(problem[i]);
				
			}
			root.getChildren().addAll(container1, label);
		}
		if(categorie.equals("Cuplaj")){
			
			for(int i = 0; i<Cuplaj.length; i++){
				
				problem[i] = new JFXButton(Cuplaj[i]);
				container1.getChildren().add(problem[i]);
				
			}
			root.getChildren().addAll(container1, label);
		}
		if(categorie.equals("SortareT")){
			
			for(int i = 0; i<SortareT.length; i++){
				
				problem[i] = new JFXButton(SortareT[i]);
				container1.getChildren().add(problem[i]);
				
			}
			root.getChildren().addAll(container1, label);
		}
		if(categorie.equals("Biconexe")){
			
			for(int i = 0; i<Biconexe.length; i++){
				
				problem[i] = new JFXButton(Biconexe[i]);
				container1.getChildren().add(problem[i]);
				
			}
			root.getChildren().addAll(container1, label);
		}
		if(categorie.equals("Cycle")){
			
			for(int i = 0; i<Cycle.length; i++){
				
				problem[i] = new JFXButton(Cycle[i]);
				container1.getChildren().add(problem[i]);
				
			}
			root.getChildren().addAll(container1, label);
		}
		if(categorie.equals("Linearizare")){
			
			for(int i = 0; i<Linearizare.length; i++){
				
				problem[i] = new JFXButton(Linearizare[i]);
				container1.getChildren().add(problem[i]);
				
			}
			root.getChildren().addAll(container1, label);
		}
		if(categorie.equals("APM")){
			
			for(int i = 0; i<APM.length; i++){
				
				problem[i] = new JFXButton(APM[i]);
				container1.getChildren().add(problem[i]);
				
			}
			root.getChildren().addAll(container1, label);
		}
		if(categorie.equals("LAZY")){
			
			for(int i = 0; i<Lazy.length; i++){
				
				problem[i] = new JFXButton(Lazy[i]);
				container1.getChildren().add(problem[i]);
				
			}
			root.getChildren().addAll(container1, label);
		}
		if(categorie.equals("Planar")){
			
			for(int i = 0; i<Planar.length; i++){
				
				problem[i] = new JFXButton(Planar[i]);
				container1.getChildren().add(problem[i]);
				
			}
			root.getChildren().addAll(container1, label);
		}
		if(categorie.equals("Corolare")){
			
			for(int i = 0; i<Corolare.length; i++){
				
				problem[i] = new JFXButton(Corolare[i]);
				container1.getChildren().add(problem[i]);
				
			}
			root.getChildren().addAll(container1, label);
		}
		for(int i=0; problem[i]!=null; i++){
			String text = problem[i].getText();
			problem[i].setOnAction((event) -> {
				Web w = new Web("http://infoarena.ro/problema/" + text + "/");
			});
		}
		root.setAlignment(Pos.CENTER);
		container1.setAlignment(Pos.CENTER);
		container2.setAlignment(Pos.CENTER);
		label.setAlignment(Pos.CENTER_RIGHT);
		root.setStyle("-fx-background-color: #ffffff;");
		root.setMaxSize(500, 400);
		prb.setScene(pb);
		prb.show();
	}
	
	public void onClick(ActionEvent e){
		
		for(JFXButton btn: problem){
			if(e.getSource() == btn){
				new Web("http://infoarena.ro/problema/"+btn.getText()+"/");
			}
		}
	}
}
