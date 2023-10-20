package org.howard.edu.lsp.assignment3.test;

public class driver {
	public static void main(String[]args) throws Listemptyexception{
ArrayList<Integer> list1= new ArrayList<>();
ArrayList<Integer> list2= new ArrayList<>();
		  
		  
// makes 2 instances of set class for implementation
IntegerSet set1= new IntegerSet(list1);
IntegerSet set2= new IntegerSet(list2);
		  
set1.addItem(10);
set1.addItem(11);
set1.addItem(12);
set1.addItem(13);
set1.addItem(14);
set1.addItem(15);
set1.addItem(16);
		  
		set2.addItem(10);
		set2.addItem(12);
		set2.addItem(11;
		set2.addItem(13);
		set2.addItem(14);
		set2.addItem(15);
		set2.addItem(16);
		  
		System.out.println("Set 1 : "+set1.getlist());
		System.out.println("Set 2 : "+set2.getlist());
		  
		System.out.println("Is equal : "+set1.equals(set2));
		  
		System.out.println("Largest element in set1 : "+set1.largestelement());
		  
		System.out.println("Smallest element in set2 : "+set2.smallestelement());
		  
		IntegerSet setu= set1.union(set2);
		  
		System.out.println("Unoin : "+setu.getlist() );
		  
		IntegerSet seti= set1.intersection(set2);
		  
		System.out.println("Intersection : "+seti.getlist() );
		  

		      
		   }
	}
	
