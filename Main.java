import java.util.Scanner;

public class Main {
  private static String name1;

  /**
   * 
   * @author tgalloway
   */

  public static void main(String[] args) {
    // Tyrese Galloway
    // int gear; // declaration
    // int gear = 1 //
    // gear = 5; // assignment

    // Int
    // Short
    // Long
    // Double
    // Float
    // Char
    // Boolean
    // Byte

    demonstratePrintHello(); // call
    demonstrateargumentDivision();
    demonstrateGame();
  }

  public static void printHello() {
    // Tyrese Galloway
    Scanner keyboard = new Scanner(System.in);
    String name1 = keyboard.nextLine();
    System.out.println("Hello " + name1);
    System.out.println("Welcome to my Integration Project");

  }

  public static void demonstratePrintHello() {
    String name = "Irma";
    System.out.println("Hello, what is your name?: ");
    // Single line comment

    printHello();
    System.out.println("Just for screwing up the semester, go to Hell " + name);
  }

  public static void argumentDivision() {
    int age = new Scanner(System.in).nextInt();
    int young = (age / 2) + 7;
    System.out.println("The youngest age of someone you can date is " + young);
  }

  // Format for a method:
  // modifier return-type methodName(parameter list){ method body}
  public static void demonstrateargumentDivision() {
    System.out.println("How old are you?: ");

    argumentDivision();
    System.out.println("That's some unnecessary information to know, right?");
  }

  public static void demonstrateGame() {
    System.out.println(
        "I'm sorry, I'm really forgetful for a CPU. What's your name again?: ");

    Game();

  }

  public static void Game() {
    Scanner keyboard = new Scanner(System.in);
    String name2 = keyboard.nextLine();
    System.out.println(
        name2 + ", I would like to play a game. (Not in a Jigsaw way)");

    System.out.println("Let's do some random trivia!");
    System.out.print("Are you ready? " + " 1. Yes " + " 2. Nah I'm Good");
    Scanner scanner = new Scanner(System.in);
    int answer = scanner.nextInt();

    // if-else statement
    if (answer == 1) {
      System.out.println("Great! Let's get right into it");
      Countdown();
    } else if (answer == 2) {
      System.out.println("Well that's too ****ing bad, we're playing anyways.");
      Countdown();
    }

  }

  private static void Countdown() {
    System.out.println("Commencing Countdown: ");
    int count = 10;
    // while loop
    while (count > 0) {
      System.out.println(count);
      count = count - 1;
    }
    Questions();
  }

  private static void Questions() {
    System.out.println(
        "First question. What did the ancient Romans use to dye their hair?");
    System.out.println(" 1. Bronze shards " + " 2. Dove Blood "
        + " 3. Old Olive Oil " + " 4. Bird Poop");
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    while (a != 4) {
      System.out.println("Wrong answer. Try Again");
      a = scanner.nextInt();
    }
    System.out.println(
        "Correct! The Romans were disgusting, weren't they? Next question.");

    System.out.println("Which series started off as a Twilight fanfiction?");
    System.out.println(" 1. The Lovely Bones " + " 2. Goosebumps "
        + " 3. 50 Shades of Grey " + " 4. The Fault in Our Stars");
    Scanner scan = new Scanner(System.in);
    int b = scan.nextInt();
    while (b != 3) {
      System.out.println("Wrong answer. Try Again");
      b = scanner.nextInt();
    }
    System.out.println(
        "Bingo! That was something the world needed right? I didn't think so either"
            + ".");
    System.out.println("What planet was discovered in 1781?");
    System.out.println(
        " 1. Neptune " + " 2. Uranus " + " 3. Saturn " + " 4. Jupiter");
    int c = scan.nextInt();
    while (c != 2) {
      System.out.println("Wrong answer. Try Again");
      c = scanner.nextInt();
    }
    System.out.println(
        "Correct! Oh, Uranus. The Romans were pretty cheeky with that name.");
    System.out.println("What year did Elvis Presley die?");
    System.out.println(" 1. 1975 " + " 2. 1976 " + " 3. 1977 " + " 4. 1978");
    int d = scan.nextInt();
    while (d != 3) {
      System.out.println("Wrong answer. Try Again");
      d = scanner.nextInt();
    }
    System.out.println("That is correct! Or did he? *cue X-Files music*");
    System.out.println(
        "What is the name of the children's book about a family of bears?");
    System.out.println(" 1. Berenstain Bears" + " 2. Berenstein Bears "
        + " 3. Barenstein Bears " + " 4. Barenstain Bears");
    int e = scan.nextInt();
    while (e != 1) {
      System.out.println("Wrong answer (which is expected). Try Again.");
      e = scanner.nextInt();
    }
    System.out.println(
        "That is correct! The Mandela Effect is just ruining childhoods for everyone.");
    System.out.println("Let's take a half time break.");
    System.out.println("So tell me, what month were you born? Type a number 1-12. ");
    int month = scanner.nextInt();
    String monthString;
    switch (month) {
        case 1:  monthString = "January";
                 break;
        case 2:  monthString = "February";
                 break;
        case 3:  monthString = "March";
                 break;
        case 4:  monthString = "April";
                 break;
        case 5:  monthString = "May";
                 break;
        case 6:  monthString = "June";
                 break;
        case 7:  monthString = "July";
                 break;
        case 8:  monthString = "August";
                 break;
        case 9:  monthString = "September";
                 break;
        case 10: monthString = "October";
                 break;
        case 11: monthString = "November";
                 break;
        case 12: monthString = "December";
                 break;
        default: monthString = "Invalid month";
                 break;
    }
    System.out.println("Okay, so you're born in " + monthString + "... I have "
        + "nothing important to say about that, to be quite honest.");
    System.out.println("I know this is my third time asking you, but "
        + "What's your name again?: ");
    stringLength ();
  }
  
public static void stringLength () {
  Scanner scanner = new Scanner(System.in);
  String name3 = scanner.nextLine();
    int len = name3.length();
    System.out.println( "String Length is : " + len );
 
}

  }
  
