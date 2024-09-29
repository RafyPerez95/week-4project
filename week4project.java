
public class week4project {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
// 1. Create an Array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
//   b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).
//   i. Make sure that there are 9 elements of type int in this new array.
//    ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of
//    the first element in the new array ages2 from the last element of ages2).
//    iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).

// 1.
int [] ages = { 3, 9, 23, 64, 2, 8, 28, 93};
int firstElement = ages[0];
int lastElement = ages[ages.length - 1]; // 1a
int answer = lastElement - firstElement;
System.out.println("Difference of the elements is" + " " + answer);   

// 1b
int [] ages2 = { 3, 9, 23, 64, 2, 8, 28, 93, 100}; 
int firstElementAges2 = ages2[0];
int lastElementAges2 = ages2[ages2.length - 1];
int answer2 = lastElementAges2 - firstElementAges2;
System.out.println("Difference of the elements is" + " " + answer2);
    
for(int i = 0; i < ages2.length; i++) {
System.out.println(i + ": " + ages2[i]);
}
    
// 1c Use a loop to iterate through the Array and calculate the average age. Print the result to the console.
int sum = 0;
for(int i = 0; i < ages.length; i++) {
  sum += ages[i];
}
int average = sum / ages.length;
System.out.println("The average age is:" + " " + average);

// 2. Create an Array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
// a. Use a loop to iterate through the Array and calculate the average number of letters per name. Print the result to the console.
// b. Use a loop to iterate through the Array again and concatenate all the names together, separated by spaces, and print the result to the console.

String[] names = {"Sam", "Tommy", "Tim"  , "Buck", "Bob"};
// 2a
int totalLetters = 0;
for(String name : names) {
  totalLetters += name.length();
}
int averageLetters = totalLetters / names.length;
System.out.println("The avaerage number of letters per name is:" + " " + averageLetters);

// 2b
String allNames = " ";
for(String name : names) {
  allNames += name + " ";
}
System.out.println("Contantenated names:" + allNames);

// 3. How do you access the last element of any Array? 
System.out.println("Last Element:" + " " + names[names.length - 1]);

// 4. How do you access the first element of any Array?
System.out.println("First Element:" + " " + names[0]);

// 5. Create a new Array of int called nameLengths. Write a loop to iterate over the previously created names Array 
// and add the length of each name to the nameLengths Array.
int [] namesLengths = new int[names.length];
for(int i = 0; i < names.length; i++) {
  namesLengths[i] = names[i].length();
}

 // 6. Write a loop to iterate over the nameLengths Array and calculate the sum of all the elements in the Array. Print the result to the console. 
int sumOfLengths = 0;
for(int length : namesLengths) {
  sumOfLengths += length;
}
System.out.println("Sum of all names is:" + " " + sumOfLengths);

// 7.Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. 
// (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”). 
System.out.println(repeatWord (3, "Hello"));


// 8.Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and 
// the last name as a String separated by a space). 
System.out.println(fullName ("Rafael", "Perez"));



// 9.Write a method that takes an Array of int and returns true if the sum of all the ints in the Array is greater than 100.
System.out.println(greaterThan100(ages));

// 10. Write a method that takes an Array of double and returns the average of all the elements in the Array.
double[] array1 = {12.2, 18.0, 20.5};
System.out.println(getAverage(array1));

// 11. Write a method that takes two Arrays of double and returns true if the average of the elements in the 
// first Array is greater than the average of the elements in the second Array.
double[] array2 = {12.2, 17.0, 20.5};
System.out.println(isFirstArrayAverageGreater(array1, array2));

// 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
// and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
boolean isHotOutside = true;
double moneyInPocket = 10.49;
System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
moneyInPocket = 10.51;
System.out.println(willBuyDrink(isHotOutside, moneyInPocket));


// 13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
int num = 17;
if(isPrime(num)) {
  System.out.println(num + " is a prime number");
} else {
  System.out.println(num + " is not a prime number"); 
}



    
    
    
    
  } // End of main

//7.Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. 
//(i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”). 
public static String repeatWord(int n, String word) {
  String newString = "";
  for (int i = 0; i < n; i++) {
      newString += word;
  }
  return newString;
}


//8.Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and 
//the last name as a String separated by a space). 
public static String fullName(String firstName, String lastName) {
  String fullName = firstName + " " + lastName;
  return fullName;
}



//9.Write a method that takes an Array of int and returns true if the sum of all the ints in the Array is greater than 100.
public static boolean greaterThan100(int[] age) {
  int sum = 0;
  for (int i = 0; i < age.length; i++) {
    sum += age[i];
}
return sum > 100;
}

//10. Write a method that takes an Array of double and returns the average of all the elements in the Array.
public static double getAverage(double[] array) {
  double sum = 0;
  for (double number : array) {
      sum += number;
  }
  return sum / array.length;
}
  


//11. Write a method that takes two Arrays of double and returns true if the average of the elements in the 
//first Array is greater than the average of the elements in the second Array.
public static boolean isFirstArrayAverageGreater(double[] array1, double[] array2) {
 return getAverage(array1) > getAverage(array2); 
}

//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
//and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
  return isHotOutside && moneyInPocket > 10.50;
}

//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
 public static boolean isPrime(int number) {
   if (number <= 1) {
     return false;
   }
 for(int i = 2; i < number; i++) {
   if(number % i == 0) {
     return false;
   } 
     
   } 
     return true;
 
 }
 
 }
  
// the method boolean is going to tell us if the numbers shown are prime numbers it will print to the console true or false.

