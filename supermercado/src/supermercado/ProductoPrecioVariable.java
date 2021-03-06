package supermercado;

public class ProductoPrecioVariable extends Producto {
	private double cantidad;
	private double precioUM;//unidad de medida
	private String unidadMedida;
	
	
	public ProductoPrecioVariable(String id, String descripcion, double tarifaIva,
			String unidadMedida, double cantidad, double precioUM) {
		super(id, descripcion, tarifaIva);
		this.cantidad = cantidad;
		this.precioUM = precioUM;
		this.unidadMedida = unidadMedida;
	}
	
	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecioUM() {
		return precioUM;
	}

	public void setPrecioUM(double precioUM) {
		this.precioUM = precioUM;
	}

	public String getUnidadMedida() {
		return unidadMedida;
	}

	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}

	@Override
	public double getValorIva() {
		return getPrecioUM() * getCantidad() * getTarifaIva();
	}
	
	@Override
	public double getValorVenta() {
		return getPrecioUM() * getCantidad() + getValorIva();
	}
	
	@Override
	public String toString() {
		return super.toString()
				+ "PrecioVariable [cantidad=" + cantidad + ", precioPorUnidadDeMedida=" + precioUM
				+ ", unidadDeMedida=" + unidadMedida + "]"
				+ "\n\tValor Iva= " + getValorIva()
				+ " Valor Venta= " + getValorVenta();
	}
	
	
	
}
