package org.age;

public class age2 extends myage {
	@Override
	public void age(int age) {
		System.out.println("age is " +age);
		super.age(20);

	}
	public static void main(String[] args) {
		age2 a = new age2();
		a.age(29);
	}
}
