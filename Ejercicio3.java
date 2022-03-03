package examen2programacion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
	/**
	 * Pre:---
	 * Post: Te lee el fichero y te cuenta las palabras.
	 */
	public static ArrayList<String> informacionVideojuegos() {
		ArrayList<String> consolas = new ArrayList<String>();
		String nombre = "C:\\Users\\Carlos\\Desktop\\ventasVideojuegos.csv";
		File file = new File(nombre);
		try {
			Scanner f = new Scanner(file);
			// Vamos linea por linea
			while (f.hasNextLine()) {
				String linea = f.nextLine();
				// Spliteamos los datos separados por comas
				String[] lineaSeparada = linea.split(",");
				if (consolas.contains(lineaSeparada[2])||lineaSeparada[2].length()>4) {
				} else {
					consolas.add(lineaSeparada[2]);
				}
			}
			f.close();
		} catch (FileNotFoundException e) {
			System.out.println("El fichero " + nombre + " no ha podido ser abierto.");
		}
		return consolas;
	}
	/**
	 * Pre:---
	 * Post: Este programa te dice que consolas se nombran en el fichero.
	 */
	public static void main(String[] args) {
		System.out.println(informacionVideojuegos());
	}
}
