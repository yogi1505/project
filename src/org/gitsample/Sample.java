package org.gitsample;

public class Sample {
	public void processorName() {
		System.out.println("SnapDragon 765G");
	}

	public Sample() {
		super();
		System.out.println("Answer is above");
	}

	public void ramSize() {

		System.out.println("Ram : 12gb");
	}

	public void romSize() {

		System.out.println("R0m : 128gb");
	}

	public static void main(String[] args) {
		Sample k = new Sample();
		k.processorName();
		k.ramSize();

	}
}