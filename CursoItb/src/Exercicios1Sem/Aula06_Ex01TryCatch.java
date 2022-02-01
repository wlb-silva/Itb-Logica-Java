package Exercicios1Sem;

import javax.swing.JOptionPane;

public class Aula06_Ex01TryCatch {

	public static void main(String[] args) {

		double media, nota1, nota2, notatrabalho=0;
		
		try {
		nota1=Double.parseDouble(JOptionPane.showInputDialog("Entre com a 1ª nota:"));
		nota2=Double.parseDouble(JOptionPane.showInputDialog("Entre com a 2ª nota:"));
		notatrabalho=Double.parseDouble(JOptionPane.showInputDialog("Entre com a nota do trabalho"));
		media=(nota1+nota2+notatrabalho)/3;
		JOptionPane.showMessageDialog(null, "Notas Fornecidas: "+"\n"+"1º--> "+nota1
				+"\n"+"2º--> "+nota2+"\n"+"trabalho--> "+notatrabalho
				+"\n\n"+"Média--> "+media);
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Houve erro na conversão,\nDigite apenas valores numéricos!");
		}		
	}
}
