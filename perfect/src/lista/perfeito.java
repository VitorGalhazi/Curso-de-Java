package lista;

import javax.swing.JOptionPane;

public class perfeito {

	public static void main(String[] agrs) {
		String number = JOptionPane.showInputDialog("Digite um número");
		int n = Integer.parseInt(number);

		int soma = 0;
		for (int cont =1; cont <= n/2; cont++) {
			if (cont % n == 0) {
				soma += cont;
			}
		}
		if (soma==n) {
			JOptionPane.showMessageDialog(null, n + " é perfeito");
		} else {
			JOptionPane.showMessageDialog(null, n + " não é perfeito");
		}
	}
}
