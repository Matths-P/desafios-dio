import java.util.Scanner;

public class SimulacaoBancaria {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double saldo = 0;
		boolean continuar = true;

		while (continuar) {

			int opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				double novoSaldo = scanner.nextDouble();
				saldo = saldo + novoSaldo;
				System.out.println("Saldo atual: " + String.format("%.1f", saldo));
				break;

			case 2:
				double valorSaque = scanner.nextDouble();
				if (valorSaque > saldo) {
					System.out.println("Saldo insuficiente.");
				} else {
					saldo = saldo - valorSaque;
					System.out.println("Saldo atual: " + String.format("%.1f", saldo));
				}
				break;

			case 3:
				System.out.println("Saldo atual: " + String.format("%.1f", saldo));
				break;

			case 0:
				continuar = !true;
				System.out.println("Programa encerrado.");
				break;

			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		}
	}
}


	 // Outra forma de resolver:
	//
	 /*
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean continuar = true;
		Double saldo = 0.0;
		
		System.out.println("Escolha uma das seguintes opções digitando o número correspondente:");
		System.out.println("1. Depositar");
		System.out.println("2. Sacar");
		System.out.println("3. Consultar saldo");
		System.out.println("4. Encerrar");
		
		while (continuar) {
			System.out.print("Por favor, digite uma opção: ");
			int opcao = scanner.nextInt();
			
			
			switch(opcao) {
				case 1:
					saldo = depositarValor(saldo);
					break;
				case 2:
					saldo = sacarValor(saldo);
					break;
				case 3:
					consultarSaldo(saldo);
					break;
				case 0:
					continuar = !true;
					System.out.println("Programa encerrado.");
					break;
				default:
					System.out.println("Opção inválida. Tente novamente.");
					System.out.print("Por favor, digite uma opção: ");
			}
		}
		scanner.close();
	}	
	
	static double depositarValor(Double saldo) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Insira o valor a ser depositado:");
		double novoSaldo = scanner.nextDouble();
		double saldoAtualizado = saldo + novoSaldo;
		return saldoAtualizado;
	}
	
	static double sacarValor(Double saldo) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Insira o valor a ser sacado:");
		double novoSaque = scanner.nextDouble();
		double saqueAtualizado = saldo;
		
		if(novoSaque > saldo) {
			System.out.println("Saldo insuficiente");
			saqueAtualizado = saldo;
		} else {
			saqueAtualizado = saldo - novoSaque;
		}
		return saqueAtualizado;
	}
	
	static void consultarSaldo (Double saldo) {
		System.out.println("Saldo atual: " + String.format("%.2f", saldo));
	}
	
}
 */