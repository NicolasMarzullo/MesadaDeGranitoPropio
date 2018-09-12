package test;


import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

import edu.unlam.mdg.Apilamiento;
import edu.unlam.mdg.ArchivoDeMesadas;
import edu.unlam.mdg.Mesada;

public class PruebaMesada {
	/*@Test
	public void testMetodoQueBuscaLaMesaMasGrande( ) throws IOException {
		
		Mesada mesada1 = new Mesada(10, 15); 
		Mesada mesada2 = new Mesada(10, 30);
	
		System.out.println(mesada2.esMasGrandeQue(mesada1));
	}*/
	
		
	
	/*@Test
	public void testCasoEnunciado( ) throws IOException {
		Apilamiento apilamiento = ArchivoDeMesadas.leer("test/lotes/in/01_CasoEnunciado.in");
		
		ArchivoDeMesadas.escribir("test/lotes/out/01_CasoEnunciado.out", apilamiento.apilar());
	}
	
	@Test
	public void testUnaSolaMesada( ) throws IOException {
		Apilamiento apilamiento = ArchivoDeMesadas.leer("test/lotes/in/02_UnaSolaMesada.in");
		
		ArchivoDeMesadas.escribir("test/lotes/out/02_UnaSolaMesada.out", apilamiento.apilar());
	}*/
	
	@Test
	public void testElegirLaMejorAgrupacion( ) throws IOException {
		Apilamiento apilamiento = ArchivoDeMesadas.leer("test/lotes/in/03_ElegirLaMejorAgrupacion.in");
		
		ArchivoDeMesadas.escribir("test/lotes/out/03_ElegirLaMejorAgrupacion.out", apilamiento.apilar());
	}

}
