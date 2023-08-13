package aplication;

//Desenvolvedor(a): Mayara Brandao de Carvalho.
// Github: https://github.com/MamayCarvalho/Casa-de-Cambio

import java.util.Scanner;

import entities.CalculoDeCambio;

public class CasaDeCambio {

	public static void main(String[] args) {
		CalculoDeCambio cambio = new CalculoDeCambio();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Selecione a opção da moeda que deseja comprar: ");
		System.out.println("1 - Euro, 2 - Dolar, 3 - Yuan Chinês, 4 - Encerrar");
		int opcao = sc.nextInt();
		
		if (opcao >=1 && opcao<=3) {
			System.out.println("Quanto você deseja converter? ");
			double valor = sc.nextDouble();
			cambio.valor = valor;
			
			cambio.selecaoMenu(opcao);
			
		} else if (opcao == 4) {
			System.out.println("É uma pena que não precisa dos nossos serviços =/ Até a próxima!");
		} else {
			System.out.println("Opção inválida! Selecione uma opção válida.");
		}
		sc.close();
	}

}
