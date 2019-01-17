import java.util.ArrayList;

public class Abteilung {
	private String name, kuerzel;

	private Lehrer abteilungsvorstand;
	private Schueler abteilingssprecher;
	private Schule schule;
	private ArrayList<Lehrer> lehrer;
	private ArrayList<Klasse> klassen;

	public Abteilung(String name, String kuerzel, Schule schule) {
		this.schule = schule;
		this.name = name;
		this.kuerzel = kuerzel;
		lehrer = new ArrayList<Lehrer>();
		klassen = new ArrayList<Klasse>();
		abteilingssprecher = null;
		abteilungsvorstand = null;
	}

	public String getName() {
		return name;
	}

	public String getKuerzel() {
		return kuerzel;
	}
}