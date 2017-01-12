package pl.sda.kolkokrzyzyk;

public class Plansza {

	private String[] pola;

	public Plansza() {
		pola = new String[9];
		for (int i = 1; i <= pola.length; i++) {
			pola[i - 1] = String.valueOf(i);
		}
	}

	public boolean wstawZnak(String znak, int pozycja) {

		if (!Util.isDigit(pola[pozycja - 1])) {
			return false;
		}
		pola[pozycja - 1] = znak;
		return true;

	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < pola.length; i++) {
			if (i != 0 && i % 3 == 0) {
				stringBuilder.append("\n");
				stringBuilder.append("-----");
				stringBuilder.append("\n");
			}
			if (Util.isDigit(pola[i])) {
				stringBuilder.append(i + 1);

			} else {
				stringBuilder.append(pola[i]);

			}
			stringBuilder.append("|");
		}
		return stringBuilder.toString();
	}

	public String[] getPola() {
		return pola;
	}

	public void setPola(String[] pola) {
		this.pola = pola;
	}

}
