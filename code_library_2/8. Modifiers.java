/* We divide modifiers into two groups:

Access Modifiers - controls the access level
Non-Access Modifiers - do not control access level, but provides other functionality

//Access Modifiers for classes:
public:	 Class is accessible by any other class
default: Class is accessible only by classes in the same package. Used when no modifier is specified.

//Non-Access Modifiers for classes: 
final:		The class cannot be inherited by other classes
abstract: 	The class cannot be used to create objects. To access an abstract class, it must be inherited from another class




//Access Modifiers for attributes, methods and constructors:
public:		code is accessible for all classes	
protected:	code is accessible in the same package and subclasses. 
default:	code is only accessible in the same package. Used when no modifier is specified.
private:	code is only accessible within the declared class	


//Non-Access Modifiers for attributes and methods:
static:		Attributes and methods belongs to the class, rather than an object
final:		Attributes and methods cannot be overridden/modified
abstract:	Can only be used in an abstract class, and can only be used on methods. The method does not have a body, for example abstract void run();. The body is provided by the subclass.

transient:		Attributes and methods are skipped when serializing the object containing them
synchronized:	Methods can only be accessed by one thread at a time
volatile:		The value of an attribute is not cached thread-locally, and is always read from the "main memory"




