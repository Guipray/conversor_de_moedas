package conversor_de_moedas;

public class Dolar extends Moedas {

	public Dolar(String moedaAReceber) {
		if (moedaAReceber == "Real") {
			setTaxacambio(5.20);
		} else if (moedaAReceber == "Euro") {
			setTaxacambio(0.95);
		} else if (moedaAReceber == "Libras Esterlinas") {
			setTaxacambio(0.85);
		} else if (moedaAReceber == "Peso Chileno") {
			setTaxacambio(803.44);
		} else if (moedaAReceber == "Peso Argentino") {
			setTaxacambio(199.68);
		}
	}
	
}
