import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import static java.nio.file.Paths.*;

class Main {
    public static void main(String[] args) {
        KolkoKrzyzyk gra = new KolkoKrzyzyk();
        gra.graj();
    }

      /*
        int[] tab = loadData("liczby_losowe.txt"); //wczytanie tablicy z pliku

        pierwsze p = new pierwsze();
        int licznik = 0;
        for(int a : tab){
            if(p.czyPierwsza(a)) licznik++;
        }
        System.out.println("Liczb pierwszych jest: " + licznik);

        /*
        Scanner sc = new Scanner(System.in);
        int liczba = sc.nextInt();
        System.out.println("Liczba " + liczba);
        p.wypiszPierwsze(liczba);

        sc.close();
*/
        //  if (p.czyPierwsza(liczba)) System.out.println("Jest pierwsza");
      //  else System.out.println("Nie jest pierwsza");
    }


      /* public static void main(String[] args) {
            System.out.println("Main, zad152");
        zad152 zad152 = new zad152(1000);
        saveFile(zad152.pobierz(), "liczby_losowe.txt");
        zad152.znajdzMaxMin();
        int [] tab = loadData("liczby_losowe.txt"); //wczytanie tablicy z pliku
        ZadaniaAlgorytm zad = new ZadaniaAlgorytm();
                  System.out.println(("Ilość liczb nieparzystych: " + zad.nieparzyste(tab)));
               //   System.out.println("Suma wszystkich cyfr: " +zad.sumacyfr(tab));
    }*/

      /*
    public static void saveFile(int[] tab, String plik){
        System.out.println("saveFile");
          String dane = "";
        for(int e : tab) dane += e + "\n";
        try {
            Files.write(Paths.get(plik), dane.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static int[] loadData(String plik){
        System.out.println("static int");
          int[] dane = new int[1000];
        Scanner sc = null;
        try {
            sc = new Scanner((new File(plik)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for(int i = 0; i < 1000; i++) dane[i] = sc.nextInt();
        return dane;
    }
}
*/