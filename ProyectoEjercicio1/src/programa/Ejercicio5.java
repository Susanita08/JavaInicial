package programa;

import java.util.Scanner;

public class Ejercicio5 {
	/*
	 * Escribe un programa java que declare una variable A 
	 * de tipo entero y as�gnale un valor. A continuaci�n muestra
	 *  un mensaje indicando si A es par o impar. Utiliza el operador 
	 *  condicional ( ? : ) dentro del println para resolverlo.
	Si por ejemplo A = 14 la salida ser�
	14 es par
	Si fuese por ejemplo A = 15 la salida ser�:
	15 es impar*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String entradaTeclado = "";
		 int A=0;
		 Scanner entradaEscaner = new Scanner (System.in); //Creaci�n de un objeto Scanner
		 entradaTeclado = entradaEscaner.nextLine (); //Invocamos un m�todo sobre un objeto Scanner
		 System.out.println ("Variable A es: " + entradaTeclado);
		 A=Integer.parseInt(entradaTeclado);
		 if(A%2==0) System.out.println("A "+A+" es par");
		 else System.out.println("A "+A+" es impar");
		
	}

}
