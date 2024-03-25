import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		String entrada;
		int num = 0;
		Fifo chama = new Fifo();
		
		do {
			entrada = JOptionPane.showInputDialog("DIGITE QUAL OPCAO O PROGRAMA DEVE APRESENTAR"+
					"\n\n\t1. INSERIR\n\t2. RETRIRAR"+
					"\n\t3. MOSTRAR\n\t4. MOSTRAR INVERTIDA"+
					"\n\t5. PROCURAR\n\t6. MEDIA IDADE" +
					"\n\t7. REINICIALIZAR\n\t8. MOSTRAR CALDA" +
					"\n\t9. MOSTRAR CABECA\n\t10. REPETIDO" +
					"\n\t11. MAIS VELHO" + 
					"\n\t12. VAZAR\n\n\tQUAL A OPCAO VOCE QUER UTILIZAR?");
			num = Integer.parseInt(entrada);
			switch(num) {
				case 1:
					entrada = JOptionPane.showInputDialog("\nDIGITE A IDADE");
					int idd = Integer.parseInt(entrada);
					entrada = JOptionPane.showInputDialog("\nDIGITE A MATRICULA");
					int matricula = Integer.parseInt(entrada);
					chama.enqueue(matricula, idd);
					break;
				case 2:
					int removido = chama.dequeue();
					if(removido == -99) {
						System.out.println("\nNAO A NADA PARA REMOVER");
					} else{
						System.out.println("\nMATRICULA " + removido + " FOI REMOVIDA");
					};
					break;
				case 3:		
					chama.mostrar();
					break;
				case 4: 
					chama.mostrarInvertido();
					break;
				case 5: 
					entrada = JOptionPane.showInputDialog("\nDIGITE A MATRICULA QUE DESEJA PROCURAR");
					matricula = Integer.parseInt(entrada);
					
					int aux = chama.procurar(matricula);	
					if(aux == -99){
                        System.out.println("\nNINGUEM NA FILA COM ESSA MATRICULA");
                    }else{
                        System.out.println("\nA IDADE DO FUNCIONARIO E: " + aux);
                    }
					break;
				case 6: 
					aux = chama.mediaIdade();
					if(aux == -99) {
						System.out.println("\nNAO A NADA NA FILA");
						break;
					}

					System.out.print("\nA MEDIA DE TODAS AS IDADES E: " + aux);
					break;
				case 7:
					chama.reset();
		             System.out.println("\nFIFO RESETADO");
					break;
				case 8:
					aux = chama.mostraCalda();	
					if(aux == -99) {
						System.out.println("\nNAO A NADA NA FILA");
						break;
					}
					System.out.println("\nA CADA DA FILA E: " + aux);
					break;
				case 9:
					aux = chama.mostraCabeca();
					if(aux == -99) {
						System.out.println("\nNAO A NADA NA FILA");
						break;
					}
					System.out.println("\nA CABECA DA FILA E: " + aux);
					break;
				case 10:
					aux = chama.repetida();
					
					if(aux == -99) {
						System.out.println("\nNAO TEM REPETIDO");
						break;
					}
					
					System.out.println("\nMATRICULA REPETIDA: " + aux);
					break;
				case 11:
					aux = chama.velho();
					
					if(aux == -99) {
						System.out.println("\nLISTA VAZIA");
						break;
					}
					
					System.out.println("\nMATRICULA DO MAIS VELHO: " + aux);
					break;
					
				case 12:
					num = 99;
					break;
				default:
					System.out.println("DIGITE UMA OPCAO VALIDA");
			}
		}while(num != 99);
	}

}
