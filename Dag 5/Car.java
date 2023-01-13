public class Car {

	public String brand;
	private int wheels;
	String engine;
	
	//GETTER
	public int getWheels(){
		return wheels;
	}	

	//SETTER
	public void setWheels(int tempWheels){
		this.wheels = tempWheels;
	}

	/*
		Constructor, returntype moet hetzelfde zijn als classname
		Constructor zonder arguments is default constructor.
	*/
	public Car() {
		System.out.println("In default constructor.");
		brand = "Tesla";
	}

	public Car(String brand) {
		System.out.println("In 2e constructor: " + brand);
		this.brand = brand;
	}

}