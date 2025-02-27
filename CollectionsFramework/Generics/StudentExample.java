package Generics;

public class StudentExample {

	public static void main(String[] args) {
		Student st = new Student(1,"Deepak");
		System.out.println(st); //st.toString()
		
		Student st2 = new Student(1,"Deepika");
		System.out.println(st2); //st.toString()

	}

}


class Student {
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
