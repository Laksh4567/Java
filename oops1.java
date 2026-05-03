/*class pen{
    String color;// properties of the pen
    String type;// properties of the pen

    public void  writter(){
        System.out.println("writting something");
    }
    public void color(){
        System.out.println(this.color);
    }
    public void type(){
        System.out.println(this.type);
    }
}
    class student{
    String name;
    String subject;
    String rollno;
    public void name(){
        System.out.println(this.name);
    }
    public void subject(){
        System.out.println(this.subject);
    }
    public void rollno(){
        System.out.println(this.rollno);
    }
    //if we have to add the constructor to the object.
    student(){
        System.out.println("constructor is being called");
    }
}



public class oops1 {
    public static void main(String args[]){

        student studentdata=new student();
        studentdata.name="Sudhanshu";
        studentdata.subject="maths";
        studentdata.rollno="56748";

        student studentdata1=new student();
        studentdata1.name="Subhash";
        studentdata1.subject="physics";
        studentdata1.rollno="56778";

        studentdata.name();
        studentdata.subject();
        studentdata.rollno();
        
        studentdata1.name();
        studentdata1.subject();
        studentdata1.rollno();

        
    }
}*/




// inheritance def: inheritance is being defined as the concept in which the child class acquires the behaviour and properties of the parent class.
/*
    class Animal{
        void eat(){
            System.out.println("animal eats food");
        }
    }
    class Dog extends Animal{
        void bark(){
            System.out.println("dog barks");
        }
    }
    public class oops1{
    public static void main(String[] args) {
        Dog d= new Dog();
        d.eat();// inherited from animal
        d.bark();//Defined in dog
    }
}*/
// Single level innheritance

/*class shape{
    public void area(){
        System.out.println("display area");
    }
}
class triangle extends shape{
    public void area(int length,int breath){
        System.out.println(0.5*length*breath);
    }
}
//multi level inheritance
class equitriangle extends triangle{
    public void area(int length,int breath){
        System.out.println(0.5*length*breath);
    }
}
//herierical inheritance
class square extends shape{
    public void area(int length,int breath){
        System.out.println(length*breath);
    }
}

public class oops1{
    public static void main(String args[]){
        shape s = new shape();
        s.area(); // display area

        // Child class (triangle)
        triangle t = new triangle();
        t.area(); // from shape
        t.area(10, 5); // from triangle

        // Multilevel inheritance (equitriangle extends triangle)
        equitriangle et = new equitriangle();
        et.area(); // from shape (inherited)
        et.area(6, 4); // from equitriangle

        // Hierarchical inheritance (square extends shape)
        square sq = new square();
        sq.area(); // from shape
        sq.area(4, 4); // from square
    }
}*/

//abstraction def: hiding implementation details and showing only essential features to the user.
/*abstract class Car {
    abstract void start();   // abstract method
    abstract void stop();    // abstract method
}

// Honda car
class Honda extends Car {
    void start() {
        System.out.println("Honda starts with a key");
    }
    void stop() {
        System.out.println("Honda stops with brakes");
    }
}

// Tesla car
class Tesla extends Car {
    void start() {
        System.out.println("Tesla starts with a button");
    }
    void stop() {
        System.out.println("Tesla stops automatically");
    }
}

public class oops1 {
    public static void main(String[] args) {
        Car c = new Honda();;  // reference of abstract class
        c.start();
        c.stop();

        Car c1 = new Tesla();
        c1.start();
        c1.stop();
    }
}*/

//encapsulation def: wrapping data (variables) and methods (functions) together into a single unit (class) and controlling access using getters and setters.
/*
class BankAccount {
    private int balance; // data hidden

    // Setter
    public void setBalance(int amount) {
        if(amount >= 0) {
            balance = amount;
        } else {
            System.out.println("Invalid balance!");
        }
    }

    // Getter
    public int getBalance() {
        return balance;
    }
}

public class oops1 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.setBalance(5000);          // setting balance
        System.out.println(acc.getBalance()); // getting balance

        acc.setBalance(-100); // invalid
    }
}

*/


// polymorphism def:one name, many forms. it happens in 2 forms 

//1) methord overloading:  same method name, different parameters.

//2) methord overriding:   same method name, same parameters, but different behavior in child class.

/*class Calculator {
    // same method name 'add' but different parameter lists

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class oops1 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(2, 3));        // int version
        System.out.println(calc.add(2.5, 3.5));    // double version
        System.out.println(calc.add(1, 2, 3));     // 3 int version
    }
}*/
