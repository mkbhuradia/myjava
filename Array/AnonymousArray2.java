import java.util.Scanner;
class AnonymousArray2
{
    public static void main(String []args)
    { 
	    
		AnonymousArray2.sum(new int[][]{{10,20,30},{40,50}});// for sum object call creat method 
    }
	static void sum(int[][] no1 no2)//parameter use as array
	{
		int total=0;
		for(int i[]:no1)
		{
			for(int j:no2)
		    {
			    total=total+j;
		    }

		}
		System.out.print("Sum is: "+total);
	}
}
	