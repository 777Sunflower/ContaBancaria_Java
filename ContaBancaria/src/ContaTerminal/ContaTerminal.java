package ContaTerminal;

import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[] args) {
	//Impotar a classe Scanner
		Scanner scan = new Scanner(System.in);
	//Obter valores
		System.out.println("Digite o numero da agencia");
			String agencia = scan.next();
		System.out.println("Digite o numero da conta");
			int conta = scan.nextInt();
		System.out.println("Digite seu nome");
			String nome = scan.next();
		System.out.println("Digite o valor depositado");
			double saldo = scan.nextDouble();
	//Exibir mensagem
		System.out.println("Ola " + nome + ", obrigado por criar uma conta em nosso banco, sua agencia e " + agencia + ", conta " + conta + " e seu saldo " + saldo + " ja esta disponivel para saque.");
		
	}

}