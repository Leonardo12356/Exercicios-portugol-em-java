package br.com.portugolexercicios;

import java.util.Calendar;

public class IdadeAlterdata {

	public static void main(String[] args) {
		int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
		int fundacaoAlterdata = 1989;
		
		System.out.println("**Sobre a Empresa Alterdata** ");
		System.out.println("A Alterdata tem " +  (anoAtual - fundacaoAlterdata) + " anos");

	}

}
