package conversor_de_moedas;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Conversor {

	public static void main(String[] args) {

		String[] opcoes = { "Conversor de Moedas", "Conversor de Temperatura" };
		String[] moedas = { "Real", "Dolar", "Euro", "Libras Esterlinas", "Peso Chileno", "Peso Argentino" };
		String[] temperaturas = { "Celsius", "Fahrenheit", "Kelvin" };

		DecimalFormat df = new DecimalFormat("#.##");

		while (true) {
			
			int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu", JOptionPane.DEFAULT_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
			
			if (escolha == 0) {
				JOptionPane.showMessageDialog(null, "Conversor de Moedas selecionado!");
				int opcao = 0;
				while (opcao == 0) {
					String escolhaMoedaInserida = (String) JOptionPane.showInputDialog(null,
							"Escolha uma moeda para converter. De:", "Moedas", JOptionPane.QUESTION_MESSAGE, null,
							moedas, moedas[0]);

					if (escolhaMoedaInserida != null) {
						boolean valorMoedaNula = true;
						while (valorMoedaNula == true) {
							try {
								Double inputMoeda = Double
										.parseDouble(JOptionPane.showInputDialog("Insira um valor:").replace(",", "."));
								if (inputMoeda > 0.0) {
									valorMoedaNula = false;
									String escolhaMoedaAReceber = (String) JOptionPane.showInputDialog(null, "Para:",
											"Moedas", JOptionPane.QUESTION_MESSAGE, null, moedas, moedas[1]);
									if (escolhaMoedaAReceber == null) {
										break;
									}
									Moedas moeda = new Moedas();

									String simboloMoeda = moeda.getSimbolo(escolhaMoedaInserida);
									String simboloMoedaConvertida = moeda.getSimbolo(escolhaMoedaAReceber);
									double valorConvertido = moeda.converter(escolhaMoedaInserida, inputMoeda,
											escolhaMoedaAReceber);

									JOptionPane.showMessageDialog(null,
											"O valor convertido fica " + simboloMoedaConvertida
													+ df.format(valorConvertido).replace(",", ".") + "\n ("
													+ simboloMoeda + df.format(inputMoeda).replace(",", ".")
													+ " foi para " + simboloMoedaConvertida
													+ df.format(valorConvertido).replace(",", ".") + ")");
								} else {
									JOptionPane.showMessageDialog(null, "Valor Inválido!");
									valorMoedaNula = true;
								}

							} catch (NumberFormatException e) {
								JOptionPane.showMessageDialog(null, "Valor Inválido!");
							} catch (NullPointerException e) {
								break;
							}
						}
						opcao = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
						if (opcao == 1) {
							JOptionPane.showMessageDialog(null, "Programa Concluído!");
							break;
						} else if (opcao == 2) {
							JOptionPane.showMessageDialog(null, "Programa Concluído!");
							break;
						} else if (opcao == -1) {
							JOptionPane.showMessageDialog(null, "Programa Finalizado!");
							break;
						}

					} else if (escolhaMoedaInserida == null) {
						JOptionPane.showMessageDialog(null, "Programa Finalizado!");
						break;
					}
				}

			} else if (escolha == 1) {

				JOptionPane.showMessageDialog(null, "Conversor de Temperatura selecionado!");

				int opcao = 0;
				while (opcao == 0) {
					String escolhaTemperaturaInserida = (String) JOptionPane.showInputDialog(null,
							"Escolha uma temperatura para ser convertida. De:", "Temperaturas",
							JOptionPane.QUESTION_MESSAGE, null, temperaturas, temperaturas[0]);
					if (escolhaTemperaturaInserida != null) {
						boolean valorNulo = true;
						while (valorNulo == true) {
							try {
								Double inputTemperatura = Double.parseDouble(
										JOptionPane.showInputDialog(null, "Insira um valor:").replace(",", "."));
								String escolhaTemperaturaAReceber = (String) JOptionPane.showInputDialog(null, "Para:",
										"Temperaturas", JOptionPane.QUESTION_MESSAGE, null, temperaturas,
										temperaturas[1]);

								if (escolhaTemperaturaAReceber == null) {
									break;
								}

								Temperaturas temperatura = new Temperaturas();
								String simboloTemperatura = temperatura.getSimbolo(escolhaTemperaturaInserida);
								String simboloTemperaturaConvertida = temperatura
										.getSimbolo(escolhaTemperaturaAReceber);

								Double temperaturaConvertida = temperatura.converter(escolhaTemperaturaInserida,
										inputTemperatura, escolhaTemperaturaAReceber);

								JOptionPane.showMessageDialog(null,
										"O valor convertido fica " + df.format(temperaturaConvertida).replace(",", ".")
												+ simboloTemperaturaConvertida + "\n("
												+ df.format(inputTemperatura).replace(",", ".") + simboloTemperatura
												+ " para " + df.format(temperaturaConvertida).replace(",", ".")
												+ simboloTemperaturaConvertida + ")");

								valorNulo = false;
							} catch (NullPointerException e) {
								break;
							} catch (NumberFormatException e) {
								JOptionPane.showMessageDialog(null, "Valor Inválido!");
							}
						}
						opcao = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
						if (opcao == 1) {
							JOptionPane.showMessageDialog(null, "Programa Concluído!");
							break;
						} else if (opcao == 2) {
							JOptionPane.showMessageDialog(null, "Programa Concluído!");
							break;
						} else if (opcao == -1) {
							JOptionPane.showMessageDialog(null, "Programa Finalizado!");
							break;
						}
					} else if (escolhaTemperaturaInserida == null) {
						JOptionPane.showMessageDialog(null, "Programa Finalizado!");
						break;
					}
				}
			} else if (escolha == -1) {
				JOptionPane.showMessageDialog(null, "Fechando Programa!");
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Opção Inválida");
			}
		}
	}

}
