package test;
import ejercicioCuentaDeAhorro.cajaAhorro;
import ejercicioCuentaDeAhorro.PlazoFijo;

public class ClaseTest {

	public static void main(String[] args) {

//Instancia #1 (cuentaAhorro)
		cajaAhorro instancia1 = new cajaAhorro("Héctor", 155.25f); //Cuando no quiero polimorfear
		
		//Instancia #2
		PlazoFijo instancia2 = new PlazoFijo("Alejandro", 152.5f, 12, 5.0f);
		
		instancia1.imprimirDatos();
		System.out.println();
		instancia2.mostrarInformacion();
	}

}
