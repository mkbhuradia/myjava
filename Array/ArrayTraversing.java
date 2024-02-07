class ArrayTraversing
{
	public static void main(String []args)
	{
	int []a={8,6,9,4,5,2,7};
	//traversing by for loop
	System.out.println("traversing by for loop");
	for(int i=0;i<a.length;i++)
	System.out.print(a[i]+" ");
	//Traversing by for each loop
	System.out.println();
	System.out.println("Traversing by for each loop");
	for(int i:a)
	System.out.print(i+" ");
    System.out.println();
	System.out.println("Traversing by for while loop");
	//Traversing by for while loop
	int index=0;
	while(index<a.length)
	{	System.out.print(a[index]+" ");
	    index++;
	}
	}
	
}