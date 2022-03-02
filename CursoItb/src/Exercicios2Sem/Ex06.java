package Exercicios2Sem;

import javax.swing.JOptionPane;

public class Ex06 {

	public static void main(String[] args) {

		
		double numero=0,soma=0;
		
		for (int i=1;i<=10;i++) {
			numero=Double.parseDouble(JOptionPane.showInputDialog("Informe dez números"));
			soma+=numero;
		}JOptionPane.showMessageDialog(null, soma);
	}

}
