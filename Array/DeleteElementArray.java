import java.util.Scanner;
class DeleteElementArray
{ 
	
    public static void main(String []args) 
	{   Scanner s=new Scanner(System.in);
	    System.out.println("Enter index number you want to delete element");
	    int delete= s.nextInt();
	    int []a={1,8,9,4,5};
		int [] b=new int [a.length];
		int temp=0;
		if(delete<a.length)
		{
		for( int i=0; i<a.length-1;i++)
		{
			if( delete<=i)
			{
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				
			
			}
			System.out.print(a[i]+"  ");
			b[i]=a[i];
		}
		}
		else
		{
			System.out.println("index is out of Bound");
		
	
	     }
		 for(int no:b)
		 {
			 System.out.print(no+" ");
		 }
		 
	
	
    }
}