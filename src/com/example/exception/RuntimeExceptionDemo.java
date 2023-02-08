package com.example.exception;

public class RuntimeExceptionDemo {

	public static void main(String[] args) {

		// RuntimeExceptions sono unchecked exception (si possono non gestire)

		int a = 100;

		int b = 0;

		//try {
		System.out.println( a / b );
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}

}
