package programa;

import java.util.Scanner;

public class Ejer4SegundaTanda {

	/*
	 * Programa que lea una cantidad de grados cent�grados y la pase a grados Fahrenheit. 
La f�rmula correspondiente para pasar de grados cent�grados a fahrenheit es:
F = 32 + ( 9 * C / 5)*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double centigrados=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese el valor de la temperatura en �C");
		centigrados=scan.nextDouble();
		double F=farenheit(centigrados);
		System.out.println("La temperatura en grados farenheit es: "+F);
	}

	public static double farenheit(double c) {
		double f=0;
		f=32+(9*c)/5;
		return f;
	}
}
