package com.sample4.com.sample4;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int i = 10;
    	
    	if(i >= 10) {
            System.out.println( "Hello World!" );
    	}
    	else {
    		System.out.println("hello XXXx");
    	}
    
    	Student obj = new Student(10, "john");
    	System.out.println(obj.getStudentId());
    }
}
