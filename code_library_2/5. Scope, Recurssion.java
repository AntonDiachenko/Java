// Method Scope
/*Variables declared directly inside a method are available anywhere in the method 
following the line of code in which they were declared */
	public static void main(String[] args) {
	// Code here CANNOT use x
	int x = 100;
	// Code here can use x
	System.out.println(x);


// Block Scope
/*A block of code refers to all of the code between curly braces {}. 
Variables declared inside blocks of code can only be accessed by the code following
the line of code and that are with in the curly braces. */



//Java Recursion
//Recursion is the technique of making a function call itself. 
myMethod(10);
static int myMethod(int num){
    if(num>0){
        return num + myMethod(num - 1);
    }
    else{
        return 0;

10 + sum(9)
10 + ( 9 + sum(8) )
10 + ( 9 + ( 8 + sum(7) ) )
...
10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0


/* Halting Condition
Just as loops, Infinite recursion is when the function never stops calling itself.
A halting condition is the condition where the function stops calling itself. 
In the previous example, the halting condition is when the parameter k becomes 0. */
        int myNum = input.nextInt();
        System.out.println(myMethod(myNum));
    }
    static int myMethod(int num){
        if(num>0){
            return num + myMethod(num - 1);
        }
        else{
            return 0;