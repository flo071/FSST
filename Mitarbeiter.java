import java.time.LocalDate;

public class Mitarbeiter extends Person {
	private int anzahl;

	public Mitarbeiter(long svnr, String vorname, String nachname, LocalDate geburtsdatumm, String email, int anzahl)
	{
		super(svnr,vorname,nachname,geburtsdatumm,email);

		this.anzahl = anzahl;
	}

	public int getAnzahl() {
		return anzahl;
	}
}