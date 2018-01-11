package modelo;

import java.util.ArrayList;

public class GestionNotas {
	//Atributos que necesito en esta capa
	//almacen notas
	ArrayList<Double> notas = new ArrayList<>();
	//Metodos que necesito
	//Funciones del programa
	public void agregarNota(double nota) {
		notas.add(nota);
	}
	public int aprobados() {
		int ap=0;
		for(Double n:notas) {
			if(n>5) {
				ap++;
			}
		}
		return ap;
	}
	public double media() {
		double media=0;
		for (Double n:notas) {
			media+=n; 
		}
		return media/notas.size();
	}
	public Double[] devolverNotas() {
		//Este método no muestra sino que devuelve un array de Notas para que capa presentación
		//lo muestre, lo creo como un array de Double y no tipo primitivo double ya que es más fácil
		//al convertir el ArrayList
		return notas.toArray(new Double[0]);
	}
}
