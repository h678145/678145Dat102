package Uke5;

public class SorterTabell {
    public static <T extends Comparable<? super T>> void utvalgssortering(T[] a, int n) {
        for (int i = 0; i < n; i++) {
            //finne index for minste element i  usortert del
            T min = a[i];
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j].compareTo(min) < 0) {
                    min = a[j];
                    minIndex = j;
                }
            }
        }

        /**
         * Oftast skal heile tabellen sorterast slik vi overlastar denne metoden slik at
         * dei som brukar den slepp skrive antal (a.length)
         *
         * @param <T>
         * @param a
         */
// Flere sorteringsmetoder
    }

    /**
     * Oftast skal heile tabellen sorterast slik vi overlastar denne metoden slik at
     * dei som brukar den slepp skrive antal (a.length)
     *
     * @param <T>
     * @param a
     */
    public static <T extends Comparable<? super T>> void utvalgssortering(T[] a) {
        utvalgssortering(a, a.length);
    }

    public static void swap(Object[] a, int i, int j) {
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


    /**
     * Oftast skal heile tabellen sorterast slik vi overlastar denne metoden slik at
     * dei som brukar den slepp skrive antal (a.length)
     *
     * @param <T>
     * @param a
     */
    public static <T extends Comparable<? super T>> void sorterVedInnsetting(T[] a) {
        sorterVedInnsetting(a, 0, a.length - 1);
    }

    public static <T extends Comparable<? super T>> void sorterVedInnsetting(T[] a,
                                                                             int forste, int siste) {
        for (int i = forste + 1; i <= siste; i++) {
            T temp=a[i];
            int j= i-1;
            //finn rett plass
            while (j>=0 && temp.compareTo(a[j])<0){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }
    }

    private static <T extends Comparable<? super T>> void
    flettesortering(T[] a, T[] tempTab, int forste, int siste){
        if (forste >= siste){
            //basis: gjør ingenting
            //Triks for å vise at vi har tenkt på basistilfelle.
            // Kunne utelate dette og teste om forste< siste of i så fall utføre else blokken.
        }else {
            int midten=(forste+siste)/2;
        //    flettesortering(a, forste,midten);
         //   flettesortering(a,midten+1, siste);
            flett(a,tempTab,forste,midten,siste);

        }
    }
    private static <T extends Comparable<? super T>> void
    flett(T[] a, T[] tempTab, int forste, int midten, int siste){

    }
}
