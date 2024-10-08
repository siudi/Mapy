package pl.gornik.map3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<Book,Integer> books = new HashMap<>();
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

        //Wyświetlanie kluczy
        Set<Book> keyBook = books.keySet();
        for(Book element : keyBook) System.out.println(element);

        //Wyśtwietlanie wartości
        Collection<Integer> values = books.values();
        for(Integer element : values) System.out.print(element + " ");



    }
    public static void putBookToMap(Map<Book, Integer> books,Book book,int amount){
        if(books.containsKey(book)) books.put(book, books.get(book) + amount);
        else books.put(book,amount);
    }

}
