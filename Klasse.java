public class Klasse {
	private String bezeichnung;
	private int schulstufe;

	public Klasse(int schulstufe, String bezeichnung){
		this.schulstufe = schulstufe;
		this.bezeichnung = bezeichnung;
	}

	public String getBezeichnung(){
		return bezeichnung;
	}

	public int getSchulstufe(){
		return schulstufe;
	}
}