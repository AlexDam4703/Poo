package com.iesviergendelcarmen.poo.ejercicios;

import java.util.Scanner;

public class TestNumber {

	public static void main(String[] args) {
		System.out.println("Introduce a decimal number");
		Scanner in = new Scanner (System.in);
		double number =  in.nextDouble();
		in.close();
		Number digit = new Number ();
		digit.setData(number);
		
		System.out.println(digit);
		System.out.printf("Square root is %.2f and cubic root is %.2f%n",digit.calculatedSquareRootofData(),digit.calculatedCubicRootOfAbsoluteData());
		System.out.printf("Absolute value is %d%n",digit.getRoudAbsoluteData());
		System.out.printf("A random number %d%n",digit.getRandomOfZeroToRoudData());
	}

}
