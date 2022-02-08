package Exercicios1Sem;
import javax.swing.JOptionPane;

public class Aula08_Ex02LacoFor {

	public static void main(String[] args) {
		
		String aux="";
		
		int num=Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor da contagem: "));
		
		for (int cont=1;cont<=num;cont++) {
			aux+=cont+" ";
			
		}JOptionPane.showMessageDialog(null, "Contagem até:\n"+ aux);
		}
}
