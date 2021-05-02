package calc.polymorphism;

public class Calculator {
	public void add(int num1, int num2) {

		int num3 = num1 + num2;
		System.out.println("Sum" + " " + num3);

	}

	public void add(int num1, int num2, int num3) {

		int num4 = num1 + num2 + num3;
		System.out.println("Sum" + " " + num4);

	}

	public void multiply(int x, int y) {

		int z = x * y;
		System.out.println("Product" + " " + z);

	}

	public void multiply(int a, double b) {

		double c = a * b;
		System.out.println("Product" + " " + c);

	}

	public void subtract(int a, int b) {

		int c = a - b;
		System.out.println("Product" + " " + c);

	}

	public void subtract(double x, double y) {

		double z = x - y;
		System.out.println("Product" + " " + z);

	}

	public void divide(int a, int b) {

		int c = a / b;
		System.out.println("Division result" + " " + c);

	}

	public void divide(int x, double y) {

		double z = x / y;
		System.out.println("Product" + " " + z);

	}

	public static void main(String[] args) {

		Calculator calc = new Calculator();
		calc.add(25, 35);
		calc.add(80, 100, 120);
		calc.subtract(90, 50);
		calc.subtract(80.256, 19.850);
		calc.multiply(32, 45);
		calc.multiply(90, 84.36);
		calc.divide(300, 80);
		calc.divide(600, 65.25);

	}

}
