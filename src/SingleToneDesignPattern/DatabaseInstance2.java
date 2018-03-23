package SingleToneDesignPattern;

public class DatabaseInstance2 {

	private static DatabaseInstance2 databaseInstance2 = null;

	private DatabaseInstance2() {

	}

	public static DatabaseInstance2 getInstance() {

		///////////////////////////////////////
		////////// double checking

		if (databaseInstance2 == null) {
			synchronized (DatabaseInstance2.class) {
				if (databaseInstance2 == null) {
					databaseInstance2 = new DatabaseInstance2();
					System.out.println("First time in this block : (synchronized block)");
				}
			}

		}
		System.out.println("hndkfdsfgn");
		return databaseInstance2;
	}

}
