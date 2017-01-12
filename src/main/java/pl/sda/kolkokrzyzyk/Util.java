package pl.sda.kolkokrzyzyk;

public class Util {

	public static boolean isDigit(String text) {
		char[] tablica = text.toCharArray();
		if (tablica.length > 1) {
			return false;
		}
		char znak = tablica[0];
		if (znak >= 49 && znak <= 57) {
			return true;
		}
		return false;

	}

	public boolean test(String napis) {
		char[] tablica = napis.toCharArray();
		if (tablica.length > 1) {
			return false;
		}
		String jedenElement = String.valueOf(tablica[0]);

		try {
			new Integer(jedenElement);
		} catch (Exception e) {
			System.out.println("To nie jest cyfra!");
			return false;
		}
		return true;
	}
}