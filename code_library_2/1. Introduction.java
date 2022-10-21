/* Every Java program has a class name which must match the filename
Every program must contain the main() method. 
Any code inside the main() method will be executed. */


/* Java Variables
Variables are containers for storing data values. A variable must be of a specified data type. 
All Java variables must be identified with unique names called identifiers.
Primitive data types - includes byte, short, int, long, float, double, boolean and char
Non-primitive data types - such as String, Arrays and Classes */

Data Type   Size    Description
byte    1 byte      Stores whole numbers from -128 to 127
short   2 bytes     Stores whole numbers from -32,768 to 32,767
int     4 bytes     Stores whole numbers from -2,147,483,648 to 2,147,483,647
long    8 bytes     Stores whole numbers from -9,223,372,036,854... to 9,223,372,036,854...
float   4 bytes     Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
double  8 bytes     Stores fractional numbers. Sufficient for storing 15 decimal digits
boolean 1 bit       Stores true or false values
char    2 bytes     Stores a single character/letter or ASCII values


// Final Variables - means unchangeable and read-only
final int myNum = 15;


// Print Variables
String firstName = "John ";
String lastName = "Doe";
String fullName = firstName + lastName;
System.out.println(fullName);
System.out.println("Hello " + firstname);
int x = 5, y = 6, z = 50;
System.out.println(x + y + z);


/* Non-primitive data types are called reference types because they refer to objects.
Primitive types are predefined. Non-primitive types are created by the programmer and is not defined by Java (except for String).
Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
A primitive type has always a value, while non-primitive types can be null.
A primitive type starts with a lowercase letter, while non-primitive starts with uppercase.
The size of primitive type depends on data type, while all non-primitive have the same size. */

/* Java Type Casting
Widening Casting - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting -  data type in parentheses added in front of the value:
double -> float -> long -> int -> char -> short -> byte  */
double num1 = 9.78d;
int num2 = (int) num1; 


//String methods
fullname.length();
fullname.toUpperCase();
fullname.indexOf("Doe");
System.out.println(firstName + " " + lastName);
System.out.println(firstName.concat(lastName));


//Escape Sequences
\" \' \\ \n \t \r \b \f  


// Java Math
Math.max(5, 8);
Math.min(5, 8);
Math.sqrt(4);
Math.abs(-4.7);
Math.random(); //between 0.0 (inclusive), and 1.0 (exclusive)
int num1 = (int) (Math.random() * (100 - 20) + 1);  //Range from 20 to 100


// Boolean
boolean isJavaFun = true;
boolean isFishTasty = false;
System.out.println(isJavaFun);     // Outputs true
System.out.println(isFishTasty)


// ++i vs i++
i++		// In this scenario first the value is assigned and then increment happens.
++i 	// In this scenario first the increment is done and then value is assigned
i = 1;
j = ++i;	// i is 2, j is 2


i = 1;
j = i++;	// i is 2, j is 1