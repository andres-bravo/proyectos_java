package presentacion;

import java.util.Scanner;

import modelo.GestionNotas;

public class Notas {
	private static void mostrarNotas(Double[] valores) {
		for(Double d:valores) {
			System.out.print(d+",");
		}
		System.out.println();
	}	
	public static void main(String[] args) {
		GestionNotas gnotas=new GestionNotas();		
		//creamos Objeto de la clase Scanner leer opciones menu
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		double nota = 0;
		//Variable global de gestion de notas
		//ArrayList<Integer> notas = new ArrayList<>();
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
	    		nota = sc.nextDouble();
	    		//Llamar a Añadir
	    		gnotas.agregarNota(nota);
	    		break;
	    	case 2:
	    		//Llamar a visualizarAprobados
	    		System.out.println(gnotas.aprobados());
	    		break;
	    	case 3:
	    		//Llamar a notaMedia
	    		System.out.println("Nota Media:" + gnotas.media());
	    		break;
	    	case 4:
	    		//Llamar a mostrarTodas
	    		System.out.println("Listado de notas");
	    		mostrarNotas(gnotas.devolverNotas());
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


