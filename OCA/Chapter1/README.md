# Declarations And Access Control

## Certification Objectives

- Java keywords
- legal Java identifier names
- source code declarations
- package and import statements, import static
- syntax for java and javac command-line tools
- entry point - main() - method signatures
- access control in relation to classes, methods and variables
- abstract vs concrete classes
- interfaces
- class definition modifiers (static, final, abstract, synchronized)
- final variables
- var-args parameters
- relative sizes of primitive variables
- Declaring Java arrays 
- Declaring enums

## Definitions

Java supports object-oriented programming, encapsulation, automatic memory management, a large API (library), built-in security features, multi-platform capability, strong typing, multi-threading and distributed computing.

Class - a template that describes the kinds of state and behaviour that objects of its type support.

Object - at runtime the JVM will use the appropriate class to make an object that is an instance of that class, when it encounters the new keyword.
That object will have its own state and access to all of the behaviours defined by its class.

State (instance variables) - each object / instance of a class will have its own unique set of instance variables defined in the class.
Collectively the values assigned to an object's instance variables make up the object's state.

Behaviour (methods) - where the class's logic is stored. 

Arguments - the things you specify between the parenthesis when you're invoking a method.

Parameters - the things in the method's signature that indicate what the method must receive when it's invoked.

## Legal identifiers

Identifers must start with a letter, a currency character ($) or an underscore (_).

Identifiers cannot start with a digit.

After the first character, identifiers can also contain digits.

Identifiers can be of any length.

Java keywords (reserved words) cannot be used as an identifier.

Identifiers are case-sensitive. Foo and FOO are different identifiers.

Examples of legal identifiers:

int _a;
int $c;
int ______2_w;
int _$;
int this_is_a_very_long_identifier;

Illegal identifiers:

int :b;
int -d;
int e#;
int .f;
int 7g;

## Source File Declaration Rules

There can be only one public class per source code file.

Comments can appear anywhere in the source file.

If there is a public class in the file, the name must match the filename.

The package statement (optional) must be the first (non-comment) line in the source file.

A file can only have one package statement, but it can have multiple imports.

The import statement(s) (optional) must go between the package statement and the class declaration.

Import and package statements apply to to all classes within a source code file.

A file can have more than one non-public class.

Files with no public classes have no naming restictions.


## Using the javac and java commands

The javac command is used to compile source files into bytecode.
Javac syntax:

javac [options] [source files] 

Both the options and source files are optional.

Legal examples of javac commands:
javac -helps
javac -version Foo.java Bar.java

Multiple source files should be separated by spaces (as above). 

The java command is used to invoke the Java Virtual Machine (JVM).

Syntax for the java command:
java [options] class [args]

Options and args are optional and can have multiple values.

You must specify exactly one class file to execute, and you don't specify the .class extension.

Example:
java -showversion MyClass x 1

In this case x and 1 are String arguments. 

public class MyClass {
    public static void main(String[] args) {
        System.out.println(args[0] + " " + args[1]);
    }
}

Result:

x 1

The main() method is special and used by the JVM to start execution of a Java program.

Legal 'special main' method signatures:

public static void main(String[] args)
static public void main(String ... x)
static public void main (String bang_a_gong[])

The main() method can be overloaded!

## Import statements and the Java API

Example import statements:
import java.util.ArrayList;
import java.util.*;

Java imports are typing shorthands. They are different to #include in C.
All a Java import statement does is save you some typing.

The static import statement MUST be written:
import static package.Class.staticThing;

You can do a static import on static object references, constants (static and final variables) and static methods.

The wildcard character (*) only searches for classes at a single level.

## Class declarations and modifiers

If class A has access to class B it means A can:

- create an instance of class B
- extend class B
- access methods and variables in B (depending on access level)

### Default access (no keyword)

Package-level access. 

### Public access (public keyword)

All classes from all packages have access to a public class.
Might need to import if in a different package (or use fully-qualified name).

## Other (non-access) class modifiers

