import java.util.Scanner;
import java.util.*;

public class UniqueElements {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		
		char[] inputArray = new char[input.length()];
		inputArray = input.toCharArray();
		
		Set<Character> set = new HashSet<Character>();
		
		for(char c : input.toCharArray())
		{
			set.add(c);
		}
		
		 String result = (set.size() != inputArray.length) ? "false" : "true";
			
		 System.out.println(result);
	}
}
