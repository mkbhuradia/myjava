class Array3D
{
    public static void main(String []args)
    {
	    int[][][] a=new int[][][]{{{10,20},{30,40,50,60},{70,80,90}},{{100,110},{120,130,140}}};
		System.out.println(a.length+" ");
		System.out.println(a[0].length+" ");
		System.out.println(a[1].length+" ");
		System.out.println(a[0][0].length+" ");
		System.out.println(a[0][1].length+" ");
		System.out.println(a[0][2].length+" ");
		System.out.println(a[1][0].length+" ");
		System.out.println(a[1][1].length+" ");
		
		for(int i=0;i<a.length;i++)
	    {
		    for(int j=0;j<a[i].length;j++)
	        {
				for(int k=0;k<a[i][j].length;k++)
	                {
	                    System.out.print(a[i][j][k]+" ");
	                }
					System.out.println();
	        }
			System.out.println();
        }			
	}	
}