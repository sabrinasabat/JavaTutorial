package ejemplos;

public class Leccion_4 {


	public static void main(String[] args) {
		// CLASES Y OBJETOS. 
		
		// Otro equipo ha estado trabajando en ese codigo. Sabrina Sabat
		//Una CLASE es un tipo de dato complejo. 
		//Un OBJETO es un elemento que se crea a partir de la CLASE
		
		//Tengo la CLASE  que es como un molde para fabricar coches, o figuras de plastelina
		//Con una CLASE o molde creo OBJETOS que serán los coches, o las figura de plastelina
		//EL creador de coches es la CLASE y cada coche es un OBJETO
		//El molde de la plastelina es la CLASE y cada figura de plastelina es el OBJETO
		//Hay una CLASE, pero puede haber muchos OBJETOS
		
		//Aplicamos terminología de Programación Orientada a Objetos
		//Un Objeto es una "instancia" de una Clase. 
		//Un Objeto tiene una "identidad" y un "estado".
		//La "identidad" se define por su identificador.
		//Su "estado" se define por el valor de sus atributos.
		//Su "comportamiento" queda determinado por el 
		//comportamiento de la clase a la que pertenece
		//Actuamos con los objetos medinate lo "metodos" 
		//que publica

		// CLASES; Recordar, son como moldes para definir objetos
		
		class Circulo {
			
			int x; // Atributo. Posición x en el plano
			int y; // Atributo. Posición y en el plano
			int radio; //Atributo. Radio del círculo
		}
		
		//Ahora hemos definido la Clase Circulo (o el molde)
		//pero todavía no hemos generado (instanciado) ningún objeto.
		//Para generar un objeto, "instanciamos" la Clase
		
		Circulo circulo1 = new Circulo(); //circulo1 es el identificador de un Objeto, no es el Objeto. 
		Circulo circulo2 = new Circulo(); //circulo2 es el identificador de un Objeto, no es el Objeto. 
		
		//Ahora tenemos dos objetos generados con el molde Circulo. 

	
		//ELEMENTOS DE UNA CLASE
		//Definimos la información que almacena un objeto mediante sus atributos. 
	
		class Vehiculo {
			
			//Atributos del Objeto
			String matricula;
			String marca;
			String modelo;
			int precio;
			boolean electrico;
			boolean hibrido;
			
		}
		
		//Instanciamos la clase Vehiculo para crear Objetos
		Vehiculo v1 = new Vehiculo(); // v1 es el identificador del Objeto 
		Vehiculo v2 = new Vehiculo(); // v2 es el identificador del Objeto 
		
		//Hemos visto que el Objeto puede tener "atributos" 
		//Veamos cómo los empleamos para definir su "estado"
		
		class Vehiculo2 {
			
			//Atributos de un objeto
			String matricula;
			String marca;
			String modelo;
			int precio;
			boolean electrico;
			boolean hibrido;
			
			//Metodo constructor
			//mismo nombre que la clase y se ejecuta
		    //automáticamente cuando se instancia la clase
			//y se utiliza para inicializar los atributos 
			
			public Vehiculo2 (String matricula,
				String marca,
				String modelo,
				int precio,
				boolean electrico,
				boolean hibrido) {
				
					this.matricula = matricula;
					this.marca = marca;
					this.modelo = modelo;
					this.precio = precio;
					this.electrico = electrico;
					this.hibrido = hibrido;
			}
			
		}
		
		//Instanciamos la clase Vehiculo2
		Vehiculo2 v3 = new Vehiculo2("1234JXC", "Ford", "Fiesta", 14000, false, true);
		Vehiculo2 v4 = new Vehiculo2("4321PRX", "Renault", "Megane", 20000, true, false);
		
		//Ahora tenemos dos Objetos Vehiculo2, v3 y v4, cuyos atributos son diferentes
		//Es como crear dos objetos con un molde de plastelina
		//pero con plastelina diferente (color, tipo plastelina)
		//Son instancias de la misma CLase, pero en absoluto son el mismo objeto
		
		//Para consultar los valors de sus atributos y
		//para asignar nuevos valores se usan los "get" y "set"
		//get --> Consultar valores
		//set --> Modificar su estado (inicializado con el constructor)
		
		
		class Vehiculo3 {
			
			//Atributos de un objeto
			private String matricula;
			private String marca;
			private String modelo;
			private int precio;
			private boolean electrico;
			private boolean hibrido;
			
			//Metodo Constructor
			public Vehiculo3 (String matricula,
				String marca,
				String modelo,
				int precio,
				boolean electrico,
				boolean hibrido) {
				
					this.matricula = matricula;
					this.marca = marca;
					this.modelo = modelo;
					this.precio = precio;
					this.electrico = electrico;
					this.hibrido = hibrido;
			}
			
			//Métodos Get y Set para obtener los valores y modificarlos
			public String get_matricula() {
				return this.matricula;
			}
			public String get_marca() {
				return this.marca;
			}
			public String get_modelo() {
				return this.modelo;
			}
			public int get_precio() {
				return this.precio;
			}
			public boolean get_electrico() {
				return this.electrico;
			}
			public boolean get_hibrido() {
				return this.hibrido;
			}
			public void set_precio(int precio) {
				this.precio = precio;
			}
			
		}
		
		//Instanciamos la clase para crear el objeto y mostramos sus valores
		Vehiculo3 v5 = new Vehiculo3("9999XXX", "Seat", "Leon", 34000, false, true);
		Vehiculo3 v6 = new Vehiculo3("777ABC", "Mercedes", "A220D", 44000, false, false);
		
		//Mostramos los valores para v5
		System.out.println("Vehiculo de matricula "+ v5.get_matricula());
		System.out.println("es marca "+ v5.get_marca());		
		System.out.println("es modelo "+ v5.get_modelo());
		System.out.println("y vale "+ v5.get_precio());
		if (v5.get_electrico()) {
			System.out.println("es electrico");
		} else if (v5.get_hibrido()) {
			System.out.println("es hibrido");
		} else {
			System.out.println("es combustión");
		}
		//Cambiamos el precio de v5
		v5.set_precio(24000);
		System.out.println("y ahora vale "+ v5.get_precio());
	
		//Mostramos los valores para v6
		System.out.println("Vehiculo de matricula "+ v6.get_matricula());
		System.out.println("es marca "+ v6.get_marca());		
		System.out.println("es modelo "+ v6.get_modelo());
		System.out.println("y vale "+ v6.get_precio());
		if (v6.get_electrico()) {
			System.out.println("es electrico");
		} else if (v6.get_hibrido()) {
			System.out.println("es hibrido");
		} else {
			System.out.println("es combustión");
		}

		
		class Vehiculo4 {
			
			//Atributos de un objeto
			private String matricula;
			private String marca;
			private String modelo;
			private int precio;
			private boolean electrico;
			private boolean hibrido;
			
			//Método Constructor
			public Vehiculo4 (String matricula,
				String marca,
				String modelo,
				int precio,
				boolean electrico,
				boolean hibrido) {
				
					this.matricula = matricula;
					this.marca = marca;
					this.modelo = modelo;
					this.precio = precio;
					this.electrico = electrico;
					this.hibrido = hibrido;
			}
			
			//Métodos Get y Set para obtener los valores y modificarlos
			public String get_matricula() {
				return this.matricula;
			}
			public String get_marca() {
				return this.marca;
			}
			public String get_modelo() {
				return this.modelo;
			}
			public int get_precio() {
				return this.precio;
			}
			public boolean get_electrico() {
				return this.electrico;
			}
			public boolean get_hibrido() {
				return this.hibrido;
			}
			public void set_precio(int precio) {
				this.precio = precio;
			}
			
		}

		
		//Vamos a mejorar nuestra clase con más métodos
		
		class Vehiculo5 {
			
			//Atributos de un objeto
			private String matricula;
			private String marca;
			private String modelo;
			private int precio;
			private boolean electrico;
			private boolean hibrido;
			
			//Método Constructor
			public Vehiculo5 (String matricula,
				String marca,
				String modelo,
				int precio,
				boolean electrico,
				boolean hibrido) {
				
					this.matricula = matricula;
					this.marca = marca;
					this.modelo = modelo;
					this.precio = precio;
					this.electrico = electrico;
					this.hibrido = hibrido;
			}
			
			//Métodos Get y Set para obtener los valores y modificarlos
			public String get_matricula() {
				return this.matricula;
			}
			public String get_marca() {
				return this.marca;
			}
			public String get_modelo() {
				return this.modelo;
			}
			public int get_precio() {
				return this.precio;
			}
			public boolean get_electrico() {
				return this.electrico;
			}
			public boolean get_hibrido() {
				return this.hibrido;
			}
			public void set_precio(int precio) {
				this.precio = precio;
			}
			
			//Método que muestra los atributos del Objeto
			
			public void muestra_coche() {
				System.out.println("Vehiculo de matricula "+ this.matricula);
				System.out.println("Vehiculo de marca "+ this.marca);
				System.out.println("Vehiculo de modelo "+ this.modelo);
				System.out.println("Vehiculo de precio "+ this.precio);
				System.out.println("Vehiculo electrico "+ this.electrico);
				System.out.println("Vehiculo hibrido "+ this.hibrido);
			}
		}
		
		
		//Instanciamos Clase Vehiculo5 y llamamos al método que nos muestra sus atributos 
		Vehiculo5 v7 = new Vehiculo5("777ABC", "Mercedes", "A220D", 44000, false, false);
		v7.muestra_coche();
		
		//Demostració de que cuando instancimos una Clase tenemos la referencia al Objeto y no el Objeto
		
		Vehiculo5 v8;
		v8 = v7;
		System.out.println(v7);
		System.out.println(v8);
		v8.muestra_coche();
	}
	
}
