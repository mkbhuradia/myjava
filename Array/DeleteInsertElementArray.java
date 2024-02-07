import java.util.Scanner;
import java.util.Arrays;
class DeleteInsertElementArray
{ 
    public static void main(String []args) 
	{  
	    Scanner obj=new Scanner(System.in);
		System.out.println("Enter Array size");
		int size=obj.nextInt();
		int []a=new int [size];
		int temp=0;
		int []b=new int[size];
		for(int i=0;i<size;i++)
		{ 
	        System.out.println("Enter "+i+" index in Array ");
			int element=obj.nextInt();
			a[i]=element; 
		}
		
	    System.out.println( );
		for(int i=0;i<size;i++)
		{ 
	        System.out.print(a[i]+"  "); 
		}
		
	    System.out.println( );
	    System.out.println("Enter index position you want Insert in Array ");
		int insert=obj.nextInt();
		System.out.println("Enter NewElement you want Insert in Array ");
        int NewElement=obj.nextInt();
		a[insert]=NewElement;
		System.out.println( );
		for(int i=0;i<size;i++)
		{ 
	        System.out.print(a[i]+"  "); 
		}
	    System.out.println( );
	    System.out.println("Enter index position you want Delete in Array ");
		int Delete=obj.nextInt();
		for(int i=0;i<size-1;i++)
		{ 
	        if(Delete<=i)
			{
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
		    }
			b[i]=a[i];
		}
	    System.out.println( );
		for(int j=0;j<size;j++)
		{ 
	        System.out.print(b[j]+"  "); 
		}	 
	}		
}
