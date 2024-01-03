package ejemplos;

public class PerimetroCircunf {
	

	public static void main(String[] args) {
		// Calculamos el perímetro de una circunferencia
		
		final double PI = 3.1415926536; //Constante PI
		double radio = 25.0, perimetro; //Radio de la circunferencia
		
		perimetro = 2.0*PI*radio;
		System.out.println("El perímetro de la circunf. de radio " + radio + " es " + perimetro);
	}

}
