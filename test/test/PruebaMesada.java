package test;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

import edu.unlam.mdg.Apilamiento;
import edu.unlam.mdg.ArchivoDeMesadas;
import edu.unlam.mdg.Mesada;

public class PruebaMesada {
	/*@Test
	public void testOrdenamientoMesadas( ) throws IOException {
		
		ArrayList<Mesada> mesadas =  new ArrayList<Mesada>();
		
		mesadas.add(new Mesada(4, 5));
		mesadas.add(new Mesada(9, 3));
		mesadas.add(new Mesada(2, 2));
		mesadas.add(new Mesada(1, 2));
		mesadas.add(new Mesada(1, 12));
		mesadas.add(new Mesada(2, 7));
		
		
		
		Collections.sort(mesadas);
		
		for(int i=0; i<mesadas.size();i++)
			System.out.println(mesadas.get(i));
	}*/
	
		
	
	@Test
	public void testCasoEnunciado( ) throws IOException {
		Apilamiento apilamiento = ArchivoDeMesadas.leer("test/lotes/in/01_CasoEnunciado.in");
		
		ArchivoDeMesadas.escribir("test/lotes/out/01_CasoEnunciado.out", apilamiento.apilar());
	}
	
	@Test
	public void testUnaSolaMesada( ) throws IOException {
		Apilamiento apilamiento = ArchivoDeMesadas.leer("test/lotes/in/02_UnaSolaMesada.in");
		
		ArchivoDeMesadas.escribir("test/lotes/out/02_UnaSolaMesada.out", apilamiento.apilar());
	}
	
	@Test
	public void testElegirLaMejorAgrupacion( ) throws IOException {
		Apilamiento apilamiento = ArchivoDeMesadas.leer("test/lotes/in/03_ElegirLaMejorAgrupacion.in");
		
		ArchivoDeMesadas.escribir("test/lotes/out/03_ElegirLaMejorAgrupacion.out", apilamiento.apilar());
	}

}
