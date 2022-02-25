package Exercicios2Sem;

import javax.swing.JOptionPane;

public class Ex05 {

	public static void main(String[] args) {
		String aux="";
		double soma=0,nota1=0, nota2=0, media=0;
		
		
		for (int i=1;i<=10;i++) {
			nota1=Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota"));
			nota2=Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda nota"));
			media=(nota1+nota2)/2;
			aux+=media+"\n";
			
		} JOptionPane.showInternalMessageDialog(null, "Média dos alunos\n"+aux);
		
		
		}
		
		
	}


