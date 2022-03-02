package Exercicios2Sem;

import javax.swing.JOptionPane;

public class Ex07 {

	public static void main(String[] args) {

		double numero=0, soma=0;
		boolean continuar=true;
		
		/*for(int i=1;i<=10;i++) {
			numero=Double.parseDouble(JOptionPane.showInputDialog("Informe um valor"));
			if (numero==0) {
				System.exit(0);	
			} else {
			soma+=numero;
			}
		}JOptionPane.showMessageDialog(null, soma);*/
		
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
