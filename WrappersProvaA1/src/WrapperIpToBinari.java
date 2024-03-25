import java.util.StringTokenizer;

public class WrapperIpToBinari {
	public static void main(String[] args) {
		String classeA = "10.0.0.1";
		String classeB = "138.33.4.8";
		String classeC = "192.168.0.2";
		
		StringTokenizer tokenizer = new StringTokenizer(classeA, ".");
		
		while (tokenizer.hasMoreTokens()) {
            String i = tokenizer.nextToken();
            int a = Integer.parseInt(i);
            System.out.println(Integer.toBinaryString(a));
        }
	}

}
