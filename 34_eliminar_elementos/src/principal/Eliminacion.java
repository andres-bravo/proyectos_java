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
		//Tengo un método que utilizando expresion lambda puedo hacer esto
		//removeIf(Predicate<? super E> filter)
		//numeros.removeIf((Integer n)->{return n<15;}); //Expresion larga
		numeros.removeIf(n->n<15); //Expresion reducida
		
		//Recorro con funcion lambda
		numeros.forEach(n->System.out.println(n));

	}

}
