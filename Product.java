import java.io.*;
import java.util.Scanner;
import java.lang.Integer;

public class Product {
    static Scanner lukija = new Scanner(System.in);
    private String name;
    private double price;
    
    public Product(String namepar, double pricepar){
        name = namepar;
        price = pricepar;
        System.out.printf("Muodostimen tyyppi: public, name: %s, price: %f %n",
                                                            name, price);
    }
    public Product(){
        name = "";
        price = 0;
    }
    /* Setters */
    public void setName(String name_par) {
        this.name = name_par;
    }
    public void setPrice(double price_par) {
        this.price = price_par;
    }
    /* Getters */
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    static void printProduct(final Product prod) {
        System.out.println("Now printing from function:");
        System.out.println(prod.getName());
        System.out.println(prod.getPrice());
    }
    static Product readProduct(Product prod){
        System.out.println("MAKING NEW PROD:");
        //instantiate
        prod = new Product();
        System.out.println("Set name:");
        prod.setName(lukija.nextLine());
        System.out.println("Giv price doble:");
        prod.setPrice(lukija.nextDouble());
        lukija.nextLine(); //consume the double
        System.out.println(prod.getName());
        System.out.println(prod.getPrice());
        return prod;
    }
    static void readProducts( Product [] products , int lkm){
        System.out.println(products.length);
        for(int i=0;i<lkm;i++){
            products[i] = readProduct(products[i]);
        }
        
    }
    
    static void printProducts( Product [] products ) {
         System.out.println("I SHALL PRINT THEM NOW");
         for(Product product:products){
            System.out.println(product.getName());
            System.out.println(product.getPrice());
        }
    }
    public static void main(String [] args){
        //First maake new product eka with 123.4
        Product eka = new Product("eka", 123.4);
        //print info
        System.out.println(eka.getName());
        System.out.println(eka.getPrice());
        //change the same object
        System.out.println("Set name to Kalle and price to 9001");
        eka.setName("Kalle");
        eka.setPrice(9001);
        //print it
        System.out.println(eka.getName());
        System.out.println(eka.getPrice());
        //Use method to print
        printProduct(eka);
        //read new info to eka using method
        Product toka = readProduct(eka);
        System.out.println("Finally print from main the new product");
        System.out.println(toka.getName());
        System.out.println(toka.getPrice());
        //Now make array and populate
        System.out.println("Ok, now how many products you want?");
        int lkm = lukija.nextInt();
        lukija.nextLine(); //consume the int
        Product [] products = new Product[lkm];
        //read aray with info
        readProducts(products,lkm);
        //print them
        printProducts(products);
        
        
    }
}
    