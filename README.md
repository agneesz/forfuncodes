
Links for studying:

https://www.programiz.com/python-programming/for-loop
https://docs.python.org/3/library/stdtypes.html#string-methods
https://www.youtube.com/watch?v=8ext9G7xspg - good for learning
https://gist.github.com/rene-d/9e584a7dd2935d0f461904b9f2950007 - kodi kr'as'am
https://emojipedia.org/cross-mark - emoji kodi
https://www.freecodecamp.org/learn/ - kod'e'sanas uzdevumi





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
```java
import java.util.Random;
public class Main {
      public static void main(String[] args) {
        
          int[][] array = new int[5][5];
          Random random = new Random();


          for (int i = 0; i < array.length; i++) {
              for (int j = 0; j < array[i].length; j++) {
                  array[i][j] = random.nextInt(10) + 1;
              }
              
          }

          for (int i = 0; i < array.length; i++) {
              for (int j = 0; j < array[i].length; j++) {
                  System.out.print(array[i][j] + " | ");
              }
              System.out.println();
          }
      }
  }
```

```python
public class Main {
    public static void main(String[] args) {
        int number = 20;
        number = changeNumber(number);
        System.out.println(number);
        
        int numberVoid = 20;
        changeNumberVoid(numberVoid);
        System.out.println(numberVoid);
    }

    public static int changeNumber(int number){
        number = 55;
        return number;
    }

    public static void changeNumberVoid(int number){
        number = 55; //THIS NUMBER WILL NOT CHANGE THE numberVoid value
    }
}



public class Main {
    public static void main(String[] args) { // Main method
        int[] array = { 1, 2, 3, 4, 5 }; // 1. declare an array
        array = changeArray(array); // 2. change the content of the array
        printOutArray(array); // 3. print out the values of the array

        int[] arrayVoid = { 1, 2, 3, 4, 5 }; // 4
        changeArrayVoid(arrayVoid); // 5
        printOutArray(arrayVoid); //6
    }

    public static int[] changeArray(int[] array) { // 2
        for (int i = 0; i < array.length; i++) { // 2.1.
            array[i] = 0; // 2.2
        } // 2.3
        return array; // 2.4
    }

    public static void changeArrayVoid(int[] array) { //5
        for (int i = 0; i < array.length; i++) { // 5.1
            array[i] = 1; // 5.2
        }// 5.3
    }

    public static void printOutArray(int[] array) { // 3 // 6
        for (int i = 0; i < array.length; i++) { // 3.1 //6.1
            System.out.println(array[i]);// 3.2 // 6.2
        } // 3.3 // 6.3
    }
}




public class Main {
    public static void main(String[] args) { // Main method
        int[] arrayVoid = { 1, 2, 3, 4, 5 }; 

        int[] array = arrayVoid;
        array[0] = 100;
        
        printOutArray(arrayVoid);
    }

    public static void printOutArray(int[] array) { 
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

// Reference type
```


```java
public class Main {
    public static void main(String[] args) { // Main method
        int size = 10;
        int[][] grid = new int[size][size];
        int bombColumn = 1;
        int bombRow = 1;
        // 1 1 1 0 0 0 0 0 0 0
        // 1 5 1 0 0 0 0 0 0 0
        // 1 1 1 0 0 0 0 0 0 0
        // 0 0 0 0 0 0 0 0 0 0
        // .... times 10

        grid[bombRow][bombColumn] = 5; // Center
        grid[bombRow - 1][bombColumn] = 1; // Top middle
        grid[bombRow - 1][bombColumn - 1] = 1; // top left
        grid[bombRow - 1][bombColumn + 1] = 1; // top right

        grid[bombRow + 1][bombColumn] = 1; // bottom middle
        grid[bombRow + 1][bombColumn - 1] = 1; //bottom left
        grid[bombRow + 1][bombColumn + 1] = 1; //bottom right

        grid[bombRow][bombColumn - 1] = 1; // middle left
        grid[bombRow][bombColumn + 1] = 1; //middle right

        if(bombRow != 0){
            grid[bombRow - 1][bombColumn] = 1; // Top middle
            grid[bombRow - 1][bombColumn - 1] = 1; // top left
            grid[bombRow - 1][bombColumn + 1] = 1; // top right
        }
        
        printArray(grid, size);
    }

    public static void printArray(int[][] array, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}


```


