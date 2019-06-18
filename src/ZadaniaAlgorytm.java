public class ZadaniaAlgorytm {
    public int nieparzyste(int[] dane){
        int ile = 0;
        for (int i = 0; i < dane.length; i++)
        {
            if(dane[i] % 2 != 0) ile++;
        }
        return ile;
    }

}
