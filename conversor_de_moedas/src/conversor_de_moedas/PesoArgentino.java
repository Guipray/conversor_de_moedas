package conversor_de_moedas;

public class PesoArgentino extends Moedas {

	public PesoArgentino(String moedaAReceber) {
		if (moedaAReceber == "Dolar") {
			setTaxacambio(0.0050);
		} else if (moedaAReceber == "Euro") {
			setTaxacambio(0.0047);
		} else if (moedaAReceber == "Libras Esterlinas") {
			setTaxacambio(0.0042);
		} else if (moedaAReceber == "Peso Chileno") {
			setTaxacambio(4.03);
		} else if (moedaAReceber == "Real") {
			setTaxacambio(0.026);
		}
	}
	
}
