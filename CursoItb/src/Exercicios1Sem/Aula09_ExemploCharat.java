package Exercicios1Sem;

import javax.swing.JOptionPane;

public class Aula09_ExemploCharat {

	public static void main(String[] args) {

		String palavra="Java", aux="";
		
			//o m�todo lenght abstrai quantos "n�meros" tem a String palavra//
			//ent�o o cont<palavra.lenght() vai fazer o la�o ir da posi��o 0 a 3//
			//o m�todo charat traz letra a letra pelo indice, neste caso a// 
			//vari�vel int cont ser� o indice usado//
		
		for (int cont=0;cont<palavra.length();cont++) {
			aux+=palavra.charAt(cont)+"-->"+cont+"\n";
			}JOptionPane.showMessageDialog(null,
					"A palavra: "+palavra+", cont�m "+palavra.length()+" letras\n"+
			"Os �ndices s�o:\n"+aux);
	}

}
