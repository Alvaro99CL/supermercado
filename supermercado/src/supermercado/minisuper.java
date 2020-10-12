package supermercado;

public class minisuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProductoPrecioFijo prod1 = new ProductoPrecioFijo("1", "Bebida 3L", 0.19 , 2000);
		ProductoPrecioFijo prod2 = new ProductoPrecioFijo("2", "Vino Tarapaca - Merlot - Reserva", 0.19 , 4000);
		
		ProductoPrecioVariable prod3 = new ProductoPrecioVariable("3", "Salame Italiano", 0.19 , "Kg", 0.200 , 8000);
		ProductoPrecioVariable prod4 = new ProductoPrecioVariable("4", "Aceituna Negra", 0.19 , "Kg", 0.400 , 6000);
		ProductoPrecioVariable prod5 = new ProductoPrecioVariable("5", "Queso Trozo", 0.19 , "Kg", 0.500 , 8000);
		
		Producto productos[] = {prod1 , prod2, prod3, prod4, prod5};
		ProductoCompuesto prod6 = new ProductoCompuesto("6","Kit Tabla basica", 0.19 , productos);
		
		System.out.println(prod1);
		System.out.println(prod2);
		System.out.println(prod3);
		System.out.println(prod4);
		System.out.println(prod5);
		System.out.println(prod6);
	}

}
