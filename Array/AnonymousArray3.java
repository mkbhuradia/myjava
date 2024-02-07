class AnonymousArray3
{
    public static void main(String []args)
    { 
	    
		AnonymousArray3.sum(new int[][][]{{{10,20,30},{40,50},{10,50},{5,15}}});// for sum object call creat method 
    }
	static void sum(int[][][] no)//parameter use as array
	{
		int total=0;
		for(int iii[][]:no)
		{
		    for(int ii[]:no)
		    {
			    for(int i:iii)
		        {
			        total=total+i;
		        }

		    }
		}
		System.out.print("Sum is: "+total);
	}
}