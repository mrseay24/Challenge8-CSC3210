import java.util.Scanner;


public class PrintOutTF {
	public static void main(String[] args){
	// Boolean variable a, b, c must be initialize to True or False
		
	boolean  a = false;  //  initialize variable a
	boolean  b = false;  //  initialize variable b
	boolean  c = true;  //  initialize variable c



	Scanner  scan  =  new Scanner(System.in);
	
	if (a && (b || c)) {    // a And b or c = True
	  System.out.println(" True");
	}
	else
	{
	  // a, b, c = False
	   System.out.println("False");
	}
	scan.close();
}
	
}
