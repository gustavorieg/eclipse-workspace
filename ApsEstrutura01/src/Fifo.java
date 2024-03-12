
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
			System.out.println("NAO A NADA PARA MOSTRAR");
			return;
		}
		aux = comeco;
		while(aux != null) {
			System.out.println("Idade: " + aux.idade + " Matricula: " + aux.matricula);
			aux = aux.proximo;
		}
	}
	
	public void mostrarInvertido() {
		Nodo aux;
		if(comeco == null) {
			System.out.println("NAO A NADA PARA MOSTRAR");
		}
		aux = fim;
		while(aux != null) {
			System.out.println("Idade: " + aux.idade + " Matricula: " + aux.matricula);
			aux = aux.anterior;
		}
	}
	
	public void procurar(int matricula) {
		Nodo aux;
		int i = 0;
		if(comeco == null) {
			System.out.println("NAO A NADA PARA PROCURAR");
		}
		aux = comeco;
		while(aux != null) {
			if (aux.matricula == matricula) {
				System.out.println("A idade referente a matricula " + matricula + ": " + aux.idade);
				i = 99;
				break;
			}
			aux = aux.proximo;
		}	
		if(i != 99) {
			System.out.println("NAO ENCONTROU NADA!");
		}
	}
	
	public void mediaIdade() {
		Nodo aux;
		int count = 0;
		int total = 0;
		if(fim == null) {
			System.out.println("NAO A NADA PARA FAZER MEDIA");
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
			System.out.print("A MEDIA DE TODAS AS IDADES E: " + media);
		}
	}
	
	public void reset() {
		comeco = null;
		fim = null;
	}
	
	public void mostraCalda() {
		if(fim != null) {
			System.out.println(fim.matricula);
		} else {
			System.out.println("NAO A NADA PARA MOSTRAR");
		}
	}
	
	public void mostraCabeca() {
		if(comeco != null) {
			System.out.println(comeco.matricula);
		} else {
			System.out.println("NAO A NADA PARA MOSTRAR");
		}
	}
}
