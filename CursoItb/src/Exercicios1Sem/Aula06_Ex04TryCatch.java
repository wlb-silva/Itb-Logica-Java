package Exercicios1Sem;

import javax.swing.JOptionPane;

public class Aula06_Ex04TryCatch {

	public static void main(String[] args) {

		double metroCubico, total, comprimento, largura, profundidade=0;
		try {
		comprimento=Double.parseDouble(JOptionPane.showInputDialog("Informe o comprimento da piscina: "));
		largura=Double.parseDouble(JOptionPane.showInputDialog("Informe a largura da piscina: "));
		profundidade=Double.parseDouble(JOptionPane.showInputDialog("Informe a profundidade da piscina: "));
		metroCubico=comprimento*largura*profundidade;
		total=metroCubico*45;
		JOptionPane.showMessageDialog(null, "A piscina solicitada ter� "+metroCubico
				+" metros c�bicos.\n"+"O valor da constru��o ser� de: R$ "+total);
	}catch (Exception e) {
		JOptionPane.showMessageDialog(null, "Informe apenas n�meros!");
	}
}
}