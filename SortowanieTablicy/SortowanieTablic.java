import java.util.Random;

public class SortowanieTablic {
    public static void main(String[] args) {
        final int ilosc_Elementow = 100000;

        Random r = new Random();
        int[] tab = new int[ilosc_Elementow];

        for (int i = 0; i < 100; i++) {
            tab[i] = r.nextInt(1000000) + 1;
        }


        long millisActualTime = System.currentTimeMillis();
        // Sortowanie bąbelkowe
        
        for (int i = 0; i < tab.length; i++) {
            for (int j = 1; j < tab.length; j++) {
                if (tab[j] < tab[j - 1]) {
                    int wieksza = tab[j - 1];
                    tab[j - 1] = tab[j];
                    tab[j] = wieksza;
                }
            }
        }
        long executionTime = System.currentTimeMillis() - millisActualTime; 
        System.out.println("Sortowanie babelkowe czas wykonania: "+executionTime);


    }

}