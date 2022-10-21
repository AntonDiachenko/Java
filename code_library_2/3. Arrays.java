// Create Array

int[] intArray = new int[20];
int[] myNum = {10, 20, 30, 40};
int intArray[];  
intArray = new int[20]; 

String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars[0]);

//Multi Dimensional Arrays
int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
int x = myNumbers[1][2];
System.out.println(x); // Outputs 7

//Modify Array
cars[0] = "Opel";

//Array Length
System.out.println(cars.length);


//Loop through array
for(int i = 0; i < arr1.length; i++ ){
    System.out.println("Enter array value: ");
    Scanner input = new Scanner(System.in);
    arr1[i] = input.nextInt();
    System.out.println(arr1[i]);
}

String[] cars = {"Volvo", "BMW", "Ford"};
for(String i : cars) {
  System.out.println(i);
}


int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
for (int i = 0; i < myNumbers.length; ++i) {
  for(int j = 0; j < myNumbers[i].length; ++j) {
    System.out.println(myNumbers[i][j]);
      }



