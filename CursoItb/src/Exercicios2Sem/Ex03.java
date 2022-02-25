package Exercicios2Sem;

import javax.swing.JOptionPane;

public class Ex03 {

	public static void main(String[] args) {
		
		int tab=0;
		String aux="";
		
		tab=Integer.parseInt(JOptionPane.showInputDialog("Informe o número da tabuada: "));
		
		for (int i=0; i<=10;i++) {
			aux+= tab+"x"+i+"="+tab*i+"\n";
		}JOptionPane.showMessageDialog(null, "Tabuada do: "+ tab+ "\n\n"+aux);
		
		
	}

}
