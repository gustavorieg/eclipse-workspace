public class Veiculo {
	
	public String marca;
	public String modelo;
	public String cor;
	public int qtdVeiculos;
	public int ano;
	public double preco;
	
	public Veiculo(String marca, String modelo, String cor,int qtdVeiculos, int ano, double preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.qtdVeiculos = qtdVeiculos;
		this.ano = ano;
		this.preco = preco;
	}
	
	public void calcularPreco(){
		System.out.println("******PRECO DE TODOS OS VEICULOS*****");
		System.out.println(this.preco * qtdVeiculos);
		System.out.println("*************************************");
	}
	
	public void imprimir() {
		System.out.println("*************INFORMACOES*************");
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ano: " + this.ano);
		System.out.println("Preco: " + this.preco);
		System.out.println("*************************************");
	}
}
