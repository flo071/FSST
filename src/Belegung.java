import java.time.DayOfWeek;

public class Belegung {
	private int unterrichtsEinheit;
	private Raum raum;
    private Lehrer lehrer;
    private Fach fach;
    private DayOfWeek wochentag;

	public Belegung(int unterrichtsEinheit){
		this.unterrichtsEinheit = unterrichtsEinheit;
	}

    public Belegung(DayOfWeek wochentag, int unterrichtsEinheit){
        this.wochentag = wochentag;
        this.unterrichtsEinheit = unterrichtsEinheit;
    }

	public Lehrer getLehrer(){
        return lehrer;
    }

    public Klasse getKlasse() {
        return raum.getKlasse();
    }

    public DayOfWeek getWochentag(){
        return wochentag;
    }

    public int getUnterrichtsEinheit(){
        return unterrichtsEinheit;
    }

    public Fach getFach() {
        return fach;
    }

    public Raum getRaum() {
        return raum;
    }
}