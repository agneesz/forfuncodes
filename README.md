
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

Develop an algorithm to check the results for tic-tac-toe game

Easy: Check two dimensional array to see whether or not values horizontally are the same.
Medium: Check two dimensional array to see whether or not values vertically are the same.
Hard: Check two dimensional array to see whether or not values diagonally are the same.
Extra hard: Develop a full turn based tic-tac-toe game

1. Playfield is a matrix 3x3
x x x    1 2 3
x x x    4 5 6
x x x    7 8 9

2. Players play in turns, the game lasts for 9 turns. 
3. On every turn a player replaces one number with either x or o
4. After the turn we check whether a horizontal, vertical and diagonal line has three x or three o
5. If true, a player wins and game ends
6. If false, the game continues with the turn of the second player.
7. If after 9 turns the condition in p. 4 is still false, the game ends with a draw.


![image](https://github.com/agneesz/forfuncodes/assets/165931569/a1d0c366-d8b5-4c08-a3cc-54fac49ddbf9)


and here is two dimensional array:

```java
data_type[][] array_name = {
                             {valueR1C1, valueR1C2, ....}, 
                             {valueR2C1, valueR2C2, ....}
                           };
    int[] oneDimensionalArray = {1,2,3};
    int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
    

 for(int i = 0; i < oneDimensionalArray.length; i++){
            System.out.print(oneDimensionalArray[i]);
        }




        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for(int i = 0; i < array.length; i++){
            //array[0] = {1, 2, 3}
            //array[0].length = 3
            int[] row = array[i]; // {1, 2, 3} OR {4, 5, 6} OR, {7, 8, 9}
            for(int j = 0; j < row.length; j++){
                System.out.print(row[j]);
            }


            
        }

```
```java
public class Main {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for(int i = 0; i < array.length; i++){ 
            //array[0] = {1, 2, 3}
            //array[0].length = 3
            int[] row = array[i]; // {1, 2, 3} OR {4, 5, 6} OR, {7, 8, 9}
            for(int j = 0; j < row.length; j++){
                System.out.print(row[j]); //PROCESSING ROWS HERE
            }
            System.out.println();

            
        }  
    }
}

```

```java
public class Main {
    public static void main(String[] args) {
        int[][] array = new int[10][10];

        for (int i = 0; i < array.length; i++) {
            int[] row = array[i];
            for (int j = 0; j < row.length; j++) {
                row[j] = i*j;
            }
        }

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(array[i][j] < 10){
                    System.out.print(array[i][j] + "  ");
                }
                else{
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
```


