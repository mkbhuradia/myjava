import java.util.Scanner;
class Sum
{
	int sum;
	int []a;
	void getdata()
	{
		Scanner aa=new Scanner(System.in);
		System.out.println("Enter Array length");
		int size= aa.nextInt();
		a=new int[size];
		System.out.println("Enter Array Element");
		for(int i=0;i<size;i++)
		{
			System.out.println(i+" index position enter Element ");
			a[i] =aa.nextInt();
		}			
	}	
	void sumElement()
	{
		for( int i:a)
		{
			sum=sum+i;
		}
	}
	void display()
	{
			System.out.print(sum+"  ");
	}
}
class Demo
{
	public static void main(String []args)
	{
		Sum bb=new Sum();
		bb.getdata();
		bb.sumElement();
		bb.display();
	}
}
