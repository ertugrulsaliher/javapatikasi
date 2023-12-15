package BoksMaci;

public class Karsilasma {
    public static void main(String[] args) {



    Fighter f1 = new Fighter("Salih",20,82,100,25);
    Fighter f2 = new Fighter("Ertugrul", 25,72,100,15);

    Match match = new Match(f1,f2,65,100);

    match.run ();

  }
}
