package strategyObject;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Converter {
	private Student st[];
	private String str;
	private String filename = "output\\a.txt";
	private BufferedWriter writer;

	public Converter(ITransformer t) throws IOException {
		
		testInput(); 
		
		writer = new BufferedWriter(new FileWriter(filename, true));
		for (int i = 0; i < st.length; i++) {
			str = t.transform(st[i]);
			try {
				writeToFile(str);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		writer.close();
	}

	private void writeToFile(String str) throws IOException {
		// TODO Auto-generated method stub

		writer.write(str);

	}

	private void testInput() throws FileNotFoundException {
		st = new Student[3];
		st[0] = new Student("Tahmid", "bsse0801@iit.du.ac.bd", 1);
		st[1] = new Student("Shihab", "bsse0813@iit.du.ac.bd", 13);
		st[2] = new Student("Hasan", "bsse0818@iit.du.ac.bd", 18);

		PrintWriter writer = new PrintWriter(filename);
		writer.print("");
		writer.close();

	}

}
