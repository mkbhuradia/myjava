class ReverseElement
{
    public static void main(String []args)
    {
	    int[][] a=new int[][]{{10,20,30},{40,50,60},{70,80,90};
		int[][] b=new int[3][3];
		int size=a.length;
		int sizeb=a.length;
		
		for(int i=0;i<size;i++)
	    {
		    for(int j=0;j<sizeb;j++)
	        {
	           b[i][j]=a[j][i];
	        }
        }			
		for(int i=0;i<b.length;i++)
	    {
			for(int j=0;j<b.length;j++)
			{
	        System.out.print(b[i][j]+" ");
			}
        }	
		System.out.println();
    }
}
/*
int [][]transpose=new int [matrix.length][matrix[0].length];
int size =magtrix.length;
int sizeb=matrix[0].length;
for(int i=0;i<size;i++)
{
	for(int j=0;j<sizeb;j++)
	{
		transpose[i][j]=matrix[j][i];
	}
	System.out.println();
	
}
//matrix without transpos
for(int[] l: matrix)
{
	for(int x:l)
	{	
	    System.out.print(x+" ");
	}
	System.out.println();
}
for(int[] m:transpos)
{
	




*/
	
	
	