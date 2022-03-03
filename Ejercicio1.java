package examen2programacion;

import java.util.ArrayList;
import java.util.Scanner;

import examen2programacion.Jugador;

public class Ejercicio1 {
	public static ArrayList<Jugador> generarJugadores(int numeroJugadores){
		ArrayList<Jugador> jugadores=new ArrayList<Jugador>();
		String nombre;
		int dorsal;
		int potenciaDisparo;
		int calidadPorteria;
		String[] nombres = { "Carlos", "Luis", "Alvaro", "Javier", "Nacho", "Jose", "Aaron", "Alejandro", "Nicolas",
				"Diego", "Rut", "Nerea", "Cristian", "Costin", "Elis", "Pablo", "Froilan", "Flavio", "Rosana",
				"Lucas" };
		String[] apellidos = { "Marco", "Muñoz", "Ciriaco", "Valles", "Peribañez", "Vaquero", "Blazquez", "Blas",
				"Sopeña", "Gil", "Lopez", "Garcia", "Gomez", "Gonzalez", "Almendivar", "Mendez", "Martinez", "Marin" };
		for (int i = 0; i < numeroJugadores; i++) {
			nombre = nombres[(int) (Math.floor(Math.random() * ((nombres.length - 1) - 0 + 1) + 0))] + " "
					+ apellidos[(int) (Math.floor(Math.random() * ((apellidos.length - 1) - 0 + 1) + 0))];
			dorsal = (int) Math.round(Math.random() * 99);
			potenciaDisparo = (int) Math.round(Math.random() * 10);
			calidadPorteria = (int) Math.round(Math.random() * 10);
			jugadores.add(new Jugador(nombre,dorsal,potenciaDisparo,calidadPorteria));
		}
		return jugadores;
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca el número de jugadores que van a participar: ");
		int n = entrada.nextInt();
		int [] orden = new int[n];
		ArrayList<Jugador> jugadores=generarJugadores(n);
		System.out.println("Generando orden de participación");
		System.out.println();
		for(int i = 0;i < orden.length;i++) {
			orden[i]=i;
		}
		for(int i = 0;i < orden.length-1;i++) {
			int a=(int) Math.round(Math.random() * n);
			int b=orden[i];
			orden[i]=orden[a];
			orden[a]=b;
		}
		Jugador jugar =new Jugador();
		jugar.jugar(jugadores, orden);
	}
}
