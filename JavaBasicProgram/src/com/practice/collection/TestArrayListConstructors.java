package com.practice.collection;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class TestArrayListConstructors {

	public static int getCapacity(ArrayList<?> l) throws Exception {
        Field dataField = ArrayList.class.getDeclaredField("elementData");
        dataField.setAccessible(true);
        return ((Object[]) dataField.get(l)).length;
    }
	
	public static void main(String[] args) throws Exception {
		
		ArrayList A1 = new ArrayList(); //no-arg - creates 10 capacity array

		A1.add("hello");
		A1.add(20);
		A1.add("hello");
		A1.add("hi");
		A1.add(10);
		A1.add(30);
		
		System.out.println("initial capacity : "+getCapacity(A1));
		System.out.println("size : "+A1.size());

		
	}
}
