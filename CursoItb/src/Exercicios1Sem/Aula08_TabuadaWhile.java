package Exercicios1Sem;

import javax.swing.JOptionPane;

public class Aula08_TabuadaWhile {

	public static void main(String[] args) {

		int tab=0;
		String aux="";
		
		tab=Integer.parseInt(JOptionPane.showInputDialog("Informe a tabuada de 1 a 10"));
		
		int i=1;
		while (i<=10) {
			aux+=tab+" X "+ i+" = "+tab*i+"\n";
			i++;
		}JOptionPane.showMessageDialog(null, aux);
	}

}
