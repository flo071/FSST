import java.time.LocalDate;

public class Schueler extends Person {

	private int katalognummer;
	private boolean eigenberechtigt;
	private LocalDate eintrittsdatum;

	public Schueler(long svnr, String vorname, String nachname, LocalDate geburtsdatumm, String email, int katalognummer, LocalDate eintritsdatum){
		super(svnr,vorname,nachname,geburtsdatumm,email);

		this.katalognummer = katalognummer;
		this.eintrittsdatum = eintrittsdatum;
	}

	public int getKatalognummer() {
		return katalognummer;
	}

	public boolean isEigenberechtigt() {
		return eigenberechtigt;
	}

	public LocalDate getEintrittsdatum() {
		return eintrittsdatum;
	}
}