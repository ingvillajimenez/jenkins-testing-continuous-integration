package com.sample5.com.sample5;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String data=null; // bug: data is initialize with null
        System.out.println( "Hello World!" + data.toUpperCase() );
        System.out.println(10/0); // bug: number divided by zero
    }
}
