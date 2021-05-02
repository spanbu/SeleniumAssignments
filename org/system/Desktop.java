package org.system;

public class Desktop extends Computer {

	public static void main(String[] args) {

		Desktop dell = new Desktop();
		dell.computerModel();
		dell.desktopSize();

	}

	public void desktopSize() {

		System.out.println("The Desktop Size is 15inch...");
	}

}
