import java.time.LocalDate;

public class Lehrer extends Mitarbeiter{
	private String kuerzel;

	public Lehrer(long svnr, String vorname, String nachname, LocalDate geburtsdatumm, String email, int anzahl, String kuerzel){
		super(svnr, vorname, nachname, geburtsdatumm, email, anzahl);

		this.kuerzel = kuerzel;
	}

	public String getKuerzel() {
		return kuerzel;
	}
}