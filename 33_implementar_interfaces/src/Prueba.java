
public class Prueba {

	public static void main(String[] args) {
		//Prueba del caso de Implementar interfaz 1
		InterPrueba t=new Test();  //Creo la clase de su interfaz no de la clase que lo implementa
		t.print();
		
		//Opcion 2 Implementar una interfaz: clase anonima.
		InterPrueba t2=new InterPrueba() {
			
			@Override
			public void print() {
				//Ventaja que puedo redefinir el método o acceder atributos de esta clase.
				//Desventaja, que incrusto código de clase aquí y si tiene muchos métodos sería enorme.
				System.out.println("Implementación Interfaz Metodo 2");
			}
		};
		t2.print();
		
		//Opción 3 Implementar con expresion lambda Opción 3
		//Es una implementación al vuelo de un interfaz funcional e una sóla funcion ya que 
		//no le digo el método sólo la imlementación.
		//Devuelve un objeto que implementa el método.
		InterPrueba t3=()->System.out.println("Implementación Interfaz Metodo 3 -- Expresion Lambda");
		t3.print();
		t3.print2();
	}

}
