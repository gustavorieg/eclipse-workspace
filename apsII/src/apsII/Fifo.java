package apsII;

public class Fifo {
	
	Nodo comeco,fim;
	
	public Fifo() {
		this.comeco = null;
		this.fim = null;
	}
	
	public void enqueue(int idade, int matricula) {
		Nodo aux = new Nodo(idade, matricula);
		if(comeco == null) {
			comeco = aux;
		}else {
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
			comeco.anterior = null;
		}
		if (comeco == null) {
			fim = null;
		}
		return aux;
	}
}
