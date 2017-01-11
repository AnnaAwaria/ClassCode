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
}
