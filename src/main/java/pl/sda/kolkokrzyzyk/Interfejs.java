package pl.sda.kolkokrzyzyk;

import java.util.Scanner;

public class Interfejs {

	public int menu() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("1. Start");
		System.out.println("0. Koniec");
		int odpowiedz = scanner.nextInt();

		return odpowiedz;
	}

	public String podajImie() {

		System.out.println("Podaj imię");
		Scanner scanner = new Scanner(System.in);
		String imie = scanner.nextLine();

		return imie;
	}

	public int podajPole(String imie) {
		System.out.println("Gracz " + imie);
		System.out.println("Podaj numer pola: ");
		Scanner scanner = new Scanner(System.in);
		int pozycja = scanner.nextInt();
		return pozycja;

	}
	public void pokazPlansze(Plansza plansza) {
		System.out.println(plansza.toString());
	}

	public void podanoNiepoprawnePole() {
		System.out.println("Podano niepoprawne pole");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
	}

	public void wygranoGre(String imie) {
		System.out.println("Brawo " + imie + "! Wygrales gre");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
	}
}
