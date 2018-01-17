package principal;

import java.util.ArrayList;

public class Eliminacion {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList();
		numeros.add(10);
		numeros.add(8);
		numeros.add(15);
		numeros.add(7);
		numeros.add(41);
		numeros.add(11);
		/*
		for (Integer i:numeros) {
			if (i<15) numeros.remove(i);//foreach es sólo de lectura entoces falla al eliminar un elemento.
		}
		*/
		//Incrementamos en dos cada elemento esto se hace con replaceAll que recibe un UnayOperator
		//recibe y devuelve el mismo tipo
		numeros.replaceAll(n->n+2);
		
		//Tengo un método que utilizando expresion lambda puedo hacer esto
		//removeIf(Predicate<? super E> filter)
		//numeros.removeIf((Integer n)->{return n<15;}); //Expresion larga		
		numeros.removeIf(n->n<15); //Expresion reducida
		
		//Recorro con funcion lambda
		numeros.forEach(n->System.out.println(n));

	}

}
