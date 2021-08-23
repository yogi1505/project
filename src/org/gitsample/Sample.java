package org.gitsample;

public class Sample {
	public void processorName() {
		System.out.println("SnapDragon 765G");
	}

	public Sample() {
		super();
		System.out.println("Answer is above");
		System.out.println("hi");
	}

	public void ramSize() {

		System.out.println("Ram : 12gb");
		System.out.println("hi");
	}

	public void romSize() {

		System.out.println("R0m : 128gb");
		System.out.println("hi");
	}
	private void data() {
		
		 byte age = 23;
		 System.out.println("Age : "+age);
		 
		 String name = "Yogi";
		 System.out.println("Name : "+name);
		 
		 short rollNo = 345;
		 System.out.println("Roll no : " +rollNo);
		 
		 int rank = 5678;
		 System.out.println("Rank : "+rank);
		 
		 long phnNo = 9899848857l;
		 System.out.println("Mobile no : "+phnNo);
		 
		 float salary = 88977.8f;
		 System.out.println("Salary : "+salary);
		 
		 double tax = 3467.988;
		 System.out.println("Tax paid : "+tax);
		 
		 char gen = 'm';
		 System.out.println("Gender : "+gen);
		 
		boolean statment = true;
		System.out.println("This statement is "+statment);
	}
	public static void main(String[] args) {
		Sample k = new Sample();
		k.processorName();
		k.ramSize();
k.data();
	}
}