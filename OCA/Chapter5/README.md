# Flow Control and Exceptions

## Key points

* The only legal expression in an if statement is an expression that resolves to a boolean or Boolean reference.
    * Boolean assignments return a boolean so is legal to use in an if statement
* Curly braces are optional in if blocks that have only one statement.
* switch statements can evaluate only to enums, byte, short, int, char or String types.
* The case constant must be a literal or a compile-time constant including an enum or a String.
* You cannot have a case that includes a non-final variable or a range of values.
* If the condition in a switch statement matches a case constant