public class Fach {
	private String name;
    private int wochenstunden;
    private Raumtyp raumanforderung;

    public Fach(String name, int wochenstunden, Raumtyp raumanforderung){
        this.name = name;
        this.wochenstunden = wochenstunden;
        this.raumanforderung = raumanforderung;
    }

    public String getName() {
        return name;
    }

    public int getWochenstunden() {
        return wochenstunden;
    }

    public Raumtyp getRaumanforderung() {
        return raumanforderung;
    }
}