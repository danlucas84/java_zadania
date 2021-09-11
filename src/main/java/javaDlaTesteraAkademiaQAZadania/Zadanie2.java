package javaDlaTesteraAkademiaQAZadania;

/*
napisz program ktory sprawdzi czy pierwszy i ostani element w tablicy pierwszej
 jest taki sam jak w tablicy drugiej obie tablice zawierają liczby calkowite
np
tab [1,2,25,1] true
tab [0,1,2,3,4] false
 */
public class Zadanie2 {
    public static void main(String[] args) {

        int[] tab1 = {4, 3, 2, 1};
        int[] tab2 = {7, 3, 2, 1};


        System.out.println("dlugosc tablicy1:" + tab1.length);
        System.out.println("pierwszy element tablicy1:" + tab1[tab1.length - 4]);
        System.out.println("ostatni element tablicy1:" + tab1[tab1.length - 1]);

        System.out.println("dlugosc tablicy2:" + tab2.length);
        System.out.println("pierwszy element tablicy2:" + tab2[tab2.length - 4]);
        System.out.println("ostatni element tablicy2:" + tab2[tab2.length - 1]);

        if (tab1[0] == tab2[0] && tab1[tab1.length - 1] == tab2[tab2.length - 1]) {
            System.out.println("elementy są takie same");
        } else {
            System.out.println("nie są takie same");
        }
    }
}
