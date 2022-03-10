package org.cts;

public class Employee {
	public void details() {
		String name= "rajesh";
		int Id = 1234;
		char gender = 'M';
float salary = 15000.12f;
		long phn = 7876543213l;
		String city = "adyar,chennai";
				
			System.out.println();
	
		System.out.println(name);
		System.out.println(Id);
		System.out.println(gender);
		System.out.println(salary);
		System.out.println(phn);
		System.out.println(city);
		

}
	public static void main(String[] args) {
		Employee d = new Employee();
		d.details();
	}
}