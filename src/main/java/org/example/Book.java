package org.example;

public class Book {
 //describe a book, create all the variables we need
    // name, author, id, price in USD, availability
    // using conversion rate, calculate EUR Price of book
    // print all the books details including prices

    public static void main(String[] args) {

        String bookName = "Harry Potter";
        String authorName = "J.K. Rowling";
        int id = 1;
        double priceInUSD = 10;
        boolean isAvailable = true;

        double rate = 1.1;

        double priceInEur = priceInUSD * rate;

        System.out.println("Book name is:"+bookName);
        System.out.println("Book ID is:"+ id );
        System.out.println("Book price:"+priceInUSD+" USD "+ priceInEur);
        System.out.println("book is Available: "+ isAvailable);




    }



}
