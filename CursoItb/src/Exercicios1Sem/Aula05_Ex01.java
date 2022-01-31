package Exercicios1Sem;

import javax.swing.JOptionPane;

public class Aula05_Ex01 {

	public static void main(String[] args) {

		//exercicios de manipulação do JOption Pane//
		
		String aux, formal, primnome, sobrenome, estado="";
		int idade, rg=0;
		
		formal=JOptionPane.showInputDialog("Entre com a maneira formal: Sr. ou Srta.");
		primnome=JOptionPane.showInputDialog("Entre com o primeiro nome");
		sobrenome=JOptionPane.showInputDialog("Entre com o sobrenome");
		idade=Integer.parseInt(JOptionPane.showInputDialog("Entre com sua idade: "));
		estado=JOptionPane.showInputDialog("Informe o estado que você nasceu: ");
		rg=Integer.parseInt(JOptionPane.showInputDialog("Informe o RG: "));
		
		String juntar=formal+" "+primnome+" "+sobrenome+", "+" com a idade de"+" "
		+idade+" anos"+"\n"+" está registrado com a RG: "+" "+rg+"\n"
		+" e seu nascimento no estado de: "+" "+estado;
		
		JOptionPane.showMessageDialog(null, juntar);
	}

}

