import java.util.Scanner;
class A
{
	public static void main(String []args)
	{	
		int no=5;
	
		Scanner sc=new Scanner(System.in);
		String []choose={"java","uiux","database"};
		System.out.println("java,uiux,database");
        String Choose=sc.nextLine();	
		String []vertical={"java asi","java hc","uiux asi","uiux hc","database si","database hc"};
		
		String [][][]str={{{"mukesh","dinesh","omprakash","Shankar","Ravishankar"},{"mukesh yadav","Dharmsingh","mahesh","rakesh","kailash","anmol"}},{{"vikash","Rajendra kohli"},{"suresh","Ashok"}},{{"suresh chand","Ratan","kuldeep"},{"suresh sharma","sonu"}} };
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<str[i].length;j++)
			{
			    for(int k=0;k<str[i][j].length;k++)
				{	
					
					if(Choose.equals(choose[0]))
					{
						
					    if((name.equals(vertical[0]))&& (i==0 && j==0))
					    {
							System.out.println(str[i][j][k]);							
					    }
					    if((name.equals(vertical[1])) && (i==0 && j==1))
					    {
						    System.out.println(str[i][j][k]);   
					    }
					}
					else if(Choose.equals(choose[1]))
                    {	
                        if ((name.equals(vertical[2]))&& (i==1&& j==0))
					    {
						    System.out.println(str[i][j][k]);	
					    }
					    if ((name.equals(vertical[3]))&& (i==1&& j==1))
					    {
						    System.out.println(str[i][j][k]);
					    }				
		                
				    }
					else if(Choose.equals(choose[2]))
					{
                        if ((name.equals(vertical[4]))&& (i==2&& j==0))
					    {
						    System.out.println(str[i][j][k]);	
					    }
					    if ((name.equals(vertical[5]))&& (i==2&& j==1))
					    {
						    System.out.println(str[i][j][k]);
					    }
						
					}
					else
					{
						System.out.println("Entry Succesfully");
					}
				}
			}
        }
		
        if(Choose.equals(choose[0]))
        {
	
            System.out.println("Enter java asi/java hc ");
            String Employee=sc.nextLine();
			
            if(Employee.equals(str[0][0][0]))
		    {
		        String []mukesh={"Name-mukesh kumar bhuradia","Father's Name-Let Bhagwan Sahay","Mother's Name-Smt. Soni devi","Spouse Name-Menka Bhuradia","Address-A-24,Triveni Nagar,Rajawas,Jaipur(Raj.)","Mobile Number-7976561626","Email Address-mkbhuradia07@gmail.com","Facebook Id-mkbhuradia"};
		        for(String m:mukesh)
			    {
				    System.out.println(m);
			    }
		    }
		    if(Employee.equals(str[0][0][1]))
		    {
			    String []dinesh={"Name-dinesh kumar meena","Father's Name--------","Mother's Name--------","Spouse Name-------","Address-Upper subordinate Quater No.-36 RPL(wireless),Ghatgate,Jaipur(Raj.)","Mobile Number-0000000000++","Email Address----------","Facebook Id---------"};
		        for(String d:dinesh)
			    {
			        System.out.println(d);
			    }
		    }
						/*System.out.println("Enter Name if You Know Details ");
		                String Employee=sc.nextLine();
						
						System.out.println("Enter Choose java asi/java hc");
						String name=sc.nextLine();
						if(Employee.equals(str[0][1][0]))
		                {
		                    String []vikash={"Name-vikash kumar meena","Father's Name--------","Mother's Name--------","Spouse Name-------","Address-Upper subordinate Quater No.-36 RPL(wireless),Ghatgate,Jaipur(Raj.)","Mobile Number-0000000000++","Email Address----------","Facebook Id---------"};
		                    for(String d:vikash)
			                {
                                System.out.println(d);
			                }
		                }
		                if(Employee.equals(str[0][1][1]))
		                {
			                String []kohli={"Name-Rajendra kohli","Father's Name--------","Mother's Name--------","Spouse Name-------","Address-Upper subordinate Quater No.-36 RPL(wireless),Ghatgate,Jaipur(Raj.)","Mobile Number-0000000000++","Email Address----------","Facebook Id---------"};
		                    for(String d:kohli)
			                {
			                    System.out.println(d);
			                }
		                }*/
        		
	}
}
}