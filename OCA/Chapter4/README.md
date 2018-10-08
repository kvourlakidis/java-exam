# Operators

* Java Operators
* Operator Precedence
* Object and String equality ('==' vs 'equals()')

## Key Points

* Relational operators always result in a boolean value (true or false)
* The six relational operators are: >, >=, <, <=, == and !=.
* When comparing characters Java uses the character's Unicode (numeric) value.

* Four types of things can be tested for equality: numbers, characters, booleans and reference variables.
* When comparing reference variables '==' returns true only if both references refer to the same object.

* The 'instanceof' operator is for reference variables only; if checks whether the object is of a particular type.
* The instanceof operator can be used to test objects (or null) against class types that are ine the same class hierarchy.

* The math operators are: add (+), subtract (-), multiply (*), divide (/) and modulus (%).
* The *, / and % operators have higher precedence than + and -.
* If either operand is a String, the + operator concatenates the operands.
* If both operands are numeric the + operator adds the operands.
* Character primitives are treated as numerics by the + operator!

* The most commonly used compound operators are: +=, -=, *= and /=.

* Prefix operators (e.g. --x and ++x) run before the value is used in the expression.
* Postfix operators (e.g. x-- and x++) run after the value is used in the expression.
* In any expression, both operands are fully evaluated before the operator is applied.
* Variables marked final cannot be incremented or decremented.

* The Ternary operator (condition ? value : value;):
	* Returns one of two values based on the state of its boolean expression.
	* Returns the value after the ? if the expression is true.
	* Returns the value after the : if the expression is false.

* The six primary logical operators are: &, &&, |, ||, ! and ^.
	* All except '!' work with two expressions that must resolve to boolean values.
	* The & and && operators return true if both operands are true.
	* The | and || operators return true if either or both operands are true.
	* The ^ operator (xor) returns true only if one operator is true.
	* The && and || are short-circuit operators.
		* The && operator does not evaluate the right operand if the left operand is false.
		* The || operator does not evaluate the right operand if the left operand is true.
	* The & and | operators always evalute both operands.
	* The ! (inversion) operator returns the opposite value of the boolean operand it precedes.
	
## Notes

Don't confuse the assignment (=) and equality (==) operators!
The result of any assignment expression is the value of the variable following the assignment.
Therefore it's possible to do this:

boolean b = false;
if (b = true) {
	/* this code is going to execute */
}

It's also possible to do this:

int a; int b = 5 + (a = 10);

## The equals() method

The Object's equals() method works exactly the same way as the equality operator (==).

The String's equals() method has been overridden and returns true if the two strings have the same value.
The String's equals() method is case sensitive!

## Operator precedence

From higest (evaluted first) to lowest (evaluated last) the operator precedence in Java is:
	* unary operators (-, !, ++, --)
	* multiplication, division, modulus (*, /, %)
	* addition, subtraction (+, -)
	* relational operators (<, >, <=, >=)
	* equality operators (==, !=)
	* logical operators (&, |)
	* short-circuit operators (&&, ||)
	* assignment operators (=, +=, -=)


