package entidades;

public class Persona {
	
	//1.-Propiedades o atributos
	
	public String nombre;
	public int edad;
	public String correo;
	public String telefono;
	
	//2.-Constructor
	
	public Persona(String nombre, int edad, String correo, String telefono) {
		this.nombre = nombre;
		this.edad = edad;
		this.correo = correo;
		this.telefono = telefono;
	}//Cierre de constructor
	
	//Sobrecarga de método (overloading)
	public Persona(String nombre, int edad, String correo) {
		this.nombre = nombre;
		this.edad = edad;
		this.correo = correo;
	}
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	 
	//3.-Métodos
	
	public void mostrarInformacion() {
		System.out.println("Nombre: "+ nombre);
		System.out.println("Edad: "+ edad);
		System.out.println("Correo: "+ correo);
		System.out.println("Telefono: "+ telefono);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instancia de un objeto Persona
		Persona Felipe = new Persona("Felipe", 31, "Felipe.maqueda@idr.edu.mx","5512345678");
		Persona Hector = new Persona("Héctor", 28, "hector.range@gmail.com", "8184592356");
		Persona Messi = new Persona("Messi", 34, "MessiElNumeroUno@fifa.com", "10");
		Persona Cristiano = new Persona("Cristiano", 35, "ElBicho@cocano.com", "777");
		Persona Espaiderman = new Persona("Pedro Parques", 26, "Espaiderman@gmail.com", "911");
		Felipe.mostrarInformacion();
		Hector.mostrarInformacion();
		Messi.mostrarInformacion();
		Cristiano.mostrarInformacion();
		Espaiderman.mostrarInformacion();
	}

}
