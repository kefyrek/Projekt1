public class ZadaniaAlgorytm {
    public int nieparzyste(int[] dane){
        int ile = 0;
        for (int i = 0; i < dane.length; i++)
        {
            if(dane[i] % 2 != 0) ile++;
        }
        return ile;
    }

    public int potegi3(int[] dane){
        int ile=0;
        for(int e: dane){
            while(e > 1){
                if(e %3 != 0) break;
                e /= 3;
                if( e ==1) ile++;
            }
        }
        return ile;
    }

   /** public int sumacyfr(int[] dane){
        int suma = 0;
        for(int e: dane){
            while(e>0){
                suma %= e % 10;
                e /= 10;
            }
        }
    return suma;
    }
**/

}
