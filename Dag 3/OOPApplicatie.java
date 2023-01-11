import java.util.Scanner;

public class OOPApplicatie {
	public static void main(String[] args) {

		Scanner inputScanner = new Scanner(System.in);

		//Temp
		Organism alien = new Organism();
		alien.setName("Gorbladorx");
		alien.setAge(666);
		alien.setGender('M');
		alien.setAlive(true);
		alien.setRace("Martian");

		System.out.println(alien.getName());
		System.out.println(alien.getRace());
		System.out.println(alien.getGender());
		System.out.println(alien.getAge());
		System.out.println(alien.isAlive());
		System.out.println();
		
		TV p = new TV();
		p.name = "fHD generic TV";
		p.price = 299.98;
		p.inStock = true;
		p.numberInStock = 3;
		p.energyLabel = 'A';

		p.getName();
		p.getInStock();
		p.getStock();
		p.getEnergyLabel();
		p.getPrice();
		System.out.println();

		TV uniqueTv = new TV();
		uniqueTv.price = 1495.99;
		uniqueTv.inStock = false;
		uniqueTv.numberInStock = 0;
		uniqueTv.name = "Oval 16K TV";
		uniqueTv.energyLabel = 'G';

		uniqueTv.getName();
		uniqueTv.getInStock();
		uniqueTv.getStock();
		uniqueTv.getEnergyLabel();
		uniqueTv.getPrice();
		System.out.println();

		TV eigenTV = new TV();
		eigenTV.addName();
		eigenTV.addPrice();
		eigenTV.addEnergyLabel();
		eigenTV.addInStock();
		eigenTV.addStock();

		eigenTV.getName();
		eigenTV.getPrice();
		eigenTV.getEnergyLabel();
		eigenTV.getInStock();
		eigenTV.getStock();

		eigenTV.setName("Super legit 48K TV");
		eigenTV.setPrice(999.99);
		eigenTV.setEnergyLabel('Z');
		eigenTV.setNumberInStock(69);
		eigenTV.setInStock(true);
		
		eigenTV.getName();
		eigenTV.getPrice();
		eigenTV.getEnergyLabel();
		eigenTV.getInStock();
		eigenTV.getStock();
	}
}