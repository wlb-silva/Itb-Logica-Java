package Exercicios1Sem;

import javax.swing.JOptionPane;

public class Aula08_Exemplo1LacoDoWhile {

	public static void main(String[] args) {
		
		String aux="";
		int i=0;
		
		do {
			aux+=i+" ";
			i++;
		}while (i<10);
		JOptionPane.showMessageDialog(null,"Valores obtidos no laço  Do while\n"+ aux);	
	}

}
