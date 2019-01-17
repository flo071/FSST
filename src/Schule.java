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

    public boolean setDirektor(Lehrer lehrer)
    {
        for(Abteilung abteilung : abteilungen)
        {
            if(abteilung.getAbteilungsvorstand() == lehrer)
                return false;
        }
        direktor = lehrer;
        return true;
    }

    public ArrayList<Schueler> getSchueler() {
        ArrayList<Schueler> schueler = new ArrayList<Schueler>();
        for(Abteilung abteilung : getAbteilungen())
        {
            schueler.addAll(abteilung.getSchueler());
        }
        return schueler;
    }

    public int getAnzahlSchueler()
    {
        return getSchueler().size();
    }
}