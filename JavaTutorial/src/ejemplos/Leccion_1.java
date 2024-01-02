package ejemplos;

public class Leccion_1 {
	
	
	public static void main(String[] args) {

		// TIPOS DE DATOS EN JAVA; Simples y Complejos
		// Operaciones básicas: Asignación, ++x, --x, x++, x--
		// ESTRUCTURAS DE Repeticion; For
	
		//Números enteros
		byte v_byte; //Entero con signo -128 a +127
		short v_short; //Entero con signo -32768 a +32767
		int v_entero; //Entero con signo -2147483648 a +2147483648
		long v_long; //Entero con signo 
		
		//Números reales
		float v_float; //Real con precisión simple
		double v_double; //Real de precisión doble
		
		//Carácteres
		char v_char; //Caracter Unicode
		String v_cadena; //Cadena de carácteres
		
		//Valores lógicos
		boolean v_boolean; //Booleano
		
		//Constantes
		final int C_NUM = 5;
		final boolean C_VERDADERO = true;
		final boolean C_FALSO = false;
		final char C_LAX = 'X'; 
		
		//Tipos de datos complejos
		int[] a_enteros = new int[C_NUM]; // Vector de enteros de NUM posiciones
		boolean[] a_booleanos = new boolean[C_NUM]; //Vector de booleanos de NUM posiciones
		char[] a_caracteres = new char[C_NUM]; //Vector de caracters de NUM posiciones
		String[] a_cadenas = new String[C_NUM]; //Vector de cadenas de caracteres de NUM posiciones
		
		int[][] m_enteros = new int[C_NUM][C_NUM]; //Matriz de dos dimensiones de enteros de NUMxNUM posciones
		boolean[][] m_booleanos = new boolean[C_NUM][C_NUM]; //Matriz de dos dimensione de booleanos de NUMxNUM
		char[][][] m_caracteres = new char[C_NUM][C_NUM][C_NUM]; // Matriz de tres dimensiones de caracters de NUMxNUMxNUM 
		
	
		//Clases para crear objetos. 
	    //Se verá en ontra lección 
		
		//OPERACIONES BASICAS. 
		
		//Asignación
		
		v_entero = 0; //Derecha a izquierda SIEMPRE
		
		v_entero = v_entero + 0; // Derecha a izquierda SIEMPRE.
		
		v_entero = 1;
		v_entero = v_entero + v_entero + v_entero + v_entero;
		System.out.println("soy v_entero y valgo :" + v_entero);
		
	
		//La asignación de derecha a izquiera se resuelve en el compilador / interprete mediante variables temporales. 
		//La siguiente secuencia de instrucciones
		v_entero = 0;
		v_entero = v_entero + 1; // Él es igual a Él + 1. 
        //Internmente se resuelve de esta manera
		v_entero =0;
		int temporal = 0; //Variable que define el compilador / interprete
		temporal = v_entero + 1;
		v_entero = temporal;
		
		//Asignación compleja; Siempre se calcula el valor y luego se asigna. 		
		v_entero = 1;
		v_entero = v_entero + v_entero + v_entero + v_entero; 
		System.out.println("soy v_entero y ahora valgo: " + v_entero);
		
		
		//Operaciones específicas de Java
		v_entero = 0;
		v_entero = v_entero + 1; //Operación muy común en cualquier lenguaje de programación
		
		v_entero++; //Incremento en 1 unidad DESPUES DE SER UTILIZADA
		v_entero--; //Decremento en 1 unidad DESPUES DE SER UTILIZADA
		
		++v_entero; //Incremento en 1 unidad para la variable ANTES DE SER UTILIZADA
		--v_entero; //Decremento en 1 unidad para la variable ANTES DE SER UTILIZADA
		
		
		v_entero = 0;
		System.out.println("soy v_entero y valgo: "+ v_entero); //aquí usamos la variable; la mostramos
		System.out.println("soy v_entero++ y valgo: " + v_entero++); //mostramos su valor y la incrementamos
		v_entero = 0;
		System.out.println("soy ++v_entero y valgo: " + (++v_entero)); //incrementamos su valor y la mostramos;
		
		// Otro ejemplo de diferencia entre ++x y x++
		
		v_entero = 0;
		temporal = 0;
		temporal = v_entero++;
		System.out.println("soy temporal = v_entero++ y valgo:" + temporal);
		
		v_entero = 0;
		temporal = 0;
		temporal = ++v_entero;
		System.out.println("soy temporal = ++v_entero y valgo:" + temporal);
		
		//Complicarse la vida innecesariamente con este tipo de operaciones
		v_entero = 0;
		v_entero = v_entero++;
		System.out.println("soy v_entero y valgo:" + v_entero);
		
		//El compilador hace esto
		v_entero =0;
		temporal = v_entero;
		v_entero++;
		v_entero = temporal;
		System.out.println("soy v_entero y valgo:" + v_entero);
		
		//En este caso no hay mucha complicación
		v_entero = 0;
		v_entero = ++v_entero;
		System.out.println("soy v_entero y valgo:" + v_entero);
	
		//Complicarse mucho la vida con este tipo de operacioes
		
		v_entero = 0;
		v_entero = (v_entero++) + (v_entero++) + (v_entero++); //0 + (1) + (2)
		System.out.println("Soy v_entero complicado y valgo: " + v_entero);
		
		v_entero = 0;
		v_entero = (++v_entero) + (++v_entero) + (++v_entero); //Evitar este tipo de operaciones (1) + (2) + (3)
		System.out.println("Soy v_entero chulo porras y valgo: " + v_entero);
		
		//Las operaciones x++, ++x, --x, etc. mucho mejor si son sencillas. 
	   
		
		//ESTRUCTURA DE CONTROL
		
		//FOR --> Repetición, bucle, iteración
		 
		//Un For Repite las instrucciones que controla
		
		/*
		
		for (inicialización; control; acción de cada iteración) {}
		
		for (;;)  {}
		
		for (;;System.out.println("hola")) {}
		
		for (;;System.out.print("no me canso de decir")) {
			System.out.println(" hola");
		}
		
        for (byte i =0; ; ) {
        	System.out.println(i++);
        }
		
		for (byte i =0; ; i++) {
			System.out.println(i);
		}
		
		//Vamos a controlar el bucle para que no se salga de rango
		for (byte i =0; ; i++) {
			System.out.println(i);
			if (i >= 127) {
				break;
			}
		}

		//Aprovechamos la estructura de control del for
		v_byte = 0;
	    for (;v_byte<=100;) {
			System.out.println(v_byte++);
	    }
		
	    //Mejoramos un pelín la anterior estructura
	    
	    for (byte v2_byte =0; v2_byte <= 100;) {
			System.out.println(v2_byte++);
	    }
	    
		//For hecho a mano
		byte j = 0;
		for (;;) {
			System.out.println(j);
			j++;
			if (j >= 127) {
				break;
			}
		}
		
		//For BIEN hecho
		for(byte k = 0; k < 127; k++) {
			System.out.println("Soy k y valgo: " + k);
		}

		//Aprovechamos la estructura del FOR
		j = 0;
		for(byte r = 0; r < 127; r++, j--) {
			System.out.print("soy j y valgo :" + j);
			System.out.println(" soy r y valgo :" + r);
		}
		
		//Recordar que el For puede no iterar ninguna vez
		for (byte r = 0; r != 0; r++) {
			System.out.println("Nunca me ejecuto");
		}
		//NOS PARAMOS CON EL FOR, SIGUIENTE DIA DAREMOS EL DO WHILE()
		
	
	  //MANEJAMOS ARRAYS
	    
	  //Definimos un array que luego lo vamos a ustilizar. 
	  int[] a_enteros2 = new int[C_NUM]; //Array de enteros de 1 dimension de C_NUM posiciones
	  
	  //REllenamos y mostramos
	  a_enteros2[0] = 0;
	  a_enteros2[1] = 1;
	  a_enteros2[2] = 2;
	  a_enteros2[3] = 3;
	  a_enteros2[4] = 4;  

	  System.out.println("a_enteros2[0] = " +  a_enteros2[0]);
	  System.out.println("a_enteros2[1] = " +  a_enteros2[1]);
	  System.out.println("a_enteros2[2] = " +  a_enteros2[2]);
	  System.out.println("a_enteros2[3] = " +  a_enteros2[3]);
	  System.out.println("a_enteros2[4] = " +  a_enteros2[4]);
	  
	  //Rellenamos de una manera más inteligente y mostramos
	  v_byte = 0;
	  a_enteros2[v_byte] = v_byte++;
	  a_enteros2[v_byte] = v_byte++;
	  a_enteros2[v_byte] = v_byte++;
	  a_enteros2[v_byte] = v_byte++;
	  a_enteros2[v_byte] = v_byte++; 
	  
	  v_byte = 0;
	  System.out.println("a_enteros2[" + v_byte + "] = " +  a_enteros2[v_byte++]);
	  System.out.println("a_enteros2[" + v_byte + "] = " +  a_enteros2[v_byte++]);
	  System.out.println("a_enteros2[" + v_byte + "] = " +  a_enteros2[v_byte++]);
	  System.out.println("a_enteros2[" + v_byte + "] = " +  a_enteros2[v_byte++]);
	  System.out.println("a_enteros2[" + v_byte + "] = " +  a_enteros2[v_byte++]);
	  
	  //Ejemplo con (++v_byte)
	  v_byte = -1; System.out.println();
	  //System.out.println("a_enteros2[" + v_byte + "] = " +  a_enteros2[v_byte++]); //No Funciona
	  //System.out.println("a_enteros2[" + v_byte + "] = " +  a_enteros2[++v_byte]); //No funciona
	  //System.out.println("a_enteros2[" + (++v_byte) + "] = " +  a_enteros2[++v_byte]); //No funciona
	  
	  System.out.println("a_enteros2[" + (++v_byte) + "] = " +  a_enteros2[v_byte]); 
	  System.out.println("a_enteros2[" + (++v_byte) + "] = " +  a_enteros2[v_byte]); 
	  System.out.println("a_enteros2[" + (++v_byte) + "] = " +  a_enteros2[v_byte]); 
	  System.out.println("a_enteros2[" + (++v_byte) + "] = " +  a_enteros2[v_byte]); 
	  System.out.println("a_enteros2[" + (++v_byte) + "] = " +  a_enteros2[v_byte]); 


      //Vamos a rellenarlo con un FOR	  
	  v_byte = 0; System.out.println();
	  for (;;) {
		  a_enteros2[v_byte] = v_byte;
		  v_byte++;
		  if (v_byte >= 4) {
			  break;
		  }
	  }
	  
	  v_byte = 0;
	  for (;;) {
		  System.out.println(a_enteros2[v_byte]);
		  v_byte++;
		  if (v_byte >= 4) {
			  break;
		  }
	  }
	  
	  //Rellenamos aprovechando la estructura del for
	  for (v_byte = 0; v_byte < a_enteros.length; v_byte++) {
		  a_enteros2[v_byte] = v_byte;
		  System.out.println("a_enteros[" + v_byte + "] = " + a_enteros2[v_byte]);
	  }
	  
	  //Recorremos de manera inversa
	  System.out.println();
	  for (int indice = a_enteros2.length - 1; indice >= 0; indice--) {
		  System.out.println("a_enteros[" + indice + "] = " + a_enteros2[indice]);
		  
	  }
	  
	  
	  //Recorrer un Array es una operación muy común en programación
	  //JAVA tiene una for "especial" para recorrer un array (extraer sus valores en orden ascendente)
	  
	  for (int variable : a_enteros2) {
		  System.out.println(variable);
	  }
	
	  for (boolean variable : a_booleanos) {
		  System.out.println(variable);
	  }
	  
	  
	  //Array puede ser de booleanos, enteros, carateres
	  
	  String[] dias_semana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
	  
	  for (String variable : dias_semana) {
		  System.out.println(variable);
	  }
	  
	  //El problema de recorrer un Sring al estilo java es que no tiene control sobre ello
	  //por ejemplo, muestrame sólo los dias laborales. 
	  
	  v_byte = 0;
	  for (String variable : dias_semana) {
		  System.out.println(variable);
		  if (v_byte++ > 3) {
			  break;
		  }
	  }
	  
	  //Siguiente lección, Arrays de 2 dimensiones, y DO WHILE()
	  
*/
	}
	

}
