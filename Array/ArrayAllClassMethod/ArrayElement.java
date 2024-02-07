import java.util.Scanner;
class Sum
{
	int size;
	Scanner aa=new Scanner(System.in);
	System.out.println("Enter Array length");
	size= aa.nextInt();
	int [][]a=new int[size][size];
	int [][]b=new int[size][size];
	int [][]c=new int[size][size];
	int [][]a=new int[size][size];
	int [][]b=new int[size][size];
	int [][]c=new int[size][size];
	void getdata()
	{
		for(int i=0;i<size;i++)
		{
			System.out.println(i+" index position enter Element ");
			a[i] =aa.nextInt();
		}
        for(int i=0;i<size;i++)
		{
			System.out.println(i+" index position enter Element ");
			b[i] =aa.nextInt();
		}
        for(int i=0;i<size;i++)
		{
			System.out.println(i+" index position enter Element ");
			b[i] =aa.nextInt();
		}		
	}	
	void swapElement()
	{
			
	}
	void display()
	{
	    
	}
}
class ArrayElement
{
	public static void main(String []args)
	{
		Sum bb=new Sum();
		bb.getdata();
		bb.swapElement();
		bb.display();
	}
}
