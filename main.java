public class Main {
  public static void main(String[] args) {

    // winter, spring, summer, autumn
    // warm jacket, T-shirt, swimming suite, rain coat

    String season = "qwerty";
//False
    if (season == ("winter")) {
      System.out.println("Wear a warm jacket!");
    }
    //FALSE
    else if (season == ("spring")) {
      System.out.println("Wear a T-shirt!");
    }
    //FALSE
    else if (season == ("summer")) {
      System.out.println("Wear a swimming suite!");
    }
    //FALSE
    else if (season == ("autumn")) {
      System.out.println("Wear a rain coat!");
    }
    else {
      System.out.println("I don't recognize this season!");
    }


    double temp = 34.0;

    if (temp <= 5) {
      System.out.println("Wear super warm");
    }
    else if (temp <= 15) {
      System.out.println("Wear warm");
    }
    else if (temp <= 30) {
      System.out.println("Wear normal");
    }
    else {
      System.out.println("You need cooling");
    }
    // using only if here would be super wrong because it will print them all out. if you put if, it will always check even if first one is true. 
    
  

    
    }
  


}
