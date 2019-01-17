public class Belegung {
	private int unterrichtsEinheit;
	private Raum raum;

	public Fach(int unterrichtsEinheit){
		this.unterrichtsEinheit = unterrichtsEinheit;
	}

	public Lehrer getLehrer(){
        return lehrer;
    }

    public Klasse getKlasse() {
        return raum.getKlasse();
    }

    public Unterrichtstag getWochentag(){
    	return Unterrichtstag;
    }

}

enum Unterrichtstag {
    MONTAG, DIENSTAG, MITTWOCH, DONNERSTAG, FREITAG
}