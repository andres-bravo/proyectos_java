package geometria;

public class Punto3D extends Punto {
	private int z;
	public Punto3D(int x, int y, int z) {
		super(x,y);		
		this.z=z;
	}
	
	//sobrescritura de imprimir
	public void imprimir(int n) {
		//System.out.println(getX()+","+getY()+","+z);
		super.imprimir();
		System.out.println(","+z);
	}
}
