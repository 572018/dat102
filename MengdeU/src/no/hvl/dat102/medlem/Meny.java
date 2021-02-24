package no.hvl.dat102.medlem;

import java.util.Scanner;

public class Meny {
	
	private Tekstgrensesnitt tekstgr;
	private Datakontakt kontakt;
	
	public Meny(Datakontakt kontakt){
		tekstgr = new Tekstgrensesnitt();
		this.kontakt = kontakt; 
	}
	
	public void start(){
		System.out.println("Skriv inn en kommando...");
		
		
		while (true) {
			
			
			switch (Tekstgrensesnitt.SC.nextLine().toLowerCase()) {
			
			case "nyttmedlem":
				tekstgr.nyttMedlem();
				break;
				
			case "slettmedlem":
				tekstgr.slettMedlem();
				break;
				
			case "avslutt":
				System.out.println("Avslutter...");
				System.exit(0);
				break;
				
		default: 
			System.out.println("Ugyldig kommando");
			}
			
		}
	}
	
}


