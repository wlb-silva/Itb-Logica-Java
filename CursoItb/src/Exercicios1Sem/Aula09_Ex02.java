package Exercicios1Sem;

import javax.swing.JOptionPane;

public class Aula09_Ex02 {

	public static void main(String[] args) {
		
		double a=0, b=0, soma=0;
		String c, d, f="";
				
		try {
			
		a=Double.parseDouble(JOptionPane.showInputDialog("Forneça um valor: "));
		b=Double.parseDouble(JOptionPane.showInputDialog("Forneça outro valor: "));
		soma=a+b;
		
		c=String.valueOf(a).replace(".","," );
		d=String.valueOf(b).replace(".","," );
		f=String.valueOf(soma).replace(".","," );
		
		String result= "Valores fornecidos: " + a + " e " + b+
				"\nValores convertidos: "+ c + " e " + d + "\nSoma: "+
				"R$ "+f;
		JOptionPane.showMessageDialog(null, result);
	} catch (Exception e) {
		JOptionPane.showMessageDialog(null, "Não deixar em branco!");	}

}
}
