package no.hvl.dat102.medlem;

import java.util.Scanner;
import no.hvl.dat102.mengde.adt.MengdeADT;
import no.hvl.dat102.mengde.kjedet.KjedetMengde;


public class Tekstgrensesnitt {
	public final static Scanner SC = new Scanner(System.in);
	// leser inn opplysningene om et medlem fra tastatur og legger det inn i datakotakt 
	public void nyttMedlem(){
		//Nytt medlemsobj. blir opprettet med new String som navn og en tom meng
		System.out.println("Skriv inn navnet ditt:");
		Medlem medlem = new Medlem(new String(SC.nextLine()), new KjedetMengde<Hobby>());
		MengdeADT<Hobby> m2 = new KjedetMengde<Hobby>();
		
		//Hobbyobj. blir opprettet og får verdi fra tastatur. Deretter blir det lagt til i mengden m2
		while(SC.nextLine() != "stop"){
			Hobby hobby = new Hobby(SC.nextLine());
			
			m2.leggTil(hobby);
		}
		Datakontakt data = new Datakontakt();
		data.leggTilMedlem(medlem);
				
	}
	
	// Sletter et medlem fra tabellen.
	public void slettMedlem(){
		System.out.println("Skriv inn navnet på medlemmet som skal fjernes:");
		Datakontakt data = new Datakontakt();
		data.slettMedlem(SC.nextLine());
		
	}
	
	/*public void endreHobbyer(String navn) {
		Datakontakt data = new Datakontakt();
		Medlem[] medlemstab = Datakontakt.getMedlemstab();
		Medlem medlem = new Medlem();
		medlem.
		medlemstab[data.finnMedlemsIndeks(navn)] ;
	}*/
	
}