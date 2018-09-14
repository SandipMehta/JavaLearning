package examples;

import java.util.*;
//import java.util.Iterator;
//import java.util.PriorityQueue;

public class JavaQueueExample {
	public void priorityQueueExample() {
		PriorityQueue<String> strQueue = new PriorityQueue<String>();
		
		strQueue.add("Sandip");
		strQueue.add("Bhavesh");
		strQueue.add("Kinchit");
		strQueue.add("Ujjaval");
		strQueue.add("Sihir");
		strQueue.add("Kiran");
		strQueue.add("Pavan");
		strQueue.add("Jemi");
		
		System.out.println("Element Method - Head :"+strQueue.element());
		System.out.println("Peek Method - Head :"+strQueue.peek());
		System.out.println("Iterating all elements ;");
		
		Iterator<String> itr=strQueue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		strQueue.remove();
		strQueue.poll();
		
		System.out.println("After removing elements :");
		
		Iterator<String> itr2=strQueue.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
	public void priorityQueueBookExample() {
		 Queue<Book> queue=new PriorityQueue<Book>();
		 
		 Book b1=new Book(121,"Let us C","Yashwant Kanetkar","BPB",8);  
		 Book b2=new Book(233,"Operating System","Galvin","Wiley",6);  
		 Book b3=new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
		 
		 queue.add(b1);  
		 queue.add(b2);
		 queue.add(b3); 
		 
		 System.out.println("Traversing the queue elements:"); 
		 
		 for (Book b:queue) {
			 System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		 }
		 
		 queue.remove();
		 
		 System.out.println("After removing one book record:");  
		 for(Book b:queue){  
			 System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
		 } 
		 
	}
	
	public void arrayDeQueueBookExample() {
		 Deque<Book> dequeue=new ArrayDeque<Book>();
		 
		 Book b1=new Book(121,"Let us C","Yashwant Kanetkar","BPB",8);  
		 Book b2=new Book(233,"Operating System","Galvin","Wiley",6);  
		 Book b3=new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",3);
		 Book b4=new Book(401,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
		 
		 dequeue.add(b1);  
		 dequeue.add(b2);
		 dequeue.add(b3); 
		 
		 dequeue.offerFirst(b4);
		 
		 System.out.println("Traversing the queue elements:"); 
		 
		 for (Book b:dequeue) {
			 System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		 }
		 
		 dequeue.pollLast();
		 
		 System.out.println("After removing one book record:");  
		 for(Book b:dequeue){  
			 System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
		 } 
		 
	}
}
