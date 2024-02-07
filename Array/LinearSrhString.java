class LinearSrhString
{
    public static void main(String []args)
    {   
	    String[] a={"mukesh","dinesh","omprakash","shankar","suresh","vikash"};
		int temp=0;
		String item="shankar";
		String s=String.valueOf(i);
	    for(int i=0;i<a.length;i++)
	    {
	        
		    if(s.equals(item))
			{
				System.out.print(" items is present "+s+" index position ");
			    temp=temp+1;
			}	
	    }
		if(temp==0)
			{
				System.out.print(" items is not present in list ");
			}
	    
	}
}