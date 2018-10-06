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

* Methods can be overridden and overloaded; constructors can be overloaded but not overridden.
* The overriding method:
    * Must have the same argument list
    * Must have the same return type or a subclass (covariant return)
    * Must Not have a more restrictive access modifier
    * May have a less restrictive access modifier
    * Must not throw new or broader checked exceptions
    * May throw fewer or narrower checked exceptions, or any unchecked exceptions
    * Final methods cannot be overridden
    * Only inherited methods may be overridden (not private)
* A subclass can call the superclass version of a method using the super.methodName() syntax
* A subclass can call the super interface version of a method using the InterfaceName.super.methodName() syntax

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
    * Upcasting - you can assign a reference variable to a supertype reference variable explicitly OR implicitly. This is an inherently safe operation because the assignment restricts the access capabilities of the new variable.

* An interface is implemented by properly and concretely implementing all the abstract methods defined by the interface.
* A single class can implement many interfaces.

* Overloaded methods can change return types, overriddem methods cannot (except in case of covariant returns).
* Object reference return types can accept null as a return value.
* An array is a legal return type.
* For values with primitive return types any value that can be implicitly converted to the return type can be returned.
* Nothing can be returned from a void method, but you can return nothing by using the return keyword, to exit the method early.
* A method with a non-void return type cannot return nothing.
* Methods with an object reference return type can return a subtype.
* Methods with an interface return type can return any implementer.

* A constructor is always invoked when a new object is created.
* Each superclass in an object's inheritance tree will have a constructor called.
* Every class, even an abstract class, has at least one constructor.
* Constructors must have the same name as the class.
* Constructors don't have a return type. 
* Typical constructor execution chain:
    * The constructor calls its superclass constructor, all the way up to the Object constructor.
    * The Object constructor executes and returns to the calling constructor which runs to completion, back down to the completion of the constructor of the actual instance being created.
* Constructors can use any access modifier (including private).
* The compiler creates a default constructor if you don't create any in the class.
* The default constructor is a no-arg constructor with a no-arg call to super().
* The first statement of every constructor must be a call to either this() (on overloaded constructor) or to super().
* The compiler will add a call to super() unless you have already put in a call to this() or super().
* Instance members are accessible only after the super constructor runs.
* Abstract classes have constructors that are called when a concrete subclass is instantiated.
* Interfaces do not have constructors.
* If the superclass does not have a no-arg constructor, you must create a constructor with a call to super() matching the arguments of the superclass constructor.
* Constructors are never inherited; thus they cannot be overridden.
* A constructor can be directly invoked only by another constructor using this() or super().
* Regarding calls to this():
    * May only appear as the first statement in a constructor.
    * The argument list determines which constructor is called.
    * Calls to this() and super() cannot be in the same constructor.

* Static initialization blocks - static { /* code */ } - for code you only want to run once.
* Multiple static initialization blocks run from the top down.
* Normal initialization blocks - { /* code */ } - for code you want to run for every new instance, right after all the super constructors have run.
* Multiple initialization blocks run from the top of the class down.

* Static methods are not affected by the state of any instances.
* Static variables hold data that is class-specific as opposed to instance-specific. There will be only one copy of a static variable.
* All static members belong to the class, not to any instance.
* A static method can't access an instance variable directly.
* Use the dot (.) operator to access static members. Using a reference variable is the same as using the class name when calling a static method.
* To invoke an interface's static method use InterfaceName.methodName() syntax.
* Static methods cannot be overridden, but they can be redefined. 



