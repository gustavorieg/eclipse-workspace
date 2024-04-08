
public class Principal {
	public static void main(String[] args) {
		Maria MariaDados = new Maria("Maria", "Rua Cunha", "Feminino", 28);
		
		MariaDados.apresentaDados();
		System.out.println("");
		System.out.println("////////////////////////////////");
		System.out.println("");
		MariaDados.Saudacao();
		System.out.println("");
		System.out.println("////////////////////////////////");
		System.out.println("");
		MariaDados.andar();
		System.out.println("");
		System.out.println("////////////////////////////////");
		System.out.println("");
		MariaDados.parar();
	}

}
