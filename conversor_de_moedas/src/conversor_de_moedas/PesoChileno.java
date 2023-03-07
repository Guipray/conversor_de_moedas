package conversor_de_moedas;

public class PesoChileno extends Moedas {

	public PesoChileno(String moedaAReceber) {
		if (moedaAReceber == "Dolar") {
			setTaxacambio(0.0012);
		} else if (moedaAReceber == "Euro") {
			setTaxacambio(0.0012);
		} else if (moedaAReceber == "Libras Esterlinas") {
			setTaxacambio(0.0011);
		} else if (moedaAReceber == "Real") {
			setTaxacambio(0.0064);
		} else if (moedaAReceber == "Peso Argentino") {
			setTaxacambio(0.25);
		}
	}
	
}
