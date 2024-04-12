
public class Maria extends Pessoa implements acoesPessoa{
		
	public Maria(String nome, String endereco, String sexo, int idade) {
		this.nome = nome;
		this.endereco = endereco;
		this.sexo = sexo;
		this.idade = idade;
	}
	
	public void apresentaDados() {
		System.out.println(this.nome);
		System.out.println(this.endereco);
		System.out.println(this.sexo);
		System.out.println(this.idade);
	}
	
	public void andar() {
		System.out.println("estou andando");
	}
	public void parar() {
		System.out.println("estou parando");
	}
	
}
