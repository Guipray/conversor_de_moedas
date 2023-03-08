package conversor_de_moedas;

import java.text.DecimalFormat;

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
			int opcao = 0;
			while (opcao == 0) {
				String escolhaMoedaInserida = (String) JOptionPane.showInputDialog(null,
						"Escolha uma moeda para converter. De:", "Moedas", JOptionPane.QUESTION_MESSAGE, null,
						moedaInserida, moedaInserida[0]);
				
				if (escolhaMoedaInserida != null) {

					while (true) {
						try {
							Double valor = Double
									.parseDouble(JOptionPane.showInputDialog("Insira um valor:").replace(",", "."));
							String escolhaMoedaAReceber = (String) JOptionPane.showInputDialog(null, "Para:", "Moedas",
									JOptionPane.QUESTION_MESSAGE, null, moedaAReceber, moedaAReceber[1]);
							if (escolhaMoedaAReceber == null) {
								break;
							}
							Moedas moeda = new Moedas();

							String simboloMoeda = moeda.getSimbolo(escolhaMoedaInserida);
							String simboloMoedaConvertida = moeda.getSimbolo(escolhaMoedaAReceber);
							double valorConvertido = moeda.converter(escolhaMoedaInserida, valor, escolhaMoedaAReceber);

							DecimalFormat df = new DecimalFormat("#.##");

							JOptionPane.showMessageDialog(null,
									"O valor convertido fica " + simboloMoedaConvertida
											+ df.format(valorConvertido).replace(",", ".") + "\n (" + simboloMoeda
											+ df.format(valor).replace(",", ".") + " foi para " + simboloMoedaConvertida
											+ df.format(valorConvertido).replace(",", ".") + ")");
							break;

						} catch (NumberFormatException e) {
							JOptionPane.showMessageDialog(null, "Valor Inválido!");
						} catch (NullPointerException e) {
							break;
						}
					}
					opcao = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
					if (opcao == 1) {
						JOptionPane.showMessageDialog(null, "Programa Finalizado!");
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
			JOptionPane.showMessageDialog(null, "Em breve!");
		} else if (escolha == -1) {
			JOptionPane.showMessageDialog(null, "Programa Finalizado!");
		} else {
			JOptionPane.showMessageDialog(null, "Opção Inválida");
		}

	}

}
