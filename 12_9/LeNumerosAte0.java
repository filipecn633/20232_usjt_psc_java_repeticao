import java.util.Scanner;
public class LeNumerosAte0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite seus numeros, 0 encerra");
        int cont = 0;
        int soma = 0;
        int n = scanner.nextInt();
        while (n != 0) {
            soma = soma + n;
            cont = cont + 1;
            System.out.print("proximo: ");
            n = scanner.nextInt();
        }
        System.out.println("soma dos valores: " + soma);
        if (cont == 0) {
            System.out.println("nenhum valor foi digitado ");

        }
        else {
            double media = (double)soma / cont;
            System.out.println("media dos valores: " + media);
        }
        double media = (double)soma / cont;
        System.out.println("media dos valores: " + media);
        scanner.close();
    }
}