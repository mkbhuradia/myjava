import java.util.Scanner;
class SortSearchArray
{
	int [] x={8,6,7,1,3,9,4,5};
	int li=0;
	int hi=x.length-1;
	int mi=li+hi/2;
	int index=0;
	int searchelement;
	int temp=0;
	int srh;
    public static void main (String []args)
	{
		A obj=new A();
		obj.sort();
		obj.getdata();
		obj.search();
		obj.display();
	}
	void sort()
	{
	 	for(int i=0;i<x.length;i++)
		{
			for(int j=i+1;j<x.length;j++)
			{ 	
		        if(x[i]>x[j])
			    {
			        temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}	
			} 
		}
	}
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter search element");
		srh=sc.nextInt();
	}
	void search()
	{
		
		for(int i=0;i<x.length;i++)
		{
			if(x[mi]==srh)
			{
				index=mi;
				searchelement=x[mi];
				
			
		    }
			else if(x[mi]<srh)
			{
				li=mi+1;   
			}				
		    else
		    {
		       hi=mi-1; 
		    }
			mi=li+hi/2;    
		}	
	}
    void display()
	{
		for(int k:x)
		{
		    System.out.print(k+" ");
		}
		System.out.println();  
        System.out.println(searchelement+" is "+index+" position");  
        System.out.println("task complete");		
	} 
}