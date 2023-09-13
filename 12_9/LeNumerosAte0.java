import java.util.Scanner;
public class LeNumerosAte0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite seus numeros, 0 encerra");
        int soma = 0;
        int n = scanner.nextInt();
        while (n != 0) {
            soma = soma + n;
            System.out.print("proximo: ");
            n = scanner.nextInt();
        }
        System.out.println("soma dos valores: " + soma);
        scanner.close();
    }
}