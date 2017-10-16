package com.selfprep;
import java.util.LinkedList;

public class LRU {

	public int chacheSize;
	public LinkedList<Integer> arrayList = new LinkedList<>();
	public LRU(int cacheSize) {
		this.chacheSize = cacheSize;
	}
	void LRU1(int pageNumber)
	{
		if(arrayList.contains(pageNumber))
		{
			arrayList.remove((Integer)pageNumber);
			arrayList.addFirst(pageNumber);
		}
		else{
			if(arrayList.size() < this.chacheSize)
			{
				arrayList.add(0, pageNumber);
			}
			else{
				arrayList.removeLast();
				arrayList.add(0, pageNumber);
			}
		}
		printList(arrayList);
	}
	
	void printList(LinkedList<Integer> arrayList)
	{
		System.out.println(arrayList);
	}
	public static void main(String[] args) {
		LRU lru = new LRU(4);
		lru.LRU1(4);
		lru.LRU1(2);
		lru.LRU1(1);
		lru.LRU1(1);
		lru.LRU1(4);
		lru.LRU1(3);
		lru.LRU1(7);
		lru.LRU1(8);
		lru.LRU1(3);
		
	}

}
