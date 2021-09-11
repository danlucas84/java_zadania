package javastartBootcamp.zajecia2TypyDanych;

public class Shop {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.productName = "Mleko Mlekowita";
        product1.priceOfProduct = 2.75f;
        product1.avaibility = true;

        Product product2 = new Product();
        product2.productName = "paczka gumek";
        product2.priceOfProduct = 6.78f;
        product2.avaibility = false;


        System.out.println(product1.productName + " " + product1.priceOfProduct + " " + "dostepność:" + product1.avaibility);
        System.out.println(product2.productName + " " + product2.priceOfProduct + " " + "dostepnosc:" + product2.avaibility);

    }
}
