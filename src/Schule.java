import java.util.ArrayList;
import java.util.Set;

public class Schule {
	private String schulname;
	private long schulkennzahl;
	private String schultyp;
	private boolean Lehrpersonal;
    private Lehrer direktor;
    private Schueler schulsprecher;
    private Adresse standort;

	private ArrayList<Abteilung> abteilungen;
    private ArrayList<Mitarbeiter> personal;

    public Schule(String schulname, long schulkennzahl, String schultyp, Lehrer direktor, Adresse standort){
        this.schulname = schulname;
        this.schulkennzahl = schulkennzahl;
        this.schultyp = schultyp;
        this.direktor = direktor;
        this.schulsprecher = null;
        this.standort = standort;
        personal = new ArrayList<>();
        abteilungen = new ArrayList<>();
    }

	public boolean addPersonal(NichtLehrpersonal personal) {
		return false; //not implemented
	}

	public boolean addAbteilung(String name, String kuerzel) {
		return abteilungen.add(new Abteilung(name, kuerzel, this));
	}

	public Long getSchulkennzahl() {
        return schulkennzahl;
    }

    public String getName() {
        return schulname;
    }

    public String getSchultyp() {
        return schultyp;
    }

    public boolean setDirektor(Lehrer lehrer){
        for(Abteilung abteilung : abteilungen){
            if(abteilung.getAbteilungsvorstand() == lehrer)
                return false;
        }
        direktor = lehrer;
        return true;
    }

    public ArrayList<Schueler> getSchueler() {
        ArrayList<Schueler> schueler = new ArrayList<Schueler>();
        for(Abteilung abteilung : getAbteilungen()){
            schueler.addAll(abteilung.getSchueler());
        }
        return schueler;
    }

    public int getAnzahlSchueler(){
        return getSchueler().size();
    }

    public ArrayList<Mitarbeiter> getPersonal() {
        return personal;
    }

    public Lehrer getDirektor() {
        return direktor;
    }

    public ArrayList<Abteilung> getAbteilungen() {
        return abteilungen;
    }
}