package Exercicios1Sem;

import javax.swing.JOptionPane;

public class Aula07_Ex06IfElseMaiorNum {

	public static void main(String[] args) {
		
		int num1, num2, num3=0;
		
		try {
		num1=Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro n�mero: "));
		num2=Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo n�mero: "));
		num3=Integer.parseInt(JOptionPane.showInputDialog("Informe o terceiro n�mero: "));
		
		if (num1>num2 && num1>num3) {
			JOptionPane.showMessageDialog(null, "N�meros fornecidos: \n"
					+num1+"\n"+num2+"\n"+num3+"\n\n"+"Maior n�mero: "+num1);
		}else if (num2>num1 && num2>num3) {
			JOptionPane.showMessageDialog(null, "N�meros fornecidos: \n"
					+num1+"\n"+num2+"\n"+num3+"\n\n"+"Maior n�mero: "+num2);
		}else {
			JOptionPane.showMessageDialog(null, "N�meros fornecidos: \n"
					+num1+"\n"+num2+"\n"+num3+"\n\n"+"Maior n�mero: "+num3);
		}
	}catch (Exception e) {
		JOptionPane.showMessageDialog(null, "Insira um n�mero inteiro!");
	}
}
}