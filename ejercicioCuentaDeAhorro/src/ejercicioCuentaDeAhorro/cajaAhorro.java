package ejercicioCuentaDeAhorro;

public class cajaAhorro extends Cuenta{
	
	//1.-Atributos los hereda de cuenta
	
	//2.-Métodos (heredar datos)
	public cajaAhorro(String titular, float cantidad) {
		super(titular, cantidad);
	}
	
	public void imprimirDatos() {
		System.out.println("Titular: "+ titular);
		System.out.println("Cantidad: " + cantidad);
	}//imprimir datos
	
	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
	}//toString
}//cajaAhorro
