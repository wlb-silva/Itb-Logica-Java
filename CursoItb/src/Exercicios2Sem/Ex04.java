package Exercicios2Sem;

import javax.swing.JOptionPane;

public class Ex04 {

	public static void main(String[] args) {
		String aux="";
		
		for (int i=100;i<=200;i++) {
			if(i%2==1) {
				aux+=i+" ";
			}
		}JOptionPane.showMessageDialog(null, aux);
		
	}

}
