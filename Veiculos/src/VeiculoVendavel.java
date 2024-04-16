public class VeiculoVendavel extends Veiculo implements IVenda{
	
	public int qtdVeiculo;
	
	public VeiculoVendavel(String marca, String modelo, String cor, int qtdVeiculos, int ano, double preco) {
		super(marca, modelo, cor, qtdVeiculos, ano, preco);
		this.qtdVeiculo = qtdVeiculos;
	}
	
	public double gerarCodigo() {
		return Math.random();
	}
	
	public void atualizarEstoque(int qtd) {
		this.qtdVeiculo =+ qtd;
		System.out.println("Estoque: " + this.qtdVeiculo);
	}
	
	@Override
	public void vender(int qtd) {
		System.out.println("Estoque: " + (this.qtdVeiculo - qtd));
	}
}
