class B
{
    public static void main (String []args)
	{   int sum=0;
	    int [][]a={{4,6,7},{8,10,11},{12,13,14}};
		for(int []i:a)
		{
			for(int j:i)
			{
				sum=sum+j;
			}
		}
		System.out.println(sum);
		int sum1=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				sum1=sum1+a[i][j];
			}
		}
		System.out.println(sum1);
		
	}
}