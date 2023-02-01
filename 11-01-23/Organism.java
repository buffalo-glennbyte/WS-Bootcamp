public class Organism {

public String name;
public int age;
public char gender;
public boolean alive;
public String race;

	// SETTERS
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public void setRace(String race) {
		this.race = race;
	}

	//GETTERS
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}

	public boolean isAlive() {
		return alive;
	}

	public String getRace() {
		return race;
	}

}