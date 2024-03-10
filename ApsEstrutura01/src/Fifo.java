
public class Fifo {
	
	public Nodo comeco;
	public Nodo fim;
	public Nodo aux;
	
	
	Fifo(){
		this.comeco = null;
		this.fim = null;
	}
	
	public void enqueue(int matricula, int idade) {
		aux = new Nodo(matricula, idade);
		if(comeco == null) {
			comeco = aux;
		} else {
			aux.anterior = fim;
			fim.proximo = aux;
		}
		fim = aux;
	}
	
	public int dequeue() {
		int aux = -99;
		if(fim != null) { 
			aux = fim.matricula;
			fim = fim.anterior;	
		}
		if(fim == null) {
			comeco = null;
		}
		return aux;
	}
	
	public void mostrar() {
		if(fim == null) {
			System.out.println("NAO A NADA PARA MOSTRAR");
		}
		aux = fim;
		while(fim != null) {
			System.out.println("Idade: " + fim.idade + " Matricula: " + fim.matricula);
			if (aux.anterior == null) {
				break;
			}
			aux = aux.anterior;
		}
	}
	
	public void mostrarInvertido() {
		if(comeco == null) {
			System.out.println("NAO A NADA PARA MOSTRAR");
		}
		aux = comeco;
		while(comeco != null) {
			System.out.println("Idade: " + fim.idade + " Matricula: " + fim.matricula);
			if (aux.proximo == null) {
				break;
			}
			aux = aux.proximo;
		}
	}
}
