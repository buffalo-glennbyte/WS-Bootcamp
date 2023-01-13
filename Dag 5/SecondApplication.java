public class SecondApplication {
	public static void main(String[] args) {
		Car car = new Car();
		car.brand = "Nissan";
		car.setWheels(4);
		car.engine = "1.6L";

		System.out.println(car.brand);
		System.out.println(car.getWheels());
		System.out.println(car.engine);
	}
}