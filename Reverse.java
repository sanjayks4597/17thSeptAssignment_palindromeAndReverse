package Problems;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter three digit number For reverse: ");
		int value=sc.nextInt();
		
		int count=0;
		int reverse=0;
		Reverse r1=new Reverse();
		count=r1.Count(value,count);
		
		if(count>=3)
		{
			while(value!=0)
			{
				int rem=value%10;
				reverse=reverse*10+rem;
				value=value/10;
				
			}
			System.out.println("Reverse of above number is: "+reverse);
		}
		else
		{
			System.out.print("Digits is less then 3..");
		}

}
	public int Count(int value,int count)
	{
		
		while(value!=0)
		{
			value=value/10;
			count++;
			
		}
		return count;
	}
}
