package no.hvl.dat102.medlem;

public class Hobby{
	private String hobbyNavn;
	
	public Hobby(String hobby){
		hobbyNavn = hobby;
	}

	public String toString(){
		String str = "<";
		while(hobbyNavn != null) {
			str = str + hobbyNavn + ", ";
		}
		str = str + ">";
		str.replace(", >", ">");
		return str;
	}

	public boolean equals(Object hobby2){
		// evntuelt fylle ut først med "standard" kode // som vi ofte har med overkjøring av // equals-metoden
		Hobby hobbyDenAndre = (Hobby)hobby2;
		return(hobbyNavn.equals(hobbyDenAndre.getHobbyNavn()));
	}

	public String getHobbyNavn() {
		return hobbyNavn;
	}

	public void setHobbyNavn(String hobbyNavn) {
		this.hobbyNavn = hobbyNavn;
	}
	
}// end Hobby