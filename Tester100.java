package labass4;
import java.util.*;

public class Tester100 
{
      public static void main(String[] args)
      {
    	  try
    	  {
    		  Scanner sc=new Scanner(System.in);
    		  System.out.println("Please enter a number");
    		  int n=sc.nextInt();
    		  try 
    		  {
    			      if(n>100)
    			      {
    				       throw new InputException("Number can't be greater than 100");
    			      }
    		  }
    		  catch(InputException e)
    		  {
    			  System.out.println(e.getMessage());
    		  }
    	  }finally
    	  {
    		  System.out.println("Exception Caught finally");
    	  }
    	  
      }
     
}

