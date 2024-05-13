import java.util.Scanner;

public class ControleSimplesDeSaques {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double limiteDiario = scanner.nextDouble();
		double totalSacado = 0;

		for (int i = 1;; i++) {
			double valorSaque = scanner.nextDouble();

			if (valorSaque == 0) {
				System.out.println("Transacoes encerradas.");
				break;
			}

			if (totalSacado + valorSaque <= limiteDiario) {
				totalSacado += valorSaque;
				System.out.println(
						"Saque realizado. Limite restante: " + String.format("%.1f", (limiteDiario - totalSacado)));
			} else {
				System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
				break;
			}
		}

		scanner.close();
	}
}