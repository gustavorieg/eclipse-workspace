import java.util.Scanner;

public class WrapperQualRede {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recebendo o número IP e a máscara de sub-rede
        System.out.println("Digite o número IP:");
        String ipAddress = scanner.nextLine();
        System.out.println("Digite a máscara de sub-rede (no formato /XX):");
        String subnetMask = scanner.nextLine();

        scanner.close();

        // Calculando a rede
        String networkAddress = calculateNetwork(ipAddress, subnetMask);
        System.out.println("A rede à qual o IP pertence é: " + networkAddress);
    }

    public static String calculateNetwork(String ipAddress, String subnetMask) {
        // Convertendo o endereço IP para binário
        String[] ipOctets = ipAddress.split("\\.");
        StringBuilder binaryIP = new StringBuilder();
        for (String octet : ipOctets) {
            String binaryOctet = Integer.toBinaryString(Integer.parseInt(octet));
            while (binaryOctet.length() < 8) {
                binaryOctet = "0" + binaryOctet;
            }
            binaryIP.append(binaryOctet);
        }

        // Convertendo a máscara de sub-rede para binário
        int maskLength = Integer.parseInt(subnetMask.substring(1));
        StringBuilder binaryMask = new StringBuilder();
        for (int i = 0; i < maskLength; i++) {
            binaryMask.append("1");
        }
        while (binaryMask.length() < 32) {
            binaryMask.append("0");
        }

        // Realizando a operação AND bit a bit entre o endereço IP e a máscara de sub-rede
        StringBuilder binaryNetwork = new StringBuilder();
        for (int i = 0; i < 32; i++) {
            char ipBit = binaryIP.charAt(i);
            char maskBit = binaryMask.charAt(i);
            if (ipBit == '1' && maskBit == '1') {
                binaryNetwork.append("1");
            } else {
                binaryNetwork.append("0");
            }
        }

        // Convertendo o resultado de volta para decimal
        StringBuilder networkAddress = new StringBuilder();
        for (int i = 0; i < 32; i += 8) {
            String octetBinary = binaryNetwork.substring(i, i + 8);
            int octetDecimal = Integer.parseInt(octetBinary, 2);
            networkAddress.append(octetDecimal).append(".");
        }
        networkAddress.deleteCharAt(networkAddress.length() - 1); // Removendo o último ponto
        return networkAddress.toString();
    }
}
