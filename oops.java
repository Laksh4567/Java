//class and objects one simple java program
/*public class oops {
    
    static String Employee_name;
    static float Employee_salary;

    static void set(String n, float p) {
        Employee_name  = n;
        Employee_salary  = p;
    }

    static void get() {
        System.out.println("Employee name is: " +Employee_name );
        System.out.println("Employee CTC is: " + Employee_salary);
    }

    public static void main(String args[]) {
        oops.set("Rathod Avinash", 10000.0f);
        oops.get();
    }
}*/
//abstract class
/*abstract class oops{
    //abstract methods declaration
    abstract void add();
    abstract void mul();
    abstract void div();
  }*/
//Encapsulation using private modifier 

//Employee class contains private data called employee id and employee name
/*class Employee {
    private int empid;
      private String ename;
}*/
//base class or parent class or super class
/*class A{
    //parent class methods
    void method1(){}
    void method2(){}
  }
  
  //derived class or child class or base class
  class B extends A{  //Inherits parent class methods
    //child class methods
    void method3(){}
    void method4(){}
  }*/
// Java program to Demonstrate Polymorphism overloading
// This class will contain
// 3 methods with same name,
// yet the program will
// compile & run successfully
/*public class oops {

    // Overloaded sum().
    // This sum takes two int parameters
    public int sum(int x, int y)
    {
        return (x + y);
    }

    // Overloaded sum().
    // This sum takes three int parameters
    public int sum(int x, int y, int z)
    {
        return (x + y + z);
    }

    // Overloaded sum().
    // This sum takes two double parameters
    public double sum(double x, double y)
    {
        return (x + y);
    }

    // Driver code
    public static void main(String args[])
    {
        oops s = new oops();
        System.out.println(s.sum(10, 20));
        System.out.println(s.sum(10, 20, 30));
        System.out.println(s.sum(10.5, 20.5));
    }
}*/
//Java is going to use primitive type int only. 
/*public class oops
{
	public static void main(String[] args) 
	{
			Integer i = new Integer(10);
			Integer j = new Integer(20);
			Integer k = new Integer(i.intValue() + j.intValue());
			System.out.println("Output: "+ k);
	}
}*/