```java
public class Main {
    public static void main(String[] args) { // Main method
        int size = 10;
        int[][] grid = new int[size][size];
        int bombColumn = 9;
        int bombRow = 1;
        // 1 1 1 0 0 0 0 0 0 0
        // 1 5 1 0 0 0 0 0 0 0
        // 1 1 1 0 0 0 0 0 0 0
        // 0 0 0 0 0 0 0 0 0 0
        // .... times 10

        //grid[bombRow][bombColumn] = 5; // Center
        if(bombRow != 0) {
            grid[bombRow - 1][bombColumn] = 1; // Top middle

            if(bombColumn != 0){
                grid[bombRow - 1][bombColumn - 1] = 1; // top left
            }

            if(bombColumn != size - 1){
                grid[bombRow - 1][bombColumn + 1] = 1; // top right
            }
        }

        if(bombRow != size - 1){
            grid[bombRow + 1][bombColumn] = 1; // bottom middle
            if(bombColumn != 0){
                grid[bombRow + 1][bombColumn - 1] = 1; //bottom left
            }
            if(bombColumn != size - 1){
                grid[bombRow + 1][bombColumn + 1] = 1; //bottom right
            }
            
        }

        if(bombColumn != 0){
            grid[bombRow][bombColumn - 1] = 1; // middle left
        }
        if(bombColumn != size - 1){
            grid[bombRow][bombColumn + 1] = 1; //middle right
        }

        
        printArray(grid, size);
    }

    public static void printArray(int[][] array, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

```


```java
public class Main {
    public static void main(String[] args) { // Main method
        int size = 10;
        int[][] grid = new int[size][size];
        funExperiment(grid, size);
        printArray(grid, size);
    }

    public static void printArray(int[][] array, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void funExperiment(int[][] grid, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i != 0) {
                    grid[i - 1][j]++; // Top middle

                    if (j != 0) {
                        grid[i - 1][j - 1]++; // top left
                    }

                    if (j != size - 1) {
                        grid[i - 1][j + 1]++; // top right
                    }
                }

                if (i != size - 1) {
                    grid[i + 1][j]++; // bottom middle
                    if (j != 0) {
                        grid[i + 1][j - 1]++; // bottom left
                    }
                    if (j != size - 1) {
                        grid[i + 1][j + 1]++; // bottom right
                    }

                }

                if (j != 0) {
                    grid[i][j - 1]++; // middle left
                }
                if (j != size - 1) {
                    grid[i][j + 1]++; // middle right
                }
            }
        }

    }
}
```



```java
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> shopsItems = new ArrayList<String>();

        shopsItems.add("Table");
        shopsItems.add("Cupboard");

        printArrayList(shopsItems);
    }

    public static void printArrayList(ArrayList<String> items){
        for (String item : items){
            System.out.println(item);
        }
    }
}

//Initialize ArrayList
// Create an element in the arrayList
// Remove an element
// Get the elements

```


```java
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Main {
    //shopsItems here
    public static void main(String[] args) {
        var shopsItems = new ArrayList<String>();
        //Initializes an ArrayList, creates a new object and gives a reference
        var scanner = new Scanner(System.in);
        while(true){
            var item = scanner.nextLine();
            if(item.equals("exit")){
                break;
            }
            addItem(shopsItems, item);
        }


        printArrayList(shopsItems);
    }

    public static void printArrayList(ArrayList<String> items){
        for (String item : items){
            System.out.println(item);
        }
    }

    public static void addItem(ArrayList<String> items, String item){
        items.add(item);
        System.out.println(item + " has been added to the store.");
    }
}

//Initialize ArrayList
// Create an element in the arrayList
// Remove an element
// Get the elements
```


