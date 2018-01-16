package geometria;

public class Circulo extends Figura{
	private int radio;

	public Circulo(String color, int radio) {
		super(color);
		this.radio = radio;
	}
	public int getRadio() {
		return radio;
	}
	public void setRadio(int radio) {
		this.radio = radio;
	}
	public double superficie() {
		return(Math.PI*Math.pow(radio, 2));
	}
	
}
