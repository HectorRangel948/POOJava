package entidades;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado EvilFelipe = new Empleado("Evil Felipe", 31, "evilFelipe@mail.com", "815458", "asdf456", "NSS666", "Bellboy");
		EvilFelipe.mostrarInformacion();
		
		Empleado Pikachu = new Empleado("Pikachu", 50, "AAA111", "654456", "Cocinero");
		Pikachu.mostrarInformacion();
	}

}
