
public class TestaMetodo {

	public static void main(String[] args) {

		Conta contaDoSergio = new Conta();
		contaDoSergio.deposita(4569.18);// Invoca-se o m�todo, que � diferente de fazer uma atribui��o (definir um
										// valor).
		System.out.println(contaDoSergio.saldo);
	}

}
