package decorativePatternAssignment;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Sorter {
	private Student st[];

	public Sorter(ISorter t, int choice[]) {
		initializeInput();

		int n = st.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				int value = t.compareAttribute(st[j], st[j + 1], choice, 0);

				if (value > 0) {
					Student temp = st[j];
					st[j] = st[j + 1];
					st[j + 1] = temp;
				}
			}

		}
		print();

	}

	public void print() {
		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i].getName() + "\t" + st[i].getAge() + "\t" + st[i].getRoll());
		}
	}

	private void initializeInput() {
		st = new Student[3];
		st[0] = new Student("Tahmid", 20, 19);
		st[1] = new Student("Shihab", 21, 13);
		st[2] = new Student("Tahmid", 20, 18);

		// PrintWriter writer = new PrintWriter(filename);
		// writer.print("");
		// writer.close();

	}

}
