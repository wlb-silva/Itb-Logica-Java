package Exercicios1Sem;

import javax.swing.JOptionPane;

public class Aula06_Ex03TryCatch {

	public static void main(String[] args) {

		double areaTotal, largura, comprimento=0;
		
		try {
		largura=Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a largura do lote: "));
		comprimento=Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o comprimento do lote: "));
		areaTotal=largura*comprimento;
		JOptionPane.showMessageDialog(null, "Área do lote: "+areaTotal);
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Informe apenas números");
		}
		}
}
