package Exercicios1Sem;

import javax.swing.JOptionPane;

public class Aula06_Ex02TryCatch {

	public static void main(String[] args) {

		double q1, q2, q3, vlr1, vlr2, vlr3, total=0;
		
		try {
		q1=Double.parseDouble(JOptionPane.showInputDialog("Informe a Qtd do produto 1"));
		vlr1=Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto 1"));
		q2=Double.parseDouble(JOptionPane.showInputDialog("Informe a Qtd do produto 2"));
		vlr2=Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto 2"));
		q3=Double.parseDouble(JOptionPane.showInputDialog("Informe a Qtd do produto 3"));
		vlr3=Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto 3"));
		total= (q1*vlr1)+(q2*vlr2)+(q3*vlr3);
		
		JOptionPane.showMessageDialog(null, "Total Geral: "+total);
	}catch (Exception e) {
		JOptionPane.showMessageDialog(null, "Não é permitidos valores em branco ou texto");
	}
	}
}
