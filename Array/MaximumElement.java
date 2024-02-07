/* class MaximumElement
{
    public static void main(String []args)
    {   
	    int[] a={6,5,7,9,12,28,16,17,19,20,24,};
	    int max=a[0];
		for(int i=1;i<a.length;i++)
	    {
	
			if(max<a[i])
		    {
				max=a[i];
		    }
	    }
	        System.out.print("maximum element is "+max);
	   
	}
}
*/
class MaximumElement
{
    public static void main(String []args)
    {   
	    int[] a={6,5,7,9,12,28,16,17,19,20,4,};
	    int min=a[0];
		for(int i=1;i<a.length;i++)
	    {
	
			if(min>a[i])
		    {
				min=a[i];
		    }
	    }
	        System.out.print("maximum element is "+min);
	   
	}
}
