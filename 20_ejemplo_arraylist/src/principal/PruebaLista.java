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
		//num no se ve modificado porque los Integer son Inmutables
		System.out.println(num.get(0));

		//Lo mismo con StringBuilder que es mutable como cualquier otro objeto
		//Hacerlo
		
		
	}

}
