
public class CondicionalComAnd {
	
	public static void main(String[] args) {
		
		double salario = 9999.99;
		boolean indicadoPorUmSocio = false;
				
		if (salario >= 4000 && indicadoPorUmSocio) {
			System.out.println("Pode se filiar ao clube.");
		} else {
			System.out.println("Infelizmente, você não preenche os requisitos.");
		}
		
	}

}
