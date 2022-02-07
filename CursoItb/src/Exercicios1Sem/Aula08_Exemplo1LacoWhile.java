package Exercicios1Sem;

import javax.swing.JOptionPane;

public class Aula08_Exemplo1LacoWhile {

	public static void main(String[] args) {

		String aux="";
		int i=0;
		while(i<10) {
			aux+=i+" ";
			i++;
		}JOptionPane.showMessageDialog(null,"Valores obtidos no laço while\n"+ aux);
	}

}
