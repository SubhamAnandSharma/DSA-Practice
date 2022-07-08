package com.masai.day9.q3;


public class Person {

	String name;
	String gender;
	Address address;
	
//	@Override
//	public String toString() {
//		return "Person [name=" + name + ", gender=" + gender + "]";
//	}
	
}

class Address {
	String city;
	String state;
	String pincode;
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	
}

class Instructor extends Person{
	int instructorId;
	int salary;
	
	@Override
	public String toString() {
		return " Name=" + name + ", gender=" + gender + ", address=" + address + "]" + "Instructor [instructorId=" + instructorId + ", salary=" + salary + "]" ;
	}
	
	
}

class Student extends Person{
	int studentId;
	String courseEnrolled;
	int courseFee;
	
	@Override
	public String toString() {
		return " Name=" + name + ", gender=" + gender + ", address=" + address +  "Student [studentId=" + studentId + ", courseEnrolled=" + courseEnrolled + ", courseFee=" + courseFee + "]";
	}
	
	
	
	
}


class Main{
	
	public static Person generatePerson(Person person) {
		
		if(person instanceof Student) {
			
			Student s1 = new Student();
			
			s1.name = "Govinda";
			s1.courseEnrolled = "JA-111";
			s1.courseFee = 300000;
			s1.gender = "Male";
			s1.studentId = 0004;
			s1.address = new Address();
			
			s1.address.city = "Siliguri";
			s1.address.state = "WB";
			s1.address.pincode = "7186101";
			
			return s1;
		}else {
			
			Instructor i1 = new Instructor();
			
			i1.name = "Ratan lal Gupta";
			i1.gender = "Male";
			i1.instructorId = 112;
			i1.salary = 4000000;
			i1.address = new Address();
			
			i1.address.city = "Kolkata";
			i1.address.state = "WB";
			i1.address.pincode = "7180111";
			
			return i1;
			
		}
				
	}
	
	public static void main(String[] args) {
		
		Person newStudent = generatePerson(new Student());

		Person newTeacher = generatePerson(new Instructor());
		
		
		System.out.println(newStudent.toString());
		
		System.out.println("==================================");

		System.out.println(newTeacher.toString());

	}
}










