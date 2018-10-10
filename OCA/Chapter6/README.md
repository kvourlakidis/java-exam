# Strings, Arrays, ArrayLists, Dates and Lambdas

## Key Points

* String objects are immutable, String reference variables are not.
* String methods are zero-based indexes, except for the second argument of substring().
* The String class is final - it cannot be extended.
* Strings have a method called length() - arrays have an attribute named length.
* StringBuilder objects are mutable - they can change without creating a new object.
* StringBuilder methods act on the invoking object, and objects can change without reassignment.
* Common String methods:
	* charAt()
	* concat()
	* equalsIgnoreCase()
	* length()
	* replace()
	* substring()
	* toLowerCase()
	* toUpperCase()
	* trim()
* Common StringBuilder methods:
	* append()
	* delete()
	* insert()
	* reverse()
	* toString()
* StringBuilders can be build empty or constructed with a specific capacity:
	* new StringBuilder(); // default cap = 16 chars
	* new StringBuilder("meh"); // cap = 16 + 3
	* new StringBuilder(10) // cap = 10
	
	
	
* Objects created using the exam's calendar classes must be created using factory methods (e.g. from(), now(), of(), parse());
	* The keyword new is not allowed
* The DateTimeFormatter class uses the parse() method to parse input Strings into valid calendar objects.
* The DateTimeFormatter class uses the format() method to format calendar objects into formatted Strings.

* Arrays can hold primitives or objects but the array is always an object.
* When declaring an array the brackets can be to the left or to the right of the name.
* It is never legal to include the size of the array in the declaration.
* You must include the size of the array when constructing it using new unless you are creating an anonymous array.
* Arrays of objects get initialized with null, primitives with their default values.
* Arrays use zero-based indexing.
* An ArrayIndexOutOfBoundsException occurs if you use a bad index value.
* Arrays have a length attribute whose value is the number of array elements.
* The last index you can access is always one less than the length.
* Multidimensional arrays are just arrays of arrays.
* The dimensions in a multidimensional array can have different lengths.
* An array of primitives can accept any value that can be implicitly promoted to the array's declared type.
* An array of objects can hold any object that passes the IS-A test for the declared type.

* If you assign an array to a previously declared array reference, the array you're assigning must be the same dimension as the reference you're assigning it to.

* ArrayLists allow resizing and additions/deletions easier than arrays.
* ArrayLists are ordered by default, and the add() method appends to the end of the list.
* ArrayLists can hold only objects, not primitives.
* ArrayLists use zero-based indexes.
* ArrayLists can have duplicate entries.
* Commonly used ArrayList methods:
	* add(element)
	* add(index, element)
	* clear()
	* contains(object)
	* get(index)
	* indexOf(object)
	* remove(index)
	* remove(object)
	* size()

* Any class that has a method that returns a reference to a mutable object is breaking encapsulation;

* Lambdas allow you to pass bits of code from one method to another.
	* The receing method can run whatever code it is sent.
* The only Lambda type in the OCA exam is Predicate.
* The Predicate interface has a single method to implement that's called test() and it takes one argument and returns a boolean:
	* boolean test(<T> arg1)
* The predicate can be placed in most places that expect a boolean expression (if, while, etc).
* Predicate lambda expressions have three parts: a single argument, an arrow (->) and an expression or code block.
* A predicate lambda expression's argument can be a variable or a type and variable together in parenthesis.
* A Predicate lambda expression's body can be an expression that resolves to a boolean OR a block of statements that ends with a boolean-returning return statement.

### Calendar objects

* java.time.LocalDateTime
	* used to create immutable objects representing a specific date and time
	* methods for manipulating the values of date/time objects
* java.time.LocalDate
	* used to create immutable objects representing a specific date
	* methods for manipulating the values of date objects
* java.time.LocalTime
	* used to create immutable objects representing a speicifc time
	* methods for manipulating the values of time objects
* java.time.format.DateTimeFormatter
	* used to format date/time objects for output
	* used to parse input strings and convert them to date/time objects
* java.time.Period
	* used to create immutable objects that represent a period of time
	* works in years, months and days
	* java.time.Duration can be used for finer granularity
* java.time.temporal.TemporalAmount
	* interface implemented by the Period class

! All of the above classes use factory (public static) methods to create new objects (not constructors) !

! both LocalDate and DateTimeFormatter have format() methods !

### Arrays

Normal array creation:

char[] chars = new char[10];
chars[0] = 'a'; // etc...

In-line array creation syntax:

int[] numbers = {2, 3, 5, 7, 11};

Just-in-time array creation syntax (NO SIZE IN BRACKETS):

String[] strings = new String[] {"Red", "Blue", "Green"};

### Java Collections API

* java.util.ArrayList
	* uses zero-based indexing
	* maintains insertion order
	* capacity adjusts on the fly
	* implements the java.util.List interface
	* overrides the toString() method (prints contents of the list)
	* can contain duplicate entries
	* only contain object references, not primitives (primitives get autoboxed into objects)

Commonly used ArrayList methods:
	* add(element) - appends the element to the end of the list;
	* add(index, element) - adds this element at the index point;
	* clear() - removes all elements from the ArrayList;
	* boolean contains(element) - whether the element is in the list;
	* Object get(index) - returns the Object at index;
	* int indexOf(Object) - returns the location of the element, -1 if the Object is not found;
	* remove(index) - removes the element at index
	* remove(Object) - removes the *first* occurence of Object
	* int size() - number of elements in the ArrayList

* Since Java 7 it's possible to use the 'diamond' syntax to declare typed collections:
	* List<String> l = new ArrayList<>();
	* List<String> l = new ArrayList<String>(); // same as above
	* But not:
	* List<> l = new ArrayList<String>(); // compile error

### Wrapper classes

* All the wrapped classes except Character provide two constructors:
	* One takes a primitive of the type of being constructed:
		* Integer int1 = new Integer(123);
	* The second takes a String:
		* Integer int2 = new Integer("123"); // throws NumberFormatException
		
### Lambdas

The basic syntax for a Predicate lambda has three parts:
	* A single parameter (x) - with optional type (myst be in parenthesis)
	* An arrow token (->)
	* A body that MUST return a boolean
		* either a single expression (no return statement)
		* or block of code (with a return statement)
