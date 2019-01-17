public class Adresse {
	private String ort, strasse;
	private int plz, hausnummer;

	public Adresse(String strasse, int hausnummer, int plz, String ort){
        this.ort = ort;
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.plz = plz;
    }

	public String getOrt() {
		return ort;
	}

	public String getStrasse(){
		return strasse;
	}

	public int getHausnummer(){
		return hausnummer;
	}

	public int getPlz(){
		return plz;
	}

	public void printAdresse(){
		System.out.println(getStrasse + " " + getHausnummer + "\n" + getPlz + " " + getOrt);
	}
}