package examples;

import java.util.*;  
import java.util.Comparator;
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
	
	public void treeSetExample() {
		TreeSet<String> ts1 = new TreeSet<String>();
		ts1.add("2");
		ts1.add("A");
		ts1.add("3");
		//System.out.println(ts1);
		//System.out.println(ts1.first());
		
		
		// Using Comparator interface
		TreeSet<Book> tsBook = new TreeSet<Book>(new NameBookComparator());
		
		// Using Comparable interface
		//TreeSet<Book> tsBook = new TreeSet<Book>();
		
		Book b1 = new Book(1,"Game Of thrones","Tom Hallman","Bantam Spectra",100000);
		Book b2 = new Book(2,"Elementary","	Sean Callery","Alysse Bezahler",1000000);
		Book b4 = new Book(4,"AThe Mentalist","Bruno Heller","Blake Neely",10000);
		Book b5 = new Book(5,"ZThe Mentalist","Bruno Heller","Blake Neely",10000);
		Book b3 = new Book(3,"The Mentalist","Bruno Heller","Blake Neely",10000);
		
		tsBook.add(b2);
		tsBook.add(b1);
		tsBook.add(b3);
		tsBook.add(b5);
		tsBook.add(b4);
		
		//tsBook.comparator();
		System.out.println(tsBook.size());
		//System.out.println(tsBook);
		
		Iterator<Book> ib = tsBook.iterator();
		//Book o = ib.next();
		//System.out.println(o.id + " || " + o.name);
		while(ib.hasNext()) {
			Book o = ib.next();
			System.out.println(o.id + " || " + o.name);
			//System.out.println(ib.next().id+" || "+ib.next().name+" || "+ib.next().author+" || "+ib.next().publisher+" || "+ib.next().quantity);
		}
		
		
	}
}

class Book implements Comparable<Book> {
	int id;
	String name,author,publisher;
	int quantity;
	Book(int id, String name,String author,String publisher,int quantity){
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	
	public int compareTo(Book b){         
		if (id>b.id)
			return 1;
		else if (id<b.id)
			return -1;
		else
			return 0;
		}
}

class NameBookComparator implements Comparator<Book>{ 
	public int compare(Book a1,Book a2){   
		return a1.name.compareTo(a2.name); 
	}  
}

class AuthorBookComparator implements Comparator<Book>{ 
	public int compare(Book a1,Book a2){   
		return a1.author.compareTo(a2.author); 
	}  
}