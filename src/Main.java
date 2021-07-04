class Parent
{
	// what is the access modifier of parent_name?
	String parent_name;

	static void method1()
	{
		System.out.println("Parent method1");
	}
	
	void overriden_method2()
	{
		System.out.println("Parent overriden_method2");
	}
	
	void method3()
	{
		System.out.println("Parent method3 exclusive");
	}
}

class Child extends Parent
{
	String child_name;
	
	// replacing the method entirely, no chance of using parent methods
	static void method1()
	{
		//super.method1();
		System.out.println("Child method1");
	}
	
	// vehicle class, the drive function had steps to wear the seatbelt
	@Override
	void overriden_method2()
	{
		//super.drive();
		//super.overriden_method2();
		System.out.println("Child overriden_method2");
	}
	
	void method4()
	{
		System.out.println("Child method4 exclusive");
	}
}

interface TestA
{
	String tostring();
}
public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TestA obj = new TestA() { public String tostring() {return "hello";}};
		//System.out.println(obj.tostring());
		
		Parent x = new Child();
		
		x.method1(); // 
		 
		Child y = new Child();
		
		// for each of x and y show all possible outputs
		
		// predict the output
		y.child_name="martian1"; // child class
		y.parent_name="martian2"; // parent class
//		y.method1(); // parent 
//		
//		// BOTTOM-UP approach
//		
//		
//		
//		y.method3(); // parent 
//		y.method4(); // child
//		y.overriden_method2(); // child
		
		System.out.println();
		
		// this is invalid as Child IS-A parent but not vice versa
		//Child z = new Parent();
		
		//Parent x = new Child();
		//Child y = new Child();
		
		// TV = actual object and a REMOTE = pointer
		
		// gives error as the pointer is of type parent
		//((Child)x).child_name="martian3"; // ERROR
		
		// predict the output // it can call these only
		x.method1(); // child | parent (child)
		x.method3(); // parent (parent)
		x.overriden_method2(); // parent | child (child)
		
		System.out.println();
		
		// upcasting and 				downcasting
		// go-up (child to parent)     go-down (parent to child)
		//Child y = new Child();
		Parent dummy = y;
		//errors
		dummy.parent_name="martian4";
		//dummy.child_name="martian 5"; // ERROR
		
		// predict the output
		dummy.method1(); // child
		dummy.method3(); // parent
		dummy.overriden_method2(); // child  
		

	}

}
