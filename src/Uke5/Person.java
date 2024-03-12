package Uke5;

public class Person implements Comparable<Person> {
    private String fornanvn;
    private String etternavn;

    public Person() {
        this("", "");
    }

    public Person(String fornanvn, String etternavn) {
        this.etternavn = etternavn;
        this.fornanvn = fornanvn;
    }

    @Override
    public String toString() {
        return etternavn + "," + fornanvn;
    }

    @Override
    public int compareTo(Person p) {
        int resultat = etternavn.compareTo(p.etternavn);
        if (resultat == 0) {
            resultat = fornanvn.compareTo(p.fornanvn);
        }
        return resultat;
    }
}
