package examples;

import java.util.Comparator;

public class Author implements Comparable<Author> {
	String firstName; 
	String bookName; 
	int auAge; 
	
	Author(String first, String book, int age){ 
		this.firstName = first; 
		this.bookName = book; 
		this.auAge = age; 
	} 
	
	public String getFirstName() { 
		return firstName; 
	}
	public void setFirstName(String firstName) { 
		this.firstName = firstName; 
	}
	
	public String getBookName() { 
		return bookName; 
	}
	public void setBookName(String bookName) { 
		this.bookName = bookName; 
	}
	public int getAuAge() { 
		return auAge; 
	}
	public void setAuAge(int auAge) { 
		this.auAge = auAge; 
	} 
	@Override 
	/* 
	* When we only use Comparable, this is where we write sorting
	* logic. This method is called when we implement the Comparable
	* interface in our class and call Collections.sort()
	*/ 
	public int compareTo(Author au){         
	return this.firstName.compareTo(au.firstName);   
	}
}
class AuthorAgeComparator implements Comparator<Author>{
	public int compare(Author A1,Author A2) {
		if(A1.auAge==A2.auAge) {
			return 0;
		}
		else if (A1.auAge > A2.auAge) {
			return 1;
		}
		else {
			return -1;
		}
	}
}
 
class BookNameComparator implements Comparator<Author>{ 
	public int compare(Author a1,Author a2){   
		return a1.bookName.compareTo(a2.bookName); 
	}  
}

class AuthorNameComparator implements Comparator<Author>{ 
	public int compare(Author a1,Author a2){   
		return a1.firstName.compareTo(a2.firstName); 
	}  
}