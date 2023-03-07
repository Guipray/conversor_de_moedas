package conversor_de_moedas;

import javax.swing.JOptionPane;

public class Conversor {

	public static void main(String[] args) {

		String[] opcoes = { "Conversor de Moedas", "Conversor de Temperatura" };
		String[] moedaInserida = { "Real", "Dolar", "Euro", "Libras Esterlinas", "Peso Chileno", "Peso Argentino" };
		String[] moedaAReceber = { "Real", "Dolar", "Euro", "Libras Esterlinas", "Peso Chileno", "Peso Argentino" };

		int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu", JOptionPane.DEFAULT_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

		if (escolha == 0) {
			JOptionPane.showMessageDialog(null, "Conversor de Moedas selecionado!");

			String escolhaMoedaInserida = (String) JOptionPane.showInputDialog(null,
					"Escolha uma moeda para converter. De:", "Moedas", JOptionPane.QUESTION_MESSAGE, null,
					moedaInserida, moedaInserida[0]);
//			if (escolhaMoedaInserida == "Reais") {
//				Moedas moeda = new Real();
//				System.out.println("moeda criada");
//			} else if (escolhaMoedaInserida == "Dolar") {
//				Moedas moeda = new Dolar();
//			}

			if (escolhaMoedaInserida != null) {

				Double valor = null;
				while (valor == null) {
					System.out.println(valor);
					try {
						System.out.println("Teste");
						valor = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor:"));
						String escolhaMoedaAReceber = (String) JOptionPane.showInputDialog(null, "Para:", "Moedas",
								JOptionPane.QUESTION_MESSAGE, null, moedaAReceber, moedaAReceber[1]);

						if (escolhaMoedaAReceber == null) {
							JOptionPane.showMessageDialog(null, "Programa Finalizado!");
						} else {
							Moedas moeda = new Moedas();
							String simboloMoeda = moeda.getSimbolo(escolhaMoedaInserida);
							String simboloMoedaConvertida = moeda.getSimbolo(escolhaMoedaAReceber);
							double valorConvertido = moeda.converter(escolhaMoedaInserida, valor, escolhaMoedaAReceber);

							JOptionPane.showMessageDialog(null,
									"O valor convertido fica " + simboloMoeda + valorConvertido + "\n (" + simboloMoeda
											+ valor + " foi para " + simboloMoedaConvertida + valorConvertido + ")");
						}

					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Valor Inválido!");
					} catch (NullPointerException e) {
						JOptionPane.showMessageDialog(null, "Programa Finalizado!");
						break;
					} finally {

					}
				}

				// Sistema para remover a moeda recebida na variavel "escolhaMoedaInserida" da
				// lista moedaAReceber.

				/*
				 * System.out.println(moedaAReceber.length); for (int i = 0; i <
				 * moedaAReceber.length; i++) { System.out.println(moedaAReceber[i]); }
				 */

			} else if (escolhaMoedaInserida == null) {
				JOptionPane.showMessageDialog(null, "Programa Finalizado!");
			}

		} else if (escolha == 1) {
			JOptionPane.showMessageDialog(null, "Conversor de Temperatura selecionado!");
			// Aqui você pode colocar o código para o Conversor de Temperatura
		} else if (escolha == -1) {
			JOptionPane.showMessageDialog(null, "Programa Finalizado!");
		} else {
			JOptionPane.showMessageDialog(null, "Opção Inválida");
		}

	}

}
