package lista;

import javax.swing.*;

public class numbers {

	public static void main(String[] args) {
		String digit = JOptionPane.showInputDialog("Quantos n�meros vai digitar");
		int digitador = Integer.parseInt (digit);
		
		int soma = 0;
		for(int cont = 0; cont<digitador; cont++){
			String number = JOptionPane.showInputDialog("Digite um n�mero");
			int n = Integer.parseInt(number);
			if (n%2==0) {
				soma = n + soma;
			}
		}
		
		JOptionPane.showMessageDialog(null, "o valor dos n�meros pares ao todo � " + soma);
	}

}
