import java.util.InputMismatchException;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj 5 liczb:");

        int[] numbers = new int[5];

        int suma = 0;
        for (int i = 0; i < numbers.length; i++) {


            try {
                numbers[i] = scan.nextInt();
                suma += numbers[i];
            } catch (InputMismatchException e) {
                System.out.println("Podałes napis, Podaj liczbę:");
                i--;
            }


        }
        System.out.println("Suma liczb wynosi:" + suma);
    }
}