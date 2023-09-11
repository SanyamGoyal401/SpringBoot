
public class Literal {
    public static void main(String[] args) {
        int num1 = 0b101;
        int num2 = 0x7EA;
        int num3 = 10_00_000;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);


        //Data Types in java;
        byte b = 127; //1 byte
        short s = 10000; //2 bytes
        int i = 293923; //4 bytes
        long l = 390843; //8 bytes
        float f = 33.4f; //4 bytes
        double d = 33.4444448949; //8 bytes
        char c = 'd'; //Unicode 2 bytes


        int number = 1;
        ++number; //(2)pre increment operator - increment the value first then use
        System.out.println(number); 
        --number; //(1)pre decrement operator - decrement the value first then use
        System.out.println(number);
        number++; //(2)post increment operator - use first then increment the value
        System.out.println(number);
        number--; //(1)post decrement operator - use first then decrement the value


    }
}
 