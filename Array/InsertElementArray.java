import java.util.Scanner;
class InsertElementArray
{ 
    public static void main(String []args) 
	{   Scanner s=new Scanner(System.in);
	    System.out.println("Enter index number you want to insert element");
	    int insertindex= s.nextInt();
		System.out.println("Enter insert element");
	    int insertelement= s.nextInt();
	    int []a={1,8,9,4,5};
		int [] b=new int [a.length];
		if(insertindex<a.length)
		{
		    for( int i=0; i<a.length;i++)
		    {
				a[insertindex]=insertelement;
			    System.out.print(a[i]+"  ");
			    b[i]=a[i];
		    }
		}
		else
		{
			System.out.println("index is out of Bound");
	    }
		 
		System.out.println("");
		for(int no:b)
		{
			 System.out.print(no+" ");
		}
    }
}