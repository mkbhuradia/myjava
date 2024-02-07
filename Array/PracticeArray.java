class PracticeArray
{
    public static void main(String []args)
    {   
	    int[] a={6,5,7,9,12,9,6,9};
	    int insert=12;
		int position=2;
		for(int i=0;i<a.length;i++)
	    {
			for(int j=i+1;j<a.length;j++)
			{
				
				if(a[i]==a[j] && i!=j)
				{
					System.out.print("  "+a[i]+" ");
				}					
			}
		}
		System.out.println();
		for(int i=0;i<a.length;i++)
			    {
					System.out.print("  "+a[i]+" ");
		        }
	   
	}
}


