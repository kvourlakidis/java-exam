# Flow Control and Exceptions

## Key points

* The only legal expression in an if statement is an expression that resolves to a boolean or Boolean reference.
    * Boolean assignments return a boolean so is legal to use in an if statement
* Curly braces are optional in if blocks that have only one statement.
* switch statements can evaluate only to enums, byte, short, int, char or String types.
* The case constant must be a literal or a compile-time constant including an enum or a String.
* You cannot have a case that includes a non-final variable or a range of values.
* If the condition in a switch statement matches a case constant execution will run through all the code following the matching case until a break statement or the end of the switch statement is encountered.
* The default keyword should be used in a switch statement if you want to run some code when none of the case values match the conditional value.
* The default block can be located anywhere in the switch statement.

* A for statement has three parts: declaration, evaluation and iteration expressions.
* If a variable is iterated within a basic for loop it must be declared before the loop or within the for loop declaration.
* A variable declared within the for loop delcaration cannot be accessed outside the for loop.
* More than one variable of the same type can be initialized in the first part of the for loop declaration (comma separated).
* An enhanced for statement has two parts: declaration and expression. It it used to loop through arrays or collections.
	* The expression is the array or collection through which you want to loop.
	* The declaration is the block variable, whose type is compatible with the elements of the array or collection.
* The do while loop will always enter the body of the loop at least once.

* An unlabeled break statement will cause the current iteration of the innermost loop to stop and the line of code following the loop to run.
* An unlabeled continue statement will cause the current iteration of the innermost loop to stop, and the loop to run again.
* If the break or continue statement is labeled, it will cause a similar action to occur on the labeled loop.

* Exceptions come in two flavors: checked and unchecked. 
* Checked exceptions include all subtypes of Exception excluding classes that extend RuntimeException.
* Checked exceptions are subject to the handle or declare rule:
	* Any method that might throw a checked exception (including any invoking methods) must either declare the exception using throws or handle the exception with an appropriate try/catch.
* Subtypes of Error or RuntimeException are unchecked so the compiler doesn't enforce the handle or declare rule.
	* You are free to handle them or to declare them, but the compiler doesn't care one way or the other.
	
* A finally block will always be invoked, regardless of whether an exception is thrown or caught in its try/catch.
	* The only exception to the above rule is if the JVM shuts down (e.g. System.exit()).
	* Code in the finally block could itself raise an exception.
* Uncaught exceptions propagate back through the call stack, starting from the method where the exception is thrown and ending with either the first method that has a corresponding catch or a JVM shutdown.

* You can almost always create your own exceptions by extending Exception or one of its checked exception subtypes. Such an exception will then be considered a checked exception by the compiler.

* All catch blocks must be ordered from the most specific to most general.
	* If you have a catch clause for both IOException and Exception, you must put the catch for IOException first in your code.
	* A catch argument can catch the specified exception of any of its subtypes.
* Some exceptions are created by programmers and some by the JVM.

### The switch statement sytanx is:

switch (expression) {
	case constant1: codeblock
	case constant2: codeblock
	default: code block
}

* The case constant must be a compile-time constant (final and initialized).

### The loop syntax is:

while (boolean expression) {
	// code block
}

do {
	// code block
} while (boolean expression);

for ( initialization(s) ; test ; iteration(s)) {
	// code block
}

### Exception types

Common types of RuntimeException:
	* NullPointerException
	* ArithmeticException
	* ArrayIndexOutOfBoundsException
	* ClassCastException
	* IllegalArgumentException
		* NumberFormatException
	* IllegalStateException
	
!!! An overriding method does not have to declare the exceptions thrown by the overridden method !!!
