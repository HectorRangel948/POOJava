package ejercicioProducto;

public class Producto {
	
	//Atributos
	String nombreProducto;
	float precio;
	float descuento;
	
	
	//Constructor
	public Producto(String nombreProducto, float precio, float descuento) {
		this.nombreProducto = nombreProducto;
		this.precio = precio;
		this.descuento = descuento;
	}
	
	//Método
	public void mostrarInfo() {
		System.out.println("Nombre del producto: "+ nombreProducto);
		System.out.println("Precio: "+ precio);
		System.out.println("Descuento: " + descuento);
	}
	
	public String operacionDescuento() {
		float cantidadADescontar = descuento*precio/100;
		float precioConDescuento = precio-(cantidadADescontar);
		String resultado;
		resultado ="Cantidad a descontar: " + cantidadADescontar +"\n"+ "Precio con descuento: " + precioConDescuento;
		return resultado;
	}
}
