package Exercicios1Sem;

import javax.swing.JOptionPane;

public class Aula08_Ex04LacoFor {

	public static void main(String[] args) {

		int tab=Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor da tabuada até 10: "));
	
		String aux="";
		for (int i=1; i<=10;i++) {
			aux+=tab+" x "+i+" = "+tab*i+"\n";
		}JOptionPane.showMessageDialog(null, aux);
	}
}
