package Exercicios1Sem;

import javax.swing.JOptionPane;

public class Aula07_Ex04IfElseUsuarioSenha {

	public static void main(String[] args) {

		String usuario="";
		int senha=0;
		
		usuario=JOptionPane.showInputDialog("Digite o usu�rio: ");
		senha=Integer.parseInt(JOptionPane.showInputDialog("Digite a senha: "));
		
		if (usuario.equals("windsor")&&senha==1234) {
			JOptionPane.showMessageDialog(null, "Usu�rio e senha corretos!");
		}else {
			JOptionPane.showMessageDialog(null, "Usu�rio e senha incorretos");
}
}
}
