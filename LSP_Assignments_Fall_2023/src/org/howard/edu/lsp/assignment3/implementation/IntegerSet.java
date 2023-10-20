package org.howard.edu.lsp.assignment3.implementation;

import java.util.*;




public class IntegerSet {
	private ArrayList<Integer>list = new ArrayList<>();
	
	public IntegerSet(ArrayList list) {
		this.list=list;
	}
	
	// code to clear class representation
	public void clear() {
		list.clear();
	}
	
	// returns length of set
	public int length() {
		return list.size();
	}
	
	//returns true if lists are equal, returns false otherwise
	public boolean equals(IntegerSet b) {
		ArrayList<Integer>list2=b.list;
		
		if(list.size()!=list2.size()) {
			return false;
		}
		
		ArrayList<Integer>temp1=list;
		ArrayList<Integer>temp2=list2;
		
		Collections.sort(temp1);
		Collections.sort(temp2);
		
		for(int i=0;i<temp1.size();i++) {
			if(temp1.get(i)!=temp2.get(i)) {
				return false;
			}
			}
		return true;
		
		}
	//returns true if list contains value, returns false otherwise
	boolean contains_element = IntegerSet.contains();
	
	//returns largest item in list; throws an exception if list is empty
	public int largest_item() throws Listemptyexception{
		if(list.size()==0) {
			Listemptyexception e= new Listemptyexception();
			throw e;
		}
		
		int max = 0;
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i)>max) {
				max=list.get(i);
			}
			}
		
		return max;
		
		}
	//returns smallest item in list; throws an exception if list is empty
	public int smallest_item() throws Listemptyexception {
		
		if(list.size()==0) {
			Listemptyexception e= new Listemptyexception();
			throw e;
		}
		
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i)<min) {
				min=list.get(i);
			}
		}
		
		return min;
		}
	
	//add item if it isn't in the list already
	public void addItem(int item) {
		
		boolean exist=false;
		for(int i=0;i<list.size();i++) {
			if(list.get(i)==item) {
				exist=true;
			}
		}
		if(exist==false) {
			list.add(item);
			}
		}
		
	//remove item if it is in the list
	public void removeItem(int item) {
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i)==item) {
				list.remove(i);
			}
			}
		}
	

	//returns union of 2 sets
	public IntegerSet union(IntegerSet list2) {
		
		ArrayList<Integer>temp=list2.getlist();
		
		Set<Integer> set=new HashSet<>();
		set.addAll(list);
		set.addAll(temp);
		
		ArrayList<Integer>list3 = new ArrayList<>(set);
		
		IntegerSet list4 = new IntegerSet(list3);
		
		return list4;
		
	}
	
	//returns intersection of 2 sets
	public IntegerSet intersection(IntegerSet list2) {
		
		ArrayList<Integer>temp =list2.getlist();
		
		list.retainAll(temp);
		
		IntegerSet list4=new IntegerSet(list);
		
		return list4;
	}
	
	//returns difference of 2 sets
	public IntegerSet difference (IntegerSet list2) {
		
		ArrayList<Integer> temp = list2.getlist();
		
		list.removeAll(temp);
	
	IntegerSet list4 = new IntegerSet(list);
		return list4;
		
	}
	
	public ArrayList<Integer> getlist(){
		return list;
	}
	//return true if set is empty, false otherwise
	boolean isEmpty() = IntegerSet.isEmpty();
	if(isEmpty()) = true{
		return true
	}
	else
	{
		return false
		
	}
}


