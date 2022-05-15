package com;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class SetDemo {
public static void main(String[] args) 
{

	LinkedList<Integer> object = new LinkedList<Integer>();
	object.add(10);
	object.add(80);
	object.add(null);
	object.add(80);
	object.add(70);
	object.add(null);
	
	Iterator<Integer> iterator = object.iterator();
	while(iterator.hasNext())
	{
		System.out.println(iterator.next());
	}
}
}
