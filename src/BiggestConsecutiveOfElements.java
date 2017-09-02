import java.util.Arrays;
import java.util.Scanner;
public class BiggestConsecutiveOfElements {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		int count = 1;
		int maxCount = 1;
		char[] inputArray = new char[input.length()];
		inputArray = input.toCharArray();
		
		for(int i =0; i< inputArray.length -1;i++)
		{
			if(inputArray[i] == inputArray[i+1])
			{
				count++;
			}
			
			else {
				count=1;
			}
			if(count>maxCount) maxCount = count;
		}
		
		System.out.println(maxCount);
	}
}
