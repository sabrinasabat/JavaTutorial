package ejemplos;

public class Mates {

	public static void main(String[] args) {
		// Algunas operaciones de mates
		
		double a = 5.4;
		double b = 5.6;
		double c;
		
		c = Math.sqrt(a);
		
		System.out.println("La raíz cuadrada de " + a + " es " + c);
		
		// c = Math.pow(a, b);
		
		System.out.print("La potencia de " + a + " base " + b + " = " + Math.pow(a, b));
		
	}

}