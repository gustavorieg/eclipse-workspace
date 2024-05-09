
public class Main {

	public static void main(String[] args) {
	
		int qtdCarro = 5;
		int qtdMoto = 10;
		Carro carro1 = new Carro("BMW", "320i", "BRANCA", qtdCarro, 2020, 60000);
		Moto moto1 = new Moto("HONDA", "CG 150", "VERMELHA", qtdMoto, 2015, 8000);
		
		carro1.calcularPreco();
		carro1.imprimir();
		carro1.atualizarEstoque(qtdCarro);
		carro1.vender(2);
		
		moto1.calcularPreco();
		moto1.imprimir();
		moto1.atualizarEstoque(qtdMoto);
		moto1.vender(5);
		
	}

}
