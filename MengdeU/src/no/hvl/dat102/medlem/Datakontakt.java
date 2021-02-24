package no.hvl.dat102.medlem;

public class Datakontakt {
	
	private static Medlem[] medlemstab;
	private int antall;
	
	public Datakontakt() {
		
	}
	public Datakontakt(int size) {
		medlemstab = new Medlem[size];
		antall = 0;
	}

	public void leggTilMedlem(Medlem person) {
		if(medlemstab.length >= antall)
			utvidKapasitet();
		medlemstab[antall] = person;
		antall++;
	}
	
	public void slettMedlem(String navn) {
		medlemstab[finnMedlemsIndeks(navn)] = null;
		antall--;
		trimTab(medlemstab,antall);
	}
	
	public int finnMedlemsIndeks(String medlemsnavn) {
		int i = 0;
		while(!medlemsnavn.equals(medlemstab[i].getNavn())) {
			i++;
			if(i>=medlemstab.length) {
				i= -1;
				break;
			}
		}
		return i;
	}
	
	public Medlem finnPartnerFor(String medlemsnavn) {
		int i = 0;
		Medlem person1 = medlemstab[finnMedlemsIndeks(medlemsnavn)];
		while (person1.getHobbyer()!=medlemstab[i].getHobbyer() && medlemstab[i].getStatusIndeks()!=-1) {
			i++;
			if(i>=medlemstab.length) {
				break;
			}
		}
		return medlemstab[i];
	}
	
	public void tilbakestillStausIndeks(String medlemsnavn) {
		medlemstab[finnMedlemsIndeks(medlemsnavn)].setStatusIndeks(-1);
	}

	public static Medlem[] getMedlemstab() {
		return medlemstab;
	}

	public static void setMedlemstab(Medlem[] medlemstab) {
		Datakontakt.medlemstab = medlemstab;
	}

	public int getAntall() {
		return antall;
	}

	public void setAntall(int antall) {
		this.antall = antall;
	}
	
	private void utvidKapasitet(){//eks. utvide 100%
		Medlem[] tab = new Medlem[(int)Math.ceil(2 * medlemstab.length)];
		for (int i = 0; i < tab.length; i++){
		tab[i] = medlemstab[i];
		}
		medlemstab = tab;
	}
	
	private Medlem[] trimTab(Medlem[] medlemstab, int antall) { // n er antall elementer
		Medlem[] tab = new Medlem[antall];
		int i = 0;
		while (i < antall) {
			tab[i] = tab[i];
			i++;
		}//while
		
		return tab;
		}//
}
