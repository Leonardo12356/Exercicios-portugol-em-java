package br.com.portugolexercicios;

import java.util.Scanner;

public class DepartamentoHoraExtra {

	public static void main(String[] args) {
		double horas, valor_hora = .0, percentual_inss, salario_bruto;
		double valor_inss, valor_horas_extras, salario_liquido;
		
		System.out.println("* Mini Departamento Pessoal * ");
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite a quantidade de horas trabalhadas no último mês: ");
		horas = leia.nextDouble();
		System.out.println("Digite o valor que o funcionário recebe a cada hora trabalhada: ");
		valor_hora = leia.nextDouble();
		System.out.println("Digite o percentual de desconto para o INSS: ");
		percentual_inss = leia.nextDouble();
		leia.close();
		
		if (horas < 160) {
			salario_bruto = horas * valor_hora;
			valor_horas_extras = .0;
		}
		
		else {
			salario_bruto = (horas * valor_hora) + ((((horas * valor_hora) - 160) / 100) * 50); 
					valor_horas_extras = ((((horas * valor_hora) - 160) / 100) * 50);
		}
		
		valor_inss = ((salario_bruto / 100) * percentual_inss);
				salario_liquido = salario_bruto - valor_inss;
				
				
		System.out.println("=== Contra Cheque === ");
		System.out.println("Salário Bruto: R$ " + (salario_bruto));
		System.out.println("Valor de Horas Extras: R$ " + (valor_horas_extras ));
		System.out.println("Valor de Desconto do INSS: R$ " + (valor_inss ));
		System.out.println("Salário Líquido: R$ " + (salario_liquido ));

	}

}
