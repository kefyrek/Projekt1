import java.util.Scanner;

    public class zad2 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Dodawanie kolejnych liczb, wyjście przez 0. Podaj pierwszą liczbę:");
            int liczba = scan.nextInt();
            int suma = 0;
            while (liczba != 0) {
                suma =  (suma+liczba);
                System.out.println("Aktualna suma= " + suma);
                System.out.println("Podaj kolejną liczbę:");
                liczba = scan.nextInt();
                //System.out.println("Aktualna suma= " + suma);
            }
            System.out.println("Koniec, wciśnięto 0");
        }
    }
