package conversor_de_moedas;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Conversor {

	public static void main(String[] args) {

		JFrame jframe = new JFrame();

		String[] opcoes = { "Conversor de Moedas", "Conversor de Temperatura" };
		String[] moedaInserida = { "Reais", "Dolar", "Euro", "Libras Esterlinas", "Peso Chileno", "Peso Argentino" };
		String[] moedaAReceber = { "Reais", "Dolar", "Euro", "Libras Esterlinas", "Peso Chileno", "Peso Argentino" };
		

		int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu", JOptionPane.DEFAULT_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
		System.out.println(escolha);

		if (escolha == 0) {
			JOptionPane.showMessageDialog(null, "Conversor de Moedas selecionado!");
			String escolhaMoedaInserida = (String) JOptionPane.showInputDialog(null, "Escolha uma moeda para converter. De:",
					"Moedas", JOptionPane.QUESTION_MESSAGE, null, moedaInserida, moedaInserida[0]);
			System.out.println(escolhaMoedaInserida);
			if (escolhaMoedaInserida != null) {
				JOptionPane.showMessageDialog(null, escolhaMoedaInserida + " foi selecionada!" );
				
			}
			
			// Aqui você pode colocar o código para o Conversor de Moedas
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
