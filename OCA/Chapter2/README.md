# Object Orientation

## Key points

* Encapsulation helps hide implementation detail behind an interface (or API).
* Encapsulated code has 2 features:
    * Instance variables are protected (private modifier)
    * Getter and setter methods provide access to instance variables
* IS-A refers to inheritance or implementation
* IS-A is expressed with the keyword extends or implements
* HAS-A means an instance of class A has a reference to an instance of class B or another instance of class A.

* Inheritance allows a subtype to inherit public and protected variables and methods of the sypertype.
* All Java classes are subclasses of type Object.

* A reference variable is always of a single type, but it can refer to a subtype object.
* The reference variable's type (not the object's type) determines which methods can be called!
* Polymorphic method invocations apply only to overridden instance methods.
* Polymorphism does not apply to static methods or variables (static or instance). Only overridden instance methods are dynamically invoked based on the real object's type.

* Methods can be overridden and overloaded; constructors can be overloaded but not overridden.
* The overriding method:
    * Must have the same argument list
    * Must have the same return type or a subclass (covariant return)
    * Must Not have a more restrictive access modifier
        * You can't override a method marked public and make it protected.
    * May have a less restrictive access modifier
    * Must not throw new or broader checked exceptions
        * For example a method that declares a FileNotFoundException cannot be overridden by a method that declares a SQLException, Exception or any other non-runtime exception unless it's a subclass of FileNotFoundException.
    * May throw fewer or narrower checked exceptions, or any unchecked exceptions
        * An overriding method doesn't have to declare any exceptions that it will never throw, regardless of what the overridden method declares.
    * Final methods cannot be overridden
    * Only inherited methods may be overridden (not private or default if in different class)
    * Static methods may not be overridden.
* A subclass can call the superclass version of a method using the super.methodName() syntax
* A subclass can call the super interface version of a method using the InterfaceName.super.methodName() syntax
* A subtype within the same package can override any supertype method that is not marked private or final.
* A subtype in a different package can override only public or protected (non-final) methods.
* The super keyword can only be used to access a method in the type's immediate supertype, not the supertype of the supertype. You cannot say super.super.doStuff() and you cannot say InterfaceA.super.super.doStuff().
* Overloading means reusing a method name but with different arguments. Overloaded methods:
    * Must have different argument lists
    * May have different return types (if argument lists are also different)
    * May have different access modifiers
    * May throw different exceptions
    * Methods from a supertype may be overloaded in a subtype
    * Polymorphism applies to overriding, not Overloading
