abstract class A//object is not creat this class
{ 
    int x,y;
	void f1()
	{
		x=5;
		y=2;
	}
	abstract void f2();//No Creat body and if method is abstract then class is compulsary make abstract
		
}
class B extends A
{
	int z;
	void f3()
	{
		z=8;
	}
	void f2()//Do method overiding because-abstract method came by parent class A and if method is abstract then class is compulsary make abstract and if class is abstract then No creat object
	{
		System.out.println("mukesh");
	}
}
class AbstractMethod  //Now Object creat and Access class A and B
{
	public static void main(String []args)
	{
		B a1=new B();
		a1.f2();//output-mukesh	
	}
	
}