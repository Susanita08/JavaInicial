package programa;

import java.util.Scanner;

public class Ejer5SegundaTanda {
	//Recursividad
	/*
	 Programa que lea un n�mero entero N de 5 
	 cifras y muestre sus cifras igual que en el ejemplo.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese un n�mero de 5 cifras:\n");
		Scanner scan = new Scanner(System.in);
		int numero=scan.nextInt();
//		while(!validarIngreso(numero)) {
//			System.out.println("N�mero incorrecto, vuelva a ingresar un n�mero de 5 cifras");
//			scan = new Scanner(System.in);
//			numero=scan.nextInt();
//		}
		numero=validarIngreso(numero,scan);
		
	}

	public static int validarIngreso(int numero, Scanner scaner) {
		if(numero>10000 && numero<99999) {
			return numero;
		}
		else {
			System.out.println("El valor es incorrecto, reingrese un n�mero de 5 cifras");
			numero=scaner.nextInt();
			return validarIngreso(numero,scaner);
		}
	}
}
