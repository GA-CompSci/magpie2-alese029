import java.util.Scanner;

public class StringExplorer {
  public static void main(String[] args) {
    // Count down with a "T minus 5"
    for (int i = 5; i > 0; i--) {
      System.out.println("T minus" + i);
    }
    // Declare and instantiate a Scanner
    Scanner input = new Scanner(System.in);
    while (true) {

      // infinite loop

      // take an input
      String userSaysWhat = input.nextLine();
      // repeat input + message
      System.out.println(userSaysWhat + " means you need more calcium. in your ");
      // implement "equals" to stop with the word "stop"
      if (userSaysWhat.equals("stop")) {
        break;
      }
    }
    /*
     * ---------------------------
     * SAMPLE STUFF
     * ---------------------------
     */
    String sample = "The quick brown fox jumped over the lazy dog.";

    // Print the sample and add a blank line after
    System.out.println("OUR SAMPLE:");

    // Demonstrate the length method.
    int l = sample.length();
    System.out.println("sample.length() = " + l);

    // Demonstrate the indexOf method.
    int position = sample.indexOf("quick");
    System.out.println("sample.indexOf(\"quick\") = " + position);

    // Demonstrate the toLowerCase method.
    String lowerCase = sample.toLowerCase();
    System.out.println("sample.toLowerCase() = " + lowerCase);
    System.out.println("After toLowerCase(), sample = " + sample);

    // toUpperCase
    String toUpperCase = sample.toUpperCase();
    System.out.println(sample.toUpperCase());
    System.out.println("After toUpperCase(),sample= " + sample);

    // lastIndexOf
    int pos = sample.lastIndexOf("lazy");
    System.out.println("sample.lastIndexOf(\"last\")= " + pos);

    // substring
    substring=text[10,25]
    System.out.println(sample.(0,25));{

    }
    // equals

  }
}
