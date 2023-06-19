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
		super(nombre, edad, correo, telefono);
		this.numEmpleado = numEmpleado;
		this.nss = nss;
		this.puesto = puesto;
	}
	
	//Sobrecargas de Persona
	public Empleado(String nombre, int edad, String correo) {
		super(nombre, edad, correo);
		this.numEmpleado = numEmpleado;
		this.nss = nss;
		this.puesto = puesto;
		
		// TODO Auto-generated constructor stub
	}

	public Empleado(String nombre, int edad) {
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

}
