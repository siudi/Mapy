package pl.gornik.map4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Book,Integer> books = new TreeMap<>(new ComparatorByAuthorThenByTitleThenByVolumin());
        books.put(new Book("Lalka","Bolesław Prus",2000,1),9);
        books.put(new Book("Chłopi","Władysław Reymont",1900,2),11);
        books.put(new Book("Chłopi","Władysław Reymont",1901,2),4);
        books.put(new Book("Pan Tadeusz","Adam Mickiewicz",1978,1),6);
        books.put(new Book("Zbrodnia i kara","Fiodor Dostojewski",1875,1),3);
        books.put(new Book("Dziady","Adam Mickiewicz",1875,3),14);

        System.out.println("Książki w księgarni:");
        for(Map.Entry<Book,Integer> element : books.entrySet()){
            System.out.println("Książek " + element.getKey().getTitle() + " jest na stanie " + element.getValue() + " sztuk" );
        }
        Set<Book> keyBook = books.keySet();
        for(Book element : keyBook) System.out.println(element);



    }
}
