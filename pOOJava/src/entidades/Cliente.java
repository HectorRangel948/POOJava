package entidades;

public class Cliente {
	//Atributos
	public String nombre;
	private String cuentaBancaria;
	private float saldo;
	private String nip;
	
	
	//Constructor
	public Cliente(String nombre, String cuentaBancaria, float saldo, String nip) {
		super();
		this.nombre = nombre;
		this.cuentaBancaria = cuentaBancaria;
		this.saldo = saldo;
		this.nip = nip;
	}
	
	//Getter y Setter Cuenta bancaria
	//Getter solo muestra la información del atributo sin tener que hacerlo public
	public String getCuentaBancaria() {
		return cuentaBancaria;
	}

	//Setter nos permite evaluar la entrada que intentamos asignarle a la variable y así evitar que se modifque siendo public con valores que no son adecuados
	public void setCuentaBancaria(String cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}

	//Getter y Setter Saldo
	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	//Getter y Setter NIP
	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}
	

	//Métodos
	public void mostrarInfoCliente() {
		System.out.println("El nombre es: " + nombre);
		System.out.println("La cuenta bancaria es: " + cuentaBancaria);
		System.out.println("El saldo es: " + saldo);
		System.out.println("El nip es: " + nip);
	}

	/*
	 * Encapsulamiento (1 de los 4 pilares de la POO)
	 * 
	 * Tiene que ver con la forma en como ocultamos algunos detalles de nuestra clase  (atributos y métodos). La gran ventaja de hacer esto es que podemos proteger los datos y el comportamiento de una clase. Cuando utilizamos los modificadores de acceso podemos controlar la forma en como se accede
	 * 
	 * Modificadores de acceso
	 * -public
	 * -private
	 * -protected
	 * -default (sin modificador de acceso)
	 * 
	 * Con esto buscamos evitar:
	 * -Reasignación de valores
	 * 	float cuenta = 157.548.75f
	 * cuenta = 00.0f;
	 * 
	 * Cuando declaramos nuestros atributos como privados, se impide el acceso a esta información (no podremos imprimirla en consola, ni mucho menos modificarla)
	 * 
	 * Jesus.nombre = sí puedo acceder porque la info es pública
	 * Jesus.saldo = no se muestra porque la info es privada
	 * 
	 *  Para solventar esto, usamos los getters y setters. El getter nos permite acceder al dato por medio de un método público llamado get, y también podemos modificar la información por medio del set(método público).
	 *  
	 *  jesus.getCuentaBancaria = sí puedo acceder a la info
	 *  jesus.setCuentaBancaria = sí puedo modificar la info
	 *  
	 *  
	 *  Ventajas del encapsulamiento
	 *  
	 *  Proteccion de datos: Cuando dejamos los datos en privado,, se evita que se sobreescriban, que se accedan directamente a ellos y se modifiquen de manera incontrolada.
	 *  
	 *  Control de acceso: Podemos usar validaciones o valores booleanos para tener acceso o no a la información (que un administrador pueda usar un setter para modificar algún dato en específico).
	 *  
	 *  Flexibilidad y mantenimiento: Podemos cambiar la implementación interna de nuestras clases (modificar el acceso, etc), sin modificar el código externo que la utiliza (herencia, etc).
	 *  
	 *  Abstacción:
	 * */

}
