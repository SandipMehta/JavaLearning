package examples;

import java.util.*;  
//import java.util.HashSet;

public class HashSetExample {
	
	public void hashSetExampleBook() {
		HashSet<Book> sBook=new HashSet<Book>();
		
		Book b1 = new Book(1,"Game Of thrones","Tom Hallman","Bantam Spectra",100000);
		Book b2 = new Book(2,"Elementary","	Sean Callery","Alysse Bezahler",1000000);
		Book b3 = new Book(3,"The Mentalist","Bruno Heller","Blake Neely",10000);
		
		
		sBook.add(b1);
		sBook.add(b2);
		sBook.add(b3);
		
		System.out.println("HashSet Example :");
		
		for (Book b:sBook) {
			System.out.println(b.id +" || "+b.name+" || "+b.author+" || "+b.publisher+" || "+b.quantity);  
		}
		
		
	}
	
	public void linkedhashSetExa() {
		LinkedHashSet<Book> lhs = new LinkedHashSet<Book>();
		
		Book b1 = new Book(1,"Game Of thrones","Tom Hallman","Bantam Spectra",100000);
		Book b2 = new Book(2,"Elementary","	Sean Callery","Alysse Bezahler",1000000);
		Book b3 = new Book(3,"The Mentalist","Bruno Heller","Blake Neely",10000);
		
		lhs.add(b1);
		lhs.add(b1);
		lhs.add(b2);
		lhs.add(b3);
		System.out.println("Linked HashSet Example");
		for(Book b:lhs) {
			System.out.println(b.id +" || "+b.name+" || "+b.author+" || "+b.publisher+" || "+b.quantity);
		}
	}
}

class Book{
	int id;
	String name,author,publisher;
	int quantity;
	Book(int id, String name,String author,String publisher,int quantity){
		this.id = id;
		this.name = name;
		this.author=author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

