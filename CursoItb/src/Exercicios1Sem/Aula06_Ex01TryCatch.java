package Exercicios1Sem;

import javax.swing.JOptionPane;

public class Aula06_Ex01TryCatch {

	public static void main(String[] args) {

		double media, nota1, nota2, notatrabalho=0;
		
		try {
		nota1=Double.parseDouble(JOptionPane.showInputDialog("Entre com a 1� nota:"));
		nota2=Double.parseDouble(JOptionPane.showInputDialog("Entre com a 2� nota:"));
		notatrabalho=Double.parseDouble(JOptionPane.showInputDialog("Entre com a nota do trabalho"));
		media=(nota1+nota2+notatrabalho)/3;
		JOptionPane.showMessageDialog(null, "Notas Fornecidas: "+"\n"+"1�--> "+nota1
				+"\n"+"2�--> "+nota2+"\n"+"trabalho--> "+notatrabalho
				+"\n\n"+"M�dia--> "+media);
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Houve erro na convers�o,\nDigite apenas valores num�ricos!");
		}		
	}
}
