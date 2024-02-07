import java.util.Scanner;
class BubbleSortArray
{
	int [] x={8,6,7,1,3,9,4,5};
	int temp=0;
    public static void main (String []args)
	{
		A obj=new A();
		obj.sort();
		obj.display();
	}
	void sort()
	{
	 	for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x.length-1-i;j++)
			{ 	
		        if(x[j]>x[j+1])
			    {
			        temp=x[j];
					x[j]=x[j+1];
					x[j+1]=temp;
				}	
			} 
		}
	}
    void display()
	{
		for(int k:x)
		{
		    System.out.print(k+" ");
		}
		System.out.println();   
        System.out.println("task complete");		
	} 
}