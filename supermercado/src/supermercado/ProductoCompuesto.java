package supermercado;

public class ProductoCompuesto extends Producto {
	
	Producto productos[];
	
	public ProductoCompuesto(String id, String descripcion, double tarifaIva, Producto[] productos) {
		super(id, descripcion, tarifaIva);
		this.productos = productos;
	}

	public Producto[] getProductos() {
		return productos;
	}

	public void setProductos(Producto[] productos) {
		this.productos = productos;
	}

	@Override
	public double getValorIva() {
		double valor = 0;
		//usando un for clasico
		for(int i = 0 ; i < productos.length ; i++) {
			valor += productos[i].getValorIva();
		}			
		return valor;
	}

	@Override
	public double getValorVenta() {
		double valor = 0;
		for ( Producto producto: productos) {
			valor += producto.getValorVenta();
		}
		return valor;
	}
	
	@Override
	public String toString() {
		String aux = super.toString() + "ProductoCompuesto [ productos = ";
		
		for(Producto producto: productos) {
			aux += "\n\t" + producto.toString();
		}
		aux += "\n\t"
				+ "Valor IVA " + getValorIva()
				+ " Valor Venta " + getValorVenta();
				
		
		return aux;
	}

}
