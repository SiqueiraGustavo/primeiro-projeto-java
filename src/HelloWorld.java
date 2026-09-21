import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("O primeiro numero é maior");
        }
        else if (num2 > num1) {
            System.out.println("O segundo número é maior");
        }
        else {
            System.out.println("Os numeros sao iguais");
        }
    }
}
