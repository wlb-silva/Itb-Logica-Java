package Exercicios1Sem;

import javax.swing.JOptionPane;

public class Aula07_Ex01IfElse {

	public static void main(String[] args) {

		int idade=0;
		try {
		idade=Integer.parseInt(JOptionPane.showInputDialog("Informe a idade:"));
		if (idade<18) {
			JOptionPane.showMessageDialog(null,"Você tem "+idade+" anos\nMenor de idade");
		}else {
			JOptionPane.showMessageDialog(null,"Você tem "+idade+" anos\n"
					+ "Maior de idade");
		}
}catch (Exception e) {
	JOptionPane.showMessageDialog(null, "Informe apenas números!");
}
}
}
