package geometria;

public class Test {

	public static void main(String[] args) {
		//aunque no se utiliza explicaitamente la clase Punto, debido
		//a la herencia, se ejecutan también los bloques estáticos
		//y de inicialización de instancia
		Punto3D pd=new Punto3D(7,2,8);
		pd.imprimir();

	}

}
