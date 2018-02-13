package decorativePatternAssignment;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Options {
	Scanner sn = new Scanner(System.in);
	private int numberofColumn;

	public Options() throws IOException {
		chooseOption();
	}

	private void chooseOption() throws IOException {
		System.out.print("please enter the number of column (max 3) : ");
		numberofColumn = sn.nextInt();
		takeColumnNameInput();
		// int option = sn.nextInt();
		// new Factory(option);

	}

	private void takeColumnNameInput() {
		int[] arr = new int[numberofColumn];
		System.out.println("please enter\n  0 for name\n 1 for age\n 2 for roll");
		for (int i = 0; i < numberofColumn; i++) {
			arr[i] = sn.nextInt();
		}

		
		//Factory fc = new Factory();
		HashMap<Integer, ISorter> map = new HashMap<Integer, ISorter>();
		map.put(0, new Comparer());
		map.put(1, new Comparer());
		map.put(2, new Comparer());
		/*Student st=new Student();
		HashMap<Integer, ISorter> map = fc.getObjectMapList();*/

		ISorter ic1 = map.get(arr[numberofColumn - 1]);
		// ISorter ic = fc.compList.get(parmList.get(x-1));
		ISorter ic2;
		for (int i = numberofColumn - 2; i >= 0; i--) {
			ic2 = map.get(arr[i]);
			ic2.nextComparison(ic1);
			ic1 = ic2;
		}
		new Sorter(ic1,arr);

	}

}
