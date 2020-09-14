package Pattern_SRP_Example;

import java.io.IOException;

public class TestApp {

	public static void main(String[] args) throws IOException {
		Journal j = new Journal();
		j.addEntry("Test 01 zero");
		j.addEntry("Test 02 zero");
		System.out.println("j = " + j);

		Persistence p = new Persistence();
		String filename = "c:\\temp\\journal.txt";
		p.saveToFile(j, filename, true);
		
		//Runtime.getRuntime().exec("notepad.exe " + filename);
		Runtime.getRuntime().exec("vim " + filename);
	}

}
