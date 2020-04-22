package day04_JavaRecap;

public class Variable_Practice {
    public static void main(String[] args) {
        byte num1 = 127;
        short num2 = num1;
        //byte num3 =num2; short byet'a atanamaz
        int num4 = num2; //int //is prefered by compiler

        long num5 = 99999999l;
        float num6 = 100L;
        System.out.println(num6);
        float num7 = 0.5f;
        double num8 = 0.5f;
        System.out.println("===================");
        char ch1 = '$'; // every single character has a correspondind number.

        char ch2 = 4500;
        System.out.println(ch2);

        int a1 = '8';
        System.out.println(a1);
        int a2='z';
        System.out.println(a2);

        char ch4 = 'z' + '8';
        System.out.println(ch4);

        boolean bool1 = true ;
        boolean bool2 = false;
        System.out.println( 9 > 10 ); //false
        System.out.println( 9 >= 10 ); //true
        System.out.println( 9 != 10 ); //true
        System.out.println( 'a'=='b'); //false
        System.out.println("========================--===========");
        float f1 = 10 / 4 ;
        float f2 = 10 / 4f ;// bu onemli
        System.out.println(f1);
        System.out.println(f2);







    }
}
