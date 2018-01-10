package principal;

import java.util.ArrayList;

public class PruebaLista {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>();
		num.add(25);
		num.add(10);
		num.add(1, 50);
		for (Integer i:num) {
			System.out.println(i);
		}
		//num.forEach(System.out.println());
		//Convierto el ArrayList a un Array
		Integer[] miarray = num.toArray(new Integer[0]);
		for (Integer i:miarray) {
			System.out.println(i);
		}
		miarray[0]=miarray[0]+100;
		//num.get(0) no se ve modificado porque los Integer son Inmutables
		//en el array para la posición 0 se crea otro objeto con el contenido 0+100
		System.out.println("Posición 0 del ArrayList de Integer: " + num.get(0));
		System.out.println("Posición 0 del Array de Integer: " + miarray[0]);

		//Creamos ArrayList de StringBuilder
		ArrayList<StringBuilder> sb = new ArrayList<>();
		sb.add(new StringBuilder("shell"));
		sb.add(new StringBuilder("java"));
		sb.add(new StringBuilder("python"));
		for (StringBuilder i:sb) {
			System.out.println(i);
		}
		
		StringBuilder[] miarraySB = sb.toArray(new StringBuilder[0]);
		for (StringBuilder i:miarraySB) {
			System.out.println(i);
		}
		//Modifico el array
		miarraySB[2].append("version");
		/*Imprimo el ArrayList de StringBuilder posicion 2 para ver si se ha modificado
		  Veremos que imprime "python version" ya que ha sido modificado al modificar el array
		  Esto sucede porque StringBuilder es mutable*/
		System.out.println(sb.get(2));
	}

}
