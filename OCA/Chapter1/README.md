# Declarations And Access Control

## Definitions

Class - a template that describes the kinds of state and behaviour that objects of its type support.

Object - a runtime the JVM will use the appropriate class to make an object that is an instance of that class,
when it encounters the new keyword.
That object will have its own state and access to all of the behaviours defined by its class.

State (instance variables) -  each object / instance of a class will have its 
own unique set of instance variables defined in the class.
Collectively the values assigned to an object's instance variables make up the object's state.

Behaviour (methods) - where the class's logic is stored. 

## Legal identifiers

Identifers must start with a letter, a currency character ($) or a connecting character such as an underscore.
Identifiers cannot start with a digit.

After the first character, identifiers can contain any combination of letters, currency characters, connecting characters or numbers.

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

The package statement (optional) must be the first line in the source file.

The import statement(s) (optional) must go between the package statement and the class declaration.

Import and package statements apply to to all classes within a source code file.

A file can have more than one non-public class.

Files with no public classes can have a name that does not match any of the classes in the file.


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
- create and instance of class B
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

