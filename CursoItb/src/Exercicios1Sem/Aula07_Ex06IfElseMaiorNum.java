package Exercicios1Sem;

import javax.swing.JOptionPane;

public class Aula07_Ex06IfElseMaiorNum {

	public static void main(String[] args) {
		
		int num1, num2, num3=0;
		
		try {
		num1=Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número: "));
		num2=Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número: "));
		num3=Integer.parseInt(JOptionPane.showInputDialog("Informe o terceiro número: "));
		
		if (num1>num2 && num1>num3) {
			JOptionPane.showMessageDialog(null, "Números fornecidos: \n"
					+num1+"\n"+num2+"\n"+num3+"\n\n"+"Maior número: "+num1);
		}else if (num2>num1 && num2>num3) {
			JOptionPane.showMessageDialog(null, "Números fornecidos: \n"
					+num1+"\n"+num2+"\n"+num3+"\n\n"+"Maior número: "+num2);
		}else {
			JOptionPane.showMessageDialog(null, "Números fornecidos: \n"
					+num1+"\n"+num2+"\n"+num3+"\n\n"+"Maior número: "+num3);
		}
	}catch (Exception e) {
		JOptionPane.showMessageDialog(null, "Insira um número inteiro!");
	}
}
}