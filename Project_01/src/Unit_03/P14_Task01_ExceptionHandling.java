package Unit_03;

import java.io.IOException;
import java.util.Scanner;

public class P14_Task01_ExceptionHandling {

	public void basicException()
	{
		int a = 0;
		int b = 100/a;
		System.out.println(a);
		System.out.println("Test Statement Executed");
	}
	
//	Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at Unit_02.P14_Task01_ExceptionHandling.basicException(P14_Task01_ExceptionHandling.java:10)
//	at Unit_02.P14_Task01_ExceptionHandling.main(P14_Task01_ExceptionHandling.java:98)
	
	public void handledException()
	{
		int a;
		try {
			a = 100/0;
		}
		catch(ArithmeticException e)
		{
			a = 100;
			System.out.println("Cannot Divide By Zero");
		}
		System.out.println("Test Statement Executed");
	}
	
	public void multipleCatch()
	{
		try
		{    
            int a[]=new int[5];    
            a[5]=30/0;
		}    
		catch(ArithmeticException e)  
		{  
			System.out.println("Arithmetic Exception.");  
		}
		catch(ArrayIndexOutOfBoundsException e)
		{  
			System.out.println("ArrayIndexOutOfBounds Exception.");
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled.");
		}   
		System.out.println("Test Statement Executed");
	}
	
	public void typeMismatch()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Integer: ");
		try
		{
			int a = sc.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled");
		}
		System.out.println("Test Statement Executed");
	}
	
	public void stackOverflow()
	{
		int a = 1;
		try
		{
			while(a>0)
			{
				System.out.println("a");
			}
		}
		catch(Exception e)
		{
			System.out.println("Stack Overflow Exception.");
		}
		System.out.println("Test Statement Executed");
	}
	
	public void outOfBoundsException()
	{
		String s = "Aryan";
		try
		{
			char ch = s.charAt(45);
		}
		catch(Exception e)
		{
			System.out.println("Index Out Of Bounds Exception.");
		}
	}
	
	public void nullPointerException()
	{
		String s = null;
		System.out.println(s.length());
	}

	
	void useOfThrow(int age) throws Exception, ArithmeticException, IOException {

		if (age < 18) {
			throw new Exception();
		} else {
			System.out.println("You are allowed to enter");
		}

	}

	/*
	 * Sometime you don't need to handle the Exception When in multi chain calling
	 * is there, then it can be handled by the supper most method then inner methods
	 * need not to handle it there
	 */
	void useOfThrows_And_Finally() {

		try {
			useOfThrow(17);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	void checkedAndUncheckedException() {

		/*
		 * Unchecked Exception: Run time catching - Here we are dividing by 0 - which
		 * will not be caught at compile time - as there is no mistake but caught at
		 * runtime - because it is mathematically incorrect
		 */
		int x = 0;
		int y = 10;
		int z = y / x;

		System.out.println(z);

		// Checked Exception [Run this code over terminal and check compiler error]
		try {
			useOfThrow(19);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	public static void main(String[] args) {
		P14_Task01_ExceptionHandling obj = new P14_Task01_ExceptionHandling();
		obj.basicException();
		obj.handledException();
		obj.multipleCatch();
		obj.typeMismatch();
		obj.stackOverflow();
		obj.outOfBoundsException();
		obj.nullPointerException();
		obj.useOfThrows_And_Finally();
		obj.checkedAndUncheckedException();
	}

}