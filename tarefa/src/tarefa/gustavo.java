package tarefa;
import javax.swing.JOptionPane;

public class gustavo {

	public static void main(String[] args) {
		
		int num, i, media, quantidade, maior, menor, maiorInd, fatorial, fatorialMult, array[];
		String entrada;
		
		array = new int[5];
		num = 0;
		i = 0;
		quantidade = 0;
		maior = 0;
		maiorInd = 0;
		
		for(i=0; i < array.length; i++){	
			entrada = JOptionPane.showInputDialog("Digite um número");
			num = Integer.parseInt(entrada);
			
			array[i] = num;	
		}
		
		entrada = JOptionPane.showInputDialog("DIGITE QUAL OPCAO O PROGRAMA DEVE APRESENTAR"+
					"\n\n\t1. MEDIA\n\t2. IMPARES"+
					"\n\t3. MAIOR\n\t4. FATORIAL"+
					"\n\t9. VAZAR\n\n\tQUAL A OPERACAO VOCE QUER ");
		num = Integer.parseInt(entrada);
		
		switch(num){
		case 1:
			num = 0;
			for(i=0; i < array.length; i++){
				num = num + array[i];
			}
			
			media = num / 5;
			System.out.println("A media e " + media);
			break;
		case 2:
			for(i=0; i < array.length; i++){
				if((array[i] % 2) != 0){
					quantidade = quantidade + 1;
				}
			}
			System.out.println("A quantidade de numeros impar e " + quantidade);
			break;
		case 3:
			for(i=0; i < array.length; i++){
				if(array[i] > maior){
					maior = array[i];
					maiorInd = i;
				}
			}
			System.out.println("A o maior numero e " + maior + " referente ao indice " + maiorInd);
			break;
		case 4:
			menor = 1000;
			for(i=0; i < array.length; i++) {
				if(array[i] < menor){
					menor = array[i];
				}
			}
			
			fatorialMult = menor - 1;
			fatorial = menor;
			while(fatorialMult != 0){
				fatorial =  fatorial * fatorialMult;
				fatorialMult = fatorialMult - 1;
			}
			System.out.println("O fatorial e " + fatorial);
			break;
		case 9:
			break;
		}
		
	}

}
