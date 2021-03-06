package presentacion;

import java.util.ArrayList;
import java.util.Scanner;
import modelo.Movimiento;
import modelo.CuentaMovimientos;

/*
 * Al inicial el programa, se solicita al usuario el saldo inicial y el 
 * l�mite de la cuenta (m�xima cantidad a extraer en un proceso)
 * Con herencia a partir de Cuenta hacer todo esto.
 * Una vez solicitado l�mite de la cuenta motrar el menu:
 * 1. Ingresar
 * 2. Extraer
 * 3. Movimientos y saldo
 * 4. Salir
 * 
 * 1. Se solicita la cantidad a ingresar y se procede al ingreso
 * 2. Se solicita la cantidad a extraer, si es inferior o igual al l�mite
 * se realiza la extraccion. si no no se hace
 * 3. Muestra los movimientos realizados en la cuenta y el saldo final.
 * Cada movimiento se caracteriza por un tipo (ingreso o extraccion) y una cantidad.
 */
public class Cajero {

	public static void main(String[] args) {
		int op;
		double saldo,limite,cantidad;
		boolean resultado;
		ArrayList<Movimiento> mov = new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca Saldo Inicial");
		saldo = Double.parseDouble(sc.nextLine());
	    System.out.println("Introduzca Limite en Cajero");
	    limite =Double.parseDouble(sc.nextLine());
	    CuentaMovimientos cuenta = new CuentaMovimientos(saldo,limite);
	    System.out.println("Saldo:"+cuenta.getSaldo()+ " Limite: "+ cuenta.getLimite());
		do{
			System.out.println("---------------MENU DE OPCIONES-----------------");
			System.out.println("1.- Ingresar");
		    System.out.println("2.- Extraer");
		    System.out.println("3.- Movimientos y Saldo");
		    System.out.println("4.- Salir");
		    System.out.println("------------------------------------------------");
		    op=Integer.parseInt(sc.nextLine());
		    switch(op){
		    	case 1:
		    		System.out.println("Cantidad a Ingresar:");
		        cantidad=Double.parseDouble(sc.nextLine());		       
		        	cuenta.ingresar(cantidad);
		        	System.out.println("Saldo:"+cuenta.getSaldo()+ " Limite: "+ cuenta.getLimite());
		        break;
		    case 2:
	    			System.out.println("Cantidad a Extraer:");
		        cantidad=Double.parseDouble(sc.nextLine());
		        if (cantidad<=cuenta.getLimite()) {
		        		cuenta.extraer(cantidad);
		        		System.out.println("Saldo:"+cuenta.getSaldo()+ " Limite: "+ cuenta.getLimite());
		        }
		        else
		        		System.out.println("Ha superado el limite.");
		        break;
		    case 3:
		    		mov = cuenta.listaMovimientos();
		    		System.out.println("---------------LISTADO DE MOVIMIENTOS----------");
		    		mov.forEach(n->System.out.println("Tipo: "+ n.getTipo()+" Cantidad: "+n.getCantidad()));
		    		System.out.println("---------------SALDO---------------------------");
		    		System.out.println("Saldo: "+ cuenta.getSaldo());
		        break;
		    case 4:
		        	break;
		    default:
		        System.out.println("debes escribir una opcion valida");
		    }
		    }while(op!=4);
	}

}
