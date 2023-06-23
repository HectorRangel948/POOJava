package ejercicioCuentaDeAhorro;

public class PlazoFijo extends Cuenta{
	
	//1.-Atributos
	int plazo;
	double interes;
	
	
	//2.-Método para calcular importe del interés 
	public PlazoFijo(String titular, float cantidad, int plazo, double interes) {
		super(titular, cantidad);
		this.plazo = plazo;
		this.interes = interes;
		// TODO Auto-generated constructor stub
	}
	
	//Método para obtener el importe de interés
	public double obtenerImporteInteres() {
		return cantidad * (interes/100);
	}//obtener importe de interes 
	
	//Método pra mostrar información
	public void mostrarInformacion() {
		System.out.println("Información de la cuenta Plazo fijo");
		imprimirDatos(); //método imprimir datos de la clase cuenta
		System.out.println("Plazo: "+plazo);
		System.out.println("Interés: "+ interes);
		System.out.println("Total de interés: "+obtenerImporteInteres());
	}
	
}
