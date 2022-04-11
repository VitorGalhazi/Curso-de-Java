package lista;

import javax.swing.*;

public class bina {
	
	public static void main(String[] agrs) {
		String number = JOptionPane.showInputDialog("Digite um número!");
		int numero = Integer.parseInt (number);
		long nume=0;
		int pot10 = 1;
		
		do {
			int num = numero % 2;
			nume += num * pot10;
			numero /= 2;
			pot10*=10;
			
		}while(numero>0);
		JOptionPane.showMessageDialog(null, nume);
	}

}
