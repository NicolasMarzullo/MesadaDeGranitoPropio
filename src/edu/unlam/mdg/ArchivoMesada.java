package edu.unlam.mdg;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ArchivoMesada {
	public static Apilamiento leer(String direccion) throws FileNotFoundException {

		Scanner sc = new Scanner(new File(direccion));
		int cantidadMesadas = sc.nextInt();
		ArrayList<Mesada> mesadas = new ArrayList<>();
		
		for(int i = 0; i < cantidadMesadas; i ++)
			mesadas.add(new Mesada(sc.nextInt(), sc.nextInt()));
		
		sc.close();
		
		return new Apilamiento(mesadas);
	}
	
	public static void escribir(String direccion, int pilas) throws IOException {
		PrintWriter salida = new PrintWriter(new FileWriter(direccion));
		
		salida.println(pilas);
		salida.close();
	}
	
	public static boolean testIgualdadArchivos(String pathOrigen, String pathDestino) {

		String cadenaOrigen;
		String cadenaDestino;
		boolean iguales = true;

		Scanner scOrigen = null;
		Scanner scDestino = null;
		try {
			scOrigen = new Scanner(new File(pathOrigen));
			scDestino = new Scanner(new File(pathDestino));

			cadenaOrigen = scOrigen.nextLine();
			cadenaDestino = scDestino.nextLine();

			while (scOrigen.hasNextLine() && scDestino.hasNextLine() && iguales) {

				cadenaOrigen = scOrigen.nextLine();
				cadenaDestino = scDestino.nextLine();

				if (!cadenaOrigen.equals(cadenaDestino))
					iguales = false;
			}

			if (scOrigen.hasNextLine() || scDestino.hasNextLine())
				iguales = false;

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			scOrigen.close();
			scDestino.close();
		}

		return iguales;
	}
}
