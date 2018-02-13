package decorativePatternAssignment;

import java.util.HashMap;

public class Student {

	private String name;
	private int roll, age;
	private HashMap<Integer, String> map = new HashMap<Integer, String>();
	public Student() {
		map.put(0, "name");
		map.put(1, "age");
		map.put(2, "roll");
	}

	public Student(String name, int age, int roll) {
		this.name = name;
		this.age = age;
		this.roll = roll;
		map.put(0, name);
		map.put(1, Integer.toString(age));
		map.put(2, Integer.toString(roll));
		
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

	public String getAttributeName(int option) {
		
		return map.get(option);
	}

	public HashMap<Integer, String> getMap() {
		return map;
	}

}
