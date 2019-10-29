
public class TestaMetodo {

	public static void main(String[] args) {

		Conta contaDoSergio = new Conta();
		contaDoSergio.deposita(4569.18);// Invoca-se o método, que é diferente de fazer uma atribuição (definir um
										// valor).
		System.out.println(contaDoSergio.saldo);
	}

}
