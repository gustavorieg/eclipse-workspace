import java.util.Scanner;

public class WrapperQualRede {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número IP: ");
        String ip = scanner.nextLine();

        System.out.print("Digite a máscara de sub-rede (no formato /XX): ");
        String mascaraString = scanner.nextLine();

        // Remover o '/' do início da máscara
        int mascara = Integer.parseInt(mascaraString.substring(1));

        String[] partesIp = ip.split("\\.");
        int[] ipNumerico = new int[4];

        // Converter o endereço IP para um array de inteiros
        for (int i = 0; i < partesIp.length; i++) {
            ipNumerico[i] = Integer.parseInt(partesIp[i]);
        }

        // Calcular a rede
        int[] rede = calcularRede(ipNumerico, mascara);

        // Imprimir o resultado em formato decimal
        System.out.print("A rede à qual o IP pertence é: ");
        for (int i = 0; i < rede.length; i++) {
            System.out.print(rede[i]);
            if (i < 3) {
                System.out.print(".");
            }
        }
        System.out.println();

        // Imprimir o resultado em formato binário
        System.out.print("Em formato binário: ");
        for (int i = 0; i < rede.length; i++) {
            System.out.print(decimalParaBinario(rede[i]));
            if (i < 3) {
                System.out.print(".");
            }
        }
        System.out.println();
    }

    public static int[] calcularRede(int[] ip, int mascara) {
        int[] rede = new int[4];

        // Calcular a máscara de sub-rede
        int mascaraInt = 0xFFFFFFFF << (32 - mascara);

        // Aplicar a máscara ao endereço IP
        for (int i = 0; i < 4; i++) {
            rede[i] = (ip[i] & (mascaraInt >> (24 - 8 * i))) & 0xFF;
        }

        return rede;
    }

    public static String decimalParaBinario(int numero) {
        StringBuilder binario = new StringBuilder();
        for (int i = 7; i >= 0; i--) {
            binario.append((numero >> i) & 1);
        }
        return binario.toString();
    }
}
