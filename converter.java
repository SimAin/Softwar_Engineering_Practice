public class converter {

    public static int readNumber (String str) {
        int result = 0;

        try {
            result = Integer.parseInt (str);
        } catch (NumberFormatException ex) {           
            System.out.println ("Read Number failed to parse " + str);
        }

        return result;
    }

    public static void main (String[] args) {
      int sum = 0;
      sum = sum + readNumber ("12");
      sum = sum + readNumber ("x");

      System.out.println ("Sum is " + sum);
    }
}

