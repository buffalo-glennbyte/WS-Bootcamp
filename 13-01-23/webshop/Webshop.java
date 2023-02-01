package webshop;
import webshop.Klant;

public class Webshop {
	
	public String owner;
	public String ipAdress;
	String webAdress;
	int bouwJaar;
	private Klant klant = new Klant();
//	private Klant k2;

	//GETTER
	public String getKlantName(){ return klant.name; }
	public int getKlantAge() { return klant.age; }
	public String getWebAdress() { return webAdress; }
	public int getBouwJaar() { return bouwJaar; }

	//SETTER
	public void setKlantName(String tempName) { klant.name = tempName; }
	public void setKlantAge(int tempAge) {klant.age = tempAge;}
	public void setWebAdress(String webAdress) {this.webAdress = webAdress;}
	public void setBouwJaar(int bouwJaar) {this.bouwJaar = bouwJaar;}


}