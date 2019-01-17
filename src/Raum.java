public class Raum {
	private String raumNummer;
	private int maxSitzplaetze;
	private Raumtyp raumtyp;
    private Hashtable<String, Belegung> belegung = new Hashtable<String, Belegung>(); 

	public Raum(String raumNummer, int maxSitplaetze, Raumtyp raumtyp) {
        this.raumNummer = raumNum;
        this.maxSitzplaetze = maxSitpl;
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
                jetzt = getBelegung(tag, einheit);
                System.out.print(tag + " ");
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

    public Belegung getBelegung(Unterrichtstag tag, int unterrichtsEinheit) {
        return belegung.get(tag + unterrichtsEinheit);
    }

}

enum Raumtyp {
    KLASSENZIMMER, LABORRAUM
}