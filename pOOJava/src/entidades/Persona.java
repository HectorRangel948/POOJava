
/*
 * Notas para trabajar con POO en JAVA
 * 
 * 1.-Establecemos los pasos para trabajar con nuestras clases definiendo el siguiente orden:
 * -Primero nuestras propiedades o atributos usando variables de JAVA
 * -Definimos un constructor con parámetros
 * 
 * Constructor por default, 
 * Creando un contructor en persona que tinenen como trabajo tomar en cuenta los parámetros que se le están pasando y crear un objeto basado en ellos
 * Definimos un constructor con parámetros (se define en la clase)
 * También tenemos un constructor por defecto que se define en la instancia de la clase, el inconveniente es que solo podemos usar uno de los dos
 * 
 * Por último definimos los métodos que nuestro objeto va a utilizar. Aquí utilizamos la teoría de funciones (functiones vacías, funciones que terornan un tipo de valor)
 *
 * Notas adicionales
 * 
 * Sobrecarga de métodos
 * 
 * La finalidad de la sobrecarga de métodos es utilizar el mismo nombre del método (Persona) e ir variando sus parámetros, con esto evitamos usar "Persona1", "Persona2", etc. para utilizar el mismo método 
 * 
 * Hay que recordar que los datos generalmente vienen del front (formulario). La sobrecarga nos ayuda en comprender distintas situaciones donde al vez uno de los campos solicitados en el formulario no sea requerido u obligatorio de llenar. Utilizando la sobrecarga, evitamos que el dato se asigne incorrectamente (es decir, que quede como indefinido), ya que esto podria acarrear errores en la ejecucion de nuestro codigo. De preferencia, es mejor que el dato quede como nulo.  
 *  
 * */


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
