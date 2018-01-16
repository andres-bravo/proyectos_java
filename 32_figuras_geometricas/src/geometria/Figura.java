package geometria;

public abstract class Figura {
	private String color;
	//Constructor clase abstracta
	public Figura(String color) {
		this.color=color;
	}
	//Metodos no abstractos
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	//Metodo abstracto para ser implementado por clase hija
	public abstract double superficie();
	
}
