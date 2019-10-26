
public class CriaConta {
	
	public static void main(String[] args) {
		//Instanciacao:

		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println("Saldo da primeira conta: R$ " + primeiraConta.saldo);
		System.out.println(primeiraConta.agencia); //Valor defaut é zero.
		System.out.println(primeiraConta.titular);//Valor defaut de String é null.
		System.out.println(" ");
		
		
		Conta segundaConta = new Conta();
		segundaConta.agencia = 2123;
		segundaConta.conta = 546398;
		segundaConta.titular = "Joaquim José da Silva Xavier";
		segundaConta.saldo = 357689.36;
		System.out.println("Dados da segunda conta: ");	
		System.out.print("Agencia: " + segundaConta.agencia + "\nConta corrente: " + segundaConta.conta + " \nTitular: " + segundaConta.titular + " \nSaldo: R$ " + segundaConta.saldo);
		
		
	}

}
