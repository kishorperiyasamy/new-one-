package org.emp;

public class testpolymorphism {
	private void employeedetails() {
		System.out.println("employee details");
		System.out.println("=================");

	}
	private void employee(int age) {
		System.out.println("employee age :" +age);
	}
		

	
		private void employeeid(long empid) {
			System.out.println("employee id :"+empid);
			

		}
		public static void main(String[] args) {
			testpolymorphism er=new testpolymorphism();
			er.employeedetails();
			er.employee(25);
			er.employeeid(3344778);
			
		}
}
	
