class DeleteElement
{
    public static void main(String []args)
    {   
	    int[] a={6,5,7,9,12,28,16,17,19,20,4,};
	    int delete=9;
		int count=0;
		for(int i=0;i<a.length;i++)
	    {
	        if(delete==a[i])
		    {
					a[i]=a[i+1];
		    
				count=count+1;
			}
				
		}
		if(count==0)
		{
	        System.out.print("Delete element is not fount");
		}
		else
		{
			System.out.print("Delete element is Delete successfully");
		}
		for(int i=0;i<a.length;i++)
			    {
					System.out.print("  "+a[i]+" ");
		        }
	   
	}
}