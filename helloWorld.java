public class helloWorld {
    public static void main(String[] args){
        System.out.println("Hello World");
        shortDemo();
        doubleDemo();
        floatDemo();
    }

    public static void dataTypes(){
        //Byte
        //-128 to +127
        byte a = 1;
        
        //Short
        //-32768 to +32767
        //(16 bits storage)
        //Note - 30000*2 = -5536. Once it has exceeded the max value it addes the remaining to the minimum value (See shortDemo)
        short b = 12;
        
        //Int
        //-2147483648 to +2147483647
        //(32 bits storage)
        int c = 123;

        //Long
        //-9.223 x 10^18 to +9.223 x 10^18
        //(64 bits storage)
        long d = 123456;

        //Float
        //-3.4 x 10^38 to 3.4 x 10^38
        float e = 123456789;

        //Double
        //-1.8 x 10^308 to 1.7 x 10^308
        double f = 123123123;

        //Boolean
        //True / False
        boolean g = true;

        //Char 
        // 16 bit Unicode value
        char h = 'h';

        //String
        //Not a primitive - it is in fact an instance of the class String but in many respects it is treated as though it were a primitive, 
        //as strings are supported with some special syntax for creating and manipulating them.
        String i = "Not a trype";

        //Array
        int[] array = new int [10];
        String[] array2 = new String [10];

        //2D array
        int[][] grid = new int [5][7] ;
        grid[2][6] = 100;
    }

    public static void shortDemo(){
        short result = 0;
        short mynumber = 30000;
        mynumber = (short) (mynumber * 2);
        result = mynumber;

        System.out.println("Short");
        System.out.println(result);
    }

    public static void doubleDemo(){
        double number1;
        double number2;
        double result;

        number1 = 6.43;
        number2 = 4.57;

        result = number1 + number2;

        System.out.println("Double");
        System.out.println(result);
    }

    public static void floatDemo(){
        float number1;
        float number2;
        float result;

        number1 = 6.43f;
        number2 = 4.57f;

        result = number1 + number2;

        System.out.println("Float");
        System.out.println(result);
    }
}