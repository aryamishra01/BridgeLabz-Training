package com.employeesystem;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeSystem {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees you want to add ? ");
        int n = sc.nextInt();
        sc.nextLine();

        int count = 0;
        while (count < n) {

            System.out.println("\n*** Enter Employee Details ***");

            System.out.print("Id : ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name : ");
            String name = sc.nextLine();

            System.out.print("Age : ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Gender : ");
            String gender = sc.nextLine();

            System.out.print("Department : ");
            String department = sc.nextLine();

            System.out.print("Year Of Joining : ");
            int year = sc.nextInt();
            sc.nextLine();

            System.out.print("Salary : ");
            double salary = sc.nextDouble();
            sc.nextLine();

            employees.add(new Employee(id, name, age, gender, department, year, salary));
            count++;
        }
       
        // 1. Male and Female Count 
        long maleCount =
                employees.stream()
                    .filter(e -> e.getGender().equalsIgnoreCase("male"))
                    .count();

        long femaleCount =
                employees.stream()
                    .filter(e -> e.getGender().equalsIgnoreCase("female"))
                    .count();

        System.out.println("\nMale : " + maleCount + " Female : " + femaleCount);

        // 2. Departments
        System.out.println("\nDepartments:");
        employees.stream()
                .map(Employee::getDepartment)
                .distinct()
                .forEach(System.out::println);

        // 3. Average age by gender
        System.out.println("\nAverage age by gender:");
        System.out.println(
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getGender,
                                Collectors.averagingInt(Employee::getAge)))
        );

        // 4. Highest paid employee
        System.out.println("\nHighest paid employee:");
        System.out.println(
                employees.stream()
                        .max(Comparator.comparingDouble(Employee::getSalary))
                        .orElse(null)
        );

        // 5. Joined after 2015
        System.out.println("\nEmployees joined after 2015:");
        employees.stream()
                .filter(e -> e.getYearOfJoining() > 2015)
                .map(Employee::getName)
                .forEach(System.out::println);

        // 6. Employee count by department
        System.out.println("\nEmployee count by department:");
        System.out.println(
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.counting()))
        );

        // 7. Average salary by department
        System.out.println("\nAverage salary by department:");
        System.out.println(
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.averagingDouble(Employee::getSalary)))
        );

        // 8. Youngest male in Product Development
        System.out.println("\nYoungest male in Product Development:");
        System.out.println(
                employees.stream()
                        .filter(e -> e.getGender().equalsIgnoreCase("male"))
                        .filter(e -> e.getDepartment().equalsIgnoreCase("product development"))
                        .min(Comparator.comparingInt(Employee::getAge))
                        .orElse(null)
        );

        // 9. Most experienced employee
        System.out.println("\nMost experienced employee:");
        System.out.println(
                employees.stream()
                        .min(Comparator.comparingInt(Employee::getYearOfJoining))
                        .orElse(null)
        );

        // 10. Gender count in Sales
        System.out.println("\nGender count in Sales:");
        System.out.println(
                employees.stream()
                        .filter(e -> e.getDepartment().equalsIgnoreCase("sales"))
                        .collect(Collectors.groupingBy(
                                Employee::getGender,
                                Collectors.counting()))
        );

        // 11. Average salary by gender
        System.out.println("\nAverage salary by gender:");
        System.out.println(
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getGender,
                                Collectors.averagingDouble(Employee::getSalary)))
        );

        // 12. Employee names by department
        System.out.println("\nEmployees by department:");
        System.out.println(
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.mapping(Employee::getName, Collectors.toList())))
        );

        // 13. Average & total salary
        DoubleSummaryStatistics stats =
                employees.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("\nAverage Salary : " + stats.getAverage());
        System.out.println("Total Salary   : " + stats.getSum());

        // 14. Salary > 25k
        System.out.println("\nEmployees earning more than 25k:");
        employees.stream()
                .filter(e -> e.getSalary() > 25000)
                .forEach(System.out::println);

        // 15–21 Salary rankings
        System.out.println("\nHighest Paid:");
        employees.stream().max(Comparator.comparingDouble(Employee::getSalary)).ifPresent(System.out::println);

        System.out.println("\nSecond Highest Paid:");
        employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst().ifPresent(System.out::println);

        System.out.println("\nThird Highest Paid:");
        employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(2).findFirst().ifPresent(System.out::println);

        System.out.println("\nLowest Paid:");
        employees.stream().min(Comparator.comparingDouble(Employee::getSalary)).ifPresent(System.out::println);

        System.out.println("\nSecond Lowest Paid:");
        employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).skip(1).findFirst().ifPresent(System.out::println);

        System.out.println("\nFirst 5 Lowest Paid:");
        employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).limit(5).forEach(System.out::println);

        System.out.println("\nFirst 5 Highest Paid:");
        employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(5).forEach(System.out::println);

        sc.close();
    }
}
