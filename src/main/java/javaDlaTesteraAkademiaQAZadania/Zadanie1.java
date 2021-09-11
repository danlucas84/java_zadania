package javaDlaTesteraAkademiaQAZadania;

/*
napisz program ktory sprawdzi czy peierwszy i ostanie element w tablicy zaowrajacej liczby calkowite
jest taki sam np
tab [1,2,25,1] true
tab [0,1,2,3,4] false
 */
public class Zadanie1 {

    public static void main(String[] args) {
        int[] tab = {1, 2, 25, 19};
        System.out.println("dlugosc tablicy:" + tab.length);
        System.out.println("pierwszy element tablicy:" + tab[tab.length - 4]);
        System.out.println("ostatni element tablicy:" + tab[tab.length - 1]);
        if (tab[tab.length - 4] == tab[tab.length - 1]) {
            System.out.println("Elementy tablicy pierwszy i ostatni są takie same");
        } else {
            System.out.println("elementy nie są takie same");
        }

    }

}
