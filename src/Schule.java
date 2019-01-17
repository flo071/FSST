import java.util.ArrayList;

public class Schule {
	private String schulname;
	private String schulkennzahl;
	private String schultyp;
	private boolean Lehrpersonal;

	private ArrayList<Abteilung> abteilungen;

	public boolean addPersonal(NichtLehrpersonal personal) {
		//return boolean NichtLehrpersonal personal
	}

	public Abteilung addAbteilung(String name, String kuerzel) {
		return abteilungen.add(new Abteilung(name, kuerzel, this))
	}

	public Long getSchulkennzahl() {
        return schulkennzahl;
    }

    public String getName() {
        return name;
    }

    public String getSchultyp() {
        return schultyp;
    }
}