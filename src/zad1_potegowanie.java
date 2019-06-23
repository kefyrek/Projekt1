import java.util.Scanner;

public class zad1_potegowanie {
    public static void main(String[] args) {
        Scanner sci = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę:");
        int a = sci.nextInt();
        System.out.println("Podaj potęgę:");
        int n = sci.nextInt();
        int potega = (int)Math.pow(a, n);
        System.out.println(a + " do potęgi " +n +" wynosi " +potega);
        sci.close();
    }
}
