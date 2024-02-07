import java.util.Scanner;
class ReverseArray
{ 
    public static void main(String []args) 
	{  
	    int []a={5,6,8,9,7,3};
		int []b=new int [a.length];
		int count=a.length-1;
		for(int i=0;i<a.length;i++)
		{
			b[count]=a[i];
			count--;
		}
		for(int no:b)
		{
			System.out.print(no+"  ");
		}	
	} 

		
}
