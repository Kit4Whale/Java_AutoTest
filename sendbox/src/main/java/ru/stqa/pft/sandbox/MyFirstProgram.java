package ru.stqa.pft.sandbox;

public class MyFirstProgram {
	public static void main (String [] args) {
		hello("world");
		hello("user");
		hello("Nikita");

		double len = 5;
		System.out.println("Площадь квадрата со стороной " + len + " = " + area(len));

		double q = 2;
		double w = 4;
		System.out.println("Площадь прямоугольника со сторнами " + q + " и " + w + " = " + area(q, w));
	}

	public static void hello (String somebody) {
		System.out.println("Hello, " + somebody + "!");
	}

	public static double area (double l) {
		return l * l;
	}

	public static double area (double a, double b) {
		return a * b;
	}
}