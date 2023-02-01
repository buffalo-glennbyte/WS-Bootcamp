public class Laptop {

	public String fabrikant;
	
	{System.out.println("Initializer 1");}
	{System.out.println("Initializer 2");}


	public Laptop(){
		System.out.println("Constructor 1\n");
	}

	public Laptop(String tempFabrikant){
		this.fabrikant = tempFabrikant;
		System.out.println("Constructor 2\n");
	}

	{System.out.println("Initializer 3");}
	
}