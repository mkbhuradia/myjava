import java.util.Scanner;
class ReverseArray
{ 
    public static void main(String []args) 
	{  
	    int []a={5,6,7,8,9,10};
		int l=a.length;
		int n=l/2;
		int temp=0;
		for(int i=0;i<n;i++)
		{
			temp=a[i];
            a[i]=a[l-1-i];	
            a[l-1-i]=temp;				
		}
		System.out.println( );
		for(int no:a)
		{
			System.out.print(no+"  ");
		}	
	} 

		
}
