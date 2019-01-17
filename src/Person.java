import java.time.LocalDate;

public class Person {
	private long svnr;
	private String vorname;
	private String nachname;
	private LocalDate geburtsdatum;
	private String email;

	public Person(long svnr, String vorname, String nachname, LocalDate geburtsdatumm, String email){
		this.svnr = svnr;
		this.vorname = vorname;
		this.nachname = nachname;
		this.geburtsdatum = geburtsdatumm;
		this.email = email;
	}

	public long getSvnr() {
		return svnr;
	}

	public String getVorname() {
		return vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public LocalDate getGeburtsdatum() {
		return geburtsdatum;
	}

	public String getEmail() {
		return email;
	}
}