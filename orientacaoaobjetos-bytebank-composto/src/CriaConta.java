
public class CriaConta {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta(); // Variável de referência do tipo Conta.
		primeiraConta.titular = "José Bonifácio";
		primeiraConta.agencia = 1758;
		primeiraConta.conta = 235487;
		primeiraConta.saldo = 300;

		Conta segundaConta = new Conta(); // Variável de referência do tipo Conta.
		segundaConta.titular = "Agnaldo Timóteo";
		segundaConta.agencia = 1365;
		segundaConta.conta = 239615;
		segundaConta.saldo = 1114365.87;

		System.out.println("");
		System.out.println("Imprimindo a variável de referência sem os atributos, apresenta o endereço na memória:");
		System.out.println(primeiraConta);
		System.out.println(segundaConta);

	}

}
