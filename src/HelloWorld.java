import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, digite seu nome");
        String Nome = scanner.nextLine();

        System.out.println("Digite um numero");
        int numero = scanner.nextInt();

        System.out.println("Contagem Crescente");

        for (int i = 0; i <= numero; i++) {
            System.out.println(i);
        }

        System.out.println("Contagem Decrescente");

        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }

        System.out.println("Nome");

        if (Nome.length() > 6) {

            for (int i = 0; i < numero; i++) {
                System.out.println(Nome);
            }

        } else {

            System.out.println(Nome);

        }

        scanner.close();
    }
}