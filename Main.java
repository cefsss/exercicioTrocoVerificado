import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		double precoProduto, dinheiroRecebido, dinheiroInsuficiente, troco;
		int quantidade;

		System.out.print("Preço unitário do produto: ");
		precoProduto = scanner.nextDouble();
		System.out.print("Quantidade comprada: ");
		quantidade = scanner.nextInt();
		System.out.print("Preço unitário do produto: ");
		dinheiroRecebido = scanner.nextDouble();

		if (precoProduto * quantidade > dinheiroRecebido) {
			dinheiroInsuficiente = precoProduto * quantidade - dinheiroRecebido;
			System.out.printf("O dinheiro não é suficiente para realizar a compra, ainda faltam %.2f",
					dinheiroInsuficiente);
		} else {
			troco = dinheiroRecebido - (precoProduto * quantidade);
			System.out.printf("Obrigado por comprar conosco! O seu troco é de %.2f", troco);
		}
		scanner.close();
	}

}
