package application;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class User {
	
	private static String user;
	private static String avatar;
	private static int problemsSolved;
	private static double smecherie;
	private static boolean[] problems = new boolean[1000];
																																																																																															// ciclu hamiltonian |->					//DFS|	
	public static final String[] p = {"ai", "alee", "amici2", "apdm", "atac2", "autobuze", "autobuze3", "banana", "barbar", "berarii2", "camionas", "car", "cifre", "cobai", "coborare2", "dragoni", "dreptunghiuri2", "figuri", "fof", "graf", "insule", "jungla", "kdrum", "mz", "markon", "miting", "muzeu", "padure", "pixy", "reinvent", "rover", "satana", "sate", "semafoare", "superp", "tsunami", "vila",
			"adn", "santa", "segmente",//hamiltonian
			"aiacupalindroame", "andrei", "arbore", "arbore3", "arbpal", "asmax", "asmin", "atac", "bcolor", "biti", "cerc", "cerere", "clepsidra", "color2", "compania", "concurs", "critice2", "curent", "delay", "dep", "domino", "dominouri", "drumuri", "easygraph", "grab", "harta3", "heavypath", "import", "intensitate", "karb2", "lesbulan", "mesaj3", "mesaj4", "padure", "party", "permlcs", "petrica", "petsoft", "pictura", "pioni", "pirati", "razboi", "salvare", "sediu", "srevni",//dfs
			"banuti", "base3", "biomech", "boom", "catun", "dmin", "lanterna", "mine", "petrol", "pitici", "retea", "robot", "team", "triliant", "ubuntzei", "volum", //Djikstra
			"atac", "concurs", "constant", "ct", "pirati", "radiatie", "viteza", //LCA
			"aladdin", "party",//2-SAt
			"control", "party", "plan", "plimbare",//tare conexe 
			"ciclu", "ciob", "lanterna", "traseu", //bell
			"adapost", "bal2", "cc", "monede", "renovare", "smen",//flux maxim de const minim
			"johnie", "tester", "ulei",//ciclu euler
			"algola", "drumuri2", "fear", "joc4", "harta",//maxflow
			"amenzi", "arbciclu", "caroiaj", "colorare2", "distante", "frunze", "grarb", "grazing", "incurcatura", "oras", "soc", "tj", "tree2",// ad-hoc
			"coach", "mmo", "rfinv", "rf",//roy-floyd
			"album", "circulatie", "java", "paznici", "plan", "senat",//cuplaj
			"path", "volum",//sortaret
			"ro", "santa",//componente biconexe
			"robotei",//cycle detection
			"arbfind", "cli", "ct", "culori", "euler", "omizi",// liniarizare arbore
			"elicoptere", "rutier",// APM
			"count", "nowhere-zero"};
	
	public static int howMany() throws IOException{
		int result = 0;
		URL url = new URL("http://www.infoarena.ro/utilizator/" + user + "?action=stats");
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
		String part[] = body.split("Probleme incercate");
		String df[] = part[0].split("Probleme rezolvate");
		int counter = 0;
		result = 0;
		for(String problem: p){
			if(df[1].contains(problem + "<")){
				problems[counter] = true;
				result++;
				System.out.println(problem);
			}
			counter++;
		}
		System.out.println(counter);
		
		
		return result;
		
		
	}
	
	public static void setUsername(String username){
		
		user = username;
		try {
			problemsSolved = howMany();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MySQL.updateSmecherie();
		try {
			smecherie = (double)problemsSolved / MySQL.getMaxSolved() ;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("Userul " + user + " a rezolvat " + problemsSolved + " probleme!");
		
	}
	
	public static boolean isProblemSolved(String problem){
		for(int i = 0; i < 170; i++)
			if(p[i].equals(problem))
				return problems[i];
		return false;
	}
	
	public static void init() throws IOException{
			
		
	}
	
	public static String getAvatar(){
		
		return avatar;
	}
	
	public static String getUser(){
		
		return user;
	}
	
	public static double getSmecherie(){
		
		return smecherie;
	}
	
	public static int getProblemsSolved(){
		
		return problemsSolved;
	}
	
	public static boolean isProblemSolved(int problem){
		
		return problems[problem]; 
	}
	
}