A class can also have the following modifiers: final, abstract, strictfp.
This is in addition to access-level modifier (e.g. public).

Strictfp - all method code in the class will conform to the IEEE754 standard rules for floating points.
Without the modifier float points might behave in a platform-specific way.

The strictfp modifier can also be used on a method. 

Final - means the class can't be subclassed (extended). 
For example java.lang.String is final. 

Abstract - an abstract class can never be instantiated. 
You can compile and execute a abstract class, as long as you don't try to instantiate it.
If any method in a class is missing a body then both the method and class must be marked as abstract.

Abstract classes can have concrete methods, but non-abstract classes cannot have abstract methods. 

You can't mark a class as both abstract and final (for obvious reasons).

## Declaring an interface

An interface is a 100% abstract class. 

Interfaces can be implemented by any class from any inheritance tree.

Interface methods are implicitly both public and abstract, unless declared as default or static.
You do not need to type public or abstract keywords.

All variables defined in an interface must be public, static and final (contants).
Therefore Interfaces cannot defined instance variables.

Interface methods cannot be marked final, strictfp or native.

And inteface can extend oen or more other interfaces.

An interface cannot extend anything but another interface.

An interface cannot implement another interface or class.

An interface must be declared with the keyword interface.

Interfaces are implicitly abstract whether you use the abstract keywords or not.

The public keyword is required if you want an interface to have public rather than default-level access.

Interface constants don't have to have the public, static or final keywords. They will have public, static and final behaviour implicitly.

### Default interface methods

Interfaces can define concrete methods using the default keyword.

The default keyword can be used only with interface method signatures, not class method signatures.

Default methods are public by definition (public modifier is optional).

Default methods cannot be marked private, protected, static, final or abstract.

Default methods must have a concrete method body.

### Static interface methods

Static interface methods are declared by using the static keyword.

Static interface methods are public by default, the public keyword is optional.

Static interface methods cannot be marked private, protected, final or abstract.

Static interface methods must have a concrete method body.

When invoking a static interface method, the method's type (interface name) MUST be included in the invocation.

## Class member access modifiers

Class members can have four access control levels:

public
protected
default
private

Access level visibility controls whether:

- method code in one class can access a member of another class using the dot (.) operator
- a subclass can inherit a memeber of its superclass

If class A can't be accessed by class B, then no members of class A can be accessed by class B.

### Public

All other classes can access the member, regardless of package.

### Private

Private members can't be accessed by code in any class other than the declaring class.

A member declared private can't be inherited by a subclass.
A subclass can however delcare a member with a matching name.
A subclass therefore cannot override a private method. 

### Protected and default level access

Default member may be accessed only if the class accessing the member belongs to the same package.
A protected member can be accessed (through inheritance) by a subclass even if the subclass is in a different package.

The subclass can see the protected member only through inheritance.

Access modifiers cannot be applied to local variables. 

Only the final modifier can be applied to local variables. 

### Final methods

The final keyword prevents a method from being overridden in a subclass.

Variables in the method declaration follow the same rules as local variables, and can have the final modifier.

### Abstract methods

An abstract method is a method that has been declared but not implemented, it had no method body.

A class that extends an abstract class must implement all abstract methods of the superclass, unless the subclass is also abstract.

The first concrete subclass of an abstract class must implement all abstract methods of the superclass.

A method can never be marked as both abstract and final.

A method can never marked as both abstract and private.

For top-level classes the abstract modifier can never be combined with the static modifier. 

### Syncronized methods

The synchronized keyword indicates that a method can be accessed by only one thread at a time.
The synchronized keyword can only be applied to methods - not variables, not classes, just methods.

The synchronized modifier can be matched with any of the four access control levels.

### Native methods

The native modifier indicates that a method is implemented in platform-dependent code, often in C.
Native can only be applied to methods - not classes, not variables, only methods.
A native method's body must be a semicolon (;) like abstract methods, indicating that the implementation is omitted.

### Strictfp methods

Strictfp forces floating points to adhere to IEEE 754 standard. 
The strictfp keyword can be used to modify a method or class declaration, but not a variable.

