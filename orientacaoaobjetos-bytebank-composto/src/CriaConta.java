
public class CriaConta {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta(); // Vari�vel de refer�ncia do tipo Conta.
		primeiraConta.titular = "Jos� Bonif�cio";
		primeiraConta.agencia = 1758;
		primeiraConta.conta = 235487;
		primeiraConta.saldo = 300;

		Conta segundaConta = new Conta(); // Vari�vel de refer�ncia do tipo Conta.
		segundaConta.titular = "Agnaldo Tim�teo";
		segundaConta.agencia = 1365;
		segundaConta.conta = 239615;
		segundaConta.saldo = 1114365.87;

		System.out.println("");
		System.out.println("Imprimindo a vari�vel de refer�ncia sem os atributos, apresenta o endere�o na mem�ria:");
		System.out.println(primeiraConta);
		System.out.println(segundaConta);

	}

}
