class Array1D
{
    public static void main(String []args)
    {
	    int[] a=new int[]{10,20,30,40,50,60};
  		System.out.println(a.length+" ");
		for(int i=0;i<a.length;i++)
	    {
	        System.out.print(a[i]+" ");
	    } 
        for(int no:a)
		{
			System.out.println (no);
		}		
	}	
}