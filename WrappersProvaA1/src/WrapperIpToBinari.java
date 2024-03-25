import java.util.StringTokenizer;

public class WrapperIpToBinari {
	public static void main(String[] args) {
		String classeA = "10.0.0.1";
		String ClasseB = "138.33.4.8";
		String ClasseC = "192.168.0.2";
		
		StringTokenizer tokenizer = new StringTokenizer(classeA, ".");
		
		while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
            
        }
	}

}
