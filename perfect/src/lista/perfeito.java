package lista;

import javax.swing.JOptionPane;

public class perfeito {

	public static void main(String[] agrs) {
		String number = JOptionPane.showInputDialog("Digite um n�mero");
		int n = Integer.parseInt(number);

		int soma = 0;
		for (int cont =1; cont <= n/2; cont++) {
			if (cont % n == 0) {
				soma += cont;
			}
		}
		if (soma==n) {
			JOptionPane.showMessageDialog(null, n + " � perfeito");
		} else {
			JOptionPane.showMessageDialog(null, n + " n�o � perfeito");
		}
	}
}
