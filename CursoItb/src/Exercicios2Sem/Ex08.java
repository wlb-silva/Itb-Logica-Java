package Exercicios2Sem;

import javax.swing.JOptionPane;

public class Ex08 {

	public static void main(String[] args) {
		//o programa deve apresentar a m�dia dos n�meros pares. Sair se digitar 0//
		double soma=0,qtd=0, media=0, numero=0;
			int i=0;
			do {
				numero=Double.parseDouble(JOptionPane.showInputDialog("Informe o n�mero: "));
				if (numero%2==0 && numero!=0) {
					qtd+=1;
					soma+=numero;
					media=soma/qtd;
				}
				
				i++;
			}while (numero!=0);		
			JOptionPane.showMessageDialog(null, "M�dia dos n�meros pares digitados:\n"+media);
	}

}
