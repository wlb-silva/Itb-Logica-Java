package Exercicios1Sem;
import javax.swing.JOptionPane;

public class Aula09_Ex01 {
	
	public static void main(String[] args) {
		String aux="";
		String palavra=JOptionPane.showInputDialog("Digite uma palavra: ");
			palavra=palavra.trim();
			
		if (!palavra.equals("")) {
		
		for (int cont=0;cont<palavra.length();cont++) {
			aux+=palavra.charAt(cont)+"\n";
		}JOptionPane.showMessageDialog(null,"Frase:        "+palavra+"\n"+aux.toUpperCase());
		
		}else {
			JOptionPane.showMessageDialog(null, "N�o deixe em branco!");
		}//Primeiro criei o la�o for usando o length, assim ele conta quantas letras tem e transforma 
		 //em inteiro, no la�o usei o charat para trazer cada letra individual.
		 //Segundo: Inseri o if-else para n�o permitir que fique em branco;
		 //Terceiro: como tirar os espa�os em branco -  usei o trim na variavel palavra;
		
	}

}
