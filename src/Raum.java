import java.util.Hashtable;
import java.time.DayOfWeek;

public class Raum {
	private String raumNummer;
	private int maxSitzplaetze;
	private Raumtyp raumtyp;
    private Klasse klasse;
    private Hashtable<String, Belegung> belegung = new Hashtable<String, Belegung>(); 

	public Raum(String raumNummer, int maxSitplaetze, Raumtyp raumtyp) {
        this.raumNummer = raumNummer;
        this.maxSitzplaetze = maxSitplaetze;
        this.raumtyp = raumtyp;
    }

    public String getRaumNummer() {
        return raumNummer;
    }

    public int getMaxSitzplaetze() {
        return maxSitzplaetze;
    }

    public Raumtyp getRaumtyp() {
        return raumtyp;
    }

    public void exportBelegung() {
        Belegung jetzt;
        for (int tag = 1; tag < 5; tag++) {
            for (int einheit = 1; einheit < 10; einheit++) {
                jetzt = getBelegung(DayOfWeek.of(tag), einheit);
                System.out.print(DayOfWeek.of(tag) + " ");
                System.out.print(einheit + ". Stunde: ");
                if(jetzt != null){
                    System.out.println(jetzt.getFach().getName());
                    System.out.print(jetzt.getLehrer().getKuerzel());
                } else{
                    System.out.println("Fehler, bitte ereut versuchen.");
                }
            }
        }
    }

    public void addBelegung(Belegung bel) {
        belegung.put((bel.getWochentag().toString() + bel.getUnterrichtsEinheit()), bel);
    }

    public Belegung getBelegung(DayOfWeek tag, int unterrichtsEinheit) {
        return belegung.get(tag.toString() + unterrichtsEinheit);
    }

    public Klasse getKlasse() {
        return klasse;
    }
}