package programa;

import java.util.Scanner;

public class Ejercicio6 {
	/*
	 * Escribe un programa java que declare una variable B de tipo entero 
	 * y as�gnale un valor. A continuaci�n muestra un mensaje indicando 
	 * si el valor de B es positivo o negativo. Consideraremos el 0 como 
	 * positivo. Utiliza el operador condicional ( ? : ) dentro del println 
	 * para resolverlo.
	Si por ejemplo B = 1 la salida ser�
	1 es positivo
	Si fuese por ejemplo B = -1 la salida ser�:
	-1 es negativo*/
	public static void main(String[] args) {
		 String entradaTeclado = "";
		 int b=0;
		 Scanner entradaEscaner = new Scanner (System.in); //Creaci�n de un objeto Scanner
		 entradaTeclado = entradaEscaner.nextLine (); //Invocamos un m�todo sobre un objeto Scanner
		 System.out.println ("Variable B es: " + entradaTeclado);
		 b=Integer.parseInt(entradaTeclado);
		 System.out.println(b + (b >= 0 ? " es positivo " : " es negativo "));
	}

}
