package conversor_de_moedas;

public class Real extends Moedas {
	
	public Real(String moedaAReceber) {
		if (moedaAReceber == "Dolar") {
			setTaxacambio(0.19);
		} else if (moedaAReceber == "Euro") {
			setTaxacambio(0.18);
		} else if (moedaAReceber == "Libras Esterlinas") {
			setTaxacambio(0.16);
		} else if (moedaAReceber == "Peso Chileno") {
			setTaxacambio(154.56);
		} else if (moedaAReceber == "Peso Argentino") {
			setTaxacambio(38.43);
		}
	}
}
