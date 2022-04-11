package lista;

import javax.swing.*;

public class Deci {
	
	public static void main(String[]args)  {

		String binario= JOptionPane.showInputDialog("Digite o número binário: ");

		long n = Long.parseLong(binario);

		int decimal = 0;

		int potd = 1;

		do {
		int ultAlg = (int) (n % 10);

		decimal = decimal + ultAlg * potd;

		n /= 10;

		potd *= 2;


		} while (n > 0);

		JOptionPane.showMessageDialog(null, decimal);

		}

		}

