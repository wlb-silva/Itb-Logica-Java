package Exercicios1Sem;

import javax.swing.JOptionPane;

public class Aula05_Ex02 {

	public static void main(String[] args) {

		//trabalhando com JOptionPane//
		
		String aux="";
		double base, altura=0;
		
		base=Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor da base"));
		altura=Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor da altura"));
		double area= base*altura/2;
		
		JOptionPane.showMessageDialog(null,"Área do Triângulo: "+ area);
		
	}

}
