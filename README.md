
Links for studying:

https://www.programiz.com/python-programming/for-loop
https://docs.python.org/3/library/stdtypes.html#string-methods
https://www.youtube.com/watch?v=8ext9G7xspg - good for learning





read me file uses markdown syntax to edit any text, formulas or codes
#welcome to my repository
## My skills🕵️
  - java
  - Python
  - GitHub

## My major projects  ☺️🕵️🎾
1. Java banking app
2. Python AI_tool
#forfuncodes
🫐

## My favourite part of code
```java
 var temperature = 30.876;

    if (temperature <= 5) {
      System.out.println("Wear super warm jacket!");
    } else if (temperature > 6 && temperature <= 15) {
      System.out.println("Wear a T-shirt!");
```


1. Go through the array - for loop
2. Find a number less than our number - if
    3. Increment index by 1 
    4. Return index
5. If we cant find the number that is less than our number
    6. Return total count + 1
```java  
import java.util.Scanner; 
import java.util.Random;

/*

1. Go through the array - for loop
2. Find a number less than our number - if
    3. Increment index by 1 
    4. Return index
5. If we cant find the number that is less than our number
    6. Return total count + 1


*/
public class Main {
    public static void main(String[] args) {
        int[] arr = {8, 7, 5, 3, 2, 1}; // current race results
        int number = 4; // our result
        boolean thePlaceIsFound = false;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < number){
                i = i + 1;
                System.out.println("Our place in race: " + i);
                thePlaceIsFound = true;
                break;
            }
        }

        if(thePlaceIsFound == false){
            System.out.println("Our place in race: " + arr.length + 1);
        }
    }
}
SHORTER VERSION OF CODE IS THIS: 

import java.util.Scanner; 
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        int[] arr = {8, 7, 5, 3, 2, 1}; // current race results
        int number = 4; // our result
        int place = getThePlace(arr, number);
        System.out.println("Our place in race: " + place);
    }

    public static int getThePlace(int[] arr, int number){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < number){
                return i + 1;
            }
        }
        return arr.length + 1;
    }
}

```

```java



/*

1. Go through the numbers from 2 to (number - 1) 

2. check whether or not it is dividable (number % i == 0)

3. If the 2nd point is true then its a prime number

4. If the 2nd point is false then it is not a prime number

*/
import java.util.Scanner; 
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        boolean isAPrimeNumber = isPrime(6);
        System.out.println(isAPrimeNumber);
    }
    public static boolean isPrime(int number){
      for(int i = 2; i < number; i++){
        if(number % i == 0){
          return false;
        }
      } 
      return true;
    }
}

```





