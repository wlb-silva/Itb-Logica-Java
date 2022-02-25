package Exercicios1Sem;

import javax.swing.JOptionPane;

public class Aula09_ExemploCharat {

	public static void main(String[] args) {

		String palavra="Java", aux="";
		
			//o método lenght abstrai quantos "números" tem a String palavra//
			//então o cont<palavra.lenght() vai fazer o laço ir da posição 0 a 3//
			//o método charat traz letra a letra pelo indice, neste caso a// 
			//variável int cont será o indice usado//
		
		for (int cont=0;cont<palavra.length();cont++) {
			aux+=palavra.charAt(cont)+"-->"+cont+"\n";
			}JOptionPane.showMessageDialog(null,
					"A palavra: "+palavra+", contém "+palavra.length()+" letras\n"+
			"Os índices são:\n"+aux);
	}

}
