import java.util.Scanner;

public class InvoerApplicatie {
	public static void main(String[] args) {
		System.out.println("Voer een getal in:");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		System.out.println("Je invoer is: " + a);

		if (a > 1) {
			System.out.println("Je invoer is groter dan 1.");
		} else if (a == 1) {
			System.out.println("Je invoer is gelijk aan 1.");
		} else if (a == -10) {
			System.out.println("Je invoer is gelijk aan -10.");
		} else {
			System.out.println("Je invoer is kleiner dan 1.");
		}


		System.out.println("Voer een woord in: ");
		String invoerString = scanner.next();
		
		//concat
		String _concat = invoerString.concat("anenbrood");
		System.out.println (_concat);
		
		//replace
		String _replace = invoerString.replace('a', 'e');
		System.out.println(_replace);
		
		//Index of
		int _indexof = invoerString.indexOf('r');
		System.out.println(_indexof);
		
		// Substring 
		String _substring = invoerString.substring(3);
		System.out.println(_substring);
		
		System.out.println("Voer een getal in binnen de lengte van het woord:");
		int positieKarakter = scanner.nextInt();
		System.out.println("Het karakter op positie " + positieKarakter + " van " + invoerString + " is: " + invoerString.charAt(positieKarakter-1));
		
		
		
	}
}