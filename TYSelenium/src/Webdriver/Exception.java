package Webdriver;

public class Exception 
{
 public static void main(String []args)
 {
	 try
	 {
		 int i=1/0;
	 }
	 catch(ArithmeticException e)
	 {
		 System.out.println("handled");
	 }
	 catch(RuntimeException r)
	 {
		 System.out.println("handle");
	 }
//	 catch(Exception a)
//	 {
//		 System.out.println("hand");
//	 }
 }
}
