package geometria;

public  class Punto {
	private int x,y;
	static{ 
		System.out.println("static de Punto");
	}
	{
		System.out.println("inicialización de Punto");
	}
	public Punto(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void imprimir() {
		
		System.out.println(x+","+y);
	}
}
