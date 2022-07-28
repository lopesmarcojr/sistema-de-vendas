package application;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.ItemVenda;
import entities.Produto;
import entities.Usuario;
import entities.Venda;
import entities.enums.StatusVenda;

public class ProgramVenda {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados do cliente:");
		System.out.print("Nome: ");
		String nomeUsuario = sc.nextLine();
		System.out.print("CPF(Apenas numeros): ");
		String cpfUsuario = sc.next();
		System.out.print("Email: ");
		String emailUsuario = sc.next();
		System.out.println();
		Usuario usuario = new Usuario(nomeUsuario, cpfUsuario, emailUsuario);
		
		System.out.println("Status de venda:");
		System.out.println("PAGAMENTO_PENDENTE");
		System.out.println("PROCESSANDO");
		System.out.println("PRODUTO_ENVIADO");
		System.out.println("PRODUTO_ENTREGUE\n");
		System.out.println("Digite uma das op��es de status:");
		StatusVenda statusVenda = StatusVenda.valueOf(sc.next());
		System.out.println();
		Venda venda = new Venda(new Date(), statusVenda, usuario);
		
		System.out.print("Quantos produtos ser�o adicionados a venda: ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.println("Entre com os dados do " + i + "�" + " produto");
			System.out.print("Nome: ");
			String nome = sc.next();
			
			System.out.print("Pre�o: ");
			Double preco = sc.nextDouble();
			
			System.out.println("Quantidade: ");
			Integer quantidade = sc.nextInt();
			System.out.println();
			
			Produto produto = new Produto(nome, preco);
			ItemVenda itemVenda = new ItemVenda(quantidade, preco, produto);
			
			venda.addVenda(itemVenda);
			
		}
		
		System.out.println();
		System.out.println(venda);
		
		sc.close();
	}
}
