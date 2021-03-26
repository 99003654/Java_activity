import java.io.*;
class InvalidAgeException1 extends Exception
{
	InvalidAgeException1()
	{
		System.out.println("CustomException: InvalidAgeRangeException");
	}
}
public class CustomException {
	public static void main(String args[])throws InvalidAgeException1
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
		System.out.println("Enter the player name");
		String s=br.readLine();
		System.out.println("Enter the player age");
		int age=Integer.parseInt(br.readLine());
		if(age<19)
			throw new InvalidAgeException1();
		else {
			System.out.println("player name: "+s);
			System.out.println("Player age: "+age);
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
