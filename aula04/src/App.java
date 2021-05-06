import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int n1 = 0;
        int n2 = 0;
        int res = 0;

        System.out.print("Digite um número: ");
        n1 = entrada.nextInt();
        System.out.print("Digite um numero: ");
        n2 = entrada.nextInt();

        res = n1 + n2;

        System.out.println("O resultado é: " + res);
    }
}
