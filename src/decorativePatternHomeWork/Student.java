package decorativePatternHomeWork;

public class Student {

	private String name;
	private int roll,age;
	public Student(String name,int age,int roll){
		this.name = name;
		this.age = age;
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
