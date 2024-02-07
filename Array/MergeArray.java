import java.util.Scanner;
class MergeArray
{ 
    public static void main(String []args) 
	{  
	    int []a={5,6,8,9,2,7,3,6};
		int []b={2,3,6,4};
		int []c=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[a.length+i]=b[i];
		}
		for(int no:c)
		{
			System.out.print(no+" ");
		}
	}

}