### Methods with variable arguments (var-args)

A var-arg type can be a primite or an object type.
To declare a var-arg type you follow the type with an ellipsis (...), a space, and then the name of the array that will hold the parameters received.

The var-arg must be the last parameter in the method's signature and you can only have one var-arg in a method.

### Constructor declarations 

A constructor declaration never has a return type. 
Constructors have normal access modifiers and can take arguments.
Constructors must have the same name as the declaring class. 
Constructors can't be marked static. 
Constructors can't be marked final or abstract (because they can't be overridden).

### Variable declarations

There are 2 types of variables in Java - primitives and reference variables.

Primitives can be one of eight types: char, boolean, byte, short, int, long, double, float.

A primitive type can never change after declaration. 

Reference variables are used to refer to an Object. Its type can never change after declaration.

A reference variable can be used to refer to any object of the declared type or of a sybtype of the declared type.

Primitive variable declarations:

byte b;
boolean myBool;
int x, y, z;

Integer type sequenced from small to big: byte, short, int, long.
Floating point types sequenced from small to big: float, double.

All six number types are made up of 8-bit bytes and are signed.

byte   - 1 byte  (-128 <-> 127)
short  - 2 bytes (-32768 <-> 32767)
int    - 4 bytes
long   - 8 bytes
float  - 4 bytes
double - 8 bytes

A boolean can only hold true or false. The big depth of a boolean is virtual-machine dependent.

The char type contains a single 16-bit Unicode character. A char is basically a 2 byte unsigned integer.

### Instance variables

Instance variables are defined inside the class, but outside of any method.
They are initialized only when the class is instantiated. 

Instance variables:

- can use any of the four access levels.
- can be marked final
- can be marked transient
- cannot be marked abstract
- cannot be marked synchronized
- cannot be marked strictfp
- cannot be marked native
- cannot be marked static (because they would become class variables)

### Local variables

A local variable is declared within a method. Local variables are always on the stack, not the heap.

Local variables can only be marked with the final keyword.

It's possible to declare a local variable with the same name as an instance variable (known as shadowing).

### Array declarations

Arrays are objects that store multiple variables of the same type or variables that are all subclasses of the same type.

Arrays can hold primitives or object references, but an array will always be an object on the heap.

Arrays are declared by stating the type of elements followed by square brackets to either side of the identifer:

int [] key;
int key [];

Multidimentional arrays can be declared by multiple square braces:

String [][][] stringsArray;
String [] names [];

It is never legal to include the size of the array in the declaration.

### Final variables

Declaring a variable final makes it impossible to reassign that variable once it has been initialized with an explicit value.

### Transient variables

A transient instance variable will be skipped when the object containing it is serialized.

### Volatile variables

The volatile modifier tells the JVM that a thread accessing the variable must always reconcile its own private copy of the variable with the master copy in memory.

### Static variables and methods

All static members exist when the class is loaded and only one copy of a static member is shared across all instances.

Things which can be marked as static:

- methods
- variables
- nested classes 
- initialization blocks

Things which cannot be marked as static:

- Constructors
- Classes (unless they are nested)
- interfaces (unless they are nested)
- method local inner classes
- inner class methods and instance variables
- local variables

## Declare and use enums

An enum is a variable restricted to a few predefined values, one value from an enumerated list (enum).

Example of an enum declaration:

enum CoffeeSize { BIG, HUGE, OVERWHELMING }; <- semicolon is optional here

CoffeeSize cs = CoffeeSize.BIG;

Enums must not be declared within a method.

An enum that isn't enlcosed in a class can be delcared with only the public or default modifier.

The semicolon at the end of an enum declaration is optional.

Every enum has a static method values() that returns an array of the enum's values in the order they're declared.

You can never invoke an enum constructor directly. The enum constructor is invoked automatically, with the arguments you defined after the constant value.

Enum definitions can contain a constant specific class body. This is used when a particular constant needs to override a method defined in the enum.

