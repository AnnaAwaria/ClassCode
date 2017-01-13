package pl.sda.kolkokrzyzyk;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Interfejs interfejs = new Interfejs();
		Plansza plansza = new Plansza();
		int menu = interfejs.menu();
		Map<String,String> mapaGraczy = new HashMap<>();
		String gracz1 = interfejs.podajImie();
		String gracz2 = interfejs.podajImie();
		mapaGraczy.put(gracz1, "X");
		mapaGraczy.put(gracz2, "O");

		for (int i = 0; i < 9; i++) {

			interfejs.pokazPlansze(plansza);
			boolean czyWstawiono;
			String aktualnyGracz = null;
			String wstawianyZnak = null;
			if (i % 2 == 0) {
				aktualnyGracz = gracz1;
			} else {
				aktualnyGracz = gracz2;
			}

			wstawianyZnak = mapaGraczy.get(aktualnyGracz);

			do {
				int pozycja = interfejs.podajPole(aktualnyGracz);
				czyWstawiono = plansza.wstawZnak(wstawianyZnak, pozycja);
				if (!czyWstawiono) {
					interfejs.podanoNiepoprawnePole();
				}

			} while (!czyWstawiono);
			if (Util.czyZakonczonoGre(plansza)) {
				interfejs.pokazPlansze(plansza);
				interfejs.wygranoGre(aktualnyGracz);
				break;
			}

		}

		System.out.println(" |  | ");
		System.out.println(" ----- ");
		System.out.println(" |  | ");
		System.out.println(" ----- ");
		System.out.println(" |  | ");

	}

}
