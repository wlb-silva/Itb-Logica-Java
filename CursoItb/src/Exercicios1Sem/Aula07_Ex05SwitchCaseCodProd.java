package Exercicios1Sem;

import javax.swing.JOptionPane;

public class Aula07_Ex05SwitchCaseCodProd {

	public static void main(String[] args) {
		
		String msg="";
		int codProd=0;
		double vlrProd=0;
	
		vlrProd=Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto"));
		codProd=Integer.parseInt(JOptionPane.showInputDialog("Informe o código de aumento: 1, 3, 4, 8"));
		
		switch (codProd) {
		case 1:
		vlrProd*=1.15;
		JOptionPane.showMessageDialog(null,"Valor com o aumento: "+vlrProd);
			break;
		case 3:
			vlrProd*=1.20;
			JOptionPane.showMessageDialog(null,"Valor com o aumento: "+vlrProd);
			break;
		case 4:
			vlrProd*=1.35;
			JOptionPane.showMessageDialog(null,"Valor com o aumento: "+vlrProd);
			break;
		case 8:
			vlrProd*=1.40;
			JOptionPane.showMessageDialog(null,"Valor com o aumento: "+vlrProd);
			break;
		default:
			msg="Código de aumento desconhecido";
		}JOptionPane.showMessageDialog(null, msg);
	}
}