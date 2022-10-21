//IF ELSE
if (time < 10) {
  System.out.println("Good morning.");
} else if (time < 20) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}


// Short Hand If...Else
String result = (time < 18) ? "Good day." : "Good evening.";
System.out.println(result);

// SWITCH, BREAK, DEFAULT
int day = 4;
switch (day) {
  case 6:
    System.out.println("Today is Saturday");
    break;
  case 7:
    System.out.println("Today is Sunday");
    break;
  default:
    System.out.println("Looking forward to the Weekend"); 
 }


 // While loop
 while (i < 5) {
  System.out.println(i);
  i++;
}


// DO While
do {
  System.out.println(i);
  i++;
}
while (i < 5);



// For loop
for (int i = 0; i <= 10; i = i + 2) {
  System.out.println(i);
}

// For - EACH loop
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String i : cars) {
  System.out.println(i);
}

// Continue
for (int i = 0; i < 10; i++) {
  if (i == 4) {
    continue;
  }
  System.out.println(i);
}