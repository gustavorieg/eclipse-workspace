import java.util.Scanner;
import java.util.StringTokenizer;

public class WrapperIpToBinari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o endereço IP e a máscara de sub-rede (no formato IP/máscara):");
        String input = scanner.nextLine();

        scanner.close();

        // Dividindo o input em endereço IP e máscara de sub rede
        StringTokenizer tokenizer = new StringTokenizer(input, "/");
        String ip = tokenizer.nextToken();
        int subMascara = Integer.parseInt(tokenizer.nextToken());

        // Verificando o endereço IP e determinando a classe
        StringTokenizer ipTokenizer = new StringTokenizer(ip, ".");
        StringBuilder binaryIP = new StringBuilder();

        while (ipTokenizer.hasMoreTokens()) {
            String i = ipTokenizer.nextToken();
            int a = Integer.parseInt(i);
            String binarySegment = Integer.toBinaryString(a);
            
            // Adicionando zeros à esquerda para completar 8 dígitos
            while (binarySegment.length() < 8) {
                binarySegment = "0" + binarySegment;
            }
            binaryIP.append(binarySegment).append(".");
        }

        // Determinando a classe do endereço IP
        String primeirosDoisBits = binaryIP.substring(0, 2);
        String ipClass = determineIpClass(primeirosDoisBits);

        // Verificando a máscara de sub rede
        String corretaMask = determineCorretaMascara(ipClass);

        if (subMascara != corretaMask.length()) {
            System.out.println("A máscara informada está incorreta para a classe " + ipClass + ".");
            System.out.println("A máscara correta para a classe " + ipClass + " é /" + corretaMask.length());
        } else {
            System.out.println("A máscara informada está correta para a classe " + ipClass + ".");
        }
        
        System.out.println("Classe do endereço IP: " + ip + " = " + binaryIP);
    }

    public static String determineIpClass(String primeirosDoisBits) {
        switch (primeirosDoisBits) {
            case "00":
                return "A";
            case "10":
                return "B";
            case "11":
                return "C";
            default:
                return "Indefinida";
        }
    }

    public static String determineCorretaMascara(String ipClass) {
        switch (ipClass) {
            case "A":
                return "255.0.0.0";
            case "B":
                return "255.255.0.0";
            case "C":
                return "255.255.255.0";
            default:
                return "";
        }
    }
}
