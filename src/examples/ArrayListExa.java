package examples;
import examples.Student;

import java.util.*;

public class ArrayListExa {
	
	public void arraylistExa1() {
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("Ahmedabad");
		obj.add("Surat");
		obj.add("Baroda");
		obj.add("Rajkot");
		
		System.out.println("Cities :" + obj);
		
		obj.remove(2);
		obj.add("Mumbai");
		System.out.println("After Add Remove Cities :" + obj);
		
		//Sorting Array list Items 
		Collections.sort(obj);
		
		System.out.println("Sorted Cities :" + obj);

		// Using Ciollections.nCopies  
		ArrayList<Integer> intlist = new ArrayList<Integer>(Collections.nCopies(10, 5));
		System.out.println("ArrayList items: "+intlist);
		ArrayList<String> strlist = new ArrayList<String>(Collections.nCopies(10, "A"));
		System.out.println("ArrayList items: "+strlist);
		
		// Getting size of arralist 
		System.out.println("Size of Obj Arraylist : "+obj.size());
		
	}
	public void arraylistExaForloop() {
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		arrlist.add(14);
		arrlist.add(7);
		arrlist.add(39);
		arrlist.add(40);
		
		   /* For Loop for iterating ArrayList */
	      /*For Loop*/
		
	      for (int counter = 0; counter < arrlist.size(); counter++) { 		      
	          System.out.println("For Loop : " + arrlist.get(counter)); 		
	      }   
		
		// Advanced For loop 
		for (Integer num : arrlist) {
			System.out.println("Advanced For loop :" +num);
		}
		
		// While loop 
		int count = 0;
		while(arrlist.size() > count) {
			System.out.println("While for Loop :"+arrlist.get(count));
			count++;
		}
	}
	public void araylistExaSort() {
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		arrlist.add(14);
		arrlist.add(7);
		arrlist.add(39);
		arrlist.add(40);
		
		System.out.println("Before Sorted Integers : ");
		
		for(Integer counter: arrlist){
			System.out.println(counter);
		}
		
		System.out.println("After Sorted Integers : ");
		Collections.sort(arrlist);
		
		for(Integer counter: arrlist){
			System.out.println(counter);
		}
		
	    ArrayList<String> listofcountries = new ArrayList<String>();
	    listofcountries.add("India");
	    listofcountries.add("US");
	    listofcountries.add("China");
	    listofcountries.add("Denmark");
	    
	    System.out.println("Before Sorted Countries : ");
	    
	    for(String counter: listofcountries){
			System.out.println(counter);
		}
	    
	    Collections.sort(listofcountries);
	    /* Sorted List*/
	    System.out.println("After Sorting countries :");
	    for(String counter: listofcountries){
	    	System.out.println(counter);
		}
	    
	    System.out.println("After Sorting countries in descending :");
	    
	    Collections.sort(listofcountries,Collections.reverseOrder());
	    for(String counter: listofcountries){
			System.out.println(counter);
		}
	    
	    System.out.println("Reversing Entire Arraylist of countries:");
		   
	    Collections.reverse(listofcountries);
	    for(String counter: listofcountries){
			System.out.println(counter);
		}
		   
	}
	//-----------------------------------------------------------------
	//                       COMPARABLE EXAMPLE 
	//-----------------------------------------------------------------
	public void arraylistsortComparableExa() {
		ArrayList<Student> arraylist = new ArrayList<Student>();
		   arraylist.add(new Student(223, "Chaitanya", 26));
		   arraylist.add(new Student(245, "Rahul", 24));
		   arraylist.add(new Student(209, "Ajeet", 32));

		   Collections.sort(arraylist);

		   for(Student str: arraylist){
				System.out.println(str);
		   }
	}

}
