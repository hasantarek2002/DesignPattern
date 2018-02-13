package strategyObject;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Options {
	public Options() throws IOException {
		chooseOption();
	}

	private void chooseOption() throws IOException {
		System.out.println("please enter  1 for CSV\n 2 for TSV\n 3 for xml");
		Scanner sn = new Scanner(System.in);
		int option = sn.nextInt();
		new Factory(option);
	
	}
}
