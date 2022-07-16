package great_learning;
import java.util.Scanner;

public class patternPrinting {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		printPattern(n);

	}
	public static void printPattern(int n)
	{
		int count=0;
		int l=0;
		int c=0;
		for(int i=0;i<n;i++)
		{
			count=n-i;
			l=n;
			for(int j=0;j<n;j++)
			{
				c=count;
				while(c>0)
				{
					System.out.print(l);
					c--;
				}
				l--;
			}
			System.out.println();
		}
	}

}
