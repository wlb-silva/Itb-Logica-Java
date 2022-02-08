package Exercicios1Sem;
import javax.swing.JOptionPane;

public class Aula08_Ex01LacoFor {

	public static void main(String[] args) {
		
		String aux="";
		String result="";
		aux=JOptionPane.showInputDialog("Entre com a palavra ou frase: ");
		for (int cont=1;cont<=10;cont++) {
			result+=cont+ " - "+aux+"\n";
			
		}JOptionPane.showMessageDialog(null, result);
		}
}