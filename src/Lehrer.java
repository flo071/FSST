import java.time.LocalDate;
import java.util.List;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;

public class Lehrer extends Mitarbeiter{
    private Set<Fach> unteritsfaecher = new HashSet<>();
	private String kuerzel;
    private Klasse[] klassen = {null, null};

	public Lehrer(long svnr, String vorname, String nachname, LocalDate geburtsdatumm, String email, int anzahl, String kuerzel){
		super(svnr, vorname, nachname, geburtsdatumm, email, anzahl);

		this.kuerzel = kuerzel;
	}

	public String getKuerzel() {
		return kuerzel;
	}

	public void exportStundenplan() {
        String[] klassenList = {null, null};
        List<Belegung> belegung = new LinkedList<Belegung>();
        List<Belegung> tag = new LinkedList<Belegung>();
        List<Belegung> stunde = new LinkedList<Belegung>();
        List<Belegung> sortiert = new LinkedList<Belegung>();

        for (int tmp = 0; tmp < klassenList.length; tmp++) {
            if (klassen[tmp] != null) {
                klassenList[tmp] = klassen[tmp].getBezeichnung();
            }
        }

        for (Fach tmp : unteritsfaecher) {
            for (Belegung tmp1 : tmp.getBelegung()) {
                if (tmp1.getLehrer().equals(kuerzel)) {
                    belegung.add(tmp1);
                }
            }
        }

        for (int tmp2 = 1; tmp2 < 5; tmp2++) {
            for (Belegung tmp : belegung) {
                tag.add(tmp);
            }

            for(int tmp3 = 0; tmp3 < 10; tmp3++){
                for(Belegung tmp : tag){
                    stunde.add(tmp);
                }
            }
            sortiert.addAll(stunde);
            tag.clear();
            stunde.clear();
        }

        belegung.clear();
        belegung.addAll(sortiert);

        for (Belegung tmp : belegung) {
            System.out.print(tmp.getWochentag());
            System.out.print("  ");
            System.out.print(tmp.getUnterrichtsEinheit());
            System.out.print("  ");
            System.out.print(tmp.getFach().getName());
            System.out.print("  ");
            System.out.print(tmp.getRaum().getRaumNummer());
            System.out.print("  ");
            System.out.println(tmp.getKlasse().getBezeichnung());
        }


    }
}