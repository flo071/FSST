import java.util.Set;
import java.util.TreeSet;
import java.time.Period;
import java.time.LocalDate;

public class Klasse {
	private String bezeichnung;
	private int schulstufe;
    private Schueler klassensprecher;
    private Set<Schueler> schuelerList = new TreeSet<Schueler>();

	public Klasse(int schulstufe, String bezeichnung){
		this.schulstufe = schulstufe;
		this.bezeichnung = bezeichnung;
	}

	public String getBezeichnung(){
		return bezeichnung;
	}

	public int getSchulstufe(){
		return schulstufe;
	}

	public float getDurchschnittsalter() {
        int alterAlle = 0;
        int anzahl = 0;
        LocalDate heute = LocalDate.now();

        for (Schueler schuelerL : schuelerList) {
            LocalDate geb = schuelerL.getGeburtsdatum();
            alterAlle += Period.between(geb, heute).getYears();
            anzahl++;
        }

        float durchschnitt = alterAlle/anzahl;

        return durchschnitt;
    }

    public boolean setKlassensprecher(Schueler schueler) {
        klassensprecher = schueler;
        return true;
    }

    public boolean addSchueler(Schueler schueler) {
        return schuelerList.add(schueler);
    }

    public Set<Schueler> getSchueler() {
        return schuelerList;
    }
}