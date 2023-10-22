package dowhile;
import javax.swing.JOptionPane;

public class gustavo {
	
	public static void main(String[] args) {
		int num, per1, per2, resultado;
		String entrada;
		
		per1 = 0;
		per2 = 0;
		
		do{	
			entrada = JOptionPane.showInputDialog("DIGITE QUAL OPCAO O PROGRAMA DEVE APRESENTAR"+
												"\n\n\t1. SOMA\n\t2. SUBTRAI"+
												"\n\t3. MULTIPLICA\n\t4. DIVIDE"+
												"\n\n\t5. VAZA\n\n\tQUAL A OPERACAO VOCE QUER ");
			num = Integer.parseInt(entrada);	
			
			if (num < 5){
				entrada = JOptionPane.showInputDialog("Digite o primeiro número");
				per1 = Integer.parseInt(entrada);	
				entrada = JOptionPane.showInputDialog("Digite o segundo número");
				per2 = Integer.parseInt(entrada);
			}
			
			switch(num) {
				case 1:
					resultado = per1 + per2;
					System.out.println("A soma de " + per1 + " + " + per2 + " e: " + resultado);
					break;
				case 2:
					resultado = per1 - per2;
					System.out.println("A subtracao de " + per1 + " - " + per2 + " e: " + resultado);
					break;
				case 3:
					resultado = per1 * per2;
					System.out.println("A multiplicacao de " + per1 + " X " + per2 + " e: " + resultado);
					break;
				case 4:
					resultado = per1 / per2;
					System.out.println("A divisao de " + per1 + " / " + per2 + " e: " + resultado);
					break;
			}
		} while (num != 5);
	}
}