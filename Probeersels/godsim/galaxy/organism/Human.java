package galaxy.organism;
import java.util.Scanner;

public class Human {
		//{System.out.println("\nEr word een Human object gemaakt.");}
		
		private String name;
		private int age;
		private String race;
		private char gender;
		private boolean alive;
		
		Scanner input = new Scanner(System.in);

		//GETTERS
		public String getName()		{return name;}
		public int getAge()		{return age;}
		public String getRace()		{return race;}
		public char getGender()		{return gender;}
		public boolean isAlive()	{return alive;}
		
		//SETTERS
		public void setName(String tempName)	{this.name = tempName;}
		public void setName(){
			System.out.println("\nWhat is the name of your human?");
			String tempName = input.next();
			this.name = tempName;}

		public void setAge(int tempAge)		{this.age = tempAge;}
		public void setAge(){
			System.out.println("\nHow old is your human?");
			int tempAge = input.nextInt();
			this.age = tempAge;}

		public void setRace(String tempRace)	{this.race = tempRace;}
		public void setRace(){
			System.out.println("\nWhat is the race of your human?");
			String tempRace = input.next();
			this.race = tempRace;}

		public void setGender(char tempGender) 	{this.gender = tempGender;}
		public void setGender(){
			System.out.println("\nWhat is the gender of your human? (M/F)");
			char tempGender = input.next().charAt(0);
			this.gender = tempGender;}

		public void setAlive(boolean tempAlive)	{this.alive = tempAlive;}
		public void setAlive(){
			System.out.println("\nIs this human alive? true/false");
			boolean tempAlive = input.nextBoolean();
			this.alive = tempAlive;}

		
		public void getStats() {
			System.out.println("\nYour human is called: " + this.getName());
			System.out.println("Your human is " + this.getAge() + " years old.");
			System.out.println("Your human is from the following race: " + this.getRace());
			System.out.println("Your human has the following gender: " + this.getGender());
			System.out.println("Is this human alive: " + ((this.isAlive()) ? "Yes" : "No"));
		}

		public void Human() {
			this.setName();
			this.setAge();
			this.setGender();
			this.setRace();
			this.setAlive();
			//this.getStats();
			}

		public void Human(String name) {
			this.name = name;
			this.setAge();
			this.setGender();
			this.setRace();
			this.setAlive();
			this.getStats();}

		public void Human(String name, int age) {
			this.name = name;
			this.age = age;
			this.setGender();
			this.setRace();
			this.setAlive();
			this.getStats();}

		public void Human(String name, int age, char gender) {
			this.name = name;
			this.age = age;
			this.gender = gender;
			this.setRace();
			this.setAlive();
			this.getStats();}

		public void Human(String name, int age, char gender, String race) {
			this.name = name;
			this.age = age;
			this.gender = gender;
			this.race = race;
			this.setAlive();
			this.getStats();}

		public void Human(String name, int age, char gender, String race, boolean alive) {
			this.name = name;
			this.age = age;
			this.gender = gender;
			this.race = race;
			this.alive = alive;
			this.getStats();}
}