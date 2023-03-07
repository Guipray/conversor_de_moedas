package conversor_de_moedas;

public class LibrasEsterlinas extends Moedas {

	public LibrasEsterlinas(String moedaAReceber) {
		if (moedaAReceber == "Dolar") {
			setTaxacambio(1.18);
		} else if (moedaAReceber == "Euro") {
			setTaxacambio(1.12);
		} else if (moedaAReceber == "Real") {
			setTaxacambio(6.14);
		} else if (moedaAReceber == "Peso Chileno") {
			setTaxacambio(950.68);
		} else if (moedaAReceber == "Peso Argentino") {
			setTaxacambio(236.21);
		}
	}
	
}
