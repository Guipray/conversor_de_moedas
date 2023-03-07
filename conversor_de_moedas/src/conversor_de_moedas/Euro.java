package conversor_de_moedas;

public class Euro extends Moedas {

	public Euro(String moedaAReceber) {
		if (moedaAReceber == "Dolar") {
			setTaxacambio(1.05);
		} else if (moedaAReceber == "Real") {
			setTaxacambio(5.48);
		} else if (moedaAReceber == "Libras Esterlinas") {
			setTaxacambio(0.89);
		} else if (moedaAReceber == "Peso Chileno") {
			setTaxacambio(847.75);
		} else if (moedaAReceber == "Peso Argentino") {
			setTaxacambio(210.60);
		}
	}
	
}
