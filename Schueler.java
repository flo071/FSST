import java.util.Date;

public class Schueler extends Person {

	private int katalognummer;
	private boolean eigenberechtigt;
	private Date eintrittsdatum;

	public int getKatalognummer() {
		return katalognummer;
	}

	public boolean isEigenberechtigt() {
		return eigenberechtigt;
	}

	public Date getEintrittsdatum() {
		return eintrittsdatum;
	}
}