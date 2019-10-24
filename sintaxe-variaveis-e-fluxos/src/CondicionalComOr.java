
public class CondicionalComOr {
	
	public static void main(String[] args) {
		
		int idade = 17;
		boolean acompanhadoDeAdulto = false;
		
		if (idade >= 18 || acompanhadoDeAdulto) {
			
			System.out.println("Pode adentrar ao recinto.");
		} else {
			System.out.println("Não pode entrar, por ser menor e estar desacompanhado.");
		}
		
	}

}
