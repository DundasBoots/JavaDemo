package com.qa.helloworld;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ArrayLists {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Hi");
		list.add("Hello");
		list.add("Good morning");
		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		for (String i : list) {
			System.out.println(i);
		}
		System.out.println(list.get(0));

		list.set(0, "Hola");
		System.out.println(list);

		Collections.sort(list);
		System.out.println(list);

		list.remove(0);
		System.out.println(list);

		List<Integer> num = new ArrayList<>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		System.out.println(num);
		 Collections.reverse(num);
		 System.out.println(num);
		Collections.swap(num, 0, 1);
		System.out.println(num);
		
	
		
	}

}
