import java.time.LocalDate;

public class HTL {
	public static void main(String[] args) {
		test_schule(); 
		System.out.println();
		System.out.println("Testing completed!");
	}

	public static void test_schueler(){
		Schueler schueler1 = new Schueler(000000000, "Florian", "Hintermeier", LocalDate.of(1999,7,20), "flo071@gmx.at",1, LocalDate.of(2013,9, 2));
		Schueler schueler2 = new Schueler(000000001, "Dominik", "Gansch", LocalDate.of(2000,1,4), "dominik.gansch@htlstp.at",2, LocalDate.of(2014,9, 1));

		System.out.println();
		System.out.println("Schüler: ");
		System.out.println(schueler1.getVorname() + " " + schueler1.getNachname() + ", Geburtstag(yyyy-mm-dd): " + schueler1.getGeburtsdatum());
		System.out.println(schueler2.getVorname() + " " + schueler2.getNachname() + ", Geburtstag(yyyy-mm-dd): " + schueler2.getGeburtsdatum());
		System.out.println();
	}

	public static void test_schule(){
		Schule htl_stp = new Schule("HTBLuVA St. Pölten", 302467, "Höhere Technische Lehranstalt", new Lehrer(000000002,"Matin","Pfeffel",LocalDate.of(1,1,1),"", 1,""), new Adresse("Waldstraße",3,3100,"St. Pölten"));

		htl_stp.addAbteilung("Elektronik", "EL");
		htl_stp.addAbteilung("Informatik", "IF");

		System.out.println("Schule: ");
		System.out.println(htl_stp.getName());
		System.out.println("Direktor: " + htl_stp.getDirektor().getVorname() + " " + htl_stp.getDirektor().getNachname());
		System.out.println();

		System.out.println("Abteilungen: ");
		htl_stp.getAbteilungen().forEach((abteilung) -> {
			
			if(abteilung.getName() == "Elektronik"){
                Lehrer lehrer1 = new Lehrer(000000003,"Wolfgang","Kuran", LocalDate.of(1,1,1),"wolfgang.kuran@htlstp.at", 1, "KURA");
                abteilung.addLehrer(lehrer1);
                abteilung.setAbteilungsvorstand(lehrer1);

                Raum raum1 = new Raum("W201",48,Raumtyp.KLASSENZIMMER);
                Klasse klasse1 = new Klasse(12, "4AHELS");

                System.out.println(abteilung.getName() + " " + abteilung.getKuerzel());
                System.out.println("Abteilungsvorstand:" + " " + abteilung.getAbteilungsvorstand().getVorname() + " " + abteilung.getAbteilungsvorstand().getNachname());

                test_schueler();
                System.out.println();

            } else if (abteilung.getName() == "Informatik") {
            	System.out.println(abteilung.getName() + " " + abteilung.getKuerzel());
            }
		});
	}
}