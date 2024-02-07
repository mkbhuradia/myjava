import java.util.Scanner;
class SearchDemo
{
	int size;
	int []a;
	int srh;
	int flag=0;
	int pos;
	int temp;
	void getdata()
	{
		Scanner aa=new Scanner(System.in);
		System.out.println("Enter Array length");
		int size= aa.nextInt();
		a=new int[size];
		System.out.println("Enter Array Element");
		for(int i=0;i<size;i++)
		{
			System.out.println("  enter Element "+i +"index position");
			a[i] =aa.nextInt();
		}
		System.out.println("Enter Search Element");
        srh=aa.nextInt();		
	}	
	void searchElement()
	{
		System.out.println("Enter Search Element");
		for(int j=0;j<size;j++)
		{
			System.out.println("Enter Search Element");
			if(srh==a[j])
			{
				
				System.out.println("Enter Search Element");
				flag++;
				temp=j;
			}
		}
	}
	void display()
	{
		if(flag>0)
		{
			System.out.println("index position"+temp);
		}
	}
}	
class LinearSearch
{
	public static void main(String []args)
	{
		SearchDemo bb=new SearchDemo();
		bb.getdata();
		bb.searchElement();
		bb.display();
	}
} 
 