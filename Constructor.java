// Java Program to demonstrate
// Constructor
/*import java.io.*;

// Driver Class
class Constructor {
  
    // Constructor
    Constructor()
    {
        super();
        System.out.println("Constructor Called");
    }

    // main function
    public static void main(String[] args)
    {
        Constructor geek = new Constructor();
    }
}*/

// Java Program to demonstrate
// Default Constructor
/*import java.io.*;

// Driver class
class Constructor {

    // Default Constructor
    Constructor() { 
        System.out.println("Default constructor"); 
    }

    // Driver function
    public static void main(String[] args)
    {
        Constructor hello = new Constructor();
    }
}*/

// Java Program for Parameterized Constructor
/*import java.io.*;
class Constructor {
    // data members of the class.
    String name;
    int id;
    Constructor(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
}
class GFG {
    public static void main(String[] args)
    {
        // This would invoke the parameterized constructor.
        Constructor geek1 = new Constructor("Avinash", 68);
        System.out.println("Name :" + geek1.name + " and Id :" + geek1.id);
    }
}*/

// Java Program for Copy Constructor
/*import java.io.*;

class Constructor {
    // data members of the class.
    String name;
    int id;

    // Parameterized Constructor
    Constructor(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    // Copy Constructor
    Constructor(Constructor obj2)
    {
        this.name = obj2.name;
        this.id = obj2.id;
    }
}
class GFG {
    public static void main(String[] args)
    {
        // This would invoke the parameterized constructor.
        System.out.println("First Object");
        Constructor geek1 = new Constructor("Avinash", 68);
        System.out.println("Name :" + geek1.name + " and Id :" + geek1.id);

        System.out.println();

        // This would invoke the copy constructor.
        Constructor geek2 = new Constructor(geek1);
        System.out.println("Copy Constructor used Second Object");
        System.out.println("Name :" + geek2.name + " and Id :" + geek2.id);
    }
}*/