* Object type (not the reference variable's type) determines which overridden method is used at runtime.
* Reference type determines which overloaded method will be used at compile time.

* There are two types of reference variable casting: downcasting and upcasting.
    * Downcasting - if you have a reference variable (Dog) that refers to a subtype object (Shiba), you can assign it to a reference variable of the subtype (Shiba). You must make an explicit cast to do this, and the result is that you can access the subtype's members with this new reference variable.
        * Downcasting is a dangerous operation:
            * Downcasting a object to a subtype will compile but throw a ClassCastException at runtime.
            * Casting a object to a type not in the object's inheritance tree will not compile (inconvertible types).
    * Upcasting - you can assign a reference variable to a supertype reference variable explicitly OR implicitly. This is an inherently safe operation because the assignment restricts the access capabilities of the new variable.
        * Upcasting is a safe operation and works implicitly.

* An interface is implemented by properly and concretely implementing all the abstract methods defined by the interface.
* A single class can implement many interfaces.
* Impelementation classes are NOT required to implement an interface's static or default methods.
* An interface can extend another interface. 

* A class can extend one other class and implement one or many interfaces - extends comes first.
* If a class implements multiple interfaces that have default implementations of the same method the implementing class MUST override the method.

* Overloaded methods can change return types, overriddem methods cannot (except in case of covariant returns).
    * The return type of the overriding method must be the same as or a subtype of the declared return type of the overridden (superclass) method.
* Object reference return types can accept null as a return value.
* An array is a legal return type.
* For methods with primitive return types any value that can be implicitly converted to the return type can be returned.
* For methods with primitive return types you can return a value that can be explicitly cast to the declared return type.
* Nothing can be returned from a void method, but you can return nothing by using the return keyword, to exit the method early.
* A method with a non-void return type cannot return nothing.
* Methods with an object reference return type can return a subtype.
* Methods with an interface return type can return any implementer.

* A constructor is always invoked when a new object is created.
* Each superclass in an object's inheritance tree will have a constructor called.
* Every class, even an abstract class, MUST have at least one constructor.
* Constructors must have the same name as the class.
* Constructors don't have a return type. 
* Typical constructor execution chain:
    * The constructor calls its superclass constructor, all the way up to the Object constructor.
    * The Object constructor executes and returns to the calling constructor which runs to completion, back down to the completion of the constructor of the actual instance being created.
* Constructors can use any access modifier (including private).
* The compiler creates a default constructor if you don't create any in the class.
* The default constructor is a no-arg constructor with a no-arg call to super().
* The first statement of every constructor must be a call to either this() (on overloaded constructor) or to super().
* Every constructor has, as its first statement, either a call to an overloaded constructor (this()) or a call to the superclass constructor (super()), although the compiler can insert this in.
    * The compiler will insert a no-arg call to super() as the very first statement in a constructor unless the constructor already calls this() or super().
* The compiler will add a call to super() unless you have already put in a call to this() or super().
* Instance members are accessible only after the super constructor runs.
* Only static variables and methods can be accessed as part of the call to super() or this().
* Abstract classes have constructors that are called when a concrete subclass is instantiated.
* Interfaces do not have constructors.
* If the superclass does not have a no-arg constructor, you must create a constructor with a call to super() matching the arguments of the superclass constructor.
* Constructors are never inherited; thus they cannot be overridden.
* A constructor can be directly invoked only by another constructor using this() or super().
    * A constructor cannot be called from a method unless using the new keyword.
* Regarding calls to this():
    * May only appear as the first statement in a constructor.
    * The argument list determines which constructor is called.
    * Calls to this() and super() cannot be in the same constructor.

* Static initialization blocks - static { /* code */ } - for code you only want to run once.
* Multiple static initialization blocks run from the top down.
* Normal initialization blocks - { /* code */ } - for code you want to run for every new instance, right after all the super constructors have run.
* Multiple initialization blocks run from the top of the class down.
* Unlike methods and constructors, the order in which initialization blocks appear in a class matters.

* Static methods are not affected by the state of any instances.
* Static variables hold data that is class-specific as opposed to instance-specific. There will be only one copy of a static variable.
* All static members belong to the class, not to any instance.
* A static method CANNOT access an instance variable or method directly.
* A static method CAN access a static method or variable.
* Use the dot (.) operator to access static members. Using a reference variable is the same as using the class name when calling a static method.
* To invoke an interface's static method use InterfaceName.methodName() syntax.
* Static methods cannot be overridden, but they can be redefined (no polymorphism). 

## Misc

The Java compiler assumes you are calling the version of the method as per the reference variable.
If the reference type's method declares a exception, the compiler assumes you are calling a method that throws an exception, regardless of the implementation of the object type's method which may not declare the same exception.
Example:

class Animal {
    public void eat() throws Exception {}
}
class Dog extends Animal {
    public void eat() { /* no exceptions */ }
    public static void main(String[] args) {
        Animal a = new Dog();
        Dog d = new Dog();
        d.eat(); // ok to call
        a.eat(); // compiler error - unhandled exception
    }
}

The choice of which overloaded method to call is NOT dynamically decided at runtime. See below example:

class Animal {}
class Horse extends Animal {}

class UseAnimals {
    void doStuff(Animal a) { System.out.println("In the animal version"); }
    void doStuff(Horse a) { System.out.println("In the horse version"); }
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Horse();
        new UseAnimals().doStuff(a);
        new UseAnimals().doStuff(b);
    }
}

Output:

In the animal version.
In the animal version.

* The reference type (NOT the object type) determines which overloaded method is invoked!

## Init block ordering example

class Init {
    Init(int x) { System.out.println("1-arg const"); }
    Init() { System.out.println("no-arg const"); }
    static { System.out.println("1st static init"); }
    { System.out.println("1st instance init"); }
    { System.out.println("2nd instance init"); }
    static { System.out.println("2nd static init"); }

    public static void main(String[] args) {
        new Init();
        new Init(7);
    }
}

Output:

* 1st static init
* 2st static init
* 1st instance init
* 2nd instance init
* no-arg const
* 1st instance init
* 2nd instance init
* 1-arg const

Note: instance init blocks are often used as a place to put code that all the constructors in a class should share.

The JVM will throw an ExceptionInInitializerError if there is a mistake in an init block.

## Polymorhism example

class Mammal {
    String mame = "furry";
    String makeNoise() { return "generic noise"; }
}
class Zebra extends Mammal {
    String name = "stripes";
    String makeNoise() { return "bray"; }
}
public class ZooKeeper {
    public static void main(String[] args) { new ZooKeeper().go(); }
    void go() {
        Mammal m = new Zebra();
        System.out.println(m.name + m.makeNoise());
    }
}

Output:

furry bray

## Default interface method example

interface MyInterface {
    default int doStuff() { return 42; }
}
public class MyClass implements MyInterface {
    public static void main(String[] args) {
        new MyClass.go();
    }
    void go() {
        System.out.println("class: " + doStuff());
        System.out.println("iface: " + MyInterface.super.doStuff());
    }
    public int doStuff() { return 43; }
}

Output:
class: 43
iface: 42