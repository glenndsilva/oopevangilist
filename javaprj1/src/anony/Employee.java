package anony;

import java.util.ArrayList;

public class Employee {
	    private String name;
	
		private Employee(String name) {
			this.name  = name;
		}
		
		public static void main(String args[]) {
			       ArrayList<Employee> emp = new ArrayList<Employee>();
			       
			       emp.add(new Employee("A"));
			       emp.add(new Employee("B"));
			       emp.add(new Employee("C"));
			       emp.add(new Employee("D"));
			       
		//	       Calculate cal = new Calculate() ;
		}
}
