import java.util.InputMismatchException;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {

     String[] napis = new String[3];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i <napis.length ; i++) {
            System.out.println("Podaj napis");
            napis[i] = scan.nextLine();
        }

        System.out.println("Podaj indeks");
        try {
            int indeks = scan.nextInt();
            System.out.println(napis[indeks]);
        } catch (InputMismatchException e) {
            System.out.println("Podaj liczbę");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wybrano nieprawidlowy indeks");
        }

    }

}
