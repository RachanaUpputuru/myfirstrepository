package com.mph.view;
import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

import com.mph.controller.EmployeeController;
import com.mph.controller.EmployeeInterface;
import com.mph.model.Manager;

public class myclass1 {

	public static void main(String[] args) throws Exception {

		EmployeeInterface ec = new EmployeeController();
		List elist =null;
		

		Scanner sc = new Scanner(System.in);
		
		
		
		try{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String un,pw;
			System.out.println("Enter UserName");
			un=br.readLine();
			System.out.println("Enter Password");
			pw =br.readLine();
			if(un.equals("var")&&pw.equals("var"))
			{
				System.out.println("Welcome " );
				
				String input = null;
				
				do {
					System.out.println("Enter Choice");
					System.out.println("1. Add Employee");
					System.out.println("2. View Employee");
					System.out.println("3. Give Dept");
					System.out.println("4. View All");
					System.out.println("5. Sort Employee According to name");
					System.out.println("6. Show");
					int choice = sc.nextInt();
					switch (choice) {
					case 1: {
						elist=ec.addEmployee();
						break;
					}

					case 2: {
						ec.viewEmployee(elist);
						break;
					}
					case 3: {
						ec.addManager();
						break;
					}
					case 4: {
						ec.viewManager();
						break;
					}
					case 5: {
						ec.sortEmp();
						break;
					}
					
					case 6: {
						ec.viewEmployee(elist);
						break;
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
			else
			{
				System.out.println("User not found...Enter correct credentials" );
			}

			
			}
			finally{
				System.exit(0);
			}
		
		
		
	}
		
		
			
}