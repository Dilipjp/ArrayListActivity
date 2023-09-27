package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListAssignment {

	static ArrayList<Integer> numberList = new ArrayList<Integer>();

	// Task 1: Creating an ArrayList
	public ArrayListAssignment() {
		for (int x = 0; x < 10; x++) {
			numberList.add(x);

		}

	}

	// Task 2: Displaying ArrayList Contents
	public void displayArrayList() {
		System.out.println(numberList);
	}

	// Task 3: Adding Elements
	public void addElement(int x) {
		numberList.add(x);
	}

	// Task 4: Removing Elements
	public void removeElement(int y) {
		numberList.remove(Integer.valueOf(y));
	}

	// Task 5: Reversing the ArrayList
	public void reverseArrayList() {
		Collections.reverse(numberList);
	}

	// Task 6: Finding the Sum
	public int findSum(ArrayList<Integer> numberList) {
		int sum = 0;
		for (int num : numberList) {
			sum += num;
		}
		return sum;
	}
	//Task 7: Finding the Maximum and Minimum
	 public int findMaximum(ArrayList<Integer> list) {
	        if (list.isEmpty()) {
	            throw new IllegalArgumentException("The list is empty");
	        }

	        int max = list.get(0);

	        for (Integer num : list) {
	            if (num > max) {
	                max = num;
	            }
	        }

	        return max;
	    }
	 public int findMinmum(ArrayList<Integer> list) {
	        if (list.isEmpty()) {
	            throw new IllegalArgumentException("The list is empty");
	        }

	        int min = list.get(0);

	        for (Integer num : list) {
	            if (num < min) {
	                min = num;
	            }
	        }

	        return min;
	    }
	 //Task 8: Sorting the ArrayList
	    public void sortArrayList() {
	    	Collections.sort(numberList);
	    }
	   // Task 9: Testing

	    //Task 10: Finding an Element

		public int findElement(int elm) {
			return numberList.indexOf(elm);
		}
		
		//Task 11: Removing Duplicates
		public void removeDuplicates() {
			ArrayList<Integer> uniqelemets = new ArrayList<>();
			for(Integer num : numberList) {
				if(!uniqelemets.contains(num)) {
					uniqelemets.add(num);
				}
			}
			numberList = uniqelemets;
		}
		
		
		
		//Task 12: Sublist Operations
		public List<Integer> getSublist(int start, int end){
			return numberList.subList(start, end);
		}
		
		
		//Task 13: Checking for Empty ArrayList
		public boolean isEmptyArrayList() {
			return numberList.isEmpty();
		}
		
		//Task 14: Replacing Elements

		public void replaceElement(int olnum,int newnum) {
			Collections.replaceAll(numberList, olnum, newnum);
		}
		
		//Task 15: Counting Occurrences

		public int countOccurrences(int elem) {
			return Collections.frequency(numberList, elem);
		}
		
		//Task 16: Clearing the ArrayList

		public void clearArrayList() {
			numberList.clear();
		}
		
		//Task 17: Getting the Size
		
		public int getArrayListSize() {
			return numberList.size();
		}
		
		//Task 18: Creating a Copy

		
		public ArrayList<Integer>  copyArrayList(){
			ArrayList<Integer> copy = new ArrayList<>(numberList);
			return copy;
		}
		
		//Task 19: Finding the Average

		
		public double findAverage() {
			int sum  = findSum(numberList) ;
			double avg = (double)sum /numberList.size();
			return avg;
		}
		//Task 20: Testing Additional Methods


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
		System.out.println(obj.findAverage());
		obj.copyArrayList();
		System.out.println(obj.getArrayListSize());
		//obj.clearArrayList();
		obj.countOccurrences(3);
		obj.replaceElement(2, 6);
		System.out.println(obj.isEmptyArrayList());
		obj.getSublist(3, 4);
		obj.removeDuplicates();
		obj.findElement(6);
		obj.sortArrayList();
		System.out.println(obj.findMaximum(numberList));
		System.out.println(obj.findMinmum(numberList));

	}

}
