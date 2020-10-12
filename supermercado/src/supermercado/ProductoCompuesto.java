package supermercado;

public class ProductoCompuesto extends Producto {
	
	Producto productos[];
	
	public ProductoCompuesto(String id, String descripcion, double tarifaIva, Producto[] productos) {
		super(id, descripcion, tarifaIva);
		this.productos = productos;
	}

	@Override
	public double getValorIva() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getValorVenta() {
		// TODO Auto-generated method stub
		return 0;
	}

}
