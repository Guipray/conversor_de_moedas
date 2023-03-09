package conversor_de_moedas;

public class Temperaturas {

	private double valor;
	private Temperaturas temperatura;
	private String simbolo;
	
	protected void setValor(double temperaturaConvertida) {
		this.valor = temperaturaConvertida;
	}
	
	public String getSimbolo(String temperaturaInserida) {
		if (temperaturaInserida == "Celsius") {
			simbolo = "°C";
		} else if (temperaturaInserida == "Fahrenheit") {
			simbolo = "°F";
		} else if (temperaturaInserida == "Kelvin") {
			simbolo = "K";
		}
		return this.simbolo;
	}
	
	public double converter(String temperaturaInserida, double valor, String temperaturaAReceber) {
		if (temperaturaInserida == "Celsius") {
			this.temperatura = new Celsius(temperaturaAReceber, valor);
		} else if (temperaturaInserida == "Fahrenheit") {
			this.temperatura = new Fahrenheit(temperaturaAReceber, valor);
		} else if (temperaturaInserida == "Kelvin") {
			this.temperatura = new Kelvin(temperaturaAReceber, valor);
		} else {
			return 0;
		}
		
		return this.temperatura.valor;
	}
	
}
