package geometria;

public class Triangulo extends Figura{
	private int base;
	private int altura;
	public Triangulo (String color, int base, int altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}

	public double superficie() {
		//Divido por 2.0 para que nos devuelva double si no devolveria un entero.
		return((this.base*this.altura)/2.0);
	}
	
}
