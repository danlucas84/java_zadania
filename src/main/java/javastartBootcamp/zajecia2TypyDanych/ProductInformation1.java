package javastartBootcamp.zajecia2TypyDanych;

/*

Informacje o produktach (zmienne)
Treść zadania

Napisz program, w którym korzystając ze zmiennych najpierw zapamiętasz informacje o dwóch produktach spożywczych, np.:

nazwa: Mleko, producent: Mlekowita, cena: 2.5zł
nazwa: Czekolada, producent: Wedel, cena: 2.19zł
Do przechowywania każdej informacji wykorzystaj osobne zmienne odpowiednich typów. Łącznie potrzebujesz 6 zmiennych.

Następnie odwołując się do zmiennych wyświetl te informacje w formie przedstawionej poniżej:

Mleko Mlekowita 2.5zł
Czekolada Wedel 2.19zł
*/


public class ProductInformation1 {

    public static void main(String[] args) {

        String product1 = "Mleko";
        String product2 = "Czekolada";
        String producer1 = "Mlekowita";
        String producer2 = "Wedel";
        float price1 = 2.5f;
        float price2 = 2.19f;

        System.out.println(product1 + " " + producer1 + " " + price1 + "zl");
        System.out.println(product2 + " " + producer2 + " " + price2 + "zl");
    }


}
