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

