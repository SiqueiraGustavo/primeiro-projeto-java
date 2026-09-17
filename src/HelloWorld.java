import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {


System.out.println("Olá, seja bem vindo!");
Scanner scanner= new Scanner(System.in);

        System.out.println("Qual seu nome completo?");
        String nome= scanner.nextLine();

        System.out.println("Qual seu CPF?");
        String CPF= scanner.nextLine();

        System.out.println("Qual sua idade?");
        int idade= scanner.nextInt();

        System.out.println("Qual seu peso?");
        double peso= scanner.nextDouble();

        System.out.println("Qual sua altura?");
        double altura= scanner.nextDouble();

        System.out.println("Qual seu estado civil?");
        String estadocivil= scanner.nextLine();

        scanner.close();

        System.out.println(" O seu nome é " + nome + " o seu CPF é " + CPF+ " A sua idade é " + idade + " O seu peso é " + peso +
                " A sua altura é " + altura + " Seu estado civil é " + estadocivil);










    }
}
