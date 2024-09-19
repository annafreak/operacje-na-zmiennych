import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {

        System.out.println("wprowadz liczbe by sprawdzic czy dzieli sie  przez 7");

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int dzielnik =   x % 7;

        if(dzielnik == 0) {

            System.out.println("\nLiczba 7 jest dzielnikiem liczby "+x);

        }
        else{
            System.out.println("\nLiczba 7 nie jest dzielnikiem liczby "+x);
        }

    }
}
