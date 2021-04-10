package basic_java;

public class Literals {

    public static void main(String[] args) {
        literals();

    }



    /*
    A literal is a source code representation of a fixed value.
    They are represented directly in the code without any computation.
    Literals can be assigned to any primitive type variable.

    Java supports five types of literals which are as follows:

    Integer
    Floating Point
    Character
    String
    Boolean
     */

    static void literals()
    {
        int x=200; //200 is  int literal
        int y=0111; //BINARY FORM
        int z=0xA; //A İN HEXADECIMAL

        System.out.printf("x:%d %n y:%d %n z:%d %n",x,y,z);

        //String and char types of literals can contain any Unicode characters. For example −
        char a = '\u0001';
        String a1 = "\u0002";

        System.out.println( a + " "+ a1 );

    }


}
