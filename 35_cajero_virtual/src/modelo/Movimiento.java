package modelo;

public class Movimiento {
	private String tipo;
	private double cantidad;
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public Movimiento(String tipo, double cantidad) {
		super();
		this.tipo = tipo;
		this.cantidad = cantidad;
	}	
}
