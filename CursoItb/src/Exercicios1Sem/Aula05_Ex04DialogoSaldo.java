package Exercicios1Sem;

import javax.swing.JOptionPane;

public class Aula05_Ex04DialogoSaldo {

	public static void main(String[] args) {
		
		double deposito=0;
		
		deposito=Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com o valor do dep�sito: "));
		JOptionPane.showMessageDialog(null,"Seu saldo atual �: "+deposito);
		deposito-=Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com o valor da retirada: "));
		JOptionPane.showMessageDialog(null,"Seu saldo atual �: "+deposito);
	}

}
