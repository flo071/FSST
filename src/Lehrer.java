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

	public void exportStundenplan() {
        String[] klassen = {null, null};
        List<Belegung> belegung = new LinkedList<Belegung>();
        List<Belegung> sortierung = new LinkedList<Belegung>();
        List<Belegung> tag = new LinkedList<Belegung>();
        List<Belegung> stunde = new LinkedList<Belegung>();

        for (int tmp = 0; tmp < klassen.length; tmp++) {
            if (klassen[tmp] != null) {
                klassen[tmp] = klassen[tmp].getBezeichnung();
            }
        }

        for (Fach tmp : unteritsfaecher) {
            for (Belegung tmp2 : tmp.getBelegung()) {
                if (tmp2.getLehrer().equals(kuerzel)) {
                    belegung.add(tmp2);
                }
            }
        }

        for (int tmp2 = 1; tmp2 < 5; tmp2++) {
            for (Belegung tmp : belegung) {
                if (tmp.Unterrichtstag == tmp2){
                    tag.add(tmp);
                }
            }

            //Sortiert nach Stunden
            for(int tmp3 = 0; tmp3 < 15; tmp3++){
                for(Belegung tmp : tag){
                    stunde.add(tmp);
                }
            }
            sortierung.addAll(stunde);
            tag.clear();
            stunde.clear();
        }

        belegung.clear();
        belegung.addAll(sorted);

        for (Belegung tmp : belegung) {
            System.out.print(tmp.Unterrichtstag);
            System.out.print(tmp.getUnterrichtsEinheit());
            System.out.print(tmp.getName());
            System.out.print(tmp.getRaumNummer());
            System.out.println(tmp.getBezeichnung());
            System.out.println(" ");
        }
    }
}