```java
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Main {
    //shopsItems here
    public static void main(String[] args) {
        var shopsItems = new ArrayList<String>();
        //Initializes an ArrayList, creates a new object and gives a reference

        // These 2 lines in a function
        shopsItems.add("Table");
        System.out.println("Table has been added to the store");
        //
        
        shopsItems.add("Cupboard");
        System.out.println("Cupboard has been added to the store");


        printArrayList(shopsItems);
    }

    public static void printArrayList(ArrayList<String> items){
        for (String item : items){
            System.out.println(item);
        }
    }
}

//Initialize ArrayList
// Create an element in the arrayList
// Remove an element
// Get the elements
```

```java
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Main {
    //shopsItems here
    public static void main(String[] args) {
        var shopsItems = new ArrayList<String>();
        //Initializes an ArrayList, creates a new object and gives a reference
        var scanner = new Scanner(System.in);
        // These 2 lines in a function
        var item = scanner.nextLine(); //Asks the user for input
        shopsItems.add(item); // adds the item to the shopsItems arrayList
        System.out.println(item + " has been added to the store"); // Provide information to the user
        //
        
        shopsItems.add("Cupboard");
        System.out.println("Cupboard has been added to the store");


        printArrayList(shopsItems);
    }

    public static void printArrayList(ArrayList<String> items){
        for (String item : items){
            System.out.println(item);
        }
    }

    public static void addItem(ArrayList<String> shopsItems, String item){
        shopsItems.add(item); // adds the item to the shopsItems arrayList
        System.out.println(item + " has been added to the store"); // Provide 
    }
}

//Initialize ArrayList
// Create an element in the arrayList
// Remove an element
// Get the elements
```


```java


import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Main {
    // shopsItems here
    public static void main(String[] args) {
        var shopsItems = new ArrayList<String>();
        // Initializes an ArrayList, creates a new object and gives a reference
        var scanner = new Scanner(System.in);
        // These 2 lines in a function
        while (true) {
            System.out.println("Enter the item you want to add to the list or type exit to stop: ");
            var item = scanner.nextLine(); // Asks the user for input

            if(item.equals("exit")){
                break;
            }
            
            addItem(shopsItems, item);
        }

        printArrayList(shopsItems);
        
        System.out.println("Enter the item you want to remove from the list:");
        var itemToRemove = scanner.nextLine(); // Asks the user for input
        shopsItems.removeIf(item -> item.equals(itemToRemove));

        printArrayList(shopsItems);
    }

    public static void printArrayList(ArrayList<String> items) {
        System.out.println("Store has these items:");
        for (String item : items) {
            System.out.println(item);
        }
    }

    public static void addItem(ArrayList<String> shopsItems, String item) {
        shopsItems.add(item); // adds the item to the shopsItems arrayList
        System.out.println(item + " has been added to the store"); // Provide information to the user
    }
}

// Initialize ArrayList
// Create an element in the arrayList
// Remove an element
// Get the elements


```


```java
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Main {
    // shopsItems here
    public static void main(String[] args) {
        var shopsItems = new ArrayList<String>();
        // Initializes an ArrayList, creates a new object and gives a reference
        var scanner = new Scanner(System.in);
        // These 2 lines in a function
        while (true) {
            System.out.println("Enter the item you want to add to the list or type exit to stop: ");
            var item = scanner.nextLine(); // Asks the user for input

            if(item.equals("exit")){
                break;
            }
            
            addItem(shopsItems, item);
        }

        printArrayList(shopsItems);
        
        System.out.println("Enter the item you want to remove from the list:");
        var itemToRemove = scanner.nextLine(); // Asks the user for input
        shopsItems.removeIf(item -> item.equals(itemToRemove));

        printArrayList(shopsItems);

        var filteredArrayList = new ArrayList<String>();
        for (String item: shopsItems){
            if(item.length() <= 5){
                filteredArrayList.add(item);
            }
        }
        printArrayList(filteredArrayList);
    }

    public static void printArrayList(ArrayList<String> items) {
        System.out.println("Store has these items:");
        for (String item : items) {
            System.out.println(item);
        }
    }

    public static void addItem(ArrayList<String> shopsItems, String item) {
        shopsItems.add(item); // adds the item to the shopsItems arrayList
        System.out.println(item + " has been added to the store"); // Provide information to the user
    }
}

// Initialize ArrayList
// Create an element in the arrayList
// Remove an element
// Get the elements
```


