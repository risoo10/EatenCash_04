package models;

import java.util.LinkedHashMap;
import java.util.Map;

public class JedloRestauracia extends Jedlo{
	
	private String nazovRestauracie;
	private int hodnotenieRestauracie;
	private String tipDalsieJedlo;

	public JedloRestauracia(String miesto, String cas, String nazov, Double cena, String nazovRestauracie, int hodnotenieRestauracie, String tipDalsieJedlo) {
		super(miesto, cas, nazov, cena);
		setNazovRestauracie(nazovRestauracie);
		setHodnotenieRestauracie(hodnotenieRestauracie);
		setTipDalsieJedlo(tipDalsieJedlo);
	}
	
	public JedloRestauracia(){
		
	}
	
	// Toto je dalsi konstruktor. Ako parameter posielame pole Stringov.
	public JedloRestauracia(Map<String, String> data){

		
		super("Restauracia", data.get("casJedla"), data.get("nazov"),Double.parseDouble(data.get("cena")));
		setNazovRestauracie(data.get("nazovRestauracie"));
		setHodnotenieRestauracie(Integer.parseInt(data.get("hodnotenieRestauracie")));
		setTipDalsieJedlo(data.get("tip"));
		
	}
	
	// metoda na vratenie detailov o jedleRetauracia v jednom String -u
		public String vratDetaily(){
			 
			//  zakladne udaje
			String detailyString = super.vratDetaily(); 
			
			//  dodatocne udaje
			detailyString += "Nazov restauracie: "+nazovRestauracie+"\n";
			detailyString += "Hodnotenie restauracie: "+hodnotenieRestauracie+"\n";
			detailyString += "Tip na dalsie jedlo: "+tipDalsieJedlo+"\n";
			
			return detailyString;
	}
	
		
	public Map<String, String> vratUdajeMapa(){
		
		Map<String, String> udaje = new LinkedHashMap<>();
		udaje = super.vratUdajeMapa();
		udaje.put("nazovRestauracie", this.nazovRestauracie);
		udaje.put("hodnotenieRestauracie", Integer.toString(this.hodnotenieRestauracie));
		udaje.put("tip", this.tipDalsieJedlo);
		
		return udaje;
	}

	public int getHodnotenieRestauracie() {
		return hodnotenieRestauracie;
	}

	public void setHodnotenieRestauracie(int hodnotenieRestauracie) {
		this.hodnotenieRestauracie = hodnotenieRestauracie;
	}

	public String getNazovRestauracie() {
		return nazovRestauracie;
	}

	public void setNazovRestauracie(String nazovRestauracie) {
		this.nazovRestauracie = nazovRestauracie;
	}

	public String getTipDalsieJedlo() {
		return tipDalsieJedlo;
	}

	public void setTipDalsieJedlo(String tipDalsieJedlo) {
		this.tipDalsieJedlo = tipDalsieJedlo;
	}

}
