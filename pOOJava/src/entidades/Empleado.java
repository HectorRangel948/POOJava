/*
 * Herencia en la POO
 * 
 * Nos permite heredar atributos y métodos con la finalidad de reutilizar código y generar una relación entre clases superiores (padres) y las subclases(hijos).
 * 
 * Superclase (clase superior) es la clase de quien vamos a heredar (persona) subclase (clase hijo) es donde vamos a poner lo que heredamos (empleado)
 * 
 * Para heredar, usamos una palabra reservada llamada extends. Esta palabra sse coloca al lado del nombre de mi clase (empleado), y después definimos el lugar de donde nos vamos  a traer las cosas que queremos heredar (Persona).
 * 
 *  Para heredar constructores de una forma muy rápida, daremos click derecho sobre nuestro editor de código
 * 
 * */


package entidades;

//primero tengo que dar la instrucción de que quiero heredar
public class Empleado extends Persona{  //Podra traer cosas de Persona
	//1.-Atributos o propiedades
	
	public String numEmpleado;
	public String nss;
	public String puesto;
	
	
	//2.-Constructor con parámetros
	
	//Click derecho, opción source, generar de una superclase
	public Empleado(String nombre, int edad, String correo, String telefono, String numEmpleado, String nss, String puesto) {
		super(nombre, edad, correo, telefono); //Con la palabra super evitamos repetir los this.
		this.numEmpleado = numEmpleado; //Solo defino los this. que me hacen falta
		this.nss = nss;
		this.puesto = puesto;
	}
	
	
	

	//Sobrecargas de Persona/*
	public Empleado(String nombre, int edad, String correo, String numEmpleado, String nss, String puesto ) {
		super(nombre, edad, correo);
		this.numEmpleado = numEmpleado;
		this.nss = nss;
		this.puesto = puesto;
		
		// TODO Auto-generated constructor stub
	}

	public Empleado(String nombre, int edad, String numEmpleado, String nss, String puesto) {
		super(nombre, edad);
		this.numEmpleado = numEmpleado;
		this.nss = nss;
		this.puesto = puesto;
		// TODO Auto-generated constructor stub
	}


	//Método para imprimir información
	public void mostrarInformacion(){
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Correo: " + correo);
		System.out.println("Teléfono: " + telefono);
		System.out.println("Número de empleado: " + numEmpleado);
		System.out.println("NSS: " + nss);
		System.out.println("Puesto: " + puesto);
	}


	//4 toString
	//Es un método de Java, se usa para obtener una representación en cadena de texto del objeto ya que si lo mandamos a imprimir como tal solo obtendremos un número de referencia. Es similar al método stringify de JS. 
	
	
	@Override
	public String toString() {
		return "Empleado [numEmpleado=" + numEmpleado + ", nss=" + nss + ", puesto=" + puesto + "]";
	}

}
