import javax.swing.JOptionPane;

public class atividade {

	public static void main(String[] args) {
		
		int num, qtdDoze, maiorNum, somaNum, qtdNum, mediaAritmetica;
		int fatorial, resultadoFatorial;
		int primo, divisorPrimo, resultadoPrimo, qtdPrimo;
		String entrada;
		
		entrada = JOptionPane.showInputDialog("Digite um numero");
		num = Integer.parseInt(entrada);
		
		qtdPrimo = 0;
		qtdDoze = 0;
		maiorNum = num;
		somaNum = 0;
		qtdNum = 0;
		mediaAritmetica = 0;
		
		while ((num < 20) && (num > 0)) {
			
			fatorial = num;
			resultadoFatorial = 1;
			primo = num;
			divisorPrimo = num;
			resultadoPrimo = 0;
			
			qtdNum = qtdNum + 1;
			somaNum = somaNum + num;
			
			while (fatorial > 1) {
				
				resultadoFatorial = resultadoFatorial * fatorial;
				fatorial = fatorial - 1;
			}
			
			System.out.println("O fatorial de: " + num + " é " + resultadoFatorial);
			
			while (divisorPrimo >= 1) {
				if ((primo % divisorPrimo) == 0) {	
					resultadoPrimo = resultadoPrimo + 1;
					
				} 	 
				divisorPrimo = divisorPrimo - 1;
				
			}
			
			if (resultadoPrimo == 2) {
				System.out.println("O " + num + " é primo");
				qtdPrimo = qtdPrimo + 1;
				
			} else {
				System.out.println("O " + num + " não é primo");
				
			}
			
			if ((num % 5) == 0) {
				System.out.println("O " + num + " é multiplo de 5");
				
			}
			
			if (num == 12) {
				qtdDoze = qtdDoze + 1;
			}
			
			if (num > maiorNum) {
				maiorNum = num;
			}
			
			entrada = JOptionPane.showInputDialog("Digite um numero");
			num = Integer.parseInt(entrada);
			
			if (num >= 20) {
				
				mediaAritmetica = somaNum / qtdNum;
				
				System.out.println("a quantidade de numeros primos foram: " + qtdPrimo);
				System.out.println("a quantidade de numeros 12 foram: " + qtdDoze);
				System.out.println("O maior numero informado foi: " + maiorNum);
				System.out.println("A media aritmetica e: " + mediaAritmetica);
			}
		}
	}

}
