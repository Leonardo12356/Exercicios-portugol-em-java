package br.com.portugolexercicios;

import java.util.Scanner;

public class MiniDepartamento {

	public static void main(String[] args) {
		int qtde_trabalhada;
		double valor_hora;
		double inss;
		
		Scanner leia = new Scanner (System.in);
		System.out.println("Quantidade de horas trabalhadas: ");
		qtde_trabalhada = leia.nextInt();
		System.out.println("Valor por hora: ");
		valor_hora = leia.nextDouble();
		System.out.println("% INSS ");
		inss = leia.nextDouble();
		leia.close();
		
		double sal_bruto = qtde_trabalhada * valor_hora;
		double desc_inss = sal_bruto * inss * 0.01;
		double liquido = sal_bruto - desc_inss;
		
		System.out.println("Seu contracheque: ");
		System.out.println("Salário bruto: " + sal_bruto);
		System.out.println("Desconto para o INSS:" + desc_inss);
		System.out.println("Líquido a receber: " + liquido);
		
	}

}
