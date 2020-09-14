package Pattern_SRP_Example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;

public class Persistence {
	
	public void saveToFile(Journal journal, String filename, boolean overwrite) {
		if (overwrite || new File(filename).exists()) {
			try(PrintStream out = new PrintStream(filename)){
				
				out.println(toString());
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void load(String filename) {};
	public void load(URL url) {}

}
