package conversor_de_moedas;

public class Celsius extends Temperaturas{

	public Celsius(String temperaturaAReceber, double valor) {
		if (temperaturaAReceber == "Fahrenheit") {
			setValor((valor * 9/5) + 32);
		} else if (temperaturaAReceber == "Kelvin") {
			setValor(valor + 273.15);
		}
	}
}
