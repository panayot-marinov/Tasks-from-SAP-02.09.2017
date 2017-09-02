import java.util.*;

public class CountOfNumbers {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String[] inputNumbers = scan.nextLine().split(" ");
		scan.close();
		
		for(int i =0; i< inputNumbers.length-1;i++)
		{
			int currentCount =1;
			String currentNumber= inputNumbers[i];
			if(currentNumber.equals(""))
			{
				continue;	
			}
			
			for(int j = i+1; j < inputNumbers.length; j++)
			{
				if(inputNumbers[j].equals(currentNumber))
				{
					currentCount++;
					inputNumbers[j] = "";
				}
			}
			
			boolean allNextEmpty = true;
			
			for(int j = i+1; j < inputNumbers.length; j++)
			{
				if(!inputNumbers[j].equals(""))
				{
					allNextEmpty = false;
					break;
				}
			}
			
			if(i == inputNumbers.length - 1 || allNextEmpty)
			{
				System.out.printf("%s %d", currentNumber, currentCount);
				System.out.println();
			}
			else
			{	
				System.out.printf("%s %d ", currentNumber, currentCount);
			}
		}
		
	}
}
