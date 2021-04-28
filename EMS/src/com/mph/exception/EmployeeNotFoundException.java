package com.mph.exception;
import java.io.*;

public class EmployeeNotFoundException extends Exception {
	
	 @Override
	 public String toString() {
		 return "pls check the credentials";
		 
	 }
	 public EmployeeNotFoundException() {
		 System.out.println("From Employee Not Found Exception");
	 }


}
