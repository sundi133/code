import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

class ListNode{
	
	int weight;
	int value;
}

class CompTypeComparator implements Comparator {
	  public int compare(Object o1, Object o2) {
		ListNode j1 = (ListNode) o1;
	    ListNode j2 = (ListNode) o2;
	    
	    if(j1.value <= j2.value && j1.weight <= j2.weight)
	    	return -1;
	    else 
	    	return 1;
	  }
	}

public class Solution {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {

		
		

	}	
	
}



 
