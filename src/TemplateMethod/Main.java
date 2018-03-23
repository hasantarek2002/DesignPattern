package TemplateMethod;

public class Main {

	public static void main(String[] args) {

		Delux d = new Delux();
		d.execute();

		Economy e = new Economy();
		e.execute();

		Luxury l = new Luxury();
		l.execute();

	}

}
