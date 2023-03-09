package conversor_de_moedas;

public class Kelvin extends Temperaturas{

	public Kelvin(String temperaturaAReceber, double valor) {
		if (temperaturaAReceber == "Fahrenheit") {
			setValor((valor - 273.15) * 9/5 + 32);
		} else if (temperaturaAReceber == "Celsius") {
			setValor(valor - 273.15);
		}
	}
	
}
