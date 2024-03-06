package apsII;

public class Nodo {
	Nodo proximo;
	Nodo anterior;
	public int idade;
	public int matricula;
	
	public Nodo(int idade, int matricula){
		this.proximo = null;
		this.anterior = null;
		this.idade = idade;
		this.matricula = matricula;
	}	
}
