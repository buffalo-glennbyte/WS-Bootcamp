import java.util.Scanner;

public class TV {

//Default waardes:
//byte, short, int, long > 0
//float, double > 0.0
//boolean > false;
//char > \u0000
//Class/Objects > null

//Properties van de class
public short numberToCart;
public int numberInStock;
public boolean inStock;
public double price;
public char energyLabel;
public String name;

	public void addProperty() {
		Scanner input = new Scanner(System.in);
		System.out.println("\nVoer een property in:");
		String property = input.next();
		System.out.println(property);
	}

	public String addName () {
		Scanner input = new Scanner(System.in);
		System.out.println("\nVoer een naam in:");
		// input.next();
		name = input.nextLine();
		return name;
	}

	public double addPrice () {
		Scanner input = new Scanner(System.in);
		System.out.println("\nVoer een prijs in:");
		price = input.nextDouble();
		return price;
	}

	public int addStock () {
		Scanner input = new Scanner(System.in);
		System.out.println("\nVoer het aantal voorraad in:");
		numberInStock = input.nextInt();
		return numberInStock;
	}

	public char addEnergyLabel () {
		Scanner input = new Scanner(System.in);
		System.out.println("\nVoer een energielabel in:");
		energyLabel = input.next().charAt(0);
		return energyLabel;
	}

	public boolean addInStock () {
		Scanner input = new Scanner(System.in);
		System.out.println("\nIs het product op voorraad?");
		inStock = input.nextBoolean();
		return inStock;
	}

	public boolean getInStock() {
		System.out.println("Is product op voorraad: " + inStock);
		return inStock;
	}

	public double getPrice() {
		System.out.println("De prijs is: " + price);
		return price;
	}

	public char getEnergyLabel() {
		System.out.println("Het energielabel is: " + energyLabel);
		return energyLabel;
	}

	public String getName() {
		System.out.println("De naam is: " + name);
		return name;
	}

	public int getStock() {
		System.out.println("De voorraad is: " + numberInStock);
		return numberInStock;
	}

	public void setName(String tempName) {
		name = tempName;
	}

	public void setPrice(double tempPrice) {
		price = tempPrice;
	}

	public void setEnergyLabel(char tempEnergyLabel) {
		energyLabel = tempEnergyLabel;
	}

	public void setInStock(boolean tempInStock) {
		inStock = tempInStock;
	}

	public void setNumberInStock(int tempNumber) {
		numberInStock = tempNumber;
	}

	public static void main(String[] args){
		
	}
}