```java

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var shopsItems = new ArrayList<String>();
        shopsItems.add("Glass table");        
        shopsItems.add("Wooden table");
        shopsItems.add("Round table");
        shopsItems.add("Doors");
        shopsItems.add("Trapdoor");
        shopsItems.add("Couch");
        shopsItems.add("Bed");
        shopsItems.add("Sofa");

        var filteredShopsItems = shopsItems
            .stream()
            .filter(item -> item.contains("table"))
            .collect(Collectors.toList());
        
        System.out.println(filteredShopsItems);
    }
}


import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var shopsItems = new ArrayList<String>();
        shopsItems.add("Glass table");
        shopsItems.add("Wooden table");
        shopsItems.add("Round table");
        shopsItems.add("Doors");
        shopsItems.add("Trapdoor");
        shopsItems.add("Couch");
        shopsItems.add("Bed");
        shopsItems.add("Sofa");

        var filteredShopsItems = shopsItems
                .stream()
                .skip(3)
                .limit(2)
                .collect(Collectors.toList());

        System.out.println(filteredShopsItems);
    }
}

```


```java
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var shopsItems = new ArrayList<String>();
        shopsItems.add("Glass table");
        shopsItems.add("Wooden table");
        shopsItems.add("Round table");
        shopsItems.add("Doors");
        shopsItems.add("Trapdoor");
        shopsItems.add("Couch");
        shopsItems.add("Bed");
        shopsItems.add("Sofa");

        shopsItems
            .stream()
            .skip(3)
            .limit(2)
            .forEach(x -> System.out.println("TEST " + x));

    }
}



import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var shopsItems = new ArrayList<String>();
        shopsItems.add("Glass table");
        shopsItems.add("Wooden table");
        shopsItems.add("Round table");
        shopsItems.add("Doors");
        shopsItems.add("Trapdoor");
        shopsItems.add("Couch");
        shopsItems.add("Bed");
        shopsItems.add("Sofa");

        shopsItems
            .stream()
            .filter(x -> x.contains("table"))
            .forEach(x -> System.out.println("TEST " + x));

    }
}


import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var shopsItems = new ArrayList<String>();
        shopsItems.add("Glass table");
        shopsItems.add("Wooden table");
        shopsItems.add("Round table");
        shopsItems.add("Doors");
        shopsItems.add("Trapdoor");
        shopsItems.add("Couch");
        shopsItems.add("Bed");
        shopsItems.add("Sofa");
        
        shopsItems
            .stream()
            //.filter(x -> x.contains("table"))
            .forEach(x -> Print(x));

    }

    public static void Print(String text) {
        System.out.println();
        System.out.println(text);
    }
}
```


```java

"fork"
//Fork has 3 or 4  spikes
//Fork has a material (silver, or plastic, wood)
//Fork has sharpness in the spikes. 0
//A fork can stab and whenever a fork stabs, it gets more dull
//Sharpness is gonna decrease by 0.1

public class Fork{
  public int spikeCount;
  public String material;
  public int sharpness = 1000;

  //new Fork(3, "wood")
  public Fork(int spikeCount, String material){
    this.spikeCount = spikeCount;
    this.material = material;
  }

  public void stab(){
    sharpness = sharpness - 1;
  }
}

"main"
public class Main {
    public static void main(String[] args) {
        var fork = new Fork(4, "Silver");

        System.out.println("Fork is made out of " + fork.material);

        System.out.println("Fork has " + fork.spikeCount + " spikes in total.");

        System.out.println("And the sharpness is " + fork.sharpness);
    }
}
