
public class Conta {

	int agencia, conta;
	String titular;
	double saldo;

	// Primeiro m�todo.
	public void deposita(double valor) { // void indica que n�o ir� retornar nada.
		this.saldo = this.saldo + valor; // This: trabalha especificamente um atributo "desta" classe.
	}

}
