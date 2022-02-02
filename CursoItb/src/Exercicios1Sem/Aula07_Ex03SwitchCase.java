package Exercicios1Sem;

import javax.swing.JOptionPane;

public class Aula07_Ex03SwitchCase {
	public static void main(String[] args) {
		
		int dia=0;
		String msg;
		dia=Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro entre 1 e 7:"));
		
		switch (dia) {
		case 1:
			msg="domingo";
			break;
		case 2:
			msg="segunda-feira";
			break;
		case 3:
			msg="terça-feira";
			break;
		case 4:
			msg="quarta-feira";
			break;
		case 5:
			msg="quinta-feira";
			break;
		case 6:
			msg="sexta-feira";
			break;
		case 7:
			msg="sábado";
			break;
		default:
			msg="Somente até DEZ";
		}JOptionPane.showMessageDialog(null, msg);
	}
}