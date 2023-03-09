package conversor_de_moedas;

public class Fahrenheit extends Temperaturas{

	public Fahrenheit(String temperaturaAReceber, double valor) {
		if (temperaturaAReceber == "Celsius") {
			setValor((valor - 32) * 5/9);
		} else if (temperaturaAReceber == "Kelvin") {
			setValor((valor - 32) * 5/9 + 273.15);
		}
	}
	
}
