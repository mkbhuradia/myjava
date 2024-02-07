import java.util.Scanner;
class Calculator
{
    public static void main (String []args)
	{
		int no=5;
		do
		{
			Scanner sc=new Scanner(System.in);
			String []str={"Add Number","Sub Number","Multiply Number","Divide","Mod Number","Power Number","Area Ractangle","Area Square","Area Triangle","Area Parallelogram","Area Ractangle","Area Square","perimeter of Rectangle","Perimeter of Square","Perimeter of Triangle"};
			for(int i=0;i<str.length;i++)
			{
				System.out.println(str[i]+"-"+i);
			}
			int number=sc.nextInt();
			switch(number)
			{
				case 1:
				int sum=0;
				System.out.println("How many Number you want Add ");
				int Add=sc.nextInt();
				int []add=new int[Add];
				for(int i=0;i<Add;i++)
				{   System.out.println("Enter "+i+" Number");
			        int num=sc.nextInt();
			        add[i]=num;
					System.out.println(num+" ");
			    }
				for(int i:add)
				{sum=sum+i;}
                System.out.println("Your result is: "+sum);	
                case 2:
				int minus;
				System.out.println("How many Number you want Substrct ");
				int Sub=sc.nextInt();
				int []sub=new int[Sub];
				for(int i=0;i<Sub;i++)
				{   System.out.println("Enter "+i+" Number");
			        int num=sc.nextInt();
			        sub[i]=num;
			    }
				for( int j=0;j<sub.length;j++)
				{
					minus=sub[i]; 
				    minus=minus-sub[j];	
			    }
                System.out.println("Your result is: "+minus);
                				
			}	
		}
		while(no>0);   		
	}
}