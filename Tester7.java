package labass4;

import java.io.IOException;

import labass4.InputException;

public class Tester7 {

	public static void main(String[] args) {
		Exception7 exceptionEg = new Exception7();
		try 
		{
			exceptionEg.throwException();
		} 
		catch (InputException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}



//How many catch blocks have been added and why?
// Answer: 2 catch blocks have been added because two exceptions  are there and we need to handle those two exceptions 
//i.e.,InputException and IOException