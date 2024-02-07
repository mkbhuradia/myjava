class ScondLargestElement
{
    public static void main(String []args)
    {   
	    int[] a={6,5,7,9,12,28,16,17,19,20,4,};
	    int temp;
		for(int i=0;i<a.length;i++)
	    {
	
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
		    {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
		    }
			}
			
	    }
	        System.out.print("maximum element is "+min);
	   
	}
}