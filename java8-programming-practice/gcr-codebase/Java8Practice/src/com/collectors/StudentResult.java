package com.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student{
	
	String name;
	String grade;
	
	public Student(String name, String grade) {
		this.name = name;
		this.grade = grade;
	}
	
	public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }
}
public class StudentResult {

	public static void main(String[] args) {
		
		List<Student> students = Arrays.asList(
				new Student("Arya", "A"),
	            new Student("Riya", "B"),
	            new Student("Ankit", "A"),
	            new Student("Neha", "C"),
	            new Student("Rahul", "B")
	    );
		
		Map<String, List<String>> result = students.stream()
				.collect(Collectors.groupingBy(
						Student :: getGrade,
						Collectors.mapping(Student ::getName, Collectors.toList())));
		
		System.out.println(result);
	}

}
