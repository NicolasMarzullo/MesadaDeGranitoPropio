package edu.unlam.mdg;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ArchivoDeMesadas {
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
}
