public class Human {
	
	public String name;
	public int age;
	public boolean alive;

	public Human() {
		System.out.println("Default Human template with no arguments.");
		System.out.println();
	}

	public Human(String tempName) {
		this.name = tempName;
		System.out.println("You just made a human with the name: " + name);
		System.out.println();
	}

	public Human(int tempAge, String tempName) {
		this.age = tempAge;
		this.name = tempName;
		System.out.println("You just made a human with the name: " + name);
		System.out.println("Human " + name + " is " + age + " years old.");
		System.out.println();
	}

	public Human(int tempAge, String tempName, boolean tempAlive) {
		this.age = tempAge;
		this.name = tempName;
		this.alive = tempAlive;
		System.out.println("You just made a human with the name: " + name);
		System.out.println("Human " + name + " is " + age + " years old.");
		System.out.println("Is this human alive? \n" + alive);
		System.out.println();
	}

	{
		System.out.println("Dit komt voor de Contructors. \n");
	}
	
}