class LinearSrhInt
{
    public static void main(String []args)
    {   
	    int[] a={5,3,6,1,4,2,6};
		int temp=0;
		int item=6;
	    for(int i=0;i<a.length;i++)
	    {
		    if(a[i]==item)
			{
				System.out.print(" items is present "+i+" index position ");
			    temp=temp+1;
			}
			
			
	    }
		if(item==0)
			{
				System.out.print(" items is not present in list ");
			}
	    
	}
}