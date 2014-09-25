package org.avg.ds.sort;

public class UnsortedOptimizedArray {

	private int next;
	private int size;
	
	private Integer[] data;
	
	public UnsortedOptimizedArray(){
		next = 0;
		size = 10;
		data = new Integer[size];
	}
	
	public boolean insert(int input){
		if(next>=size) return false;
		data[next] = input;
		next ++;
		return true;
	}
	
	public int fetch(int searchValue){
		int pos = 0;
		while(pos<=size){
			if(data[pos]==searchValue){
				int temp = data[pos];
				data[pos] = data[pos-1];
				data[pos-1] = temp;
				
				return pos;
			}
			pos++;
		}
		return -1;
	}
	
	public boolean delete(int searchValue){
		
		int index = fetch(searchValue);
		if(index==-1){
			return false;
		}
		
		//just move the last node to this pos
		data[index] = data[next-1];
		data[next-1] = null;
		next = next-1;
		return true;
	}
	
	public boolean update(int oldValue, int newValue){
		if(delete(oldValue) == false){
			return false;
		}else if(insert(newValue) == false){
			return false;
		}else{
			return true;
		}
		
	}
	
	
	
}
