public class passingArguments {

 //Run with name param
 //Name gets passed in as String argument '(String[] args)'
 //Num gets passed in as String argument '(String[] args)' then converted to int
  public static void main (String[] args) {


    if (args.length == 0) {
    System.out.println ("You must type in something");
    } else {
    try {
      int value = Integer.parseInt (args[0]);
      System.out.println ("Double of " + value + " is " + 2*value);
    } catch (NumberFormatException nfe) {
      System.out.println ("You must provide a number");
    }
    }

    if (args.length == 0) {
      System.out.println ("Hello.  Please tell me your name next time.");
    } else {
      for (String s : args) {
        System.out.println ("Hello " + s);
      }
      
    }
  }
}