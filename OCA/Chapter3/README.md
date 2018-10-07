# Assignments

## Key points

* Local (method) variables live on the stack.
* Objects and their instance variables lives on the heap.

* Integer literals can be binary, decimal, octal or hexadecimal.
* Literals for longs end in L or l. 
* Float literals end in F or f, and double literals end in a digit or D or d.

* The boolean literals are true and false.
* Literals for chars are a single character inside single quotes: 'd'.

* Scope refers to the lifetime of a variable.
* There are four basic scopes:
    * Static variables live as long as their class lives.
    * Instance variables live as long as their object lives.
    * Local variables live as long as their method is on the stack; however if their method invokes another method, they are temporarily unavailable.
    * Block variables (for example in a for-loop) live until the block completes.

* Literal integers are implicitly ints.
* Integer expressions always result in an int-sized result, never smaller. 
* Floating-point numbers are implicitly doubles (64 bits).
* Narrowing a primitive truncates the high order bits.
* Compound assignments (such as +=) perform an automatic cast.
* A reference variable holds the bits that are used to refer to an object.
* Reference variables can refer to subclasses of the declared type, but not to superclasses.

* When an array of objects is instantiated, objects within the array are not instantiated but all the references get the default value of null.
* When an array of primitives is instantiated, elements get default values.
* Instance variables are always initialized with a default value.
* Local variables are never given a default value. 

* Methods can take primitives and/or object references as arguments.
* Method arguments are always copies.
* A primitive argument is an unattached copy of the original primitive.
* A reference argument is another copy of a reference to the original object.
* Shadowing occurs when two variables with different scopes share the same name.

* Garbage collections (GC) in Java provides automatic memory management.
* The purpose of GC is to delete objects that cannot be reached.
* Only the JVM decides when to run the GC, the programmer can only suggest it.
* The programmer can't know the GC algorithm definitely.
* Objects must be considered eligible before they can be GC'ed.
* An object is eligible when no live thread can reach it.
* To reach an object you must have a live, reachable reference to that object.
* Java applications can run out of memory.
* Islands of objects can be GC'ed even though they refer to each other.
* Request garbage collection with System.gc();
* The Object class has a finalize() method.
* The finalize() method is guaranteed to run once and only once before the garbage collection deletes an object.
* The garbage collector makes no guaranteed; finalize() may never run.
* It is possible to ineligible-ize an object for GC from within finalize().

### Primitive literals

Examples of primitive literals:

* 'b' // char literal
* 42  // int literal
* false // boolean literal
* 3.142 // double literal

### Number literals

An underscore (_) can be used to improve readability of integer literals:

int mill = 1_000_000;

You cannot use the underscore at the beginning or end of the literal, or directly next to the decimal point.

* Binary literals are declared by placing 0b or 0B at the start of the literal. 

int b1 = 0b101010; // binary literal
int b2 = 0B001001; // also a binary literal

* Octal literals are declared by placing a zero in front of the literal.

int oct1 = 07102; // octal literal

* Hexadecimal literals are declared by placing 0x or 0X in front of the literal.

int hex1 = 0x7fff;
int hex2 = 0X7FFF;
int hex3 = 0x00AEF;

All four integer literals are defined as int by default, but can be specified as long by placing a l or L suffix at the end:

long l = 112314L;

* Floating point numbers are defined as <digit(s)><.><digit(s)>

Floating-point numbers are doubles by default, but can be explicitly declared as floats by attaching a f/F suffix.

Double literals can also have an optional d/D suffix. 

Attempting to assign a double literal (e.g. 3.14) to a float won't compile.

### Char literals

A char literal is represented by a single character in single quotes:

char a = 'a';

You can also use the Unicode value of the characater by using the Unicode (\u) notation.

char N = '\u004e'; // the letter 'N'

Since characters are 16-bit unsigned integers, you can also a number literal.

char a = 0x892; // hex literal

You can use an escape code to declare literals that can't be typed directly:

char quote = '\"'; // a double quote
char tab = '\t'; // a tab character
char newline = '\n'; // a line feed

### Declaration and casts

It's legal to declare multiple variables of the same type on a single line by placing a comma between each variable:

int a, b, c;

You can also optionally initialize any of those variables in place:

int j, k=1, l, m=3;

The variables are evaluated in the order of declaration - left to right.

### Gargabe collection

The heap is the part of memory where Java objects lives, and it's the only part that is involved in the garbage collection process.

The Java specification doesn't guarantee a particular implementation of the garbage collector.

An object becomes eligible for garbage collection when no live thread can access it.
Accessible means having a reachable reference variable that refers to that object.

The first way to remove a reference to an object is to set the reference variable that refers to the object to null.

Garbage collection is performend automatically by the JVM, but can also be requested manually.
Examples of syntax for requesting manual garbage collection:

System.gc();

Runtime.getRuntime().gc();

Trivial program to illustrate the effects of garbage collection:

import java.util.date;
public class CheckGC {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        System.out.println("Total JVM memory: " + rt.totalMemory());
        System.out.println("Before memory: " + rt.freeMemory());

        Date d = null;
        for (int i=0; i < 10_000; i++) {
            d = new Date();
            d = null;
        }
        System.out.println("After memory: " + rt.freeMemory());
        rt.gc(); // request garbage collection run
        System.out.prinln("After GC memory: " + rt.freeMemory());
    }
}

#### The finalize() method

All classes inherit a finalize() method from java.lang.Object.
The code inside finalize() is guaranteed to run once when the respective object is deleted by the garbage collector.

* For any given object, finalize() will be called once and only once by the garbage collector.
* Calling finalize() can actually result in saving an object from deletion.

