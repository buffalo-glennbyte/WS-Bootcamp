public class Application {
	public static void main(String[] args) {
		
		int a = 12;
		int b = 33;
		
		// Hele getallen
		byte _bb = 23; // 8 bit
		short _s = 5123; // 16 bit
		int _i = 345356; // 32 bit
		long _l = 34875634; // 64 bit

		float _f = 12; // 12.0
		double _d = 23.65; //
		double _d2 = 44.49;

		boolean _b = true;

		char _c = 'c'; // Altijd enkele quote

		String _s2 = "Working Spirit";

		System.out.println("Het werkt!");



		// * 2 ints en int * short
		System.out.println("Antwoord = " + (a * b));
		System.out.println("Antwoord = " + (a * _s));

		// delen door 2 ints en 2 doubles
		System.out.println("Antwoord = " + (b / a));
		System.out.println("Antwoord = " + (_d / _d2));

		int a2 = 4;
		int b2 = 3;
		System.out.println("Antwoord = " + (5 + 2 * 3 - a2++ - --b2));



		// maak 3 boolean variabelen en pas daar 3 comparators op de variabelen die je eerder hebt gemaakt
		if (a == a2){
			System.out.println("Waar");
		} else {
			System.out.println("Niet waar");
		}

		if (_d < _d2){
			System.out.println("Waar");
		} else {
			System.out.println("Niet waar");
		}

		if ((_i % b2) < 4){
			System.out.println("Waar");
		} else {
			System.out.println("Niet waar");
		}
	}
}