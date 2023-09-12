import java.util.Scanner;
public class ContaIntervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite o inicio: ");
        int inicio = scanner.nextInt();
        System.out.print(" digite o fim: ");
        int fim = scanner.nextInt();
        scanner.close();    
        int cont = inicio;
        while (cont <= fim) {
            System.out.print (cont + " ");
            cont = cont + 1;
        }
}
}
