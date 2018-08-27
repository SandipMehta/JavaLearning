package examples;
import java.util.*;
import java.util.Collections;
import examples.Author;
import examples.ArrayListExa;


public class ExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Arraylist example call
		//ArrayListExa arralist = new ArrayListExa();

		/* Arraylist initialize & size*/
		
		//arralist.arraylistExa1();
		
		/* Arraylist For loops */
		
		//arralist.arraylistExaForloop();
		
		/* Arraylist Sorting */
		//arralist.araylistExaSort();
		
		
		/* Array List Sorting for multiple fields using COMPARABLE Interface */
		//arralist.arraylistsortComparableExa();
		
		/* Calling sorting for Author using Comparator */
		 ComparatorAuthorSortingPgm comparatorSort = new ComparatorAuthorSortingPgm();
		 comparatorSort.ComparatorAuthorSorting();
	
	}
}
