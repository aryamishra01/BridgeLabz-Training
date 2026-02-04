package com.streamslogical1;

import java.util.Comparator;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + salary;
    }
}


public class EmployeeWithHighestSalary {

	public static void main(String[] args) {
		
		List<Employee> employees = List.of(
				new Employee(1, "A", 50000),
                new Employee(2, "B", 70000),
                new Employee(3, "C", 60000));
		
		Employee highestPaid = employees.stream()
										.max(Comparator.comparingDouble(Employee :: getSalary))
										.orElse(null);
		
		System.out.println(highestPaid);
	}

}
