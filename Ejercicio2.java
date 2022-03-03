package examen2programacion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio2 {
	public static int palabrasMasLargasQue(int longitud) {
		String nombre = "C:\\Users\\Carlos\\Desktop\\textoExamen.txt";
		File file = new File(nombre);
		int contador = 0;
		try {
			Scanner f = new Scanner(file);
			// Vamos linea por linea
			while (f.hasNextLine()) {
				String linea = f.nextLine();
				// Spliteamos los datos separados por comas
				String[] palabras = linea.split(" ");
				for (int i = 0; i < palabras.length; i++) {
					palabras[i] = palabras[i].replace(",", "");
					palabras[i] = palabras[i].replace(".", "");
					palabras[i] = palabras[i].replace("(", "");
					palabras[i] = palabras[i].replace(")", "");
					palabras[i] = palabras[i].replace(":", "");
					palabras[i] = palabras[i].replace("\"", "");
				}
				for (int i = 0; i < palabras.length; i++) {
					if(longitud<palabras[i].length()) {
						contador++;
					}
				}
			}
			f.close();
		} catch (FileNotFoundException e) {
			System.out.println("El fichero " + nombre + " no ha podido ser abierto.");
		}
		return contador;
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca la longitud que quiere que tenga la palabra: ");
		int longitud = entrada.nextInt();
		System.out.println(palabrasMasLargasQue(longitud));
	}
}
