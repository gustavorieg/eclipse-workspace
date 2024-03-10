
public class Nodo {

	public Nodo anterior;
	public Nodo proximo;
	public int matricula;
	public int idade;
	
	Nodo(int matricula, int idade) {
		this.anterior = null;
		this.proximo = null;
		this.matricula = matricula;
		this.idade = idade;
	}
}
