package com.mph.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.mph.dao.EmployeeDao;
import com.mph.model.Employee;
import com.mph.model.Salary;

public class EmployeeController implements EmployeeInterface {
	Employee emp;
	Salary sal;
	List<Employee> emplist = new ArrayList<Employee>();
	EmployeeDao empdao = new EmployeeDao();
	
	public List addEmployee()
	{
		emp = new Employee();
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the Eid");
		int eno = sc.nextInt();
		emp.setEid(eno);
		System.out.println("Enter the Ename ");
		String enam = sc.next();
		emp.setEname(enam);
		
		sal= new Salary();
		
		System.out.println("Enter basic Salary");
		int basic = sc.nextInt();
		sal.setBasic(basic);
		System.out.println("Enter DA");
		int da = sc.nextInt();
		sal.setDa(da);
		System.out.println("Enter HRA");
		int hra = sc.nextInt();
		sal.setHra(hra);
		System.out.println("Enter PF");
		int pf= sc.nextInt();
		sal.setPf(pf);
		
		sal.setGross(basic, da, hra);
		sal.setNet(sal.getGross(),pf);
		emp.setSalary(sal);
		
		//emplist.add(emp);
		empdao.insertEmp(emp);
		
		//System.out.println(emp.getEid() + " " + emp.getEname());	
		System.out.println("Employee "  + eno + "Succesfully added");
		return emplist;
	}
	
	public void viewEmployee(List elist)
	{
		/*Iterator i= elist.iterator();

		while(i.hasNext())
		{
			System.out.println(i.next());
		}*/
		
		empdao.viewEmp();
		
	}
	public void insertUsingProc ()
	{
		Employee e = new Employee();
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the Eid");
		int eno = sc.nextInt();
		e.setEid(eno);
		System.out.println("Enter the Ename ");
		String enam = sc.next();
		e.setEname(enam);
		
		empdao.insertUsingProcedure(e);
	}
	
	

	@Override
	public void viewEmployee(int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sortEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nameStart() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Serial() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Deserial() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deSerializeList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serializeList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getNamesStartingWithA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sortEmpNames(int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addEmployee(int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rsmd() {
		// TODO Auto-generated method stub
		empdao.rsmd();
	}

	@Override
	public void type_forward_only_rs() {
		// TODO Auto-generated method stub
		empdao.type_forward_only_rs();
	}

	@Override
	public void type_scroll_insensitive_rs() {
		// TODO Auto-generated method stub
		empdao.type_scroll_insensitive_rs();
	}

	@Override
	public void type_scroll_sensitive_rs_insert() {
		// TODO Auto-generated method stub
		empdao.type_scroll_sensitive_rs_insert();
		
	}
	
	
}