import java.util.Scanner;
class main {
  public static void main(String[] args) {
    System.out.println("hello");
    System.out.println("welcome to name verification");
    try (Scanner namever = new Scanner(System.in)) {
      System.out.println("what is your name? >");
      String iptname = namever.nextLine();
      if (iptname == "ben") {
        System.out.println("name verified. welcome, master benjamin");
      } else {
        System.out.println("wrong you fucking dumass");
      }
    }

    
  }
}
