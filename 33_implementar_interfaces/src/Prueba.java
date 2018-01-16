
public class Prueba {

	public static void main(String[] args) {
		//Prueba del caso de Implementar interfaz 1
		InterPrueba t=new Test();  //Creo la clase de su interfaz no de la clase que lo implementa
		t.print();
		
		//Opcion 2 Implementar una interfaz: clase anonima.
		InterPrueba t2=new InterPrueba() {
			
			@Override
			public void print() {
				//Ventaja que puedo redefinir el m�todo o acceder atributos de esta clase.
				//Desventaja, que incrusto c�digo de clase aqu� y si tiene muchos m�todos ser�a enorme.
				System.out.println("Implementaci�n Interfaz Metodo 2");
			}
		};
		t2.print();
		
		//Opci�n 3 Implementar con expresion lambda Opci�n 3
		//Es una implementaci�n al vuelo de un interfaz funcional e una s�la funcion ya que 
		//no le digo el m�todo s�lo la imlementaci�n.
		//Devuelve un objeto que implementa el m�todo.
		InterPrueba t3=()->System.out.println("Implementaci�n Interfaz Metodo 3 -- Expresion Lambda");
		t3.print();
		t3.print2();
	}

}
