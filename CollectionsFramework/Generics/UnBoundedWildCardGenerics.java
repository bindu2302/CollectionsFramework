package Generics;

import java.util.ArrayList;
import java.util.List;

public class UnBoundedWildCardGenerics {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(20);
		intList.add(30);
		System.out.println(intList);
		
		
		List<String> strList = new ArrayList<String>();
		strList.add("kalki");
		strList.add("pushpa 2");
		System.out.println(strList);
		
		Student st1 = new Student(1,"deepak");
		Student st2 = new Student(2,"deepika");
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(st1);
		studentList.add(st2);
		System.out.println(studentList);
		
	}
	
	// unbounded wilcards :?
	public static void printList(List<?> list) {
		for(Object element:list) {
			System.out.println(element);
		}
	}
	
	

}
