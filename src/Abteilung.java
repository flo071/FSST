import java.util.ArrayList;

public class Abteilung {
	private String name, kuerzel;

	private Lehrer abteilungsvorstand;
	private Schueler abteilingssprecher;
	private Schule schule;
	private ArrayList<Lehrer> lehrer;
	private ArrayList<Klasse> klassen;

	public Abteilung(String name, String kuerzel, Schule schule) {
		this.schule = schule;
		this.name = name;
		this.kuerzel = kuerzel;
		lehrer = new ArrayList<Lehrer>();
		klassen = new ArrayList<Klasse>();
		abteilingssprecher = null;
		abteilungsvorstand = null;
	}

	public String getName() {
		return name;
	}

	public String getKuerzel() {
		return kuerzel;
	}

	public ArrayList<Klasse> getKlassen() {
        return klassen;
    }

    public ArrayList<Schueler> getSchueler() {
        ArrayList<Schueler> schueler = new ArrayList<Schueler>();
        for(Klasse klassen : getKlassen()){
            schueler.addAll(klassen.getSchueler());
        }
        return schueler;
    }

    public boolean addLehrer(Lehrer lehrer){
        return this.lehrer.add(lehrer);
    }

    public boolean setAbteilungsvorstand(Lehrer lehrer){
        if(schule.getDirektor() == lehrer)
            return false;
        
        for(Abteilung abteilung : schule.getAbteilungen()){
            if(abteilung.getAbteilungsvorstand() == lehrer)
                return false;
        }
        
        abteilungsvorstand = lehrer;
        return true;
    }
}