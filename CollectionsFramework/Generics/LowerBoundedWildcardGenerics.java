package Generics;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildcardGenerics {
	public static void main(String[] args) {
		
		
		Student st1 = new Student(1,"deepak");
		Student st2 = new Student(2,"deepika");
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(st1);
		studentList.add(st2);
		printList(studentList);
		
		
		Fresher f1 = new Fresher();
		Fresher f2 = new Fresher();
		List<Fresher> FresherList = new ArrayList<Fresher>();
		FresherList.add(f1);
		FresherList.add(f2);
		printList(FresherList);
	
//		Mentor m1 = new Mentor(101,"Sumit");
//		Mentor m2 = new Mentor(202,"samera");
//		List<Mentor> mentorList = new ArrayList<Mentor>();
//		mentorList.add(m1);
//		mentorList.add(m2);
//		printList(mentorList);
		
	}
	
	// lower bounded wilcards : ? super T
		public static void printList(List<? super Student> list) {
			for(Object element:list) {
				System.out.println(element);
			}
		}

}

class Fresher {
	
}

class Student extends Fresher {
	int roll;
	String name;
	public Student(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}
	public String toString() {
		return roll + "-" + name;
	}
}



class Mentor {
	int id;
	String name;
	public Mentor(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public String toString() {
		return id + "-" + name;
	}
}

