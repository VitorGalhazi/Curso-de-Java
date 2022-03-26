package lista;

import javax.swing.*;

public class natural {
	public static void main(String[] agrs) {
		String quant = JOptionPane.showInputDialog("Digite a quantidade de números");
		int n = Integer.parseInt(quant);
		String numero = JOptionPane.showInputDialog("Digite um número");
		int i = Integer.parseInt(numero);
		String number= JOptionPane.showInputDialog("Digite outro número");
		int j = Integer.parseInt(number);
		
		int cont = 0;
		
		do{
			if (cont % i == 0 || cont % j == 0){
				JOptionPane.showMessageDialog(null, cont);
				cont++;
			}else {
				cont++;
			}
		}while(cont<=n);
	}
	
}
