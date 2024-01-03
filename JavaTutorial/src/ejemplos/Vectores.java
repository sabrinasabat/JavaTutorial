package ejemplos;

import java.util.Scanner;

public class Vectores {

	public static void main(String[] args) {
		
		final int NUM = 5;
		
		Scanner entrada = new Scanner(System.in);
		int[] v_enteros = new int[NUM];
		int[] v_enteros2 = new int[NUM];
		int alvaro = 10;

		//rellenamos
		for (int i = 0; i < v_enteros.length; i++) {
			v_enteros[i] = i;
		}
		
		//recorremos y mostramos
		for (int i = 0; i < v_enteros.length; i++) {
			System.out.print("v_enteros["+i+"]="+v_enteros[i]+",");
		}
		System.out.println();
		
		//recorremos en orden inverso y mostramos
		for (int i = v_enteros.length - 1; i >= 0; i--) {
			System.out.print("v_enteros["+i+"]="+v_enteros[i]+",");
		}
		System.out.println();
		
		//recorremos e indicamos si cada un o es par o impar
		for (int i = 0; i < v_enteros.length; i++) {
			
			if (v_enteros[i] % 2 == 0 ) {
				System.out.print("v_enteros["+i+"] = "+ v_enteros[i] + " es par, ");	
			} else {
				System.out.print("v_enteros["+i+"] = "+ v_enteros[i] + " es impar, ");	
			}
		}
		
		//Entramos número por consola y los introducimos en el vector. 
		for (int i=0; i < v_enteros.length; i++) {
			System.out.println("Teclea un número :");
			v_enteros2[i] = entrada.nextInt();
		}
		for (int i=0; i < v_enteros.length; i++) {

			System.out.print(v_enteros2[i]);
		}
		

	}

}