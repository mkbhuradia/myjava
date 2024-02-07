import java.util.Scanner;
class DuplicateElementArray
{ 
    public static void main(String []args) 
	{  
	    int []a={5,6,8,9,2,7,3,6};
		int duplicate=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					duplicate=a[i]; 	
				}
			}
		}
		System.out.print(duplicate);
	}	

}