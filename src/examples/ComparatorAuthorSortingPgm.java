package examples;

import java.util.Collections;
import java.util.ArrayList;

import examples.Author;

public class ComparatorAuthorSortingPgm {
	
	public void ComparatorAuthorSorting() {
	ArrayList<Author> authorlist = new ArrayList<Author>();
	authorlist.add(new Author("Henry", "Tropic of Cancer",  45));
	authorlist.add(new Author("Nalo", "Brown Girl in the Ring", 56));
	authorlist.add(new Author("Frank", "300", 65));
	authorlist.add(new Author("Deborah", "Sky Boys", 51));
	authorlist.add(new Author("George R. R.", "A Song of Ice and Fire", 62));
	
	ArrayList<Author> authorlist1 = new ArrayList<Author>();
	authorlist.add(new Author("Forbes", "Titanic",  35));
	authorlist.add(new Author("Sam", "Golden Ring", 34));
	
	authorlist1.addAll(authorlist);
	 
	System.out.println("Sorting by Author First Name:");  
	 System.out.println("------------------------------");
    Collections.sort(authorlist);        
    for(Author au: authorlist){       
    		System.out.println(au.getFirstName()+", "+au.getBookName()+", "+
    		au.getAuAge());        
    	}
    System.out.println("****************************************");

    //***********COMPARATOR SORTING CALL AS BELOW***********************
    
    System.out.println("Sorting Author by Age:");
    System.out.println("------------------------------");
	Collections.sort(authorlist,new AuthorAgeComparator());
	for(Author au: authorlist){       
        System.out.println(au.getFirstName()+", "+au.getBookName()+", "+ 
           au.getAuAge());       
     } 
	System.out.println("****************************************");
	System.out.println("Sorting Author by Book:");
	System.out.println("------------------------------");
	Collections.sort(authorlist,new BookNameComparator());
	for(Author au: authorlist){       
        System.out.println(au.getFirstName()+", "+au.getBookName()+", "+ 
           au.getAuAge());       
     } 
	System.out.println("****************************************");

	}
}
