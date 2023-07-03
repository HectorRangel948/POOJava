package entidades;

import colecciones.Cliente;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado EvilFelipe = new Empleado("Evil Felipe", 31, "evilFelipe@mail.com", "815458", "asdf456", "NSS666", "Bellboy");
		EvilFelipe.mostrarInformacion();
		
		Empleado Pikachu = new Empleado("Pikachu", 50, "AAA111", "654456", "Cocinero");
		Pikachu.mostrarInformacion();
		
		//Instancia de un cliente
		System.out.println();
		System.out.println("Instancia de un cliente");
		
		Cliente Jesus = new Cliente("Jesus Gonzalez", "ABC123", 157005.54f, "1525");
		Jesus.mostrarInfoCliente();
		
		//Modificación de un atributo
		Jesus.nombre = "Evil Jesus";
		Jesus.setCuentaBancaria("1255");
		
		System.out.println(Jesus.getCuentaBancaria());
		
		System.out.println();
		Jesus.mostrarInfoCliente();
	}

}

