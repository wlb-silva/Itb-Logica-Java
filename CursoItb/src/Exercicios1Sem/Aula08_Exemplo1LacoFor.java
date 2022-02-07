package Exercicios1Sem;

import javax.swing.JOptionPane;

public class Aula08_Exemplo1LacoFor {

	public static void main(String[] args) {

		String aux="";
		
		for (int i=0;i<10;i++) {
		aux+=i+" ";
	}
		JOptionPane.showMessageDialog(null, "Valores obtidos com laço\n"+aux);
}
}