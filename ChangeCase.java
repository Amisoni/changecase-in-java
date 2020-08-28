import java.util.*;
class ChangeCase
{
	public static void main(String args[])
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter Any String that you want to check and Convert");
		String name=sc1.nextLine();
		String returnString;
		returnString=ChangeCase.CheckString(name);
		
		if(returnString=="upper")
		{
			
			System.out.println("Entered String is in UpperCase\n");
			System.out.println("Here is Converted String..."+name.toLowerCase());
		}
		else if(returnString=="lower")
		{
			System.out.println("Entered String is in LowerCase\n");
			System.out.println("Here is Uppercase String..."+name.toUpperCase());
		}
		else
		{
			System.out.println("You have entered mixed String..Please Enter Either Upper or Lowercase");
		}
		
	}
	public static String CheckString(String name)
	{
		if(name.equals(name.toUpperCase()))
		{	
			return "upper";
		}
		else if(name.equals(name.toLowerCase()))
		{
			return "lower";
		}
		else
		{
			return "mixed";
		}
		
	}	
	
}