package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAssignment {
	
	 static ArrayList <Integer> numberList = new ArrayList<Integer>(10);
	
	//Task 1: Creating an ArrayList
	public ArrayListAssignment() {
		for(int x= 0; x< 10; x++) {
			numberList.add(x);
			
		}
		
	}
	//Task 2: Displaying ArrayList Contents
	public void displayArrayList() {
		System.out.println(numberList);	
		}
	//Task 3: Adding Elements
	public void addElement(int x) {
		numberList.add(x);
	}
	
	//Task 4: Removing Elements
	public void removeElement(int y) {
		numberList.remove(Integer.valueOf(y));
	}
	
	//Task 5: Reversing the ArrayList
	public void reverseArrayList() {
		 Collections.reverse(numberList);
	}
	//Task 6: Finding the Sum
	public int findSum(ArrayList<Integer> numberList) {
		 int sum = 0;
	        for (int num : numberList) {
	            sum += num;
	        }
	        return sum;
	}




	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListAssignment obj = new ArrayListAssignment();
		obj.displayArrayList();
		obj.addElement(10);
		obj.displayArrayList();
		obj.removeElement(10);
		obj.displayArrayList();
		obj.reverseArrayList();
		obj.displayArrayList();
		System.out.println(obj.findSum(numberList));

	}

}
