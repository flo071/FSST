public class Raum {
	private String raumNummer;
	private int maxSitzplaetze;
	private Raumtyp raumtyp;

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

}