package gestion_notas_alumnos;

import java.util.ArrayList;
import java.util.Scanner;

	
public class GestionNotas {
	//Metodo añadir notas
	private static void anyadirNota(int nota, ArrayList<Integer> notas) {
		notas.add(nota);
	}
	private static void mostrarTodas(ArrayList<Integer> notas) {
		for (Integer i:notas) {
			System.out.println(i);
		}
	}
	private static void verAprobados(ArrayList<Integer> notas) {
		for (Integer i:notas) {
			if (i>=5) 
				System.out.println(i);
		}		
	}
	private static void mostrarMedia(ArrayList<Integer> notas) {
		double media=0;
		for (Integer i:notas) {
			media+=i; 
		System.out.println("La Media es:"+media/notas.size());
		}		
	}
	public static void main(String[] args) {
		//creamos Objeto de la clase Scanner leer opciones menu
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		int nota = 0;
		//Variable global de gestion de notas
		ArrayList<Integer> notas = new ArrayList<>();
		while (opcion!=5) {
			System.out.println("Menu opciones");
			System.out.println("1.-Añadir nota.");
			System.out.println("2.-Ver Aprobados");
			System.out.println("3.-Nota Media");
			System.out.println("4.-Mostrar Todas");
			System.out.println("5.-Salir");
			opcion = sc.nextInt();
			switch (opcion){
	    	case 1:
	    		System.out.println("Introducir nota a añadir");
	    		nota = sc.nextInt();
	    		//Llamar a Añadir
	    		anyadirNota(nota,notas);
	    		break;
	    	case 2:
	    		//Llamar a visualizarAprobados
	    		verAprobados(notas);
	    		break;
	    	case 3:
	    		//Llamar a notaMedia
	    		System.out.println("Nota Media");
	    		mostrarMedia(notas);
	    		break;
	    	case 4:
	    		//Llamar a mostrarTodas
	    		System.out.println("Listado de notas");
	    		mostrarTodas(notas);
	    		break;
	    	case 5:
	    		//Salir
	    		break;
	    	default:
	    		System.out.println("opción no válida");
			}
		}
		sc.close();
	}
}
