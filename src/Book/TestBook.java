package Book;

import java.util.ArrayList;

public class TestBook {

    public static void main(String[] args) {
        var book1= new Book("Pushkin",1825,"Evgeny Onegin");
        var book2= new Book("Kovalev",1765,"Liza");
        var book3= new Book("Mishin",1967,"Nova");
        Bookshelf book=new Bookshelf();
        book.add(book1);
        book.add(book2);
        book.add(book3);
        System.out.println(book.toString());
        System.out.println("The first book is: "+book.First());
        System.out.println("The last book is: "+book.Last());
    }
}
