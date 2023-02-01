import test.model.*;
import working.spirit.util.*;
import working.spirit.code.*;
import webshop.Webshop;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		String tempSI;
		int tempII;

		Scanner input = new Scanner(System.in);

		/*
		Laptop l1 = new Laptop("Lenovo");
		Laptop l2 = new Laptop();

		Car c1 = new Car();  // Default constructor
		Car c2 = new Car("Volvo");

		Human test = new Human();
		Human barry = new Human("Barry");
		Human henk = new Human(23, "Henk");
		Human Suzanne = new Human(83, "Suzanne", false);

		Testprint tP = new Testprint();
		*/

		Webshop web1 = new Webshop();
		System.out.println("Wie is de eigenaar?");
		tempSI = input.next();
		if(tempSI.length() < 2){
			System.exit(0);
		}
		web1.owner = tempSI;
		tempSI = null;

		System.out.println("Wat is het IP adress?");
		tempSI = input.next();
		if(tempSI.length() < 2){
			System.exit(0);
		}
		web1.ipAdress = tempSI;
		tempSI = null;

		System.out.println("Wat is het webadress?");
		tempSI = input.next();
		if(tempSI.length() < 2){
			System.exit(0);
		}
		web1.setWebAdress(tempSI);
		tempSI = null;

		System.out.println("Wat is het bouwjaar?");
		int tempBJ = input.nextInt();
		if(tempBJ <= 0){System.exit(0);}
		web1.setBouwJaar(tempBJ);

		System.out.println("Wat is de klant naam?");
		tempSI = input.next();
		if(tempSI.length() < 2){
			System.exit(0);
		}
		web1.setKlantName(tempSI);
		tempSI = null;

		System.out.println("Wat is de leeftijd van de klant?");
		int tempKA = input.nextInt();
		if(tempKA <= 0){System.exit(0);}
		web1.setKlantAge(tempKA);

		System.out.println(web1.owner);
		System.out.println(web1.ipAdress);
		System.out.println(web1.getWebAdress());
		System.out.println(web1.getBouwJaar());
		System.out.println(web1.getKlantName());
		System.out.println(web1.getKlantAge());

				
	}
}