package decorativePattern;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Options {
	public Options() throws IOException {
		chooseOption();
	}

	private void chooseOption() throws IOException {
		System.out.println("please enter\n  1 for name\n 2 for age\n 3 for roll");
		Scanner sn = new Scanner(System.in);
		int option = sn.nextInt();
		new Factory(option);
	
	}
}
