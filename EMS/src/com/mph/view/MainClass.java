package com.mph.view;

import java.util.List;
import java.util.Scanner;

import com.mph.controller.EmployeeController;
import com.mph.controller.EmployeeInterface;
import com.mph.model.Employee;

public class MainClass {

	public static void main(String[] args) {

		EmployeeInterface ec = new EmployeeController();
		List<Employee> elist = null;
		Scanner sc = new Scanner(System.in);

		String input = null;
		do {
			System.out.println("Enter your Choice");
			System.out.println("1. Add Employee");
			System.out.println("2. View Employee");
			System.out.println("3. Procedure Insert");
			System.out.println("4. Get ResultSet MetaData Info ");
			System.out.println("5. RS Forward Only");
			System.out.println("6. RS scroll insensitive");
			System.out.println("7. RS scroll sensitive");
			
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				elist = ec.addEmployee();
				break;
			}

			case 2: {
				ec.viewEmployee(elist);
				break;
			}
			case 3: {
				ec.insertUsingProc();
			}
			case 4: {
				ec.rsmd();
			}
			case 5: {
				ec.type_forward_only_rs();
			}
			case 6: {
				ec.type_scroll_insensitive_rs();
			}
			case 7: {
				ec.type_scroll_sensitive_rs_insert();
			}
			case 8: {

			}
			case 9: {

			}

			default: {

			}

			}
			System.out.println("Do you want to continue ? Y or y for yes");
			input = sc.next();
		} while (input.equals("Y") || input.equals("y"));
		System.out.println("System Exited..Thanks for using our system !!!");
		System.exit(0);
	}
}