import java.util.Random;

public class random {

    public static void main(String[] args) {
        part4();
    }

    public static void part4() {
        System.out.println("losujemy ile ocen wylosować");
        Random generator = new Random();
        System.out.println("Generator: " + generator);
        int ile = generator.nextInt(10_000);
        System.out.println("Będziemy losować " + ile + " liczb.");
        int suma = 0;
        for(int i = 0; i < ile; i++) {
            suma += generator.nextInt(6) + 1;
        }
        System.out.println("Suma ocen " + suma);
        System.out.printf("Średnia ocen %.3f \n \n \n", ((double) suma / (double) ile) ); // \n - nowa linia
    }

}