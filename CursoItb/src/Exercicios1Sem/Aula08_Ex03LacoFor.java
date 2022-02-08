package Exercicios1Sem;
import javax.swing.JOptionPane;

public class Aula08_Ex03LacoFor {

	public static void main(String[] args) {
		
		String nome, sobrenome="";
		String result="";
		nome=JOptionPane.showInputDialog("Entre com o nome: ");
		sobrenome=JOptionPane.showInputDialog("Entre com o sobrenome: ");
		
		for (int i=1;i<=10;i++) {
			result+=i +" - "+ "Nome: "+nome+"\n"+"Sobrenome: "+sobrenome+"\n";
		}JOptionPane.showMessageDialog(null, result);
	}
}