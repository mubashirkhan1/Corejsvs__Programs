package collectionprograms11;

import java.util.ArrayList;
import java.util.List;

class Book extends ArrayList {  
int id;  
String name,author,publisher;  
int quantity;  
public Book(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}  
}  
public class Listbyuserclass {  
public static void main(String[] args) {  
    //Creating list of Books  
    List<Book> list=new ArrayList<Book>();  
    //Creating Books  
    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
    Book b2=new Book(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",4);  
    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  
    //Adding Books to list  
    System.out.println(b2.isEmpty());
    list.add(b1);  
    list.add(b2);  
    list.add(b3);  
    System.out.println(list.size());
    //Traversing list  
    for(Book b:list){  
    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    int str1=1;
    System.out.println(str1);
    }  
    
}  
 

}
