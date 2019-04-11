package com.youbaoplus.tee;

public class CloneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Employee employee =null;
			employee.setName("dusugang");
			employee.setHirDay(2016, 5, 23);
			employee.setSalary(10000);
			Employee clone = (Employee) employee.clone();
			clone.raiseSalary(1000);
			clone.setHirDay(2011, 10, 23);
			
			System.out.println(employee);
			System.out.println(clone);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}
}
