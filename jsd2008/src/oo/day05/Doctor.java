package oo.day05;

public class Doctor extends Person {
	String level;
	Doctor(String name, int age, String address, String level) {
		super(name, age, address);
		this.level = level;
	}
}
