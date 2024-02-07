import java.util.Scanner;
class AnonymousArray1
{
    public static void main(String []args)
    { 
	    
		AnonymousArray1.sum(new int[]{10,20,30});// for sum object call creat method 
    }
	static void sum(int[] no)//parameter use as array
	{
		int total=0;
		for(int i:no)
		{
			total=total+i;
		}
		System.out.print("Sum is: "+total);
	}
}
	
	