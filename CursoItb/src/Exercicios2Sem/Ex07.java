package Exercicios2Sem;

import javax.swing.JOptionPane;

public class Ex07 {

	public static void main(String[] args) {

		//o programa deve ler e somar números até o usuário digitar 0//
		double numero=0, soma=0;
		boolean continuar=true;
		
		int i=0;
		while (continuar) {
			
			numero=Double.parseDouble(JOptionPane.showInputDialog("Informe um valor"));
			if (numero==0) {
				System.exit(0);	
			} else {
			soma+=numero;
			JOptionPane.showMessageDialog(null, soma);
			}
			i++;
		}		
}
}
