package Exercicios2Sem;

import javax.swing.JOptionPane;

public class Ex02 {

	public static void main(String[] args) {
		
		String aux="";
		
		int num1=0, num2=0;
		
		num1= Integer.parseInt(JOptionPane.showInputDialog("Digite primeiro número: "));
		num2= Integer.parseInt(JOptionPane.showInputDialog("Digite segundo número: "));
		
		for (int i=num1; i<=num2;i++) {
			aux+=i + " ";
		}JOptionPane.showMessageDialog(null, "Numeros informados: "+ num1 + " e "+ num2+
				"\nSequência de números: "+aux);
	}

}
