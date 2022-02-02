package Exercicios1Sem;

import javax.swing.JOptionPane;

public class Aula07_Ex02IfElseImc {
	public static void main(String[] args) {
		double peso, altura, imc=0;
		
		peso=Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso: "));
		altura=Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura: "));
		imc=peso/(altura*altura);
				
		if (imc<18.5) {
			JOptionPane.showMessageDialog(null, "Peso abaixo do normal"+"\nIMC: "+imc);
	}		else if (imc>=18.5&&imc<=24.4) {
			JOptionPane.showMessageDialog(null, "Peso ideal"+"\nIMC: "+imc);
	}		else if (imc>=24.5&&imc<=29.9) {
			JOptionPane.showMessageDialog(null, "Pré obesidade"+"\nIMC: "+imc);
	}		else if (imc>=30&&imc<=34.9) {
			JOptionPane.showMessageDialog(null, "Obesidade classe I"+"\nIMC: "+imc);
	}		else if (imc>=35&&imc<=39.9) {
			JOptionPane.showMessageDialog(null, "Obesidade classe II (severa)"+"\nIMC: "+imc);
	}		else if (imc>=40) {
			JOptionPane.showMessageDialog(null, "Obesidade classe III (severa)"+"\nIMC: "+imc);
	}
}
}