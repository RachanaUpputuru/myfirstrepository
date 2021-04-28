package com.mph.model;

import java.util.Comparator;

public class Employee {
	
	public static Comparator nameComparator;
	private int eid;
	private String ename;	
	
	public Employee()
	{
		System.out.println("From Emp contsr.. ");
	}
	
	public Employee(int eid2, String ename2, Salary sal) {
		// TODO Auto-generated constructor stub
	}

	public void setEid(int eid)
	{
		this.eid=eid;
	}
	
	public int getEid()
	{
		return eid;		
	}
	public void setEname(String ename)
	{
		this.ename=ename;
	}
	
	public String getEname()
	{
		return ename;		
	}
	public String toString()
	{
		return "EiD : " + eid + "   " + "Emp name : " + ename;
	}

	public void setSalary(Salary sal) {
		// TODO Auto-generated method stub
		
	}

	public static Object stream() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setDept(String dept) {
		// TODO Auto-generated method stub
		
	}

	public char[] getDept() {
		// TODO Auto-generated method stub
		return null;
	}

	public char[] getSalary() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}