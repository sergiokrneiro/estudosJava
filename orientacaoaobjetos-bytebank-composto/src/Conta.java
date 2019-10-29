
public class Conta {

	int agencia, conta;
	String titular;
	double saldo;

	// Primeiro método.
	public void deposita(double valor) { // void indica que não irá retornar nada.
		this.saldo = this.saldo + valor; // This: trabalha especificamente um atributo "desta" classe.
	}

}
