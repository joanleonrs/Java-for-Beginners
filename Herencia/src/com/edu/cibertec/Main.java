package com.edu.cibertec;

import java.util.ArrayList;

public class Main {

	// ArrayList de objetos SeleccionFutbol. 
	// Idenpendientemente de la clase hija a la que pertenezca el objeto
	
	public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();
	
	public static void main(String[] args) {
		
		Entrenador delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, "284EZ89");
		Futbolista iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
		Masajista raulMartinez = new Masajista(3, "Raúl", "Martinez", 41, "Licenciado en Fisioterapia", 18);
		
		integrantes.add(delBosque);
		integrantes.add(iniesta);
		integrantes.add(raulMartinez);
		
		// CONCENTRACION
		System.out.println("Todos los integrantes comienzan una concentración. (Todos ejecutan el mismo método)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre()+" "+integrante.getApellidos()+" -> ");
			integrante.concentrarse();
		}

		// VIAJE
		System.out.println("\nTodos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo método)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre()+" "+integrante.getApellidos()+" -> ");
			integrante.viajar();
		}
		
		// ENTRENAMIENTO
		System.out.println("\n\nEntrenamiento: Sólamente el entrenador y el futbolista tiene métodos para entrenar:");
		System.out.print(delBosque.getNombre()+" "+delBosque.getApellidos()+" -> ");
		delBosque.dirigirEntreno();
		System.out.print(iniesta.getNombre()+" "+iniesta.getApellidos()+" -> ");
		iniesta.entrenar();

		// MASAJE
		System.out.println("\n\nMasaje: Solo el masajista tiene el método para dar un masaje:");
		System.out.print(raulMartinez.getNombre()+" "+raulMartinez.getApellidos()+" -> ");
		raulMartinez.darMasaje();

		// PARTIDO DE FUTBOL
		System.out.println("\n\nPartido de Fútbol: Sólamente el entrenador y el futbolista tiene métodos para el partido de fútbol:");
		System.out.print(delBosque.getNombre()+" "+delBosque.getApellidos()+" -> ");
		delBosque.dirigirPartido();
		System.out.print(iniesta.getNombre()+" "+iniesta.getApellidos()+" -> ");
		iniesta.jugarPartido();

	}	

}
