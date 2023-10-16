package org.howard.edu.lsp.assignment4;

import java.util.*;
import java.util.List;

class IntegerSetException extends Exception{

}
public class IntegerSet {
	private ArrayList<Integer> list = new ArrayList<>();

	public IntegerSet(ArrayList list) {
		this.list=list;
	}

public void clear(){	//clears internal representation
	list.clear();
}

public int length() {  //returns length of set
	return list.size();
	
}

public boolean equals(IntegerSet b) { //checks if 2 list are equal, returns true or false
	ArrayList<Integer>list2 = b.list;
	
	if(list.size()!=list2.size()) {
		return false;
	}
	ArrayList<Integer> temp1=list;		//sorts and goes through list by value to check if they are all the same
	ArrayList<Integer> temp2 =list2;
	
	Collections.sort(temp1);
	Collections.sort(temp2);
	
	for(int i=0;1<temp1.size();i++) {  
		if(temp1.get(i)!=temp2.get(i)) {
			return false;
		}
	}
	
	
	return true;
}
	
//return largest item and throw exception if empty list

public int largest() throws IntegerSetException{
	if(list.size()==0) {
		IntegerSetException e = new IntegerSetException();
		throw e;
	}
	int max=0;
	
	for(int i=0;i<list.size();i++) {
		if(list.get(i)>max) {
			max=list.get(i);
		}
		
	}
	
	return max;
	
}

//return largest item and throw exception if empty list
public int smallest()throws IntegerSetException{
	if(list.size()==0) {
		IntegerSetException e = new IntegerSetException();
		throw e;
	}
	
	int min = Integer.MAX_VALUE;
	
	for(int i=0;i<list.size();i++) {
		if(list.get(i)<min) {
			min=list.get(i);
		}
	}

	return min;
}

//adds item to list if it is not in there already, otherwise do nothing
public void addItem(int item){
	boolean exist = false;
	
	for(int i=0;i<list.size();i++) {
		
		if(list.get(i)==item) {
			exist = true;
			
		}
	}
	if(exist==false) {
		list.add(item);
	}
}
	
//removes item from list if it is there, otherwise do nothing
public void removeItem(int item) {
	for(int i=0;i<list.size();i++) {
		if(list.get(i)==item) {
			list.remove(i);
		}
	}
}

//return the union of 2 sets
public IntegerSet union(IntegerSet list2) {
	
	ArrayList<Integer>temp=list2.getlist();
	
	Set<Integer>set = new HashSet<>();
	set.addAll(list);
	set.addAll(temp);
	
	ArrayList<Integer>list3 = new ArrayList<>(set);
	IntegerSet list4 = new IntegerSet(list3);
	
	return list4;
			
}

//return the intersection of 2 sets
public IntegerSet intersection(IntegerSet list2) {
	
	ArrayList<Integer>temp = list2.getlist();
	
	list.retainAll(temp);
	
	IntegerSet list4 = new IntegerSet(list);
	
	return list4;
}

//return the difference of 2 sets
public IntegerSet diff (IntegerSet list2) {
	
	ArrayList<Integer>temp = list2.getlist();
	

	list.removeAll(temp);
	
	IntegerSet list4 = new IntegerSet(list);
	
	return list4;
}

public ArrayList<Integer> getlist(){
	return list;
}

}