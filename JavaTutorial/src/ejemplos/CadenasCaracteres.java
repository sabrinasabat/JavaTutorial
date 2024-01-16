package ejemplos;

import java.util.Scanner;

public class CadenasCaracteres {
	

	public static void main(String[] args) {
		// Operaciones con Cadenas de Caracters
		
		String cadena1 = "";
		String cadena2 = "";
		Scanner entradachar = new Scanner(System.in);
		// Comentario
		// Código
		System.out.print("Teclea primer string : ");
		cadena1 = entradachar.nextLine();
		
		System.out.print("Teclea segundo string :");
		cadena2 = entradachar.nextLine();
		
		System.out.println();
		System.out.println("primer texto : " + cadena1);
		System.out.println("segundo texto : " + cadena2);
		System.out.println("concatenación : " + cadena1 + cadena2);
		System.out.println("longitud primer texto = " + cadena1.length());
		System.out.println("longitud segundo texto = " + cadena2.length());
		System.out.println("texto iguales = " + cadena1.equals(cadena2));
		System.out.println("último caracter de " + cadena1 + " = " + cadena1.charAt(cadena1.length()-1));
		System.out.println();
								
		}

}
