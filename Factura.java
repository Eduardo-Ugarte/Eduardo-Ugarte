package lab02;

public class Factura implements PorPagar {
	
	private String numeroPieza;
	private String descripcionPieza;
	private int cantidad;
	private double PrecioArticulo;
	
	public Factura(String numeroPieza, String descripcionPieza, int cantidad, double precioArticulo) {
		super();
		this.numeroPieza = numeroPieza;
		this.descripcionPieza = descripcionPieza;
		this.cantidad = cantidad;
		this.PrecioArticulo = precioArticulo;
	}
	
	public String getNumeroPieza() {
		return numeroPieza;
	}

	public void setNumeroPieza(String numeroPieza) {
		this.numeroPieza = numeroPieza;
	}

	public String getDescripcionPieza() {
		return descripcionPieza;
	}

	public void setDescripcionPieza(String descripcionPieza) {
		this.descripcionPieza = descripcionPieza;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		if(cantidad>0)
			this.cantidad=cantidad;
		else
			this.cantidad=0;
	}

	public double getPrecioArticulo() {
		return PrecioArticulo;
	}

	public void setPrecioArticulo(double precioArticulo) {
		if (precioArticulo>0)
			this.PrecioArticulo=precioArticulo;
		else
			this.PrecioArticulo=0;
	}

	@Override
	public String toString() {
		return "Pieza No. :" + this.numeroPieza + "\nDescripcion:" + this.descripcionPieza +this.cantidad + "\n Precio: " + this.PrecioArticulo;
	}

	public double obtenerMontoPago() {
		return this.cantidad*this.PrecioArticulo;
	}

}
