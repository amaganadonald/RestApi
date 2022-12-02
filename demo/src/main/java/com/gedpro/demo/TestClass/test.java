package com.gedpro.demo.TestClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class test {
	
	public static int[] selectedSort(int[] array) {
		int[] tab = array.clone();
		int m = 0;
		for(int i=0;i<array.length;i++) {
			m = i;
			for(int j= i+1;j<array.length;j++) {
				if (tab[j]<tab[m]) {
					m = j;
				}
			}
			int temp = tab[m];
			tab[m] = tab[i];
			tab[i] = temp;
		}
		tabv(array);
		tabv(tab);
		return tab;
	}
	
	public static int[] bubbleSort(int[] array) {
		int[] tab = array.clone();
		for(int i=0;i<tab.length-1;i++) {
			for(int j=0;j<tab.length-1-i;j++) {
				if(tab[j+1] < tab[j]) {
				  int tmp = tab[j+1];
				  tab[j+1] = tab[j];
				  tab[j] = tmp;
				}
			}
		}
		tabv(tab);
		return tab;
	}
	
	public static void tabv(int[] tb) {
		for(int t=0;t<tb.length;t++) {
			System.out.println(tb[t]);
		}
	}
	
	
	public static void main(String[] args) {
		List<Integer> arraylist  = new ArrayList <Integer>(2);
		arraylist.add(3);
		arraylist.add(1, 6);
		arraylist.add(7);
		System.out.println(arraylist);
		System.out.println(arraylist.get(0));
		System.out.println("--------------------");
		LinkedList<Integer> list = new LinkedList<>();
		list.add(3);
		list.add(4);
		list.addFirst(1);
		list.addLast(5);
		list.add(2, 6);
		System.out.println(list.contains(5));
		System.out.println(list);
		System.out.println("--------------------");
		Set<String> hashset = new HashSet<>();
		hashset.add("A");
		hashset.add("E");
		hashset.add("B");
		hashset.add("C");
		System.out.println(hashset.contains("C"));
		System.out.println(hashset);
		System.out.println("--------------------");
		TreeSet<String> treeset = new TreeSet<String>();
		treeset.add("A");
		treeset.add("E");
		treeset.add("B");
		treeset.add("C");
		treeset.add("C");
		System.out.println(treeset);
		System.out.println("--------------------");
		int[] ta = {9,6,10,8,1,24};
		System.out.println(selectedSort(ta));
		System.out.println(bubbleSort(ta));
		
		
	}
}
