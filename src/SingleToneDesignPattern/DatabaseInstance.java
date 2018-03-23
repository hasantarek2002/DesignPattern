package SingleToneDesignPattern;

public class DatabaseInstance {
	private static DatabaseInstance databaseInstance = new DatabaseInstance();

	private DatabaseInstance() {

	}

	public static DatabaseInstance getInstance() {
		System.out.println("hndkfdsfgn");
		return databaseInstance;
	}
	public void print() {
		System.out.println("null");
	}

}
