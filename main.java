// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    
    // winter, spring, summer, autumn
    // warm jacket, T-shirt, swimming suite, rain coat

    String season = "autumn";

    if (season.equals("winter")) {
      System.out.println("Wear a warm jacket!");
    }else if (season.equals("spring")) {
      System.out.println("Wear a T-shirt!");
    } else if (season.equals("summer")) {
      System.out.println("Wear a swimming suite!");
    }else if (season.equals("autumn")) {
      System.out.println("Wear a rain coat!");
    }else {
      System.out.println("Invalid season");
    }

    var temperature = 30.876;

    if (temperature <= 5) {
      System.out.println("Wear super warm jacket!");
    } else if (temperature > 6 && temperature <= 15) {
      System.out.println("Wear a T-shirt!");
    } else if (temperature > 15 && temperature <= 30) {
      System.out.println("Wear a swimming suite!");
    } else if (temperature > 30) {
      System.out.println("Wow, it is super hot");
    } else {
      System.out.println("Invalid season");
    }



}
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}
