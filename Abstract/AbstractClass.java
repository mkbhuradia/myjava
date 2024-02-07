abstract class A//object is not creat this class
{ 
    int x,y;
	void f1()
	{
		System.out.println("mukesh");
		
	}
		
}
class AbstractClass extends A //Now Object creat and Access class A
{
	public static void main(String []args)
	{
		A a1=new A();
		a1.f1();//output-mukesh	
	}
	
}