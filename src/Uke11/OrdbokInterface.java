package Uke11;

import java.util.Iterator;

public interface OrdbokInterface<K,V> {


    //Blir fylt inn på forelesning
    //Vil bruke den forhåndsdefinerte klassen HashMap i Java.
    V leggTil(K nokkel, V verdi);

    V fjern(K nokkel);

    V getVerdi(K nokkel);

    boolean inneholder(K nokkel);

    Iterator<K> getNokkelIterator();

    Iterator<V> getVerdiIterator();
    boolean erTom();

    int getAntall();

    void toem();
}
