import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {

		int grafo[][][],i,j,n,k,aux;
		String local[], entra;
		entra = JOptionPane.showInputDialog("INFORME O NUMERO DE VERTICES");
	    n = Integer.parseInt(entra);
		grafo = new int[n][n][n];
		local = new String[n];
		
		
		for(i=0; i < n; i++) {
			local[i] = JOptionPane.showInputDialog("INFORME O LOCAL "+(i+1));
		}
	    for(i=0; i < n; i++){
	    	for(j=0; j < n; j++){
	    		if (i != j){
	    			entra = JOptionPane.showInputDialog("INFORME A ARESTA DE "+local[i] + " ATE "+local[j]);
		            grafo[0][i][j] = Integer.parseInt(entra);
	    		}else
	    			grafo[0][i][i] = 0;
			}
	    }

	    System.out.println(" VEJA A MATRIZ INICIAL DO GRAFO");
	    for(i=0; i < n; i++){
	    	for(j=0; j < n; j++)
	    	      System.out.print("  "+grafo[0][i][j]);
	       System.out.println();
	    }
	   
		for(k = 1; k < n; k++) {
			for(i = 0; i < n; i++) {
				for(j = 0; j < n; j++) {
					if (i != j) {
						grafo[k][i][j] = menor(grafo[k-1][i][j], (grafo[k-1][i][k] + grafo[k-1][k][j]));
					} else {
						grafo[k][i][j] = 0;
					}
				}
			}
		}
		
		System.out.println("\t MENORES CAMINHOS ");
		for(i=0; i < n; i++){
			for(j=0; j < n; j++){
				if (i != j){
					System.out.print("DISTANCIA DE " +local[i] + " ATE " + local[j] + " = ");
		    	    if (grafo[n-1][i][j] == 99)
		    	    	System.out.println(" IMPOSSIVEL");
		    	    else 
		    	    	System.out.println(grafo[n-1][i][j]);
		        }
		    }
		}
		  
	}
	public static int menor(int a, int b) {
		if (a < b) 
			return a;
		return b;
	}
}
