package ejemplos;

import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) {
		// Vamos a leer entradas de usuario

		//Definimos las variables
		int a,b,c;
		Scanner entrada = new Scanner(System.in);
		
		//Código
		System.out.println("Teclea un número :");
		a = entrada.nextInt();
		
		System.out.println("Teclear otro número :");
		b = entrada.nextInt();
		
		c = a * b;
		System.out.println("a = " + a + " b = " + b + " a * b = " + c);
	}
}

