package Exercicios2Sem;

import javax.swing.JOptionPane;

public class Ex01 {

	public static void main(String[] args) {
		
		int num=0, positivo=0, negativo=0;
		
		for (int i=0;i<20;i++) {
			num=Integer.parseInt(JOptionPane.showInputDialog("Informe 20 valores"));
			
			if (num>0) {
				positivo+=num;
			}else {
				negativo+=1;
			}
			
		}JOptionPane.showMessageDialog(null, "Soma dos positivos: " + positivo+
				"\n Quantidade Valores Negativos: "+ negativo);
		
	}

}
