import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = input.nextInt();

        int a = 0;
        int b = 1;
        boolean pertence = false;

        while (b <= num) {
            if (b == num) {
                pertence = true;
                break;
            }
            int temp = a + b;
            a = b;
            b = temp;
        }

        if (pertence) {
            System.out.printf("%d pertence à sequência de Fibonacci", num);
        } else {
            System.out.printf("%d não pertence à sequência de Fibonacci", num);
        }
    }
}
