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
					"\n\t9. MOSTRAR CABECA" +
					"\n\t10. VAZAR\n\n\tQUAL A OPCAO VOCE QUER UTILIZAR?");
			num = Integer.parseInt(entrada);
			switch(num) {
				case 1:
					entrada = JOptionPane.showInputDialog("DIGITE A IDADE");
					int idd = Integer.parseInt(entrada);
					entrada = JOptionPane.showInputDialog("DIGITE A MATRICULA");
					int matricula = Integer.parseInt(entrada);
					chama.enqueue(matricula, idd);
					break;
				case 2:
					int removido = chama.dequeue();
					if(removido == -99) {
						System.out.println("NAO A NADA PARA REMOVER");
					} else{
						System.out.println("MATRICULA " + removido + " FOI REMOVIDA");
					};
					break;
				case 3:		
					chama.mostrar();
					break;
				case 4: 
					chama.mostrarInvertido();
					break;
				case 5: 
					entrada = JOptionPane.showInputDialog("DIGITE A MATRICULA QUE DESEJA PROCURAR");
					matricula = Integer.parseInt(entrada);
					chama.procurar(matricula);
					break;
				case 6: 
					chama.mediaIdade();
					break;
				case 7:
					chama.reset();
					break;
				case 8:
					chama.mostraCalda();
					break;
				case 9:
					chama.mostraCabeca();
					break;
				case 10:
					num = 99;
					break;
				default:
					System.out.println("DIGITE UMA OPCAO VALIDA");
			}
		}while(num != 99);
	}

}
