class SelectionSort
{
    public static void main(String []args)
    {   int temp=0;
	    int min;
	    int[] a={38,52,9,18,6,62,13};
	    for(int i=0;i<a.length;i++)
	    {
		     min=i;
		    
		    for(int j=i+1;j<a.length;j++)
		    {
			    if(a[j]<a[min])
			    {
				    min=j;
			    }
				
				temp=a[i];
				a[i]=a[min];
				a[min]=temp;
				for(int k=0;k<a.length;k++)
	            {
	                System.out.print(a[k]+" ");
	            }
				System.out.println();
		    }
	    }
	}
}
/* Debug
 i    j     min    if                         min   swap             array
 0    1      0    a[1]<a[0]=52<38 false        0   a[0]=a[0]     38,52,9,18,6,62,13
      2      0    a[2]<a[0]=9<38  true         2   a[0]=a[2]     9 ,52,38,18,6,62,13
	  3      2    a[3]<a[0]=18<9  false        2   a[0]=a[2]     18,52,38,9,6,62,13
	  4      2    a[4]<a[0]=6<38  true         4   a[0]=a[4]     6,52,38,9,18,62,13
	  5      4    a[5]<a[0]=62<6  false        4   a[0]=a[4]     18,52,38,9,6,62,13
	  6      4    a[6]<a[0]=13<6  false        4   a[0]=a[4]     6, 52,38,9,18,62,13  
	  
	  */