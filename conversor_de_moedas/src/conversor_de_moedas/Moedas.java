package conversor_de_moedas;

public class Moedas {

	private double valor;
	private double taxacambio;
	private Moedas moeda;
	private String simbolo;
	
	protected void setTaxacambio(double taxacambio) {
		this.taxacambio = taxacambio;
	}
	
	public String getSimbolo(String moedaInserida) {
		if (moedaInserida == "Real") {
			simbolo = "R$";
		} else if (moedaInserida == "Dolar") {
			simbolo = "US$";
		} else if (moedaInserida == "Euro") {
			simbolo = "€";
		} else if (moedaInserida == "Libras Esterlinas") {
			simbolo = "£";
		} else if (moedaInserida == "Peso Chileno") {
			simbolo = "CLP";
		} else if (moedaInserida == "Peso Argentino") {
			simbolo = "ARS";
		}
		return this.simbolo;
	}
	
	public double converter(String moedaInserida, double valor, String MoedaAReceber) {
		if (moedaInserida == "Real") {
			this.moeda = new Real(MoedaAReceber);
			simbolo = "R$";
		} else if (moedaInserida == "Dolar") {
			this.moeda = new Dolar(MoedaAReceber);
			simbolo = "US$";
		} else if (moedaInserida == "Euro") {
			this.moeda = new Euro(MoedaAReceber);
			simbolo = "€";
		} else if (moedaInserida == "Libras Esterlinas") {
			this.moeda = new LibrasEsterlinas(MoedaAReceber);
			simbolo = "£";
		} else if (moedaInserida == "Peso Chileno") {
			this.moeda = new PesoChileno(MoedaAReceber);
			simbolo = "CLP";
		} else if (moedaInserida == "Peso Argentino") {
			this.moeda = new PesoArgentino(MoedaAReceber);
			simbolo = "ARS";
		} else {
			return 0;
		}
		double convertido = valor * this.moeda.taxacambio;
		this.valor = convertido;
		return this.valor;
	}

}
