package edu.unlam.mdg;


public class Mesada implements Comparable<Mesada> {
	private int largo;
	private int ancho;
	
	public Mesada(int largo, int ancho) {
		if(largo >= 0 && largo <=1000000)
			this.largo = largo;
		else
			this.largo = 0;
			
		if(ancho >= 0 && ancho <=1000000)
			this.ancho = ancho;
		else
			this.ancho = 0;
	}
			
	@Override
	public String toString() {
		return "Largo: " + this.largo + " Ancho: " + this.ancho;
	}

	
	@Override
	public int compareTo(Mesada otra) {
		int aux;
		
		if(this.ancho>this.largo) {	//los roto
			aux = this.ancho;
			this.ancho =this.largo;
			this.largo = aux;
			
		}
			
		if(this.largo < otra.largo)	//los comparo
			return 1;
		if(this.largo > otra.largo)
			return -1;
		
		return this.ancho < otra.ancho ? 1 : -1; 
	}
	
	public boolean esApilable(Mesada otra) {
		return this.largo <= otra.largo && this.ancho <= otra.ancho;
	}
	
	
}
