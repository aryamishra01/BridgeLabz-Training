package com.jdbcpractice.jdbc_practice;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeCrud {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Connection con = null;
		Statement st = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb", "root", "Aryamishra@24");
			st = con.createStatement();

			// create a table
			String str = "create table employee(emp_id int, emp_name varchar(20), emp_dpt varchar(20), emp_salary decimal(10,2))";
			int r = st.executeUpdate(str);
			System.out.println("Rows affected " + r);

			// insert data into table
			PreparedStatement ps = con.prepareStatement(
					"INSERT INTO employee (emp_id, emp_name, emp_dpt, emp_salary) " + "VALUES (?, ?, ?, ?)");
			System.out.println("Enter the employee id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the employee name: ");
			String name = sc.nextLine();
			System.out.println("Enter the employee department: ");
			String dept = sc.nextLine();
			System.out.println("Enter the employee salary: ");
			double sal = sc.nextDouble();
			sc.nextLine();

			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, dept);
			ps.setBigDecimal(4, new BigDecimal(sal));

			int r1 = ps.executeUpdate();
			System.out.println("Total number of rows affected " + r1);

			// update records
			System.out.println("Enter the employee id to be updated: ");
			int id2 = sc.nextInt();
			PreparedStatement ps2 = con
					.prepareStatement("update employee set emp_salary = emp_salary + 5000 where emp_id = ?");
			ps2.setInt(1, id2);
			int r2 = ps2.executeUpdate();
			System.out.println("Number of rows affected " + r2);

			// delete records
			System.out.println("Enter the employee id to be removed: ");
			int id3 = sc.nextInt();
			PreparedStatement ps3 = con.prepareStatement("delete from employee where emp_id = ?");
			ps3.setInt(1, id3);
			int r3 = ps3.executeUpdate();
			System.out.println("Number of rows affected: " + r3);

			// search record
			System.out.println("Enter the name of the employee to be searched: ");
			String searchName = sc.nextLine();
			PreparedStatement ps4 = con.prepareStatement("select * from employee where emp_name = ?");
			ps4.setString(1, searchName);
			ResultSet r4 = ps4.executeQuery();
			while (r4.next()) {
				int i = r4.getInt(1);
				String en = r4.getString(2);
				String ed = r4.getString(3);
				BigDecimal d = r4.getBigDecimal(4);
				System.out
						.println("Emp Name: " + en + " Emp ID: " + i + " Emp Department: " + ed + " Emp Salary: " + d);
			}

		} catch (SQLException e) {
			System.out.println(e.toString());
		} finally {
			if (con != null) {
				try {
					con.close();
					System.out.println("Connection Closed!!");
				} catch (SQLException e) {
					System.out.println(e.toString());
				}
			}
		}
	}
}
