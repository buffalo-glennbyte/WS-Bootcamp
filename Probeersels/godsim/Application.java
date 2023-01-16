import galaxy.organism.*;
import galaxy.planet.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Application {

	static Scanner input = new Scanner(System.in);
	final static String[] mainMenu = {"[1] Create a human", 
						"[2] Modify a human", 
						"[3] Delete a human", 
						"[4] List all humans",
						"[5] Get stats from a human", 
						"[6] Exit application"};
	final static String[] modifyList = {"[1] Name",
							"[2] Age",
							"[3] Gender",
							"[4] Race",
							"[5] Is alive?",
							"[6] None"};
	static boolean userExit = true;
	static ArrayList<Human> humans = new ArrayList<Human>();
	static int amountHumans = humans.size();

	private static void mainMenu(){ 			
		//This prints the menu array
		System.out.println("\nWhat do you want to do?");
		for(String x : mainMenu) {System.out.println(x);}
		System.out.println();
		switch (input.nextInt()) {
			case 1:
				createHuman();
				break;
			case 2:
				System.out.println("\nWhat human do you want to modify?");
				listHumans();
				String humanToModify = input.next();
				for(Human element : humans) {
					if(element.getName().equals(humanToModify)){
						modifyList(element);
					} else {
						System.out.println("Human doesn't exist.");
					}
				}
				break;
			case 3:
				System.out.println("\nWhat human would you like to delete?");
				listHumans();
				String humanToDelete = input.next();
				for(Human element : humans) {
					if(element.getName().equals(humanToDelete)){
						humans.remove(element);
						System.out.println("Human deleted.");
					} else {
						System.out.println("Human doesn't exist.");
					}
				}
				break;
			case 4:
				System.out.println("\nThese are all the humans you created thus far:");
				listHumans();
				break;
			case 5:
				System.out.println("\nFrom what human would you like to see the stats?");
				listHumans();
				String humanGetStats = input.next();
				for(Human element : humans) {
					if(element.getName().equals(humanGetStats)){
						element.getStats();
					} else {
						System.out.println("Human doesn't exist.");
					}
				}
				break;
			case 6:
				System.out.println("\nSee you next time!\n");
				userExit = false;
				break;
			default:
				System.out.println("Invalid input, try again.");
		}
	}

	private static void createHuman(){
			Human tempHuman = new Human();
			tempHuman.Human();
			humans.add(tempHuman);
		}

	private static void listHumans(){
			for(Human element : humans){
			System.out.println(element.getName());}
			System.out.println();
		}

	private static void modifyList(Human human){
			System.out.println("\nWhat property would you like to modify?");
			for (String x : modifyList) {System.out.println(x);}
			System.out.println();
			switch(input.nextInt()){
				case 1:
					System.out.println("The current name is: " + human.getName());
					human.setName();
					break;
				case 2:
					System.out.println("The current age is: " + human.getAge());
					human.setAge();
					break;
				case 3:
					System.out.println("The current gender is: " + human.getGender());
					human.setGender();
					break;
				case 4:
					System.out.println("The current race is: " + human.getRace());
					human.setRace();
					break;
				case 5:
					System.out.println("Currently this human is: " + ((human.isAlive()) ? "Alive" : "Dead"));
					human.setAlive();
					break;
				case 6:
					break;
				default:
					System.out.println("Invalid input.");
			}
		}

	public static void main(String[] args){
		System.out.println("Welcome to God Simulator, command line edition!");
		do {mainMenu();}
		while(userExit);

		/*
		Human t1 = new Human(), t2 = new Human(), t3 = new Human(), t4 = new Human(), t5 = new Human();
		t1.Human("Caroline", 62, 'F', "Dutch", true);

		Human test = new Human();
		test.getStats();
		test.setName("Harry");
		test.setAlive(true);
		test.setGender('M');
		test.setRace("Egytian");
		test.setAge(28);
		
		test.getStats();
		test.Human();

		Human test2 = new Human();
		test2.Human("Elise");
		*/
	}
	
}