package Exercicios1Sem;

import javax.swing.JOptionPane;

public class Aula05_Ex03{

public static void main(String[] args) {
	//trabalhando com JOptionPane//
	
	double vlr1, vlr2=0;
	
	vlr1=Double.parseDouble(JOptionPane.showInputDialog("Informe um n�mero: "));
	vlr2=Double.parseDouble(JOptionPane.showInputDialog("Informe outro n�mero: "));
	
	double  soma, subt, mult, div=0;
	
	soma=vlr1+vlr2;
	subt=vlr1-vlr2;
	mult=vlr1*vlr2;
	div=vlr1/vlr2;
	
	JOptionPane.showMessageDialog(null, "N�meros fornecidos: "+""+vlr1+", "
	+vlr2+"\nSoma: "+soma+"\nSubtra��o: "+subt+"\nMultiplica��o: "+mult+"\nDivis�o: "+div);
	
}

}

