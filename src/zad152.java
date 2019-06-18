import java.util.Random;

public class zad152 {
    int[] tab;
    Random r = new Random();

    public zad152(int size){
        this.tab = new int[size];
        losuj();
    }

private void losuj() {
    for (int i = 0; i < tab.length; i++) tab[i] = r.nextInt(10000);
}

public int[] pobierz(){
        return tab;
}

public void znajdzMaxMin(){
    int min =1000000;
    int max=0;
    for(int e : tab) {
        if(min >e) min=e;
        else if(max < e) max = e;
    }
    System.out.println("Minimum: " + min + " Maksimum: " + max);
    }
}