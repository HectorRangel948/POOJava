package ejercicioProducto;

public class Consumidor extends Producto{
	String nombreConsumidor;
	int numeroUsuario;


	public Consumidor(String nombreProducto, float precio, float descuento, String nombreConsumidor, int numeroUsuario) {
		super(nombreProducto, precio, descuento);
		this.nombreConsumidor = nombreConsumidor;
		this.numeroUsuario = numeroUsuario;
	}
	
		
	public static void main(String[] args) {
		Consumidor consumidor1 = new Consumidor("Ganzito", 18.5f, 15.0f, "Amlo", 666 );
		consumidor1.mostrarInfo();
		System.out.println(consumidor1.operacionDescuento());
	}
}
