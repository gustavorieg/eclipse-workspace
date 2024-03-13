
public class Fifo {
	
	public Nodo comeco;
	public Nodo fim;
	
	public Fifo(){
		this.comeco = null;
		this.fim = null;
	}
	
	public void enqueue(int matricula, int idade) {
		Nodo aux = new Nodo(matricula, idade);
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
		if(comeco != null) { 
			aux = comeco.matricula;
			comeco = comeco.proximo;	
		}
		if(comeco == null) {
			fim = null;
		}
		return aux;
	}
	
	public void mostrar() {
		Nodo aux;
		if(comeco == null) {
			System.out.println("\nNAO A NADA PARA MOSTRAR");
			return;
		}
		aux = comeco;
		while(aux != null) {
			System.out.println("\nIdade: " + aux.idade + " Matricula: " + aux.matricula);
			aux = aux.proximo;
		}
	}
	
	public void mostrarInvertido() {
		Nodo aux;
		if(comeco == null) {
			System.out.println("\nNAO A NADA PARA MOSTRAR");
		}
		aux = fim;
		while(aux != null) {
			System.out.println("\nIdade: " + aux.idade + " Matricula: " + aux.matricula);
			aux = aux.anterior;
		}
	}
	
	public int procurar(int matricula) {
		Nodo aux;
		int idade = -99;
		if(comeco == null) {
			return -99;
		}
		aux = comeco;
		while(aux != null) {
			if (aux.matricula == matricula) {
				idade = aux.idade;
				break;
			}
			aux = aux.proximo;
		}	
		return idade;
	}
	
	public int mediaIdade() {
		Nodo aux;
		int count = 0;
		int total = 0;
		
		if(fim == null) {
			return -99;
		}
		aux = fim;
		while(aux != null) {
			total =+ aux.idade;
			count++;
			if (aux.anterior == null) {
				break;
			}
			aux = aux.anterior;
		}
		if(fim != null) {
			int media = total / count;
			return media;
		}
		return -99;
	}
	
	public void reset() {
		comeco = null;
		fim = null;
	}
	
	public int mostraCalda() {
		if(fim != null) {
			return fim.matricula;
		} else {
			return -99;
		}
	}
	
	public int mostraCabeca() {
		if(comeco != null) {
			return comeco.matricula;
		} else {
			return -99;
		}
	}
}
