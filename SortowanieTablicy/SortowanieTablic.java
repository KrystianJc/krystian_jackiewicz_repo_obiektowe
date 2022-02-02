import java.util.Random;
import java.util.Arrays;
public class SortowanieTablic {
    public static void main(String[] args) {
        final int ilosc_Elementow = 50000;

        Random r = new Random();
        
        long millisActualTime = 0, executionTime = 0;
        for(int k=0;k<10;k++)
        {
            int[] tabBubble = new int[ilosc_Elementow];
            for (int i = 0; i < ilosc_Elementow; i++) {
                tabBubble[i] = r.nextInt(1000000) + 1;
            }
        int[] tabQuick = Arrays.copyOf(tabBubble,tabBubble.length);
        millisActualTime = System.currentTimeMillis();
        Arrays.sort(tabQuick);

        executionTime = System.currentTimeMillis() - millisActualTime;
        System.out.println("Sortowanie QUICKSORT czas wykonania: "+executionTime);
        millisActualTime = System.currentTimeMillis();
        //Sortowanie babelkowe
        for (int i = 0; i < tab.length; i++) {
            for (int j = 1; j < tab.length; j++) {
                if (tab[j] < tab[j - 1]) {
                    int wieksza = tab[j - 1];
                    tab[j - 1] = tab[j];
                    tab[j] = wieksza;
                }
            }
        }

      executionTime = System.currentTimeMillis() - millisActualTime;
        
        System.out.println("Sortowanie babelkowe czas wykonania: "+executionTime);
    }

    }

}