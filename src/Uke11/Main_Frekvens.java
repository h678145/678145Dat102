package Uke11;
import java.util.Iterator;
public class Main_Frekvens {
    public static void main(String[] args) {
        String[] ord ={"er","det","finn","er","finn","er"};
        //lag ordbok
        Ordbok<String,Integer> frekvenser = new Ordbok<>();
        //tell opp
        for(String e : ord){
            Integer verdi = frekvenser.getVerdi(e);
            if(verdi== null ){
                frekvenser.leggTil(e,1);
            }else{
                frekvenser.leggTil(e,verdi+1);
            }
        }
        //skriv ut frekvensoversikt
        //nI=nøkkelIterator, vI=verdiIterator
        Iterator<String> nI = frekvenser.getNokkelIterator();
        Iterator<Integer> vI = frekvenser.getVerdiIterator();
        
        while (nI.hasNext()){
            System.out.println(nI.next() + ": " + vI.next());
        }
    }

}
