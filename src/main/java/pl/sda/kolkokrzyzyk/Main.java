package pl.sda.kolkokrzyzyk;

public class Main {

	public static void main(String[] args) {

		Interfejs interfejs = new Interfejs();
		Plansza plansza = new Plansza();
		int menu = interfejs.menu();
		String gracz1 = interfejs.podajImie();
		String gracz2 = interfejs.podajImie();

		int pozycja = interfejs.podajPole(gracz1);
		boolean czyWstawiono = plansza.wstawZnak("X", pozycja);
		czyWstawiono = plansza.wstawZnak("O", pozycja);

		System.out.println(" |  | ");
		System.out.println(" ----- ");
		System.out.println(" |  | ");
		System.out.println(" ----- ");
		System.out.println(" |  | ");

	}

}
