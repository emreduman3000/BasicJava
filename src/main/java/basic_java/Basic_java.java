/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic_java;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author emreduman
 */
public class Basic_java
{

    static final int a =1;
    static int b=2;   //field - instance variable
    static private double cev;
    static private double dev;
    
    public String name;

    /**
     * @param name
     */
     public Basic_java(String name) {
        this.name=name;
    } 
    public Basic_java() {
    }



     /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
       

            Basic_java nesneee=new Basic_java();  
            //System.out.println(nesneee instanceof Basic_java);//true
            //String qwe="qwe"; System.out.println(qwe instanceof String);//true
            //int i=1; //System.out.println(i instanceof Integer);//variable must be reference data type
            //Integer i2=new Integer(1); System.out.println(i2 instanceof Integer);//true


        //<editor-fold defaultstate="collapsed" desc="run">

        //showMESSAGEdialog();
        //SCANNER();
        //showINPUTdialog();
        //MATH();
        //VARIABLES();
        //wrapperClass();
        //autoBoxing();
        //unBoxing();
        //printf();
        //format();
        //formatter();
        //characters();

        //customFormat();
        //<editor-fold defaultstate="collapsed" desc=" DECIMALFORMAT">
        /*
        customFormat("###,###.###", 123456.789);
        customFormat("###.##", 123456.789);
        customFormat("000000.000", 12.78);
        customFormat("$###,###.###", 12345.67);
        System.out.println (new DecimalFormat("###,###.##").format (123456.742));//40
        System.out.println (DecimalFormat.getInstance().format (011223.12294));//95
        */

        // </editor-fold>

        //TypeCasting();
        //conversion();

        //Bitwise_Operators();
        //Arithmetic_Operators();
        //Assignment_Operators();
        //Comparison_Operators();
        //Logical_Operators();
        //concatenation();
        //codeBlock();

        //showMESSAGEdialog();


        //int[] iff=IF(new int []{1,2,3}); printArray(iff);  System.out.println(Arrays.toString(iff));
        //ternary();
        //SWITCH();
        //WHILE();
        //FOR();
        //

        //break_continue();
        //label();
        //FOR_EACH();
        //SHORTCUT();

        //MATH();

        //SCANNER();

        //Varargs();//Number of arguments: 0


        //int [] a56=new int[]{1,2,3,4,5}; System.out.println(ARRAY(a56));System.out.println(Arrays.toString(a56));//[10, 2, 3, 4, 5]

        //ARRAYLIST();
        //date();
        //Stringg();
        //StringBuilder();
        //StringBuffer();


        //icice_Methods();//ebob-ekok
        //icice_Methods2();
        //icice_Methods3();

        //setPassword nesne= new setPassword();
        //nesne.putPassword();
        //setPassword.putPassword();

        //AlgorithmQuestions();

        //nesneee.passByValue_Reference();
        //nesneee.passByValueAndReference();

        // </editor-fold>
 
        //<editor-fold defaultstate="collapsed" desc="ARRAY-Class">
/*
       Scanner scan=new Scanner(System.in);
       int itemNumber;
       while(true)
       {
            System.out.print("Determine the Shopping List Capacity:");
            itemNumber=scan.nextInt();
          
            if(0<=itemNumber && itemNumber<=20)
                break;
            else
                System.out.println("The List Limit must be between 0-20");
       
       }
       ARRAYshopping shop = new ARRAYshopping(itemNumber);
       boolean go=true;
       int listNo=0;
       int a,b,c,d;

       
       while(go)
       {
           Scanner scan2=new Scanner(System.in);
           System.out.println("To add item(Press 1):\nTo delete item(press 2)\n"
           +"To display the list(press3)\nto sort out the list(press4)\nto swap 2 items(press 5)\nTo Exit(press 6)\n");
           int option=scan.nextInt();
           switch (option)
           {
                case 1:
                    Scanner scan3=new Scanner(System.in);
                    if(listNo<itemNumber)
                    {
                        listNo++;
                        System.out.printf("Add your %d.item:",listNo);
                        String item=scan2.nextLine();
                        shop.AddItems(item);
                    }
                    if(listNo==itemNumber)
                    {
                        System.out.println("The List is Full!!!");
                        System.out.println("If you want increase the limit and add an item(press 1):");
                        a=scan3.nextInt();
                        if(a==1)
                        {
                            Scanner scan4=new Scanner(System.in);
                            System.out.println("please enter your item's row :");
                            int row=scan4.nextInt();
                            System.out.println("and name:");
                            String added=scan4.next();
                            shop.addItems_index(added, row);
                        }     
                        else{System.out.println("okay :)");}
                    }
                    break;
                case 2:
                   System.out.println("To delete from the first line(press 1)");
                   System.out.println("To delete from the last line(press 2)");
                   System.out.println("To delete from any line (press 3)");
                   System.out.println("NOT To delete anything (press 4)");
                   int delOption=scan.nextInt();
                   if(delOption==1){shop.Del_item_fromBeginning();}
                   if(delOption==2){shop.Del_item_fromEnd();}
                   if(delOption==3){System.out.println("Please type the number of the item:");shop.Del_item(scan2.nextInt());}
                   if(delOption==4){}
                   break;
                case 3:
                    shop.printList();
                    break;
                    
                case 4:
                    shop.sortOut();
                    break;

                case 5:
                    Scanner scan4=new Scanner(System.in);
                    System.out.println("change the place of two items\nThe first item's number:");
                    c=scan4.nextInt();
                    System.out.println("The sdcond item's number:");
                    d=scan4.nextInt();
                    shop.swap(c, d);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("enter between 1-6");
                   break;                          
           }
           
            if(option==6){break;}
           
        
       }
       
       */
                // </editor-fold>
               
        //<editor-fold defaultstate="collapsed" desc="selectionSort|array ||reverse method">
        /*
        SelectionSort ob = new SelectionSort(); 
        int arr[] = {64,25,12,22,11}; 
        ob.sort(arr); 
        System.out.println("Sorted array"); 
        ob.printArray(arr); 
        */
        /*
        int[] list = {1, 2, 3, 4, 5};//reverse method in methods
        reverse(list);//ben yazdım listeyi ters çevirsin
        for (int i = 0; i < list.length; i++)
        System.out.print(list[i] + " ");

        
        
        
        int number = 0;   //m method in methods
        int[] numbers = new int[1];
        m(number, numbers);
        System.out.println("number is " + number
        + " and numbers[0] is " + numbers[0]);
        
        
         
        
        
        
        
        int myArray[ ] = new int [3]; //manually
        myArray[0] = 10; myArray[1] = 20; myArray[2] = 30;
        System.out.println("Printing integer array before passing to a function");
        for (int i = 0; i < myArray.length; i++)
        System.out.println(" Index " + i + " of the array have value = " + myArray[i]);

        modified(myArray); ///calling a method

        System.out.println("Printing integer array after passing to the function");
        for (int i = 0; i < myArray.length; i++)
        System.out.println(" Index " + i + " of the array have value = " + myArray[i]); */

        
        //add_up();// this method is in the method region

        // </editor-fold>
                      

        
        //<editor-fold defaultstate="collapsed" desc=" Methods ">

        
   
         int a=9;//ıf ı didnot identify a in main method static a was going to be used
        //int a=8;//ı cant assign a new value to a variable
        a=8; // a's new value is 8

        //System.out.println("A:"+a);//second a in main method
        //System.out.println("B:"+b);//static b out of main method

        //method1();
        //System.out.println(method1());//error because it is void message
        //method2(new Basic_java());
        //method2(5);
        //method2(1,2,3,4,5,6);
        String bbb="Mr.DUMAN";
        //method3("Mr.Clay and ",bbb);
        //method3(b);//ıt has to have 2 parameter
        //method3(6, " string");//there are 2 method named method3 but their parameter's type different so they both execute
        //bbb=method3();
        //System.out.println(bbb); // or sout(method3());
        //method3(4,4);//println:8
        //int ddd= method3(4,4);//8
        //
        // ddd=ddd*ddd;//64
        //System.out.println(ddd);//println:8 return 64
        //System.out.println(method3(3,3));//println:6 return:6

        //Basic_java nesne=new Basic_java(); nesne.method3(1,2,"3");//aaaa 23 static method değil nesne gerekli
        //System.out.println(method3());//turkey turkey
        //Basic_java.method3();//turkey - class ismi ile klas içindeki static degerlere ulasbilirim


        
       
        
        //method2(1,2,3,4,5,6);

  
        // </editor-fold>   
              
    }   
    
    
    
    //<editor-fold defaultstate="collapsed" desc=" METHODS ">

    //VOID WITHOUT PARAMETER
    public static void method1()//void=not returning the value
    {
        int a=4;
        a=3*a;//a is 4
        int b=0000;
        System.out.println("A+B:"+a+b);//adding up as a string
        System.out.println("A+B:"+(a+b));//addng up as a number
    }
      
    
    //VOID WITH PARAMETER
    
    public static void method2(Basic_java c)//c.a ( a variable that is out of main)
    {
       
        int a=5 ;//classın içinde global bir a var ,bumethod class adıyla parametre cağrıyor
       //so ı cant creat e new integer named a
        System.out.println((c.a) *a*b);  //static
    }
    
    //OVERLOADING
    public static void method2(int... parametres)//array gibi
    {
        int sum=0;
        for(int i:parametres)
        {
            sum+=i;
        }
        System.out.println(parametres[0]);
        System.out.println(Arrays.toString(parametres));
    }

   // protected void method2(Basic_java c){} overloading errror
   //public static int method2(Basic_java c){return 1;}//overloading errorr



    public static void method3(String name,String surname)//str b == str name parameter
    {
        int a=3;
        name="aaaaa";//this one is used 
        System.out.println(name);
        System.out.println("merhaba "+a+name+" "+surname);
    }

    public static void method3(int integer,String str) 
    {
        System.out.println("aaaa "+integer+ str);       
    }
    public static void method3(String integer,int str) 
    {
        System.out.println("aaaa "+integer+ str);       
    } 
      public void method3(int f,int integer,String str) 
    {
        System.out.println("aaaa "+integer+ str);       
    }
    
    
    
    //INT WITH PARAMETER
    public static int method3(int a,int b)
    {
        int c=a+b;//8
        System.out.println(c);// void 8
        return a+b;///8
        //return c;// comes out of method3 8
        //System.out.println(c);// after return nothing can be printed  
    }
    //public static double method3(int a,int b) { } //override etmez
    

    
    //STRING WITHOUT PARAMETER
    public static String method3()
    {
        System.out.println("turkey");
        return "turkey";
        //String a="TURKEY";       
        //return a;
    }
    
    
    
    
    public static void reverse(int[] list)//array-main
    {
    int[] newList = new int[list.length];
    for (int i = 0; i < list.length; i++)
    newList[i] = list[list.length - 1 - i];
    }
    
    public static void m(int x, int[] y) //array-main
    {
        x = 3;
        y[0] = 3;
    }
    
    
    public static double max()//in showinput
    {
        if (a > b)
            return a;
        else
            return b;
    }

       static void modified(int jun[ ])//array
    {
        for(int i =0; i < jun.length; i++)
            jun[i] = 100;
    }

    public static void add_up()//array
    {
        
        Scanner object=new Scanner(System.in);
        int[] circleArray = new int[4];
        for (int i = 0; i < circleArray.length; i++)
        {
            System.out.printf("Enter %d. Element:",i+1,"\n");
            circleArray[i]=object.nextInt();
        }
        for (int i = 0; i < circleArray.length; i++)
            System.out.println(circleArray[i]);
        
        //method ile array'i çağırdım,methodun iççinde liste elemanlarını topla dedim
        
        int total=0;
        for( int i=0;i<circleArray.length;i++)
        {
            total+=circleArray[i];
        }
        System.out.println("sum of elements of array:"+total);
        System.out.println("average:"+(double)total/circleArray.length);    
    }

    
    static void modifie(int jun[ ])//array
    {
        for(int i =0; i < jun.length; i++)
            jun[i] = 100;
    }

      //OVERRIDING methodları sadece inheritance yapmis classlarda olur
    
   
      
      
    // </editor-fold>
       
    //<editor-fold defaultstate="collapsed" desc=" BASIC INFOs">
    
    /*
    
    
    cd thr address of the file
    javadoc -d foldernamethat ı created  file.java  -version -param -author -return - since
    
    
DATA TYPES			  

        1-PRIMITIVE DATA TYPES

              1a.)There are 8 primitive data types in Java:

                      Data Type	Size		Description
                      byte		1 byte		Stores whole numbers from -128 to 127
                      short		2 bytes		Stores whole numbers from -32,768 to 32,767
                      int		4 bytes		Stores whole numbers from -2,147,483,648 to 2,147,483,647
                      long		8 bytes		Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
                      float		4 bytes		Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
                      double		8 bytes		Stores fractional numbers. Sufficient for storing 15 decimal digits
                      boolean		1 bit		Stores true or false values
                      char		2 bytes		Stores a single character/letter or ASCII values

              1b.)Numbers

                      Primitive number types are divided into 2 groups:

                      * Integer types stores  without decimals. Valid types are byte, short, int and long. 			
                      * Floating point types represents numbers with a fractional part, containing one or more decimals. There are two types: float and double.

      2-NON-PRIMITIVE DATA TYPES

              Non-primitive data types are called reference types because they refer to objects.

              The main difference between primitive and non-primitive data types are:

              * Primitive types are predefined (already defined) in Java. Non-primitive types are created by the programmer 
                and is not defined by Java (except for String).

              * Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.

              * A primitive type has always a value, while non-primitive types can be null.
              * A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
              * The size of a primitive type depends on the data type, while non-primitive types have all the same size.
              * Examples of non-primitive types are Strings, Arrays, Classes, Interface, etc. You will learn more about these in a later chapter.

        
        
    Primitive Data Types
    1-Integral
    -short
    -char
    -long
    -int
    -byte
    
    2-floating-point
    -float
    -double
    
    3-Boolean operand
    -true
    -false
    
    
    
    Identifier:
    A Java identifier consists of letters, digits, the underscore character (_),and the dollar sign ($),
    and must begin with a letter, underscore, or the dollar sign.
    Identifiers can be made of only letters, digits, the underscore character (_), and the dollar sign ($);
    no other symbols are permitted to form an identifier
    
    Identifier Description
    Examples of Illegal Identifiers
    employee Salary  ->>> There can be no space between employeeand Salary.
    Hello!           ->>> The exclamation mark cannot be used in an identifier.
    one+two          ->>> The symbol +cannot be used in an identifier.
    2nd              ->>> An identifier cannot begin with a digit.
    
      
    
    The smallest individual unit of a program written in any programming language is called a "TOKEN". 
    Java’s tokens are divided into special symbols, word symbols, and identifier.
    
    
    
    Word Symbols:
    A second category of tokens is word symbols.Some word symbols include the following:
    int, float, double, char, void, public, static, throws, return.Word symbols are also called reserved words, or keywords.
    The letters in a reserved wordare always lowercase. Like the special symbols, each word symbol is considered a single sym-bol.
    Furthermore, word symbols cannot be redefined within any program; that is, they can-not be used for anything other than their intended use.

    
    Special Symbols:
    +  -  *  /    Mathematical operators
    .  ;  ?  ,    question mark , comma
    <= != == >=   Comparison operators
    
    
    Logical operators 
    NOT (!), AND (& or &&), OR (| or ||), Exclusive (^)
    
    Concatenation operator 
(+)Concatenation operator (+) art arda baglama
Increment operator (++)
Decrement operator(--)
    
    
    Increment and Decrement Operators
    •x = 1;
    •y = 1 + x++;
    •y = 1 + ++x;
    
    •y = 1 + x--;
    •y = 1 + --x;
    
    

    
    Shortcut operators
    +=    i+=8      i = i+8 
    -=    f-=8.0    f = f-8.0
    *=    i*=8      i = i*8
    /=    i/=8      i = i/8
    %=    i%=8      i = i%8
    
    
    
    
    

    Operator Precedence
    Casting                  Highest order
    ++, -- 
    *, / , % 
    +, -
    <,  <=, >, =>
    ==, !=;
    && 
    ||
    =,  +=, -=, *=, /=, %=  Lowest order


    ERRORS
    //ShowRuntimeError   
        System.out.println(1 / 0);
    
    //ShowSyntaxError
        //System.out.pprint(b);
        
    //ShowLogicError
        System.out.println("Celsius 35 is Fahrenheit degree ");
        System.out.println((9.0 / 5) * 35 + 32);
    
    
    
  
    FORMAT SPECIFIER    OUTPUT                      
    %b                  boolean
    %c                  char
    %d                  a decimal integer
    %f                  a floating-point number
    %e                  a number in standard scientific notation(sembolle gösterim) 4.556000e+01
    %s                  string
    
    
    
    
    

1-Class
2-Package
3-Subclass
4-World
    
    Modifier
public
Y
Y
Y
Y
protected
Y
Y
Y
N
no modifier
Y
Y
N
N
private
Y
N
N
N
    
    
    
    */
    
    
    
    // </editor-fold>


    //<editor-fold defaultstate="collapsed" desc=TOKENS

        /*
        What are Tokens in Java and how to Implement them?
        In Java, a program is a collection of classes and methods, while methods are a collection of various expressions and statements. Tokens in Java are the small units of code which a Java compiler uses for constructing those statements and expressions. Java supports 5 types of tokens which are:

        1-Keywords -> public static void  int volatile throw implements extends...
                    String string="string is not a keyword";

        2-Identifiers -> (package class method instance)'s name
                        keywords can’t be used as identifiers in Java.
                        Example:
                            //Valid Identifiers
                            $myvariable  //correct
                            _variable    //correct
                            variable     //correct
                            edu_identifier_name //correct
                            edu2019var   //correct

                            //Invalid Identifiers
                            edu variable    //error
                            Edu_identifier  //error
                            &variable       //error
                            23identifier    //error
                            switch          //error
                            var/edu         //error
                            edureka's       //error

        3-Literals:
                    Literals in Java are similar to normal variables but their values cannot be changed once assigned. In other words, literals are constant variables with fixed values. These are defined by users and can belong to any data type.
                    Java supports five types of literals which are as follows:
                        Integer
                        Floating Point
                        Character
                        String
                        Boolean
        4-Operators -> + - * / < > = ...
        5-Special Symbols -> {} () [] , ; *
         */

    //<editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Variables ">

    public void variable()
    {
        //static int aa;//ERRORR  method içine static variable atanamaz
    }
    static public void VARIABLES()
    {
        //static int bb; ERROR!!!
        int aaa;//local variable must be initialized
        //System.out.println(aaa);//if ı want to run it gives error

        int f=99; //32 bitlik alan ayrıldı stack bellekte
        float g=f; System.out.println(g);//99.0
        int j=00; System.out.println(j);//0
        //int jj=09; System.out.println(jj);//0 error
        int c=6;   // at c#  ıt is possibly to write int c=6 + d=4
        //int c=7; //ı cant assign c new value to a variable
        c=5;
        b=3;//  static int b - field of the class
        int b=4;//ıt is not private static int b
        b=1;
        System.out.println(c+b-b*c);  System.out.println(-c/b);//b=1; will be compiled
        System.out.println("java"+1+2+4+c);

        String t="java";
        int tt=1;
        System.out.println(t+tt);//concanication

        //int qq=09; SYNTAX ERROR
        final int ww=2; //CANT BE CHANGED

        //int rr+=i; runtime error


        int yy=5; float ff=3.0f; System.out.println(yy+ff);//8.0
        System.out.println(yy%ff);//2.0
    }


    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc="concatenation ">
    public static void concatenation()
    {
        //soldan saga calisir
        System.out.println("3"+4);//34
        System.out.println("3"+4+5);//345
        System.out.println("3"+(4+5));//39
        System.out.println(3+4+"5");//75
        System.out.println(3+4+"5"+6);//756
        System.out.println(3*4+"5"+6/2);//1253
        System.out.println("3*4"+5+6);//3*456
        
        String sk  = String.valueOf(54);
        System.out.println(sk + 123);//54123
        System.out.println("emre"+1+2+3);//emre123
        System.out.println(1+2+3+"emre"+4);//6emre4
   
    }
 
    // </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="printf ">

    public static void printf()
    {

        /*
        FORMAT SPECIFIER	CONVERSION APPLIED
        %%	Inserts a % sign
        %x %X	Integer hexadecimal
        %t %T	Time and Date
        %s %S	String
        %n	Inserts a newline character
        %o	Octal integer
        %f	Decimal floating-point
        %e %E	Scientific notation
        %g	Causes Formatter to use either %f or %e, whichever is shorter
        %h %H	Hash code of the argument
        %d	Decimal integer
        %c	Character
        %b %B	Boolean
        %a %A	Floating-point hexadecimal
        */
            System.out.printf("The result of %f times %f is %f. \n", .25, 1.1, (.25 * 1.1));//virgulden sonra 6 digits
                //The result of 0.250000 times 1.100000 is 0.275000.

            System.out.printf("%d%n", 25);//25 -*ğ-

        // %d is used for integer values
            System.out.printf("DECIMAL:%d\n",2555);//we have put %d to print all values together
            //System.out.printf("%d",0.2);error
            //System.out.printf("%f",888); error
            System.out.printf("%s%n","wfew");
            int count=5; double amounnt=45.56; System.out.printf("count is %d and amount is %f  \n",count,amounnt);
            //count is 5 and amount is 45.560000 
            
            
            
            
            double amountt=12618.98, interestRate=0.0013,  interest=amountt*interestRate;
            System.out.printf("Interest is $%.4f\n",interest);//Interest is $16.4047
        
            System.out.printf("FLOAT:%f\n",12345678910111213.0000000001);//12345678910111214.000000 6 digitten dazla olunca yukarı yuvarlar
            System.out.printf("FLOAT:!%10.5f!\n",2.345);//FLOAT:***2.34500  - nokta dahil toplam 10 digits
            System.out.printf("FLOAT:'%10.7f'\n",2.345);//FLOAT:*2.34500000
            System.out.printf("FLOAT:%f\n",2.345f);//FLOAT:2.345000
            System.out.printf("'%-1.2f'\n", 7.245);//45 46 47 48 49 50 --> 7.25
            System.out.printf("'%-3.2f'\n", 7777888.2777);//toplam 5 haneli olmalı 7777888.28
            
            
            
            //ERRORS
            //System.out.printf("%5d %d", 1, 2, 3);there must not be 3 parameter
            //System.out.printf("%5d %f", 1);//there must be 2 parameter
            System.out.printf("%5d %f%n", 1, 2.);// ****1 2.000000  -  I must 2.  2.0  2f   2F
            
            System.out.printf("Hello%2d and %8s", 10, "Hi!!!%n\n");//8 ve altı yazarssan boşluk işlemez
            System.out.printf("Hi,%s%4d%n", "Hello", 88);//Hi,Hello**88
            System.out.printf("Hi, %d %4.2f%n", 8, 5.556);//Hi, 8 5.56
            System.out.printf("Hi,%-4s&%6.2f%n", "Hi", 5.5);//Hi,Hi**&**5.50  - -4 ile sona 2 bosluk koydu, 6 ile basa 2 bosluk koydu
            System.out.printf("Hi, Hi, %.4f%n", 5.56);//5.5600
            
            String hh; //String hh=printf yapamam error format da olur ama
            System.out.printf("The value of the float variable is " +
                  "%f, while the value of the integer " +
                  "variable is %d, and the string " +
                  "is %s  %n", 4.4, 4, 4);
            
            
            System.out.printf("%s %n",4);//4
            System.out.printf("%c %n",'c');//c

        //boolean Formatting
        //To format boolean values, we use the %b format. It works the following way: If the input value is true, the output is true. Otherwise, the output is false.


        System.out.printf("%b%n", null);//false
        System.out.printf("%B%n", false);//false
        System.out.printf("%B%n", 5.3);//true
        System.out.printf("%b%n", "random text");//True

        //6. Char Formatting
        //The result of %c is a Unicode character:

        System.out.printf("%c%n", 's');//s
        System.out.printf("%C%n", 's');//S


       // 7.1. Integer Formatting
        //The printf() method accepts all the integers available in the language;
        // byte, short, int, long and BigInteger if we use %d:

         System.out.printf("simple integer: %d%n", 10000L);
        //simple integer: 10000


/*
        8.1. Time Formatting
        First, let's see the list of some useful suffix characters for Time Formatting:

        ‘H', ‘M', ‘S'  – characters are responsible for extracting the hours, minutes and second from the input Date
        ‘L', ‘N'  – to represent the time in milliseconds and nanoseconds accordingly
        ‘p' – adds am/pm formatting
        ‘z' – prints out the timezone offset
        Now, let's say we wanted to print out the time part of a Date:
*/

        Date date = new Date();
        System.out.printf("%tT%n", date);//        13:51:15
        System.out.printf("%tT%n", new Date());//        13:51:15

        //The code above along with ‘%tT' combination produces the following output:


    System.out.printf("hours %tH: minutes %tM: seconds %tS%n", date, date, date);
       // Having used ‘H', ‘M', and ‘S' we get:
       // hours 13: minutes 51: seconds 15
            
    }
      
    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc="wrapperClass">

    public static void wrapperClass()
    {

        ///Importance of Wrapper classes

        //There are mainly two uses with wrapper classes.
            //1) To convert simple data types into objects, that is, to give object form to a data type; here constructors are used.
            //2) To convert strings into data types (known as parsing operations), here methods of type parseXXX() are used.

        //Features of the Java wrapper Classes.
            //1) Wrapper classes convert numeric strings into numeric values.
            //2) The way to store primitive data in an object.
            //3) The valueOf() method is available in all wrapper classes except Character
            //4) All wrapper classes have typeValue() method. This method returns the value of the object as its primitive type.

        //primitive data type - hafızada ne kadar yer kapladıgı belli olan data types
        //WRAPPER CLASSES AND THEIR METHODS
        int i=1,i2=2,i3=3;
        System.out.println("Min:"+Integer.MIN_VALUE+"  Max:"+Integer.MAX_VALUE);//Min:-2147483648  Max:2147483647
        System.out.println("hashCode:"+Integer.hashCode((i+i2+4))+"bitCount:"+Integer.bitCount(1234));//hashCode:7 bitCount:5
        System.out.println("min:"+Integer.max(i, i2)+"max:"+Integer.min(i, i2));//min:2max:1

        System.out.println("Size(bits):"+Long.SIZE+"  Bytes:"+Long.BYTES + " Type:"+ Long.TYPE);//Size(bits):64  Bytes:8  Type:long
        System.out.println("Double NaN:"+Double.NaN+ " MAX_EXPONENT:"+Double.MAX_EXPONENT);//Double NaN:NaN MAX_EXPONENT:1023

        short x=-3,y=4,z=8;
        System.out.println("valueOf:"+Integer.valueOf(x)+ "  compare"+ Short.compare(x, y));//valueOf:-3  compare-7 x-y
        System.out.println( Double.valueOf(z).compareTo(Double.valueOf(y)));//z short variable is greater (+4)
        System.out.println("Size:"+Short.MIN_VALUE+"  Bytes:"+Short.MAX_VALUE);//Size:-32768  Bytes:32767

        char [] charArray={'1','2'};
        System.out.println("CHARARRAY TO STRING:"+String.copyValueOf(charArray));//CHARARRAY TO STRING:12

        String string =new String("Java 10");
        Integer integer =new Integer("1023");//integer yazar
        System.out.println(integer);//1023 - because toString method is available in Integer Class
        Integer integer2 =12;//autoBoxing
        System.out.println(integer2);//12
        Double d=new Double(1.0d);
        Double d2=1.0;
        System.out.println(string+"  "+integer+" "+integer2);//Java 10  1023  12  concanation



        //String
        String s1 = new String("s1");
        String s2=s1;//unBoxing gibi ama değil çünkü s2 objecttir.
        System.out.println(s2);

        String ss="str";//AutoBoxing!!!

        String s3= new String();// = ""
        System.out.println(s3);

        StringBuilder s4= new StringBuilder();// = ""
        System.out.println(s4);


    }


    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc="AutoBoxing-UnBoxing">


    public static void autoBoxing()
    {
        //Basically, generic classes only work with objects and don't support primitives. As a result,
        // if we want to work with them, we have to convert primitive values into wrapper objects.

        //Let's see an example of converting an int value to an Integer object in Java:

        Integer object = new Integer(1);
        System.out.println(object);//1
        System.out.println(object instanceof  Integer);//true


        Integer anotherObject = Integer.valueOf(1);//valueOf() methodun new Integer(); ifadesi vardır

        int intValue=object.intValue();
        long longValue=object.longValue();

        System.out.println(intValue);//1
        //System.out.println(intValue instanceof Integer);//casting compile errror

        int int2=object;//unboxing
        System.out.println(int2);

        Integer intObject=1;//autoboxing
        System.out.println(intObject);
//

        //Boxing refers to converting a primitive value into a corresponding wrapper object.
        // Because this can happen automatically, it's known as autoboxing.

        //What this means in practice is that we can pass a primitive value to a method
        // which expects a wrapper object or assign a primitive to a variable
        // which expects an object:

        List<Integer> list = new ArrayList<Integer>();
        list.add(1); // autoboxing

        Integer val = 2; // autoboxing
        //In this example, Java will automatically convert the primitive int value to the wrapper.

        //Internally, it uses the valueOf() method to facilitate the conversion.
        // For example, the following lines are equivalent:

        Integer value = 3;
        Integer value2 = Integer.valueOf(3);
    }


    public static void unBoxing()
    {
        //Similar to autoboxing, unboxing is done automatically when passing an object to a method
        // that expects a primitive or when assigning it to a primitive variable:

        Integer object = new Integer(1);
        int val1 = getSquareValue(object); //unboxing
        int val2 = object; //unboxing

        //Basically, if we write a method that accepts a primitive value or wrapper object,
        // we can still pass both values to them. Java will take care of passing
        // the right type e.g. primitive or wrapper depending upon context.
    }

    public static int getSquareValue(int i) {
        return i*i;
    }
    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc="System.out.format - String.format ">

    public static void format()
    {


        //String.format returns a new String,
        // while System.out.printf just displays the newly formatted
        
        /*
        FORMAT SPECIFIER	CONVERSION APPLIED
        %%	Inserts a % sign
        %x %X	Integer hexadecimal
        %t %T	Time and Date
        %s %S	String
        %n	Inserts a newline character
        %o	Octal integer
        %f	Decimal floating-point
        %e %E	Scientific notation
        %g	Causes Formatter to use either %f or %e, whichever is shorter
        %h %H	Hash code of the argument
        %d	Decimal integer
        %c	Character
        %b %B	Boolean
        %a %A	Floating-point hexadecimal
        */

         //   The System.out.format() method works exactly the same as
            //   System.out.printf()! 
            System.out.format("%10d\n",2);// *********2   ıt is printed in 10th digit
            System.out.printf("%10d%n",2);// *********2
            System.out.format("%12.2f\n",123.456789);// *******12.46
            System.out.format("%8d%8s%8.3f\n",1234567,"jajava",123456.123456);//*1234567**jajava123456.123   -  the last digit will be 8th digit
            System.out.format("%-8d%-8s%-8.1f\n",1234,"java",5.63);//1234****java****5.6*****
            
            long n = 461012;
            System.out.format("%d%n", n);//461012      %n == \n
            System.out.format("%08d%n", n);//00461012
            System.out.format("%+8d%n", n);//*+461012
            System.out.format("%,8d%n", n);//*461,012
            System.out.format("%+,8d%n%n", n);//+461,012
            
            double pi = Math.PI;                System.out.format("%f%n", pi);       System.out.format("%.3f%n", pi);   
                                                System.out.format("%10.3f%n", pi);   System.out.format("%-10.3f merhaba%n", pi); 
            
            
            System.out.format("%s \n %n ",String.format("%s","String"));

            //String acc=System.out.print("accc");   ERROR
            
            String format = String.format("|%30s|", "Hello World");               System.out.println(format); // |                   Hello World|
           
            String format1 = String.format("|%-30s|", "Hello World");           
            System.out.println(format1);  // |Hello World                   |

            String format2 = String.format("|%.8s|", "Hello World");
            System.out.println(format2);//|Hello Wo|

        //String format22 = String.format("|%.-8s|", "Hello World");
        //errror

            String format3 = String.format("|%30.5s|", "Hello World");     
            System.out.println(format3);//|                         Hello|
 
            
            String fs;
            fs = String.format("The value of the float variable is " +
                   "%f, while the value of the integer " +
                   "variable is %d, and the string " +
                   "is %s", 5.5, 6, "köse");
            System.out.println(fs);

            //Integer.format diye bir sey yok

        whenNumericIntegralConversion_thenConvertedString();
        whenNoArguments_thenExpected();
            
    }


    public static  void whenNumericIntegralConversion_thenConvertedString()
    {
        String s = String.format("The number 25 in decimal = %d", 25);
       // assertEquals("The number 25 in decimal = 25", s);

        s = String.format("The number 25 in octal = %o", 25);
       // assertEquals("The number 25 in octal = 31", s);

        s = String.format("The number 25 in hexadecimal = %x", 25);
      //  assertEquals("The number 25 in hexadecimal = 19", s);
    }


    public static void whenNoArguments_thenExpected() {
        String s = String.format("John scored 90%% in Fall semester");

        //assertEquals("John scored 90% in Fall semester", s);
    }

    // </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Formatter Classı ">

    public static void formatter()
    {
        
        // create Formatter class object 
        Formatter formatter = new Formatter(); 
        
        // Use Space format specifier 
        formatter.format("\n%d%n", -111); //-111   //%n String degerde calısmaz  
        formatter.format("%+d%n", 111); //+111        
        formatter.format("%(d%n", -111); //(-111)        
        formatter.format("%, .3f%n", 32659526566.4521);         
        formatter.format("%, d%n", 1000000);//1, 000, 000
        formatter.format("|%20.4f|%n", 1234.1234);//|           1234.1234|
        formatter.format("|%-20.4f|%n", 1234.1234);//|1234.1234           |
        formatter.format("10 %% 4 = 2%n"); //10 % 4 = 2      

        // %x format specifier 
        // It prints the number in Hexadecimal 
        // with lowercase alphabets         
        formatter.format("%x%n", 250); //%x: fa
        // with uppercase alphabets         
        formatter.format("%X%n", 250); //%X: FA

        
        // %e format specifier 
        // It prints the number in Scientific Notation 
        // with lowercase alphabets 
        formatter.format("%e%n", 123.1234); //%e: 1.231234e+02
                formatter.format("%.4f%n", 123.1234567); //123.1235
                        formatter.format("%.15s%n", "12345678901234567890"); //123.1
                                formatter.format("%010d%n", 88); //0000000088
                                formatter.format("%10d%n", 88);  //********88



        


        String form ="--------------- Format Class --------------- \n formatter nesnesi: "+formatter;
        System.out.println(form);
        
        //conversion yapmaya gerek yok kısa yolu bu
        //hepsini yazar çünkü her defasında yeni bir nesne olusturlmuyor
        //her sey bir nesneye kaydediliyor String.concat gibi


        Formatter f=new Formatter();
        f.format("%3$3s %2$3s %1$3s", "fear",
                "strengthen", "weakness");
        System.out.println(f);
        //weakness strengthen fear farklı sırada printed olurlar


        whenCreateFormatter_thenFormatterWithAppendable();
        dateFormat();
    }

    public static void whenCreateFormatter_thenFormatterWithAppendable()
    {
        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb);
        formatter.format("I am writting to a %s Instance.", sb.getClass());

        //String ss=sb.getClass();
        String s=sb.toString();
        System.out.println(s);
        System.out.println(sb);

        /*
        assertEquals(
                "I am writting to a class java.lang.StringBuilder Instance.", sb.toString());

         */
    }

    //Regionalize Date
    public static void dateFormat()
    {

        Formatter f3=new Formatter();
        f3.format(Locale.FRENCH,"%1$te %1$tB, %1$tY",
                Calendar.getInstance());
        System.out.println(f3);
        //10 janvier, 2021

        Formatter f4=new Formatter();
        f4.format(Locale.GERMANY,"%1$te %1$tB, %1$tY",
                Calendar.getInstance());

        System.out.println(f4);
        //10 Januar, 2021




    }

        // </editor-fold>
        
    //<editor-fold defaultstate="collapsed" desc=" characters ">
    
       public static  void characters()
       {
               System.out.println("my name:\n \t '\\emre duman\'");
        System.out.println("My Name:\n\t \\\\ \'Satyendra Narayan\'" );

        System.out.print("komando  \n");//next line!!!!!!!!!
        System.out.println("tegmen\t "+a);// duman tab gap 
       }
                // </editor-fold>   

    //<editor-fold defaultstate="collapsed" desc=" typeCasting ">
    
       public static void TypeCasting()
       {
    
        //1) Auto Widening  Casting
           byte u1=10; short u2=u1; System.out.println(u2);//10
        //2) Explicit Narrowing Casting
        double u3=128; int u4=(int)u3; byte uu5=(byte)u4; System.out.println(u4);//128
           System.out.println(uu5);// 127 den sonra -128 
        //TYPE CASTING
		 byte by1 = 101;
	        int sayi1 = by1;//Kucuk data tipini buyuk data tipini cevirmek icin extra bir kod yazmaya 
	                      //gerek yok Java bunu otomatik olarak yapar. (Auto Widening)
	        
	        System.out.println(sayi1);//101
	        
	        int sayi2 = 53;
	        byte by2 = (byte)sayi2;//Buyuk data tipini kucuk data tipine cevirmek Java tarafindan yapilmaz.
	                               //Ornekteki gibi sag tarafa donusturmek istedigimiz data tipini 
	                               //parantez icinde yazmaliyiz.
	        System.out.println(by2);//53
	        
	        double sayi3 = 23.9;
	        int by3 = (int)sayi3;
	        System.out.println(by3);//23
	        
	        float sayi4 = -23.9f;
	        short by4 = (short)sayi4;
	        System.out.println(by4);//-23 
	        
	        double sayi5 = 4.8;  
	        double sayi6 = 1.4;
	        
	        float sonuc1 = (float)(sayi5 / sayi6);
	        //float -> 4bytes range
           //double ->8bytes range
	        System.out.println(sonuc1); // 3.428571428571429

           double d1=10.0f;
           float f1=10.0f;
           d1=f1;


	        int sonuc2 = (int)(sayi5 / sayi6);
	        System.out.println(sonuc2); //3
	        
	        int sayi7 = 5;
	        int sayi8 = 3;
	        double dd=3; dd=3.3; dd=3.3d; dd=3.3D;
	        float ff=3; /* ff=3.3; */ ff=3.3f; ff=3.3F;
	        
	        int sonuc3 = sayi7 / sayi8;
	        System.out.println(sonuc3);//Normalde 5/3=1.6666666... ama data type'i int yaparsaniz
            // sadece tam kismi gorursunuz ==> 1
	        
	        double sonuc4 = sayi7 / sayi8;//1.0
	        System.out.println("sonuc4:"+sonuc4);//sonuc4:1.0
	      
	        
	        int sayi9 = 255;
	        byte by5 = (byte)sayi9;
	        System.out.println(by5);//Normalde byte'ta (-128 ...-1, 0, 1 ...127) 256 sayi var
	                                //255 i 256 ya boler kalani yazar- 255= 127+128 -1 e denk gelir
	        
        
        
        short s=9; byte b=3;
                         
        int iii=10%2, iiii=6%-13; System.out.println(iii+" "+iiii);
        //System.out.println(-34%5 , -34%-5 ,  34%-5); error
        //System.out.println("edaedaed","eafeaf");       error
             
        long l = 129;        System.out.println("byte:"+(byte)(l)); //long 0==byte0/ long 127==byte127/ long128==byte-128/ long129==byte-127/ long255 ==byte-1/ long256==byte0 long257==byte1

        
        float f = 100.2f;  f = 100.2F; System.out.println("float+integer+short+double:"+f+5+s+b);//100.2593 concanation
        //f=100.2; error
        System.out.println("float+integer+short+double:"+(f+5+s+b));//117.2   
        System.out.println((int)f); //100
                System.out.println((double)f); //100.199...
                byte xx=(byte)(f);
                        System.out.println((byte)(f)); //100



        
        
        double d = 10000000.2d;     d=1000.2;//****
        d = 100.2D; d=1000.20; d=100d; System.out.println("double:"+d);//100.0
                System.out.println((byte)(d)); //-24
                


       
	        
	        //SWAP
	        double say1=10;
	        int say2=12;
	        long ll=0;
	        System.out.println("say1:"+say1+"    say2:"+say2);//say1:10.0    say2:12

	        ll=(long)say1;//explicit narrowing type casting
	        say1=say2;
	        say2=(int)ll;//explicit narrowing type casting
	        System.out.println("say1:"+say1+"    say2:"+say2);//say1:12.0    say2:10
       
	        //Swap again
	        say1+=say2;
	        say2=(int) (say1-say2);
	        say1-=say2;

	        System.out.println("say1:"+say1+"    say2:"+say2);//say1:10.0    say2:12
                
                
                
                
                char charr='7'+'9'; System.out.println(charr);//p
        char e='A';         System.out.println((int)'0' +"\b"+ (int)('1')+"\n"+(int)('a')+"\t"+(int)'b'+"\f "+(int)'A');// \f up arrow \b delete 1 digit
      //\n == %n
        char char1, char2;
        char1 = 65; 		// char1 = 'A'
        char2 = '6';// 6

        System.out.println("char1 = " + char1);//char1 = A
        System.out.println("char2 = " + char2);//char2 = 6
        //System.out.println("char1 + 1 = " + (char)(char1 + 1) );
        System.out.println("++char1 = "  +  ++char1);
        System.out.println("++char2 = "  +  ++char2);

  
        
        System.out.println((int)(7.9f)); //7
                System.out.println((float)(8+2)); //10.0
                        System.out.println((short)(3.3d)); //3
                                System.out.println((double)(-3/2)); //-1.0d
                                        System.out.println(110.0 ==(float)((int)(7.9+(double)(100+2.2f))));//true

                                        
                                        
                                              
        
                                        
        byte bb = 100;	//declaring and assigning value to a variable
        //Implicit conversion
//	double d = b;	//assigning byte type data to double type variable
        double rdd  = (double) bb;  //explicit casting
           //Casting 'bb' to 'double' is redundant
        System.out.println("Value of d = " + rdd);
        System.out.println("Value of b = " + bb);
        
        
        
        
        double  D= 128.5;	//declaring and assigning value to a variable
        //Explicit conversion
        byte B = (byte)D;	//assigning double type data to byte type variable
        System.out.println("Value of b = " + B);//127 gitti 1 daha giderse -128 yani
        System.out.println("Value of d = " + D);
        
        
        
        
        double ddd = (double)200;	//declaring and assigning value to a variable
        double ee=200;
        byte bbb = (byte) ddd;	//implicit conversion is not allowed
        System.out.println("Value of d = " + ddd);
        System.out.println("Value of b = " + bbb);
        System.out.println("Value of ee = " + ee);
        
        

        char de = 'a';	//declaring and assigning value to a variable
        byte be = (byte) de;	//implicit conversion is not allowed    99 
        System.out.println("Value of de = " + de);
        System.out.println("Value of be = " + be);

        
        
        byte bbe = 66;
        char dde = (char)bbe;//B
           //dde=bbe; error
           dde=10; //runs
        char ddee=66;//B
        System.out.println("Value of dde = " + dde);
        System.out.println("Value of bbe = " + bbe);
        System.out.println("Value of ddee = " + ddee);

        char mychar = (char) 97;
        mychar=100;
        System.out.println("mychar = " + mychar);

        
        
        
           System.out.println(1.0 - 0.1 - 0.1);//0.8
           System.out.println(10/2.0);//5.0
        
       }
    // </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="conversion ">
    public static void conversion()
    {
     
       //STRING
        String str="111";       int strr=Integer.parseInt(str);  System.out.println(strr);//111

        //String str2="111.0";    int strr2=Integer.parseInt(str2); System.out.println(strr2);//111 olmaz error
        int i1=100; /* i1=1.0; error   */ double d=1.0; d=i1;
        i1=(int)d;

        String str3="111.0";    int strr3=(int)Float.parseFloat(str3); System.out.println(strr3);//111
        String str4="111.0";    double strr4=Short.parseShort(str4); System.out.println(strr4);//111.0 

        String str5=Integer.toString(10);   System.out.println(str5);//10                  
        String str6=Double.toString(10.0);   System.out.println(str6);//10.0                  

        String str7 = String.valueOf(123.0); System.out.println(str7);//123.0
        String str10 = String.valueOf('e'); System.out.println(str10);//e

        Integer obj = new Integer(str);//!!!!!!  111 string deger alan constructor da var
        System.out.println("obj:"+obj);//obj:111
        int i2=obj; //unBoxing
        Integer value = 3;//autoBoxing
        Integer value2 = Integer.valueOf(3);

        String str8 = obj.toString(); System.out.println(str8);//111
        String str11 = String.valueOf(obj); System.out.println(str11);//111
       
        String str9 = new Integer(str).toString(); System.out.println(str9);//111
        str9=new Double(100.0).toString();
        str9=String.valueOf(new Double(100.0).toString());

        
        //Integer.parseInt()
        String number = "10";

        int result = Integer.parseInt(number);
        double d3=Double.parseDouble(number);
        short s=Short.parseShort(number);
        System.out.println(result);//10
        
        //Integer.valueOf()
        number = "100";
        //number = "100abc";//Exception in thread "main" java.lang.NumberFormatException: For input string: "100abc"
       
        //converting to String from Integer
        Integer result2 = Integer.valueOf(number);
        System.out.println(result2);//100
        
        System.out.println(String.valueOf(result));//10
        number=result2.toString() ;System.out.println(number);//100
        
        }
        // </editor-fold>
       
    //<editor-fold defaultstate="collapsed" desc="arithmetic/INC-DECREMENT Operators ">
    public static void Arithmetic_Operators()
    {
        /*
        Arithmetic Operators
        Arithmetic operators are used to perform common mathematical operations.

        Operator    Name                Description                             Example
        +           Addition            Adds together two values                x + y	
        -           Subtraction 	Subtracts one value from another	x - y	
        *           Multiplication	Multiplies two values                   x * y	
        /           Division            Divides one value by another            x / y	
        %           Modulus             Returns the division remainder      	x % y
        ++          Increment           Increases the value of a variable by 1	++x	
        --          Decrement           Decreases the value of a variable by 1	--x
        */
       

        int x=25,y=10,z,w,p,result;
        x++;//26 later increment
        ++x;//27 increment first
        System.out.println(x++);//after will print 27 ,x's value will be 28
        z=x++;//z:28 x:29
        w=--y;//w:9 y:9
        p=-y;
        System.out.println("X:"+x+"   Z:"+z+"  W:"+w+"  P:"+p);



        int i=1;
        System.out.print(i-- +" ");//1 yazıp eksiltiyor
        System.out.print(i +" ");//0
        System.out.println(--i);//-1 eksiltip yazıyor
        System.out.println(--i + --i);//(-2) + (-3)=-5        
        
        //boolean qe=true;     qe++;        System.out.println(qe);
        
        //int r=5;    int r= --(r++);     System.out.print(r);
       
        //int qwe = 11++;     System.out.println(qwe); direk increment ile assign olunmaz
         
        
    }
    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Assignment_Operators ">
        public static void Assignment_Operators()
        {

            /*
            Operator        Example	Same As	
            =               x = 5	x = 5	
            +=              x += 3	x = x + 3	
            -=              x -= 3	x = x - 3	
            *=              x *= 3	x = x * 3	
            /=              x /= 3	x = x / 3	
            %=              x %= 3	x = x % 3	
            &=              x &= 3	x = x & 3	
            |=              x |= 3	x = x | 3	
            ^=              x ^= 3	x = x ^ 3	
            >>=             x >>= 3	x = x >> 3	
            <<=             x <<= 3	x = x << 3
            */
          
            int counter = 1;
            int increment = 2;
            System.out.print(counter + " ");
            counter += increment;
            System.out.print(counter + " ");
            counter *= increment;
            System.out.print(counter + " ");
            increment /= 2;
            counter -= increment;
            System.out.println(counter);
            System.out.println("increment: " + increment);
            
            
        }
    // </editor-fold>
        
    //<editor-fold defaultstate="collapsed" desc="Comparison_Operators ">
        public static void Comparison_Operators()
        {
            /*
            Java Comparison Operators
            
            Comparison operators are used to compare two values:

            Operator	Name                    Example	
            ==          Equal to                x == y	
            !=          Not equal               x != y	
            >           Greater than            x > y	
            <           Less than               x < y	
            >=          Greater than or equalto x >= y	
            <=          Less than or equal to	x <= y
            */
   
            
        }
    // </editor-fold>
        
    //<editor-fold defaultstate="collapsed" desc="Logical_Operators ">
        public static void Logical_Operators()
        {
            /*
            Java Logical Operators
            
            Logical operators are used to determine the logic between variables or values:

            Operator	Name            Description                                               Example	
            &&          Logical and	Returns true if both statements are true                  x < 5 &&  x < 10	
            ||      	Logical or	Returns true if one of the statements is true             x < 5 || x < 4	
            !           Logical not	Reverse the result, returns false if the result is true   !(x < 5 && x < 10)
            */
            int x=5,y=6;
            System.out.println(!(x!=y));//false

             boolean lightsOn = true;
        lightsOn = false;
//        int iİ =2;
        int jJ =3;
        System.out.println('A' > 'a');//false
        System.out.println(5!=10);//true
       // System.out.println(iİ*jJ > iİ);//true
        System.out.println("Hello" !="HelloStudents");//true
        System.out.println("HelloStudents" == "HelloStudents");//true
        System.out.println("HelloStudents" .equals( "HelloStudents"));//true
        System.out.println();

        //Logical operators
        System.out.println(!(5==7));
        System.out.println(!(5!=jJ));
        //System.out.println((iİ>jJ)&&(iİ==0));
            
        }
    // </editor-fold>
        
    //<editor-fold defaultstate="collapsed" desc="Bitwise_Operators ">
        public static void Bitwise_Operators()
        {
            /*
            Operator	Meaning                         Work
                &	Binary AND Operator             There are two types of AND operators in Java: the logical && and the binary &. Binary & operator work very much the same as logical && operators works, except it works with two bits instead of two expressions. The "Binary AND operator" returns 1 if both operands are equal to 1.
                |	Binary OR Operator              Like "AND operators ", Java has two different "OR" operators: the logical || and the binary |. Binary | Operator work similar to logical || operators works, except it, works with two bits instead of two expressions. The "Binary OR operator" returns 1 if one of its operands evaluates as 1. if either or both operands evaluate to 1, the result is 1.
                ^	Binary XOR Operator             It stands for "exclusive OR" and means "one or the other", but not both. The "Binary XOR operator" returns 1 if and only if exactly one of its operands is 1. If both operands are 1, or both are 0, then the result is 0.
                ~	Binary Complement Operator	
                <<	Binary Left Shift Operator	
                >>	Binary Right Shift Operator	
                >>>	Shift right zero fill operator	       
            */
        int num1 = 30, num2 = 6, num3 =0, num4=5,num5=5;

        
        //Bitwise AND
        /*
        a = 5 = 0101 (In Binary)
        b = 7 = 0111 (In Binary)

        Bitwise AND Operation of 5 and 7
          0101
        & 0111
         ________
          0101  = 5 (In decimal)
        */
        System.out.println("num1 & num2 = " + (num1 & num2));//num1 & num2 = 6
        System.out.println("num4 & num1 = " + (num4 & num1));//num4 & num1 = 5
        System.out.println("num4 & num5 = " + (num4 & num5)+"\n");//num4 & num5 = 5

        
        
        //Bitwise OR
       /*
        a = 5 = 0101 (In Binary)
        b = 7 = 0111 (In Binary)

        Bitwise OR Operation of 5 and 7
          0101
        | 0111
         ________
          0111  = 7 (In decimal)
        */
        System.out.println("num1 | num2 = " + (num1 | num2) );//num1 | num2 = 30
        System.out.println("num4 | num1 = " + (num4 | num1)+"\n");//num4 | num1 = 5


        
        
        //Bitwise XOR ^
        /*
        a = 5 = 0101 (In Binary)
        b = 7 = 0111 (In Binary)

        Bitwise XOR Operation of 5 and 7
          0101
        ^ 0111
         ________
          0010  = 2 (In decimal)
        */
        System.out.println("num1 ^ num2 = " + (num1 ^ num2) );//30,6 num1 ^ num2 = 24

        
        
        //Binary Complement Operator ~
        /*
        a = 5 = 0101 (In Binary)

        Bitwise Compliment Operation of 5

        ~ 0101
         ________
          1010  = 10 (In decimal) 
        */
        System.out.println("~num1 = " + ~num1 );//~num1 = -31

        //Binary Left Shift Operator
        num3 = num1 <<  2;
        System.out.println("num1 << 1 = " + num3 );//num1 << 1 = 120

        //Binary Right Shift Operator
        num3 = num1 >>  2;
        System.out.println("num1 >> 1  = " + num3 );//num1 >> 1  = 7

        //Shift right zero fill operator
        num3 = num1 >>> 2;
        System.out.println("num1 >>> 1 = " + num3 );//num1 >>> 1 = 7

            
        

        
        }
    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Code Blocks">
    static public void codeBlock()
    {
        int level01=10;
        System.out.println(level01);
        //System.out.println(level02);
        //System.out.println(level03);
        {
            
            System.out.println(level01);//1 - ilk burası yazılı
            
            int level02=11;
            System.out.println(level02);
            {
                System.out.println(level01);//2
                System.out.println(level02);//3

                int level03=12;
                System.out.println(level03);
                {
                    System.out.println(level01);//4
                    System.out.println(level02);//5
                    System.out.println(level03);//6
                }
            }
            //System.out.println(level03); erorr
        }
        //System.out.println(level02); / error

        
        int $1=20;
        {
            System.out.println($1);//7
            System.out.println(level01);//8
            //System.out.println(level02);
        }
    }
    
    
        //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" DECIMALFORMAT">

    static public void customFormat() 
    {
        
        /*
            0 – prints a digit if provided, 0 otherwise
            # – prints a digit if provided, nothing otherwise
            . – indicate where to put the decimal separator
            , – indicate where to put the grouping separator
        */
        
        //Creating a DecimalFormat instance is done like this:
        String pattern = "###,###.###";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        System.out.println(decimalFormat);//java.text.DecimalFormat@674dc
        System.out.println(decimalFormat.toString());//java.text.DecimalFormat@674dc
        
        
        String format = decimalFormat.format(123456789.123);
        System.out.println(format);//123,456,789.123
        
        //As you can see, the DecimalFormat is created with a formatting pattern.
        //You can change this pattern later using the applyPattern()
        //The applyPattern() method simply applies a new pattern to the DecimalFormat
        //instance as if it were created with that pattern.

        decimalFormat.applyPattern("#0.##");
        format=decimalFormat.format(12345678);
        System.out.println(format);





        //DecimalFormatSymbols
        //You can customize which symbols are used as decimal separator, grouping separator etc. using a DecimalFormatSymbols instance. Here is an example:

        Locale locale = new Locale("en", "UK");

        DecimalFormatSymbols symbols = new DecimalFormatSymbols(locale);
        symbols.setDecimalSeparator(';');
        symbols.setGroupingSeparator(':');

        String pattern2 = "#,##0.###";
        DecimalFormat decimalFormat2 = new DecimalFormat(pattern2, symbols);

        String number = decimalFormat2.format(123456789.123);
        System.out.println(number);//123:456:789;123

        
        
        
        //Grouping Digits
        //The DecimalFormat class has a method called setGroupingSize() which sets how many digits of the integer part to group. 
        //Groups are separated by the grouping separator. 
        //Here is an example:

        DecimalFormat decimalFormat3 = new DecimalFormat("#,###.###");
        decimalFormat.setGroupingSize(4);

        String number3 = decimalFormat3.format(123456789.123);
        System.out.println(number3);
        
        //The same effect could have been achieved by just changing the pattern string, like this:      
        DecimalFormat decimalFormat4 = new DecimalFormat("####,####.###");
        String number4 = decimalFormat4.format(123456789.123);
        System.out.println(number4);
        
        double d = 1234567.877777;
        System.out.println(new DecimalFormat("#.##").format(d));//1234567.88
        boolean t=new DecimalFormat("#.##").format(d).endsWith("9");//true
        System.out.println(t);//true
        
        System.out.println(new DecimalFormat("0.00").format(12345));//12345.00
        boolean t2=new DecimalFormat("0.00").format(12345).equals(d);//false
        System.out.println(t2);//false
        
        System.out.println(new DecimalFormat("#,####,####.###").format(d));//123,4567.878


    }
    // </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" ternary ">
        
        static public void ternary()
        {
            System.out.println("W3Adda - Java Ternary Operator.");
            String result =new String(  (10 > 15) ? "Greater" : "Smaller "     );
            String result2="emre".equals("emre") ? "same" : "different" ;
            System.out.println("result:"+result + "  result2:"+result2); //result:Smaller   result2:same
            
            System.out.println( 5 >= 0 ? ( 5 >=10 ? "positive" : "digit") : "negative number "); //if ( if  else) else - digit

            int num=-5;
            String result3 =new String(num>=0 ? ( num >=10 ? "positive number" : "digit") : num==0 ? "zero" :  num<0 ? "negative" : "positive");
            String ternary= String.valueOf(num > 0 ? num +": is +" : num < 0 ? num + ": is - " : num==0 ? num  : "num is not a number"  );
            //1 tane bile int cıkabilebildiği için String.valueOf() yanar
            System.out.println(ternary);
            //if ( if  else)   else [if else (if else ) ]
            System.out.println("result3:"+result3);


            Scanner scan= new Scanner(System.in);
            System.out.println("write down a word to test if its first letter is upper or lower");
            char ch=scan.next().charAt(0);
            String result4= ch<='z' && ch>='a' || ch<='Z' && ch>='A' ? ch<=122 && ch>=97 ? "LOWERCASE" : "UPPERCASE"  : ch <= 57 && ch >=48 ? "ch is an digit" : "dont enter special character";
            //a:97 z:122 A:65 Z:90      IF ilk sembol harf ise(IF küçük harf ise lowercase değilse ELSE uppercase) ELSE not letter
            
            System.out.println(result4);
            
           
        }
        
            // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" IF ">
        
        static public int [] IF(int[] a123)
        {
            boolean transaction=true;
            int c=7;
            if(c!=b && transaction)
            {
                System.out.println("soldier");
            }
            if(c>b)
                System.out.println("soldier");
                System.out.println("soldier");

             // INFOOOO CTRL+SPACE OPENS  METHODS BOX  
              int a=0,b=0;
            if(true)
                a++;a++;System.out.println(a);//2 yazar if in içi
                b++;System.out.println(b);//1 yazar if in dışı
                
            int c1=0,d1=0;
            if(false)
                c1++;System.out.println(c1);//0 yazar if in içi 
                d1++;System.out.println(d1);//1 yazar dışı
               
            int e1=0;
            if(false)
                e1++;//çalışmaz if in içi
                e1++;//çalışır if in dışı
                e1++;//çalısır
                System.out.println(e1);//2 



            System.out.print("PLEASE TYPE 0 OR 1:");
            Scanner scan= new Scanner(System.in);//TO ENTER A VALUE FROM CONSOLE
            //scanner is a class-scan is a object that we created by using scanner class
            int option=scan.nextInt();
            System.out.print("please write sth:");
            String qqqq=scan.next();
            if(option==0)
            {
                System.out.print(qqqq);
                System.out.println(c+b);
            }
            if(option==1)
            {
                System.out.println("substraction:");
                System.out.println(c-b);
            }



            System.out.print("please write multiplication or division:");
            Scanner scan2= new Scanner (System.in);
            String optionn=scan2.next();

            if(optionn.equals("multiplication"))
            {
                System.out.print("multiplication:");
                System.out.println(c*b);
            }

            String t="division";
            if(optionn.equalsIgnoreCase(t)) //equals is a methods so contains ()
                //if(optionn==t) we cant write like this
            {
                System.out.print("division:");
                System.out.println(c/b);
            }

            if(optionn.equalsIgnoreCase("EMRE"))//ıgnore upper lower case which is written ın console 
            {
                System.out.println("okey");
            }
            
            
            String name="emre";
            boolean aa=optionn.equals(name);// THIS CODE MEANS "TRUE"
            //if optionn == emre yani optionn.equals(name)yani girdiğim code sring name ile aynıysa        
            if(aa)//inside of parantesis is true
            {
                System.out.println("addsad");
            }     
        
            
            double value = 2;
            if (value != 0)
                    if (value > 0)
                            System.out.println("The result =  " +  (1 / value));            
                    else
                            System.out.println("The result =  " +  (-1 / value));

            
            
            //start of nested if statement
            Scanner scan3= new Scanner (System.in);
            System.out.print("write a day:");
            String dayy=scan3.next();
            
            //if (day == "Monday")//ıt does not work
            if ("monday".equals(dayy))
                System.out.println("It 's Monday.");// It 's Monday.
            else if ("Tuesday".equalsIgnoreCase(dayy))
                System.out.println("It \'s Tuesday.");
            else if ("Wednesday".equals(dayy))
                System.out.println("It \'s Wednesday.");
            else
                System.out.println("I am seating in else block"); //end of nested if statement
            
            
            //reverseArray
            int [] copy_a123=new int[a123.length];//parametredeki listeyi yeni listeye copyaladım
            System.out.println(copy_a123);//[I@62ee68d8
            System.out.println(Arrays.toString(copy_a123));//[0,0,0]
            for(int i=0,j=a123.length-1 ; i < a123.length ; i++,j--){
                copy_a123[j]= a123[i];}
            System.out.println(Arrays.toString(copy_a123));//[3, 2, 1]

            return copy_a123;
          
    } 
        
    public static void printArray(int[] a)
    {
        for(int i : a)
            System.out.println("Copied array element:"+i);
    }
     
    // </editor-fold>
        
    //<editor-fold defaultstate="collapsed" desc=" BREAK-CONTINUE ">
        public static void break_continue()
        {
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter a number:");
            for (int i= 0;i<100;i++)
            {
                int s=scan.nextInt();
                String ss=Integer.toString(s);//conversion int to string
                System.out.println("Welcome to java!"  + s);

                String df="4";
                if (ss.equals("3")||ss.equals(df))break;
                if (i==4) break;

                break;// it doesnt execute
               
           
            } 
            String q=Integer.toString(12);
            String qq=Integer.toString(12);
            System.out.println(q.equals(qq));
            
            
            int i=0, sum=0;
            
            while(i<10)
            {
                i++;
                sum+=i;
                if (i == 4 || i==7) //or
                {
                  continue;
                }
                System.out.println(i);//if i==4 codes in the for loop will not execute
            }
            System.out.println(sum);
            
            
            
            

            double arra[ ] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int su = 0;

            for (int t = 0; t < arra.length; t++)
            {
                su += arra[t];	//sum = sum + array[i];
                if (su > 12)
                {
                    break;//loop un dısına cıkar
                }
                System.out.println("Looping ......");
            }

            System.out.println("The sum exceeded the maximum value.");




            for (int r = 5; r> -5; r--)
            {
                if (r == 0)//if this condition
                {
                        continue;
                }//burdan sonrası calısmaz
                System.out.println("The reciprocal of " + r + " = " + (1. / i));
            }




        }
    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" LABEL ">
    public static void label()
    {
        // the for loop is labeled as first
        first:
        for( int i = 1; i < 5; i++) {

            // the for loop is labeled as second
            second:
            for (int j = 1; j < 3; j++) {
                System.out.println("i = " + i + "; j = " + j);

                // the break statement breaks the first for loop
                if (i == 3)
                    break second;// == break;
                if(i==4)
                    break first;
            }

        }

    }
    // </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" SWITCH ">
      
        static public void SWITCH()
        {
            Scanner scan=new Scanner(System.in);
            System.out.println("enter a letter:");

            String str=scan.nextLine().toUpperCase();//"a","b","A","B" girdim

            for(int i=0;i<1;)
            {
                first:
                //karar yapılarının hemen üstüne yazılır label lar
                switch(str)//string short byte integer char degerlerini alır
                //inside of switch can not be double orv float value since they are both not certain expression
                {
                    case "A":
                        System.out.println("A");//yazar
                        i++;
                    case "B":
                        System.out.println("B");//yazar
                        i++;
                        break;
                    
                    default:
                        System.out.println("it is not a letter , write letter:");
                        str=scan.nextLine().toUpperCase();

                        //str="1"; yazdım
                        //break koymasam da tekrar tekrar switch yapsı calısır
                        //break; // aynı işe yarar alttaki kod ile de aaynı işi görür
                        break first;
                }
            }


            int day = 7;
            switch(day)//start of the switch statement
            {
                case 0:
                        System.out.println("It is Sunday.");
                        break;
                case 1:
                        System.out.println("It is Monday.");
                        break;
                case 2: System.out.println("It is Tuesday.");break;
                case 3: System.out.println("It is Wednesday.");break;
                case 4: System.out.println("It is Thursday.");break;
                case 5: System.out.println("It is Friday.");break;

                //optional
                default:System.out.println("It is Saturday.");
            }//end of switch Statement
            
            
            
            int temperature = 68;
            while(temperature<77)
            {
                switch(temperature)
                {
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                            method1();break;
                    case 65:
                    case 66:
                    case 67:
                    case 68://It is cool. //temperature=68 der bırakırsam case 68: içinde sonsuz döngü olur
                    case 69://It is cool.
                            System.out.println("It is cool.");
                            break;
                    case 70://It is warm.
                    case 71://It is warm.
                    case 72://It is warm.
                    case 73://It is warm.
                    case 74://It is warm.
                    case 75://It is warm.
                            System.out.println("It is warm.");
                            break;
                    default:
                            System.out.println("It is probably too hot.");

                }
                System.out.println(temperature);//68-69-...-75
                temperature +=1;//bunu yazmazsam hep68 te kalır ve infinite loop olur
            }
            
            

            String input1 = JOptionPane.showInputDialog("Please enter a number");
            int year  = Integer.parseInt(input1);

            double interestRate;
            switch (year)
            {
              case 5://For  year 5,6, Interest Rate is 7.25
              case 6:case 7:
                            interestRate = 7.25;
                            System.out.println("For  year " + year + ", "  + "Interest Rate is " + interestRate);
                     break;
              case 15:
                            interestRate = 8.50;
                            System.out.println("For  year " + year + ", "  + "Interest Rate is " + interestRate);
                       break;
              case 30:
                            interestRate = 9.0;
                            System.out.println("For  year " + year + ", "  + "Interest Rate is " + interestRate);
                       break;
              default:
                    System.out.println("Wrong Year, enter 7, 15, or 30");
                    break ;
            }

            
        }
        // </editor-fold>
        
    //<editor-fold defaultstate="collapsed" desc="FOR">
    public static void FOR()
    {
        for(;;)//infinity loop
        {
            Scanner scan=new Scanner(System.in);
            System.out.println("enter a number:  (type '0' to break the loop)");
            int a=scan.nextInt();
            System.out.println(a);
            if(a==0)
                break;
        }
        
        
        
        double sum=0;
        for(double d=0;d<10;)
        {
            d+=0.5;
            sum+=d; //sum=0+0+0.5;    0.5 2.0 5.5
            System.out.println("sum:"+sum);
        }
        
        
        
        int total=0;
        for(int i=0;i<5;++i)//for loop'ta ++i or i++ affect value after 1 squence finished
        {
            total+=i;//0 1 3 6 10
            System.out.println("total:"+total);         
        }

        total=0;//made total 0 from 10
        for(int i=0;i<5;i++)
        {
            total+=i;//0 1 3 6 10
            System.out.println("total:"+total);         
        }
         
        total=0;//made total 0 from 10
        for(int i=0;i<10;++i)
            total+=i;//0-9  0 1 3 6 10 10 15 21 28 36 45
        System.out.println("total:"+total);       
        
        total=0;//made total 0 from 10
        for(int i=0;i<10;i++)
        //for(int i=0;i<10;++i) //it is same with up one
        {
        //System.out.println("i:"+i); //0 1 3 7
        //i+=i;
        i=i+i;
        }
        //System.out.println("i:"+i);//Exception in thread "main" java.lang.RuntimeException: Uncompilable source code - Erroneous tree type: <any>  
        //because of i belongs to for loop , we must print it out in for loop
        //for(; ;); // true loop
        
        for(int i=0;i<10;i++)
            for(int j=0;j<10;j++)  
                System.out.println(i+"-"+j);//100 times
        
        
        

         
        /*
            for(int i=0, j=0; (i+j <10 ); i++, j++){}
            for(;;)//  ifadesi ile sonsuz döngü oluşturulabilir.

        */
             
        
         // QUESTION-3
        
        Scanner object1=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF LINES:");
        int line=object1.nextInt(),q=1;       
        for(int a=1;a<=line;a++)
        {
            for(int i=(line-a);i>=1;i--)//soldaki bosluk için
            {
                System.out.print("  ");
            }

            for(int i=1;i<=2*a-1;i++)
            {
                if (i<=a)
                {
                    q*=a+1-i;
                    System.out.print(q+" ");
                }
                else
                {
                    q+=-a+i;
                    System.out.print(q+" ");
                }              
                q=1;                  
            }
            System.out.println(" ");
        }
        /*
              1  
            2 1 2  
          3 2 1 2 3 
        */
        
        // QUESTION 4
        Scanner object2=new Scanner(System.in);
        System.out.print("ENTER NUMBER OF LINES=");
        int y=object2.nextInt(),k=1;
   

        for(int x=1;x<=y;x++)//satır sayısı
        {
            for(int t=(y-x);t>0;t--)//bosluk sayısı
            {
                System.out.print("  ");
            }
            for(int z=1;z<=(2*x-1);z++)//satırlardaki sayı sayısı
            {
                if (z<=x)
                    k=(int)Math.pow(2,(z-1));//1 2 4 8 16
                else
                    k/=2;   

                System.out.print(k+" ");//8 4 2 1
            }
            System.out.println(" ");
        }
       /*
        1  
      1 2 1  
    1 2 4 2 1  
  1 2 4 8 4 2 1  
1 2 4 8 16 8 4 2 1  
        */
        
        
        
        
        
        double grades[ ] = {88, 99, 73, 56, 87, 64};
        double sum3=0, average3;
        int index;
        for ( index = 0; index <grades.length; ++index)	//try using ++index in the header
        {
            sum3 += grades[index];	//sum = sum + grades[index];
            System.out.println(index);// 0 1 2 3 4 5

        }
        System.out.println(index);//6
        average3 = sum3 / grades.length;
        System.out.println(average3+" "+sum3+"Average grade =  " + DecimalFormat.getInstance().format( average3) );
    
    
    for (int indexx = 0, doubled = 0,triple=0; indexx <= 5; indexx++, doubled = 2*indexx, triple=3*indexx)
    {
            System.out.println("Loop index " + indexx + " doubled equals " + doubled+ " triple equals " + triple);
    }
    
    
    int arrey[ ] = {1, 2, 3, 4, 5};
    int  summ = 0;
    for (int indeex = 0; indeex < arrey.length; summ += arrey[indeex++])
        System.out.println("The sum =  " + summ);
    
    
    
    int value = 5, factorial = 1, temp;
    temp = value;

    for ( ; temp > 0; )
    {
            factorial *= temp-- ;
    }
    System.out.println(value + "! = " + factorial);

    
   

        
    
    double arreyy[ ] [ ] = {{1, 2, 3}, {3, 2, 1},  {1, 2, 3}};
    System.out.println(Arrays.toString(arreyy));//[[D@146ba0ac, [D@4dfa3a9d, [D@6eebc39e]
        System.out.println(Arrays.deepToString(arreyy));//[[1.0, 2.0, 3.0], [3.0, 2.0, 1.0], [1.0, 2.0, 3.0]]
    int summm = 0 ; total = 0;

    for (int i = 0; i < arreyy.length; i++)
    {
        for(int j = 0; j < arreyy[i].length; j++)
        {
                System.out.print(arreyy[i][j]+" ");

                summm += arreyy[i][j];
                total++;
        }
        System.out.println();
        System.out.println(summm);
        summm=0;
    }

        System.out.println("Average array value = " + (summm / total));
    
        
        
        //tags!!!!!
        outerLoop:
        for(int a=0 ; a<5 ; a++)
        {
            innerLoop:
            for(int b=0 ; b<3 ; b++)
            {
                System.out.println("a:"+a +" - b:"+b);
                if(a==3 && b==2)
                {
                    //break;//buradaki 2 break innerLoop'u durdurur
                    //break innerLoop;
                    break outerLoop;//outerLoop'u durdurur
                }
   
            }
        }
        for(int i=0 ; i<2 ; i++)
           break;//for looptan cıkarır

        for(int i=0 ; i<2 ; i++)
            return;//bbburadaki return FOR(); methoddtan cıkartıcak bizi
        
        for(int i=0 ; i<2 ; i++)//bu döngü calısmaz
            System.out.println("i:"+i);

    }


     //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="FOR_EACH">
    public static void FOR_EACH()
    {  
        int[] array1={1,2,3};
        int d=0;
        for(int i: array1)
        {
            System.out.printf("%d.element: %s %n",d,i);
            d++;

        }
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Varargs(method)">

    public static void Varargs()
    {        
        /*bir methodumuz var
        public static void abc(int a ,int b){}
        public static void abc(int a ,int b, int c ){}//overloading
        eger hep aynı primitive data type i aticaksak hep overloadingle
        uğrasmayalım ne kadar deger atıcaksak varargs yöntemi ile atayalım 
        */
        
        Varargs(1,2,3);
        Varargs(1,2,3,4);
        
        /*void method(String... gfg, int... q)
        {
            Compile time error as there are two
            varargs
        }
        */
    }
    
    public static void Varargs(int ...a)//
    {
    
        System.out.println(a[0]);// 1 parametrelerin indexleri olur
        System.out.println(a[1]);// 2 parametrelerin indexleri olur
        System.out.println(a[2]);// 3 parametrelerin indexleri olur
        System.out.println("Number of arguments: " + a.length); 
  
        // using for each loop to display contents of a 
        for (int i: a) 
            System.out.print(i + " "); 
        System.out.println(); 
     
       
            
        printName("Ali");
        printName("Ali", "Kahraman");
        printName("Ali", "Can", "Kahraman");
        
        valueChar("Character: ",'a');
        valueChar("Character: ",'a', 'b');

    }

    public static void printName(String... n) {
        for(String w: n) {
            System.out.print(w + " ");
        }
        System.out.println("");
    }

    public static void valueChar(String s, char... c) {
        for(char w: c) {
            System.out.print(s);
            System.out.print(w);
        }
        System.out.println("");
    }

    public static void valueChar2(String s,int i ,char... c) {
     //3noktalı varargs özelliği sadece bir tane olabilir ve en sonda olmak zorunda
    }




        // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" WHILE - do while ">

    public static void WHILE()
    {
        /*
        System.out.print("PLEASE ENTER A NUMBER:");
        Scanner scan=new Scanner(System.in);
        int ac= scan.nextInt();
        while(ac<=10)
        {
            System.out.println(ac+" zeko");
            ac+=1;               
        }
        */
        int i =0;
        while (i<10)//top checking  while loop (non counted loop)
        {
            System.out.println("Loop No. =  " + i);//01234
            i =i+1;	// i++

            if (i==5)
            {
                break;
            }
        }//end of the loop

        int count=0;
        while (count<10)
        {
            System.out.println(count+"java");//0-9
            count++;
        }

        int coun=0;
        while (coun++<10)//0-9 buraya en son 9 ile geldi geçti ve diğer satırda 10 oldu
        {
            System.out.println(coun+"c#");//1-10
        }


        int cou=0;
        do   
        { 
            System.out.println(cou+"hello");//0 hello
            cou++; 
        }   
        while (cou<-1);//condition is not true 


        int con=0;
        do   
        { System.out.println(con+"welcome");//0 welcome
        con++;       }
        while (con<10);//1-9 welcome


        int co=0;
        do   
        { System.out.println(co+"emre");}  //0 emre
        while (co++<10);//gelirken 0-9 yazarken 1-10 emre

        int c=0;
        do   
        { System.out.println(c+"duman");}                 
        while (++c<10);//entry value 0-8 increased values:1-9 printed values:1-9 


        int cc=0;
        do   
        { System.out.println(cc+"tegmen");}  //0               
        while (cc++<9);//entry value 0-8 increased values:1-9 printed values:1-9 

        int balance=10;
        while(true) 
        {
            if (balance<9)
            {
                break; 
            }
            balance-=9;
            System.out.println(balance);
        }

       int s=0,item=0;
       do{ item++; s+=item; System.out.println(s);/*1 3 6*/ 
       if(s>4) break; System.out.println(s);/*1 3 */} 
       while(item<5);
       
       
       
       //do can not be used without paranthesis
       int itemm=0,ss=0;
       do
        { 
          itemm++;   ss+=item; 
          System.out.println(itemm +" "+ss);

          if(ss>=4) 
          {
              continue; 
          }
        }
       while(itemm<5);
       
       System.out.println(ss);//15
       
       
       int sum=0;
       Scanner scan=new Scanner(System.in);
       System.out.print("Enter A Number:");
       int number=scan.nextInt();//12345 sayısı girildi
       do{
           sum+=number%10;//to add the last digit of the number
           number=number/10;//to decrease the digits of number
           System.out.printf("SUM:%d - NUMBER:%d %n ",sum,number);
         } 
        while(number==0);
         

       

           
    }
    
    
        
    // </editor-fold>
        
    //<editor-fold defaultstate="collapsed" desc="JOptionPane.showInputDialog ">
    public static void showINPUTdialog()
    {   
        //import javax.swing.*;	//required for our input box
        String input1 = JOptionPane.showInputDialog("Please enter a number");
        int a  = Integer.parseInt(input1); //Converts String number stored into input1 to int variable
        
        int as=Integer.parseInt(JOptionPane.showInputDialog("Please enter a number"));
        System.out.println("a = " + a);

        String input2 = JOptionPane.showInputDialog("Please enter another number");
        int b = Integer.parseInt(input2); //Converts String number stored into input2 to int variable

        System.out.println("b = " + b);

        System.out.println("Sum of two numbers = " + (a  + b) );
        
        
        
        
         //getting inputs
        cev = Double.parseDouble(JOptionPane.showInputDialog("Enter first number"));
        dev = Double.parseDouble(JOptionPane.showInputDialog("Enter second number"));
        double result  = Math.max(cev,dev);	//calling statement for the method max
        System.out.println("Maximum of " + a + " and " + b + " is "  + result);
    }
    
    
// </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" SCANNER ">
    public static void SCANNER()
    {
        scanner3();
        scanner4();

        Scanner scanner = new Scanner("Emre Duman");
        String namee=scanner.nextLine();//scanner nesnesi emre dumanı tutuyor ve bize veri girmek için sormaz
        //String name22=scanner.nextLine();//Exception in thread "main" java.util.NoSuchElementException: No line found
        System.out.println(namee);//Emre Duman

        scanner = new Scanner("Emre Duman");
        namee=scanner.next();//scanner nesnesi emre ı tutuyor ve bize veri girmek için sormaz
        String name22=scanner.next();//duman
        System.out.println(namee+ " "+name22);//Emre Duman



        String str = "Hello/This is JavaTpoint/My name is Abhishek.";
        //Create scanner with the specified String Object
        scanner = new Scanner(str);
        System.out.println("Boolean Result: "+scanner.hasNextBoolean());
        //Change the delimiter of this scanner
        scanner.useDelimiter("/");
        //Printing the tokenized Strings
        System.out.println("---Tokenizes String---");
        while(scanner.hasNext()){
            System.out.println(scanner.next());
        }
        //Display the new delimiter
        System.out.println("Delimiter used: " +scanner.delimiter());
        /*
        delimiter()
        Scanner objemizin sınırlayıcısını döndürür.
        Örnek olarak varsayılan delimiter white space olduğundan bize \p{javaWhitespace}+
        gibi bir string döndürürken .useDelimiter("%%%") ile sınırlayıcısı değiştirilmiş
        bir obje için "%%%" değerini döndürecektir.

         */
        scanner.close();









        //2.Java Scanner hasNext (String pattern) Method:
        String s = "Hello, This is JavaTpoint.";
        //Create scanner Object and pass string in it
        Scanner scan2 = new Scanner(s);
        //Check if the scanner has a token
        System.out.println("Result: " + scan2.hasNext());//Result: true
        //Print the string
        System.out.println("String: " +scan2.nextLine());  //String: Hello, This is JavaTpoint.
        //Check if the scanner has a token after printing the line
        System.out.println("Final Result: " + scan2.hasNextLine());//Final Result: false
        //Close the scanner
        scan2.close();

        str = "JavaTpoint.com 15 + 15 = 18.0";
        Scanner scan3 = new Scanner(str);
        //Checking scanner's next token matches "c"
        System.out.println("Result: "+scan3.hasNext("JavaTpoint.com")); //Result: true
        //Checking scanner's next token matches "="
        System.out.println("Result: "+scan3.hasNext());  //Result: false bir sonra yok
        // Print the rest of the string
        System.out.println("Rest of String: "+scan3.nextLine());  //Rest of String: JavaTpoint.com 15 + 15 = 18.0
        scan3.close();





        //NEXT NEXTLINE
        //String'leri kullanicidan almak icin ya next() veya nextLine()
        //kullaniriz. next() tek kelimelik String'ler icin kullanilir.
        //Space gorunce String'i almayi birakir.
        //nextLine() girilen tum String'i almak icin kullanilir

        //nextLine()'dan önce next gelirse nextLine() calısmaz

        Scanner scan = new Scanner(System.in);
		System.out.println("string giriniz:");
		String test=scan.nextLine();	//1 2 3
		System.out.println("test:"+test);

		System.out.println("string giriniz:");
		String test2=scan.nextLine();//deger gireriz/ a b c girdim   test2=a b c
		System.out.println("string giriniz:");
		String name=scan.nextLine();// d e f  girdim	   name=d e f
		String name1=scan.next();// 1 2 3 girdim 		   name1=1
		String name2=scan.nextLine();//tekrardan girmedim/ name2= 2 3 oldu
        name22=scan.next();//4 5 6 girdim		   name22=4 yazdı
		System.out.println("test  "+test+"  test2"+test2+"   name:"+ name +"  name1:"+ name1 +"  name2:"+ name2 +"  name22:"+ name22 );
		System.out.println("string giriniz:");
		String name3=scan.next();//tekrardan girmedim 		name3=5 oldu
		String name4=scan.next();//tekrardan girmedim 		name4=6 oldu
		String name5=scan.nextLine();// k l m girdim		name5 boş
		String name6=scan.nextLine();//p r s girdim			name6=k l m oldu
		String name7=scan.nextLine();//x y z girdim			name7=p r s oldu
		String name8=scan.next();//tekrardan girmedim       name8=x oldu
		System.out.println("   name3: " + name3 +
				"   name4: "+name4+"  name5:"+name5+"  name6:"+name6+
				"  name7:"+name7+"  name8:"+name8);

                //scan.close();

        Scanner object1 = new Scanner(System.in);
        System.out.println("ENTER INVESTMENT AMOUNT:");
        //float investment_amount=object1.nextInt();
        float investment_amount=object1.nextFloat();
        String zx=object1.next();
        String zxx=object1.nextLine();
        System.out.println(object1.nextLine());
        if(investment_amount<0)
        {
            JOptionPane.showMessageDialog (null, " YOU CAN NOT ENTER NEGATIVE AMOUNT, PLEASE ENTER A POZITIVE VALUE:", "NOTICE", JOptionPane.WARNING_MESSAGE);
            String input1=JOptionPane.showInputDialog("PLEASE ENTER A POZITIVE VALUE:");
            float input2=Float.parseFloat(input1);
            investment_amount=(float)(input2);
            while(input2<0)
            {
                String input3=JOptionPane.showInputDialog("PLEASE ENTER A POZITIVE VALUE:");
                float input4=Float.parseFloat(input3);
                investment_amount=(float)(input4);
                    if(input4>0)
                    {
                        System.out.printf("ENTER INVESTMENT AMOUNT:%.2f %n",investment_amount);
                        break;
                    }
            }
        }
        System.out.println("ENTER MONTHLY INTEREST RATE:");
        float interest_rate=object1.nextFloat();
        System.out.println("ENTER FUTURE-INVESTMENT DURATION AS YEAR:");
        float investment_duration=object1.nextFloat();
        float future_investment_amount=(float) (investment_amount* Math.pow((1+interest_rate),investment_duration*12));
        System.out.printf("INVESTMENT AMOUNT: %.2f %nANNUAL INTEREST RATE: %.2f%nNUMBER OF YEARS:%.2f%nACCUMULATED VALUE IS:%.2f",investment_amount,interest_rate,investment_duration, future_investment_amount);






    //charNext(); yok
    Scanner scan01= new Scanner(System.in);
    char letter=scan01.next().charAt(0);//girilen metnin ilk harfini alır
    System.out.println("char: "+ letter);

    scanner2();

    }

    public static void scanner2()
    {
        // Declare an object and initialize with
        // predefined standard input object
        Scanner sc = new Scanner(System.in);

        // Initialize sum and count of input elements
        int sum = 0, count = 0;

        // Check if an int value is available
        while (sc.hasNextInt())
        {
            // Read an int value
            int num = sc.nextInt();
            sum += num;
            count++;
        }
        int mean = sum / count;
        System.out.println("Mean: " + mean);

    }

    static void scanner3(){
        Scanner sc = new Scanner("Merhaba Dünya 123");
        System.out.println("" + sc.hasNext());//true
        System.out.println("" + sc.next());//merhaba
        System.out.println("" + sc.hasNext());//true
        System.out.println("" + sc.next());//dünya
        System.out.println("" + sc.hasNext());//true
        System.out.println("" + sc.next());//123
        System.out.println(sc.hasNext());//false

    }


    static void scanner4()
    {
        Scanner sc = new Scanner("Merhaba Dünya 123");
        System.out.println("" + sc.hasNextLine());//true
        System.out.println("" + sc.nextLine());//merhaba dünya 123
        System.out.println("" + sc.hasNext());//false
    }

    // </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" JOptionPane.showMessageDialog  ">
    public static void showMESSAGEdialog() 
    {                
          //  JOptionPane.showMessageDialog("Hello World");  ERROR
          //JOptionPane.showMessageDialog("Hello World",JOptionPane.INFORMATION_MESSAGE);  ERROR
        
          JOptionPane.showMessageDialog(null, "Hello World");// İ LETTER WITH CIRCLE  WİLL BE SHOWED - JOptionPane.INFORMATION_MESSAGE title= message
          //System.exit(1);
          JOptionPane.showMessageDialog (null, "hellooo", "Title", JOptionPane.INFORMATION_MESSAGE);   
          JOptionPane.showMessageDialog (null, "warning message", "Title", JOptionPane.WARNING_MESSAGE);//warning_message cant be written without title
          JOptionPane.showMessageDialog (null, " error Message", "Title", JOptionPane.ERROR_MESSAGE);//error_message cant be written without title
                    
          String namee = JOptionPane.showInputDialog("Type your nameeeeee please");
          String nameee = JOptionPane.showInputDialog("Type your nameeeeee please","title");
          String nameeee = JOptionPane.showInputDialog(null,"Type your nameeeeeeii please","title");
          
          // ERROR  String namii = JOptionPane.showInputDialog("Type your namiiii please","title",JOptionPane.ERROR_MESSAGE);
          String name = JOptionPane.showInputDialog(null,"Type your name please","title",JOptionPane.ERROR_MESSAGE);
          //int number1=Integer.parseInt(name);
          //int number2=Integer.parseInt(JOptionPane.showInputDialog(null,"Type your name please","title",JOptionPane.OK_OPTION));
          JOptionPane.showMessageDialog(null, "Hello " + name);

          String nameeeee = JOptionPane.showInputDialog("Type your name please","input in the bar");//HEP SORU İŞARETİ CIKAR
          //System.exit(0);//stop the running preceding codes
          //System.exit(1);//DONT STOP
          /*
          The messageType argument specifies the type of the message, and its values is one of the following:

          JOptionPane.INFORMATION_MESSAGE
          JOptionPane.ERROR_MESSAGE
          JOptionPane.WARNING_MESSAGE
          JOptionPane.QUESTION_MESSAGE
          JOptionPane.PLAIN_MESSAGE
          */
          
        //JDialog.setDefaultLookAndFeelDecorated(true);
	
        Object[ ] selectionValues = { "Pandas", "Dogs", "Horses" };
	String initialSelection = "Dogs";
	Object selection = JOptionPane.showInputDialog(null, "What are your favorite animals?",
        "Zoo Quiz", JOptionPane.QUESTION_MESSAGE, null, selectionValues, selectionValues[1].toString());
        System.out.println(selection);

        
        
        JFrame f=new JFrame();  //null diyordum ben
        JOptionPane.showMessageDialog(f,"Hello, Welcome to Javatpoint.","title",JOptionPane.INFORMATION_MESSAGE);  
        
        
        
        
        
    }
    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" MATH-random ">
    public static void MATH()
    {
        //  java.lang. Math;
        //  import java.text.*;

        int radius = (int)  ( 1 + Math.random() *5 );   //returns a number between 1 and 6
        double area = Math.PI*radius*radius;
        //System.out.println("The area is " +  area + " for radius " + radius);
        System.out.println("The area is " +  DecimalFormat.getInstance().format(area) + " for radius " + radius);


        double a = -191.635;
        double b = 43.74;
        int c = 16, d = 45;

        System.out.printf("The absolute value " + "of %.3f is %.3f%n",a, Math.abs(a));//The absolute value of -191.635 is 191.635

        System.out.printf("The ceiling of " + "%.2f is %.0f%n",b, Math.ceil(b));//The ceiling of 43.74 is 44

        System.out.printf("The floor of " + "%.2f is %.0f%n",b, Math.floor(b));//The floor of 43.74 is 43

        System.out.printf("The rint of %.2f " + "is %.0f%n",b, Math.rint(b));//The rint of 43.74 is 44

        System.out.printf("The max of %d and " + "%d is %d%n",c, d, Math.max(c, d));//The max of 16 and 45 is 45

        System.out.printf("The min of of %d " + "and %d is %d%n",c, d, Math.min(c, d));//The min of of 16 and 45 is 16




        double x = 11.635;
        double y = 2.76;

        System.out.printf("The value of " + "e is %.4f%n",Math.E);

        System.out.printf("exp(%.3f) " + "is %.3f%n",  x, Math.exp(x));//eulor number exponantial 2   2.71*2.71

        System.out.printf("log(%.3f) is " + "%.3f%n",x, Math.log(x));

        System.out.printf("pow(%.3f, %.3f) " + "is %.3f%n",x, y, Math.pow(x,y));//y üzeri x

        System.out.printf("sqrt(%.3f) is " + "%.3f%n",x, Math.sqrt(x));



        double random = Math.random() * 49 + 1;
        int randomm = (int )(Math.random() * 50 + 1);//DOUBLE DEGERİ INT YAP
        //This method returns a pseudorandom double greater than
        //or equal to 0.0 and less than 1.0.



        // Generate random number
        double rand = Math.random();
        // Output is different everytime this code is executed
        System.out.println("Random Number:" + rand); //0.70168273526199

        //RANDOM

        Random r1, r2;//Random classı ve objectleri

        r1 = new Random();
        System.out.println("Random value 1: " + r1.nextDouble());//deger girmem ve kendisi deger atar

        r2 = new Random(1);
        System.out.println("Random value 2: " + r2.nextDouble());

        Random randa = new Random();
        int value = randa.nextInt(3);
        //This will give value from 0 1 2.
        //import java.util.Random;
        System.out.println(randa);//java.util.Random@8bd1b6a
        System.out.println(randa.toString());//java.util.Random@8bd1b6a
        System.out.println(value);


    }


    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc="ARRAY">
    public static int[] ARRAY(int[] bjk) 
    {  
        //INITIALIZING - CREATING - DECLARING ARRAY       
        String[] array ={"a","b","c","d"};
        array=new String[10];
        System.out.println(array[0]);//null
        //String array [4]={"a","b","c","d"};//ERROR
        String arrayy[];  
        arrayy = new String []{"a","a","a","a","a"}; 
        //arrayy = new String [5]{"a","a","a","a","a"}; //ERROR

        int[] myIntArray = new int[3];//THIS LINE IS TRUE
        // myIntArray [] = {1, 2, 3};//THIS LINE IS WRONG

        int myIntArray2 [] = {1, 2, 3};//THIS LINE IS true
   
        int[] myIntArrayY = new int[]{1, 2, 3};//correct
        
        String[] StringArray = new String[3];//TRUE
        String [] aaarrAAy = new String []{"a","a","a","a","a"}; //CORRECT
        String array54[]={"1","3"};
        
        
        //ARRAY REFERENCE - Arrays.toString();
            /*
            array1=array2; dersek reference number ları ve içerikleri aynı olur
            birinde yapılacak değişiklik diğerini de otomatik olarak etkiler.
            */
        int [] a14=new int[4]; a14[0]=1; System.out.println(Arrays.toString(a14));//[1, 0, 0, 0]
        
        int[] w1={1,2,3};        int[] w2={4,5,6};   w2=w1;  System.out.println(Arrays.toString(w2));//[1, 2, 3]
        w1[0]=9;System.out.println(Arrays.toString(w2));//[9, 2, 3]

        int i1=1 , i2=2; i2=i1;  System.out.println(i2);//1

        //readdressing an object
        int[] sew={1,2,3};System.out.println(Arrays.toString(sew));//[1, 2, 3]
        sew=new int[5];System.out.println(Arrays.toString(sew));//[0, 0, 0, 0, 0]


        //DEFAULT ARRAY VALUES
        int a1 []=new int [2]; //listenin içi boş
        //a1=new int[3]; yeniden  aynı identifier ile array olusturdum 
        String [] a2 =new String [2]; //listenin içi boş
        char [] a3 =new char [2]; //listenin içi boş
        double [] a4 =new double [2]; //listenin içi boş
        float [] a5 =new float [2]; //listenin içi boş
        boolean [] a6 =new boolean [2]; //listenin içi boş
        long [] a7 =new long [2]; //listenin içi boş
        short [] a8 =new short [2]; //listenin içi boş
        //var a9 =new String [2]; //listenin içi boş
        for(int i=0; i<a1.length;i++)
        {
            System.out.println(a1[i]+" "+a2[i]+"- "+a3[i]
                    +" -"+a4[i] +" "+a5[i]+" "+a6[i]
                    +" "+a7[i]+" "+a8[i]);//+" "+a9[i]);
            //0 null-  -0.0 0.0 false 0 0 null
        }
         
        
        
        //COPYING ARRAY
        int[] sourceArray = {2, 3, 1, 5, 10};System.out.println(sourceArray);//[I@7f560810
        int[] targetArray = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++)
        {
                targetArray[i] = sourceArray[i];
                System.out.print(targetArray[i]+" ");//2 3 1 5 10 
        }

        
        
        //ENTERING VALUES AND PRINTING
        Scanner obje=new Scanner(System.in);
        int[] circleArray = new int[4];
        for (int i = 0; i < circleArray.length; i++)
        {
            System.out.printf("\nEnter %d. Element:",i+1,"\n");
            circleArray[i]=obje.nextInt();
        }
        for (int i = 0; i < circleArray.length; i++)
            System.out.println(circleArray[i]);
        
       
      
        
        
        //ENTERING VALUES IN 2D ARRAY AND PRINTING 
        int matrix[][] = new int[3][3];
        for (int i=0; i<3; i++)
        {
            for (int j=0; j<3;j++)
            { 
                System.out.printf("Enter %d.%d Element:",i,j,"%n");
                 matrix[i][j]=obje.nextInt();
            }
        }
        
        for (int i=0; i<3; i++)
        {
            for (int j=0; j<3;j++)
            { 
                 System.out.println(matrix[i][j]);
            }
            System.out.println();
        }


       // Three dimensional array:
        int[][][] threeD_array = new int[][][] { { {0,1,2},{0,1,2},{0,1,2} },{ {0,1,2},{0,1,2},{0,1,2} },{ {0,1,2},{0,1,2},{0,1,2} }  };

        int[][][] threeD_arr = new int[3][3][3];

        threeD_arr=threeD_array;

        for (int i=0; i<3; i++)
        {
            for (int j=0; j<3;j++)
            {
                for (int l=0; l<3;l++)
                {
                    System.out.printf("Enter %d.%d.%d Element:",i,j,l,"%n");
                    threeD_arr[i][j][l]=obje.nextInt();
                }
            }
        }

        for (int i=0; i<3; i++)
        {
            for (int j=0; j<3;j++)
            {
                for (int l=0; l<3;l++)
                {
                    System.out.println(matrix[i][j]);
                }
                System.out.println();
            }
            System.out.println();
        }
        
        
        //INITIALIZING AND CREATING ARRAY
        Scanner object4=new Scanner(System.in);
        System.out.printf("TYPE A NUMBER:");
        int size=object4.nextInt();
        System.out.printf("TYPE DOUBLE VALUES %d TIMES:%n",size);
        double[] rounfall = new double[size];
        for (int i = 0; i < rounfall.length; i++)
        {
            rounfall[i]=obje.nextDouble();
        }
   
        //FINDING MAX VALUE
        
        double max=rounfall[0];
        for(int t=1;t<size;t++)
        {
            if(rounfall[t]>max)
            {
                max=rounfall[t];
            }
        }
      
        //FINDING MIN VALUE
        double min=rounfall[0];
        for(int a=1;a<rounfall.length;a++)
        {
            if(rounfall[a]<min)
            {
                min=rounfall[a];
            }
        }
      
        //TOTAL OF VALUES
        double total = 0;
        for (int i = 0; i < rounfall.length; i++)
        {         
            total+=rounfall[i];               
        }
         
        System.out.println("the average of all elements="+ (total/rounfall.length));
        System.out.println("the biggest double="+max);
        System.out.println("the smallest double="+min);
 

        
        

        
        /*
        int x = 30;
        int[] numbers = new int[x];
        x = 60;
        System.out.println("x is " + x);//60
        System.out.println("The size of numbers is " + numbers.length);//30       
        */
        
        //SYSTEM.ARRAYCOPY()
        int a[]= {1,2,3,4,3,2,1}; //source array  
        int b[]= {5,6,7,8,7,6,5}; //destination array  
        int src[],srcPos,  dest[],destPos,length;  
        src =a;  
        srcPos=1;  
        dest=b;  
        destPos=2;  
        length=4;  
        System.out.print("Source array:");  
        for(int i=0;i<src.length;i++) {System.out.print(src[i]);}  
        System.out.println();  
        System.out.print("Destination array:");  
        for(int i=0;i<src.length;i++) {System.out.print(dest[i]);}  
        System.out.println();  
        System.out.println("Source Position:"+srcPos);  
        System.out.println("Destination Position:"+destPos);  
        System.out.println("Length:"+length);  
        System.arraycopy(src, srcPos, dest, destPos, length); //use of arraycopy() method  
        System.out.println("Destination array after use of arraycopy()");  
        for(int i=0;i<b.length;i++)  
        {  
            System.out.print(b[i]);  
        }  
        System.out.println();
        
        
        
        //SYSTEM.ARRAYCOPY() - Arrays.toString();
        String[] names = {"Alex", "Brian", "Charles", "David"};
        //Using System.arraycopy() method - Equally efficient but less readable
        String[] copyOfNames = new String[names.length];
        System.arraycopy(names, 0, copyOfNames, 0, copyOfNames.length);
        for(int i=0;i<copyOfNames.length;i++)
        {
            System.out.println(copyOfNames[i]);
        }
        System.out.println("names:"+names);//names:[Ljava.lang.String;@799f7e29
        System.out.println("copyOfNames:"+copyOfNames);//copyOfNames:[Ljava.lang.String;@4b85612c
        System.out.println(java.util.Arrays.toString(names));         //[Alex, Brian, Charles, David]
        System.out.println(Arrays.toString(copyOfNames));   //[Alex, Brian, Charles, David]

        System.out.println(new Integer(1)==new Integer(1));//FALSE
        System.out.println(new Integer(1).hashCode()==new Integer(1).hashCode());//true


        //Arrays.Equals();
        //Arrays.hashCode(names);
        //(names == copyOfNames)
        System.out.println("names == copyOfNames : " + (names == copyOfNames) );//false
        System.out.println("Arrays.Equals() --> "+Arrays.equals(copyOfNames,names));//true
        System.out.println("Arrays.Equals() --> "+copyOfNames.equals(names));//false içeriği aynıdır ama  referenceları farklıdır
        /*
           public boolean equals(Object obj) {
                return (this == obj);
            }
            Object classındaki equals methodu override edilmeli String classındaki gibi
         */
        System.out.println("names.hashCode() -->"+names.hashCode()+"\ncopyOfNames.hashCode(): -->"+copyOfNames.hashCode());
        System.out.println("names.hashCode() -->"+java.util.Arrays.hashCode(names)+"\ncopyOfNames.hashCode(): -->"+Arrays.hashCode(copyOfNames));
        
        //SYSTEM.ARRAYCOPY();
        int[] source = {3, 4, 5};
        int[] t = new int[source.length];
        System.arraycopy(source,0, t,0,2);//3 4 0 length:2
        System.out.println(Arrays.toString(t));//
        System.arraycopy(source,0, t,0,t.length);//3 4 5 
        System.out.println(Arrays.toString(t));


        //RESIZE THE ARRAY
        int[] myList;
        myList = new int[10];  System.out.println(myList.length);
        myList = new int[20];  System.out.println(myList.length);

        

        
        //Arrays.fill(); - Arrays.equals();
        int[] list1 = {2, 4, 7, 10};

        int[] list2 = {2, 4, 7, 10};
        System.out.println(java.util.Arrays.toString(list2));//[2, 4, 7, 10]
        System.out.println(java.util.Arrays.equals(list1, list2));//true - arrays classında equals methodu override edilmişitir
        System.out.println(list1.hashCode()==list2.hashCode());//false - hashcode override edilmemiş


       java.util.Arrays.fill(list1, 7);
        System.out.println("list1:"+java.util.Arrays.toString(list1));//list1:[7, 7, 7, 7]
        System.out.println(java.util.Arrays.equals(list1, list2));//false
        System.out.println(list1.hashCode()==list2.hashCode());//false




        list1=list2;///esitledim referansı da degerleri de aynı
        System.out.println(java.util.Arrays.toString(list1));//[2, 4, 7, 10]
        System.out.println(java.util.Arrays.equals(list1, list2));//true
        System.out.println("list1 == list2: "+ (list1 == list2));//true
        System.out.println(Arrays.hashCode(list1));// esittir Arrays.hashCode(list2)
        list1[1]=10;
        System.out.println(Arrays.hashCode(list1));

        System.out.println(java.util.Arrays.equals(list1, list2));//true olucak cümkü list2[1] de 10 oldu

        //java.util.Arrays.fill()
        int[] list = {2, 4, 7, 10};
        java.util.Arrays.fill(list, 7);
        System.out.println(java.util.Arrays.toString(list));// [7, 7, 7, 7]
        Arrays.fill(list, 1, 3, 8);//from to value index 1 ve 2 yi 8 yap
        System.out.println(java.util.Arrays.toString(list));// [7, 8, 8, 7]
        System.out.println(java.util.Arrays.equals(list, list2));//false
        
        
        //split()
        String myString = "Merhaba bu benim dunyam";
        String[] words = myString.split(" - ");
        System.out.println("stringi string arra yapar  "+words);//[Ljava.lang.String;@604ed9f0
        System.out.println(words[0]+" lenght "+words.length);//Merhaba bu benim dunyam lenght 1
        System.out.println(Arrays.toString(words));//[Merhaba bu benim dunyam]

        String[] words2 = myString.split("");
        System.out.println(Arrays.toString(words2));//[M, e, r, h, a, b, a,  , b, u,  , b, e, n, i, m,  , d, u, n, y, a, m]

        String[] words3 = myString.split(" ");
        System.out.println(Arrays.toString(words3));//[Merhaba, bu, benim, dunyam]

        String strr = "geekss@for@geekss";
        String[] arrOfStr = strr.split("@", 2);

        for (String ab : arrOfStr)
            System.out.println(ab);
        /*
        geekss
        for@geekss
         */

        String[] arrOfStr2 = strr.split("@", 5);

        for (String ab2 : arrOfStr2)
            System.out.println(ab2);

        /*
        geekss
        for
        geekss
         */



        // Verilen bir cumledeki bosluklar haric character sayisini bulunuz.	
        String str = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";	
        str = str.replace(" ", ""); // str = "Verilenbircumledekibosluklarhariccharactersayisinibulunuz."
        String harf[] = str.split("");
        System.out.println(harf.length);
	    
	//Another Way
        String strr3 = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
        String kelime[] = strr3.split(" ");
        int boslukSayisi = kelime.length - 1;
        System.out.println(boslukSayisi);
        String character[] = strr3.split("");
        System.out.println(character.length - boslukSayisi);
        
        
        
        
        
        // System.arraycopy
        int[ ] ourceArray = {2, 3, 1, 5, 10};//creating, and loading array

        int[ ] argetArray = new int[ourceArray.length];	//Creating 5 elements long array

        System.arraycopy(sourceArray, 0, argetArray, 0,ourceArray.length);

        for (int i = 0; i < ourceArray.length; i++)
           System.out.println(ourceArray[i] + "\t\t" + argetArray[i]);

        Arrays.sort(ourceArray);
        Arrays.sort(argetArray);
        for (int i = 0; i < ourceArray.length; i++)
            System.out.println(ourceArray[i] + "\t\t" + argetArray[i]);

    
     
        //Arrays.sort();
        int[] arr = {13, 7, 6, 45, 21, 9, 101, 102}; 
        Arrays.sort(arr); 
        System.out.printf("Modified arr[] : %s", Arrays.toString(arr)); //Modified arr[] : [6, 7, 9, 13, 21, 45, 101, 102]
    
    
    
    
    //System.arraycopy()-Arrays.sort()-Arrays.binarySearch()
    int[ ] sourcArray = {2, 3, 1, 5, 10};//creating, and loading array

    int[ ] targeArray = new int[sourcArray.length];	//Creating 5 elements long array

    System.arraycopy(sourcArray, 0, targeArray, 0,sourcArray.length);

    Arrays.sort(sourcArray);
    Arrays.sort(targeArray);

    int j = Arrays.binarySearch (sourcArray, 13);
    System.out.println ("j = " + j);//j = -6

    System.out.println("sourceArray" + "\t" + "targetArray");

    for (int i = 0; i < sourcArray.length; i++)
       System.out.println(sourcArray[i] + "\t\t" + targeArray[i]);

                
                
                
        //Let us create different integers arrays 
        int[] arr1 = new int [] {1, 2, 3, 4}; 
        int[] arr2 = new int [] {1, 2, 3, 4}; 
        int[] arr3 = new int [] {1, 2, 4, 3}; 
          
        System.out.println("is arr1 equals to arr2 : " + 
                                Arrays.equals(arr1, arr2)); //is arr1 equals to arr2 : true
        System.out.println(Arrays.hashCode(arr1)==Arrays.hashCode(arr2));//true

        System.out.println(arr1.equals(arr2));//false
        System.out.println(arr1.hashCode()==arr2.hashCode());//false

        System.out.println("is arr1 equals to arr3 : " + 
                                Arrays.equals(arr1, arr3));//is arr1 equals to arr3 : false
    
        
        
        Arrays.fill(arr1, 1, 3, 5 );//1,2 indexlerine 5 atar
                
                
                
        byte byteArr[] = {10,20,15,22,35}; 
        char charArr[] = {'g','p','q','c','i'}; 
        int intArr[] = {10,20,15,22,35}; 
        double doubleArr[] = {10.2,15.1,2.2,3.5}; 
        float floatArr[] = {10.2f,15.1f,2.2f,3.5f}; 
        short shortArr[] = {10,20,15,22,35}; 
  
        Arrays.sort(byteArr,1,3); //1-2-3 indekslerini sıralarlar
        Arrays.sort(charArr); 
        Arrays.sort(intArr); 
        Arrays.sort(doubleArr); 
        Arrays.sort(floatArr); 
        Arrays.sort(shortArr); 
  
        byte byteKey = 35; 
        char charKey = 'g'; 
        int intKey = 22; 
        double doubleKey = 1.5; // 1.5yok
        float floatKey = 35; 
        short shortKey = 5; //5 yok
  
        System.out.println(byteKey + " found at index = "
                           +Arrays.binarySearch(byteArr,byteKey)); 
        System.out.println(charKey + " found at index = "
                           +Arrays.binarySearch(charArr,charKey)); 
        System.out.println(intKey + " found at index = "
                           +Arrays.binarySearch(intArr,intKey)); 
        System.out.println(doubleKey + " found at index = "
                           +Arrays.binarySearch(doubleArr,doubleKey)); //yoksa -1 döndürür
        System.out.println(floatKey + " found at index = "
                           +Arrays.binarySearch(floatArr,floatKey)); 
        System.out.println(shortKey + " found at index = "
                           +Arrays.binarySearch(shortArr,shortKey)); 
    
    
        

    double myListt [ ] = new double [2];

    //Loading array with user input
    for(int i= 0; i < myListt.length; i++)
    {
        Scanner scan =new Scanner(System.in);
        //double d = Double.parseDouble(JOptionPane.showInputDialog("Enter a value for rainfall"));
        double d=scan.nextDouble();      myListt[i] = d;
    }

    double sum  = 0;
    //Processing array to calculate average rainfall
    for(int i= 0; i < myListt.length; i++)
            sum = sum + myListt[i];
    double average = sum/myListt.length;

    //Displaying result
    System.out.println("Average Rainfall = " + average);



    
    
    int matrixx[][] = new int[10][10];

    //loading 2d array
     for (int i=0; i<matrixx.length; i++)
     {
       for (int jl=0; jl<matrixx[i].length;jl++)
       {
           matrixx[i][jl]=(int)(Math.random()*1000);
       }
     }

//Print 2d array
    for (int i=0; i<matrixx.length; i++)
    {
        for (int jl=0; jl<matrixx[i].length;jl++)
        {
            System.out.print (matrixx[i][jl] + "\t");
        }
        System.out.println();
      }




        int [ ] [ ] matrxx = { {1,2}, {4,5,}, {4,6}, {4,5,6,7,8,9} };

    //Print 2d array
        for (int i=0; i<matrxx.length; i++)
        {
            for (int ji=0; ji<matrxx[ji].length;ji++)
            {
                System.out.print (matrxx[i][ji] + "\t");
            }
                System.out.println();
        }

        System.out.println ("matrix.length = " + matrxx.length );//matrix.length = 4
        System.out.println ("matrix[2].length = " + matrxx[3].length );//matrix[2].length = 6



        int arr22[][]={{1,2},{5},{6,7,8}};
        int sum1=0;

        for (int[] w:arr22)
        {
            for (int z:w)
            {
                System.out.print(z+" ");
                sum1=sum1+z;
            }		
            System.out.println("");
        }

        System.out.println(sum1);//29	

        
        //Arrays.deepToString();
        int arra[][] = new int[3][4];
        System.out.println(Arrays.toString(arra)); // [[I@71423665, [I@20398b7c, [I@6fc6f14e]
        System.out.println(Arrays.deepToString(arra)); // [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]

        int arra123[][] = new int[][]{{1,2,3},{4,5},{6}};
        System.out.println("arra123:"+Arrays.toString(arra123)); // arra123:[[I@20398b7c, [I@6fc6f14e, [I@56235b8e]
        System.out.println(Arrays.deepToString(arra123)); //[[1, 2, 3], [4, 5], [6]]
       
        
        
        bjk[0]=10;
        System.out.println(Arrays.toString(bjk));//[10, 2, 3, 4, 5] 
        //referanslar parametre ile tasınır
        return bjk;//[I@52a86356
    }


    
    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc="ARRAY">

    // </editor-fold>


    //<editor-fold defaultstate="collapsed" desc="ARRAYLIST">
    public static void ARRAYLIST()
    {      
        //Array'lerde length sabittir, degistirilemez.
        //ArrayList'lerde (List) length esnektir. Siz eleman ekledikce List length'ini
        //artirir, siz eleman sildikce List length'ini azaltir.

        //List<String> list01 = new List<>(); ==> olmaz
        //ArrayList<String> list01 = new List<>(); ==> olmaz
        ArrayList<String> list01 = new ArrayList<>();// ==> Bu olabilir ama
        //asagidaki daha cok kullanilir.
        List<String> list02 = new ArrayList<String>(); //==> bu da olur ama 

        String a1[]={"emre","duman"};
        a1[0]="mavi";
        System.out.println(a1[0]);//mavi
        System.out.println(Arrays.toString(a1));//[mavi, duman]
        System.out.println(Arrays.deepToString(a1));//[mavi, duman]

        //add();
        ArrayList fruitList = new ArrayList();
        fruitList.add("mango");
        fruitList.add("pineapple");
        fruitList.add("coconut");
        fruitList.add(1);
        fruitList.add('a');
        fruitList.add(false);
        fruitList.add(1.0);
        System.out.println(fruitList);//[mango, pineapple, coconut]
        fruitList.add(1,"APPLE");//ADDED IN 1.INDEX
       
        //isEmpty();
        System.out.println(fruitList.isEmpty());//false
        
        //set();
        fruitList.set(0, "mangoooo");
        System.out.println(fruitList);//[mangoooo, APPLE, pineapple, coconut, 1, a, false, 1.0]

        //remove();
        fruitList.remove("pineapple");
        System.out.println(fruitList);//[mangoooo, APPLE, coconut, 1, a, false, 1.0]
        
        //clear();
        fruitList.clear();
        System.out.println(fruitList);//[]
        
        //contains();
        System.out.println(fruitList.contains("mango"));//false

        
       
        
        ArrayList<Integer> integers =new ArrayList<>(1);//1 olsada artırabilirim
        integers.add(0);//0
        integers.add(1);//1
        integers.add(2,10);//the code below make 10 be third position
        integers.add(2,20);//put 20 into second position
        //integers.add(5,20);//compile error
        /*
        1.element: 0 
        2.element: 1 
        3.element: 20 
        4.element: 10 
        */
      
        //sonsuza kadar data girebilirsin.
        Scanner scan= new Scanner(System.in);
        for(int i=0;i<integers.size();i++)
        {
            int a=scan.nextInt();
            integers.add(a);
            if(i==3){ break;}
        }
        for(int i=0;i<integers.size();i++)//size();
        {
            System.out.printf("%d.element: %s %n",i+1,integers.get(i));//get();
            /*
            5.element: 1 
            6.element: 2 
            7.element: 3 
            8.element: 4 
            */
        }
        
        for (Integer i : integers)
            System.out.println("Number = " + i);
        
        //Collections.sort(arraylist);
        Collections.sort(integers);
        System.out.println(integers);//[0, 1, 1, 2, 3, 4, 10, 20]


        //list1.addAll(list2);
        fruitList.add("apple");//[apple]
        fruitList.addAll(integers);
        System.out.println("fruitList:"+fruitList);//fruitList:[apple, 0, 1, 1, 1, 1, 1, 10, 20]
        fruitList.addAll(fruitList);
        System.out.println("fruitList:"+fruitList);//fruitList:[apple, 0, 1, 1, 1, 1, 1, 10, 20, apple, 0, 1, 1, 1, 1, 1, 10, 20]

        //addAll(1, list3);
        List<Integer> list3 = new ArrayList<>();
        list3.add(6);list3.add(7);
        System.out.println(list3);//[6, 7]

        List<Integer> list4 = new ArrayList<>();
        list4.add(1);list4.add(2);list4.add(3);
        System.out.println(list4);//[1, 2, 3]

        list4.addAll(1, list3); //index 1 den itibaren ekler 
        System.out.println(list4);//[1, 6, 7, 2, 3]
       

        
        
        
        ArrayList<String> groups =new ArrayList<String>();//suan degersiz bir list
        groups.add("metallica");//0
        groups.add("manga");//1
        groups.add("PUBG");//2
        //groups.add(0)="emre"; error
        groups.set(0,"0"); 
        
        //indexOf(); - get();
        System.out.printf("%d. inde" +
                "x:%s %n ",groups.indexOf("0"),groups.get(0));//0. index:0
        System.out.println("1. index: "+ groups.get(1));// 1. index: manga
        System.out.println("2. index: "+ groups.get(2));//2. index: PUBG
        System.out.println("arraylist size:"+groups.size());//arraylist size:3
        for(int i=0;i<groups.size();i++)
        {
            System.out.printf("%d.element: %s %n",i+1,groups.get(i));
        }
        int d=0;
        for(String i: groups)
        {
            System.out.printf("%d.index: %s %n",d,i);
            d++;
            /*
            0.index: 0 
            1.index: manga 
            2.index: PUBG 
            */

        }

        boolean w1=groups.remove("metallica");//false
        boolean w2=groups.remove(groups.get(0));//true
        String w3=groups.remove(0);//manga
        System.out.println("w1:"+w1 +"\nw2:"+w2 + "\nw3:"+w3);
        
        
        //isEmpty();
        System.out.println(groups.isEmpty());//false PUBG kaldı

        int dd=0;
        for(String i: groups)//buraya girecek değer yok döngü hiç başlamaz
        {
            System.out.printf("%d.element: %s %n",dd,i);
            dd++;
            //0.element: PUBG 
        }

        //equals();
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        System.out.println(list1.equals(list2));//true
        list1.add("A");
        list1.add("B");
        System.out.println(list1.equals(list2));//false
        list2=list1;
        System.out.println(list1==list2);//true
        System.out.println(list2);//[A, B]
        list1.add("C");
        System.out.println(list2);//[A, B ,C ]


        
        //list2.toArray()   methodu list'i array'e cevirmek icin kullanilir.
        String[] SArray =list2.toArray( new String[4] );
        System.out.println(SArray);           //[Ljava.lang.String;@675d3402
        System.out.println(SArray.toString());//[Ljava.lang.String;@675d3402
        System.out.println(Arrays.toString(SArray));//[[A, B, C, null]
        
        
        //2. Yontem: Olusturdugunuz array'in data type'ini Object olarak secin
        //Object class, Java'da butun class'larin parent'idir.Yani Object class ortak atadir.
        //Object class, Java'da parent'i olmayan tek class'dir.
        //String, Object class'in child'i oldugundan data type olarak bazi durumlarda
        //String yerine Object kullaniriz.
        Object arr1[] = list2.toArray();
        System.out.println("arr1:"+Arrays.toString(arr1));//arr1:[A, B, C]
        
  
        
        //Arrays.asList() methodu array'leri list'e cevirmek icin kullanilir.
        //Arrays.asList() methodu parametre olarak array'in ismini kabul eder.
        //Create an ArrayList from an array - Arrays.asList();
        String[] stringArray = { "a", "b", "c", "d", "e" };
        System.out.println(Arrays.asList(stringArray));//[a, b, c, d, e]
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(stringArray));
        System.out.println(arrayList);// [a, b, c, d, e]

        //contains
        boolean b = Arrays.asList(stringArray).contains("a");
        System.out.println(b);//// true

       
        arrayList.add("Emine");
        System.out.println(arrayList);//[a, b, c, d, e, Emine]
        arrayList.remove("Emine");
        System.out.println(arrayList);//[a, b, c, d, e]
        arrayList.set(0, "elif");
        System.out.println(arrayList);//[elif, b, c, d, e]
    
    }

    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Immutable Class - String">
        public static void Stringg()
        {
            
            //String a42; System.out.println(a42);
            //Exception in thread "main" java.lang.RuntimeException: Uncompilable source code
            //- variable a might not have been initialized

            //IMPORTANT!!!
            /*
                bu 3 string de aynı kuyu gösterir.Yani 3 referans(variable) aynıkutu yazısı yazan kutuyu gösteriri.
                bu kutunun bir tane hashcode'u vardır
                String pool heap alanı içinde sadece string sabitleri tutan özel bir alandır. 
                Buraya aynıkutu değeri yazıldıktan sonra bunu değiştiremeyiz.
            */
            String f1="aynıkutu";System.out.println(f1.hashCode());//701857958  //hashCode StringClassından geliyor 
            String f2="aynıkutu";System.out.println(f1.hashCode());//701857958
            String f3="aynıkutu";System.out.println(f1.hashCode());//701857958
            System.out.println(f1==f2);//true- alanları baska olaydı false olurdu
            System.out.println(f1.equals(f2));//true
            
            String f4=new String("aynıkutu");//heap memory'de yeni bir alan/nesne olusturdu
            String f5=new String("aynıkutu");//heap memory'de yine yeni bir alan/nesne olusturdu
           
            System.out.println(f1==f4);//false- because variables refer to different boxes.
            System.out.println(f4==f5);//false- because variables refer to different boxes.
            System.out.println(f1.equals(f4));//true
            System.out.println(f4.equals(f5));//true
            
             
            Object f7=new String("aynıkutu");//heap memory'de yeni bir alan/nesne olusturdu
            Object f8=new String("aynıkutu");//heap memory'de yine yeni bir alan/nesne olusturdu
            
            System.out.println("f7==f8:"+(f7==f8));//false
            System.out.println("f7.equals(f8):"+f7.equals(f8));//true
            System.out.println(f7.hashCode()==f8.hashCode());//true
            
            
            
            //Integer - aynı kutuyu temsil ederller primitive'ler ve hashcodeları yoktur
            int i01=1,i02=1;
            Integer i03=new Integer(1);
            Integer i04=new Integer(1);
            System.out.println(i01==i02);//true  hashcodeları yoktur
            System.out.println(i01==i03);//true
            System.out.println(i03.hashCode());//1
            System.out.println(i04.hashCode());//1
            System.out.println(i04==i03);//false
            System.out.println("Objects.equals(i03,i04)"+ Objects.equals(i03,i04));//true

          
            
            
            String g="123";System.out.println("g.equals(String.valueOf(123))"+g.equals(String.valueOf(123)));//true
            int g1=123;    System.out.println("123".equals(String.valueOf(g1)));//true - String classındaki equals() methodu kullanılır

            String f6=new String("aynıkutu").intern();//heap memory'de yine yeni bir alan/nesne olusturdu ve aynı zamanda String Pool'daki aynıkutu yazısını tasıyan kutuyada ulalsır.
            System.out.println(f1==f6);//true - f6 variable'ı hem heap'te yeni olusturalan alana hem de string pooldaki kutuya referans eder.

            System.out.println(f6.hashCode());//701857958
            System.out.println(f1.hashCode());//701857958 f1 f2 f3 f6 hepsi aynı hashcodelu kutuyu refer eder

            f1.concat("ilave yapmadım,yeni bir alan olusturdum");//bu kutunun referansı yok ,oyuzden ulasılamaz
            System.out.println(f1==f1.concat("ilave yapmadım,yeni bir alan olusturdum"));//false

            String F2=f2.concat("ilave yapmadım,yine yeni bir alan olusturdum");//bu kutunun referansı var ,oyuzden ulasılır

            
            Basic_java nesnee2=new Basic_java("emre");//heapte yeni bir alan
            Basic_java nesnee3=new Basic_java("emre");//heapte yine yeni bir alan
                 
            //WRAPPER CLASSLER VE STRING,arrays classı olsun bunlarda equals methodu override edilmiştir
            System.out.println("nesnee2==nesnee3:"+(nesnee2==nesnee3));//false
            System.out.println("nesnee2.equals(nesnee3)"+ nesnee2.equals(nesnee3));//false
            //Basic_Java classında Object classındaki equals methodu override edilirse true yazabilir
           

            
            
            
            
            String s1="duman";
            String s2=new String("emre");
            System.out.println("String2:"+s2+"  String2 lenght:"+s2.length()+"  String1 lenght:"+s1.length());//4 5
            System.out.println("0.index of s2:"+s2.charAt(0));//stringin 0. indexi
            System.out.println("last index of s1:"+s1.charAt(s1.length()-1));//last letter


            //startsWith()
            System.out.println(s2.startsWith("emr"));//TRUE
            System.out.println(s2.startsWith("e"));//TRUE
            System.out.println(s1.startsWith("D"));//FALSE
            //endsWith()
            System.out.println(s2.endsWith("re"));//TRUE
            System.out.println(s1.endsWith("man"));//TRUE

        //equals()
        Scanner abc=new Scanner(System.in);
        String a=abc.nextLine();
        if("emre".equals("emre")) System.out.println("equal1");
        if("emre"=="emre") System.out.println("equal2");
        if("duman".equals(s1)) System.out.println("equal3");//s1="duman";
        if("duman"==s1) System.out.println("equal4");
        if("emre".equals(a))System.out.println("equal5");
        if(a.equals("emre")){ System.out.println("equal6");}//!!!!!!
        if("emre"==a){ System.out.println("equal7");}//FALSE/YAZMAZ REFERANSLARI FARKLIama kutuları aynı

        //even if both string are same,because of their existance area are different    
        //we need to use egual method

        //Convert using Integer.toString(int)
        Scanner scan=new Scanner(System.in);
        int s=scan.nextInt();
        String Str=String.valueOf(s);
        String ss=Integer.toString(s);
        System.out.println(Str==ss);//false referans noktalrı farklı içleri aynı
        System.out.println(Str.equals(ss));//true referans noktalrı farklı içleri aynı
        System.out.println(Str.equals(s));//false 

        //Convert using Integer(int).toString()
        String sss=new Integer(s).toString();      System.out.println(sss);//int s
        String aa=new Integer(123).toString();     System.out.println(aa);//123
        System.out.println(ss==aa);//false

        String q=Integer.toString(12);
        String qq=Integer.toString(12);
        System.out.println(q.equals(qq));//true


        //String class'ı

        String s_1=new String("bebek");//String s_1="bebek";
        String s_2=new String("bebek");
        String s_3="bebek";
        String s_4="bebek";

        if(s_1==s_2)//burada referanslarını sorguluyorum
            //oyuzden not equal yazar
        {
            System.out.println("equal");         
        }
        else{System.out.println("not equal s_1 s_2");}

        if(s_1.equals(s_2))//burada içindeki değerleri sorguluyorum
        {System.out.println("equal s_1 s_2");}
        else{System.out.println("not equal");}




        if(s_3==s_4)//burada referanslarını sorguluyorum
            //ve equal yazar
        { System.out.println("equal s_3 and s_4");         }
        else{System.out.println("not equal");}

        if(s_3.equals(s_4))//burada içindeki değerleri sorguluyorum
        { System.out.println("equal");          }
        else{System.out.println("not equal");}

            
            
        if(s_1==s_3)//burada referanslarını sorguluyorum
            //oyuzden not equal yazar
        { System.out.println("equal");          }
        else{System.out.println("not equal");}

        if(s_1.equals(s_3))//burada içindeki değerleri sorguluyorum
        {   System.out.println("equal");         }
        else{System.out.println("not equal");}

        
        
        char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.'};
            String helloString = new String(helloArray);
            System.out.println( helloString );//hello.

        char [] chararr=helloString.toCharArray();
            System.out.println(Arrays.toString(chararr));

        String[] helloStringArray = { "h", "e", "l", "l", "o", "."};
        //there is no such constructor in String Class
        //String helloString2 = new String(helloStringArray);     
        //System.out.println( helloString2 );//hello.
        

            
        String  str1 = "Free the bound periodicals.";
        String  str2 = str1;

        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);//String2: Free the bound periodicals.
        System.out.println("Same object? " + (str1 == str2));//Same object? true
            //String pooldaki aynı kutuyu refer ederler
        
        
        str2 = new String(str1);

        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);//String2: Free the bound periodicals.
        System.out.println("Same object? " + (str1 == str2));//Same object? false
        System.out.println("Same value? " + str1.equals(str2));//Same value? true
        
        
        
            
        //concat();
        String em="emre";
        System.out.println(em);//emre   
        String av = em.concat("duman"); //instance değişmez
        System.out.println(av);//emreduman
        System.out.println(em);//emre

        em.concat("duman");//yeni bir String Object. hashCode() u var
        System.out.println(em);//emre

        System.out.println("my name is ".concat("emre"));
            

    
        String yy = "GeeksforGeeks";
        //charAt
        System.out.println(yy.charAt (4 )  );//s, 5th element
        //length()
        System.out.println(yy.length()  );//13

        
        //replace() methodu varolan bir characterin butun gorunumlerinin yerine baska bir character yazmaya yarar
        //Ornek ata ==> ana
        //replace() 1. versiyon
        String str3 = "ata";
        System.out.println(str3.replace('t', 'n')); //ana yeni bit String nesnesi
        System.out.println(str3.replace("a", "o"));//oto

        System.out.println(str3.replace("x", "y"));//ata. x harfi olmadigi icin herhangi bir degisim yapmaz
        System.out.println(str3.replace("", "/"));//==>  /a/t/a/
        System.out.println(str3.replace("t", ""));// aa olur yani t'yi siler. Biz bu yontemi bir characteri 
                                                  // String den silmek icin kullaniriz.
        System.out.println(str3.replace("a", ""));//t butun a characterlerini siler.

        System.out.println(str3.replace("at", "Mustaf"));//Mustafa
        System.out.println(str3.replace("at", "y"));//ya
	    	
        //Soru
        String text = "Ali okula gitti. Ali otobuse bindi. Ali eve geldi. Ali yemek yedi. Ali uyudu.";
        System.out.println(text.replace("Ali", "Veli"));
        
        
        //replaceFirst() methodu degistirmek istedigimiz characterin sadece ilk gorunumunu degistirir.
        String str4 = "karakartal";
        System.out.println(str4.replaceFirst("k", "K"));//Karakartal
        System.out.println(str4.replaceFirst("a", "e"));//kerakartal
        System.out.println(str4.replaceFirst("ka", "A"));//Arakartal
        System.out.println(str4.replaceFirst("kar", ""));//akartal
        System.out.println(str4.replaceFirst("kara", "A"));//Akartal
        System.out.println(str4.replaceFirst("karakartal", "cimbombom"));//cimbombom
	
          
        //substring()
        String so="emre duman";  
        System.out.println(so.substring(6));//7. indexten baslar  - uman
        System.out.println(so.substring(0,6)+ "  html");//emre d  html  0dahil 6 ya kadar


        String w1 = "Welcome to Javaaaa";
        String w2 = w1.substring(0, 11)+ "HTML";//12 dahil deavmını yazaer
        w2 = w1.substring(10)+ "HTML";//11 dahil devamını yazar
        System.out.println(w1);
        System.out.println(w2);
    
    
        // substring() methodu bir String'in belli bir bolumunu kesip almak icin kullanilir.

        str1 = "Java calisana kolaydir";

        //substring() 1. versiyon

        System.out.println(str1.substring(5));//calisana kolaydir. 5. indexi gosterir
        System.out.println(str1.substring(8));//isana kolaydir. index 8 dahildir (inclusive)
        System.out.println(str1.substring(22));//Ekranda hic bir sey goremezsiniz
        //System.out.println(str1.substring(23));//index 23 yok ama ben olmayan bir yerden kesmek istiyorum. 
                                               //Bu bir hatali istekdir. Java Exception verir, yani beni uyarir
                                               //hata yapiyorsun der.
        System.out.println(str1.substring(0));//str1.substring(0) = str1 oldugundan substring(0) hic kullanilmaz

        //substring() 2. versiyon
        System.out.println(str1.substring(5, 13));//ilk index dahil ikinci index dahil degildir. Ilk index i ekranda gorurusunuz
                                                  //ikinci indexi ekranda goremezsiniz. [5,13)
                                                  //calisana

        System.out.println(str1.substring(6,12));//alisan
        System.out.println(str1.substring(6,6));//Ekranda hic bir sey goremezsiniz. substring(6,6) kullanilmaz
        //System.out.println(str1.substring(7,6));//RunTime Error Exception verir.Bu hatayi yapmayin, her zaman ilk index kucuk 
                                                // veya esit olmalidir.

                                                       
        //reverse() String classında böyle bir method yok
        StringBuffer  sd = new StringBuffer("Hello");// public final class StringBuffer
        System.out.println(sd.reverse() );//olleH
        
         //reverse() String classında böyle bir method yok
        StringBuilder  sd2 = new StringBuilder("Hello");//public final class StringBuilder
        System.out.println(sd2.reverse() );//olleH

        //valueOf() 
        double d = 102939939.939;
        boolean b = true;
        long l = 1232874;
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f','g' };
        String[] arr2 = {"a","b","c","d","e","f","g" };
        

        System.out.println("Return Value : " + String.valueOf(d) );// 1.02939939939E8
        System.out.println("Return Value : " + String.valueOf(b) );
        System.out.println("Return Value : " + String.valueOf(l) );
        System.out.println("Return Value : " + String.valueOf(arr) );// abcdefg
            String fd=String.valueOf(arr);   System.out.println(fd);//// abcdefg

            String fd2=String.valueOf(arr2); System.out.println(fd2);//[Ljava.lang.String;@5010be6
            System.out.println("Return Value : " + String.valueOf(arr2) );// [Ljava.lang.String;@604ed9f0
        System.out.println("Return Value : " + String.valueOf(arr2[0]) );// a
        
        
        int [] arr3 = {1,2,3,4,5};
        Object arr32=String.valueOf(arr3);
        String arr33=String.valueOf(arr3[0]);
        System.out.println("Return Value : " + String.valueOf(arr32) );//[I@6a4f787b
        System.out.println("Return Value : " + String.valueOf(arr33) );//1

        
        //indexOf()
        System.out.println("emreduman".indexOf("du"));//4 yazar dnin indeksi 4
        System.out.println("emreduman".indexOf("d", 2));//4 yazar 2. d yok olsa da
        System.out.println("emredumane".indexOf("m", 2));//6 yazar 2. m

        //lastIndexOf()
        System.out.println("emreduman".lastIndexOf("e"));//3 yazar
        System.out.println("sivrihisar".lastIndexOf("i",7));//ilk 7 indeksin içinde last i nin indeksini bulur
        System.out.println("sivrihisar".lastIndexOf("a",7));// -1 yok çünkü/ilk 7 indeksin içinde last i nin indeksini bulur
        
        //equalsIgnoreCase()
        String myString = "MERHABA DÜNYA";
        if (myString.equalsIgnoreCase("merhaba dünya"))
            System.out.println(myString);//MERHABA DÜNYA
    
        //toLowerCase()
        System.out.println("Kucuk harfler : " + myString.toLowerCase());//merhaba dünya

        //toUpperCase()
        myString = "merhaba dunya";
        System.out.println("Buyuk Harfler : " + myString.toUpperCase());//MERHABA DUNYA

        //trim()
        myString = "  merhaba  dunya  ";
        System.out.println("Basta ve sondaki bosluklar silinir " + myString.trim());//"merhaba  dunya"

        //split()
        myString = "Merhaba bu benim dunyam";
        String[] words = myString.split(" ");
        System.out.println("stringi string arra yapar  "+words);//[Ljava.lang.String;@604ed9f0
        System.out.println(words[0]+" lenght "+words.length);//Merhaba bu benim dunyam lenght 1
        System.out.println(Arrays.toString(words));//[Merhaba bu benim dunyam]

        String[] words2 = myString.split("");
        System.out.println(Arrays.toString(words2));//[M, e, r, h, a, b, a,  , b, u,  , b, e, n, i, m,  , d, u, n, y, a, m]

        String[] words3 = myString.split(" ");
        System.out.println(Arrays.toString(words3));//[Merhaba, bu, benim, dunyam]


        // Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
		
        String str = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
		
        str = str.replace(" ", ""); // str = "Verilenbircumledekibosluklarhariccharactersayisinibulunuz."
        String harf[] = str.split("");
        System.out.println(harf.length);
	    
	//Another Way
        String strr3 = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
        String kelime[] = strr3.split(" ");
        int boslukSayisi = kelime.length - 1;
        System.out.println(boslukSayisi);
        String character[] = str1.split("");
        System.out.println(character.length - boslukSayisi);
        
        

        //isEmpty();
        System.out.println(myString.isEmpty());//false çünkü dolu
        System.out.println(" ".isEmpty());//false çünkü dolu
        System.out.println("".isEmpty());//true çünkü dolu


    
        //contains()
        System.out.println("karakartal".contains("g"));//false
        System.out.println("karakartal".contains("a"));//true
        System.out.println("karakartal".contains("kar"));//true
        //System.out.println("karakartal".contains('a'));//error char kabul etmez
    
    
    
        // String i byte array yapar        
        myString = "Merhaba dünya";         
        byte[] strByte = myString.getBytes();//stores bytes into array         
        System.out.println(Arrays.toString(strByte));//[77, 101, 114, 104, 97, 98, 97, 32, 100, -61, -68, 110, 121, 97]       
        System.out.println("index 0:"+strByte[0]+" byteArrayLength ");//index 0:77 byteArrayLength - 77 M
        System.out.println(new String(strByte));//Stringi referansı baska olan bir string atamak
   
        //toCharArray();
         String y = "GeeksforGeeks"; 
         char[] gfg = y.toCharArray(); 
         for (int i = 0; i < gfg.length; i++) { 
         System.out.print(gfg[i]+" "); }//G e e k s f o r G e e k s  

         //toCharArray();
         String y2 = "0123456789"; 
         Integer zx=new Integer(y2); System.out.println(zx);//123456789
         int[] yu=new int []{zx}; System.out.println(yu);/*[I@4cf777e8*/   System.out.println(yu[0]);//123456789
         int[] yu2=new int []{Integer.parseInt(y2)}; System.out.println(yu2);/*[I@2f686d1f*/   System.out.println(yu[0]);//123456789
            System.out.println(yu2.length);//1
         
    

    //compareTo()
    String st1="alisa";
    int i=0;
    i=st1.compareTo("behra");
    System.out.println("\ni:"+i+"  st1:"+st1);//i:-1 because i "a"lisa "b"ehradan erken gelir
    
    //getChars(stpoint,endpoint,destSrc,stPointsAtDest)
    String st2="anadolu";
    char karDiz[]=new char[7];
    st2.getChars(3,7,karDiz,0);    
    //index3ten 6dahile kadar karDiz in içine 0.indexten itibaren yerleştir
            System.out.println("Arrays.toString(karDiz)"+Arrays.toString(karDiz));
            //Arrays.toString(karDiz)[d, o, l, u,  ,  ,  ]

    System.out.println("Yeni dizi: ");
    for(i=0; i<karDiz.length; i++)
    System.out.println(karDiz[i]);
    
    
    }
        
        
        
        

    //</editor-fold>
        
    //<editor-fold defaultstate="collapsed" desc=" StringBuffer & StringBuilder vs String">
        
        static public void StringBuilder()
        {
            //STRİNGTEKİ METHODLAR STRING degerleri değistiremezimmutable classtır. hep yeni nesne  olusturur.
           
            String name="Emre"; 
            System.out.println(name.substring(2));//starts from index2 re/ suan bu re heap bellekte yaratıldı /re
            //"re" objesi olustu fakat terkedilmis durumda (abadoned)
            
            name.concat(" Duman");
            //concat(" Duman")       - " Duman" objesi olustu referansı yok unassigned abandoned
            //name.concat(" Duman"); - "Emre Duman" objesi oluştu ama abandoned unassigned to any variable
            String x=name.concat(" Duman"); System.out.println(x);//assigned Emre Duman 
            System.out.println(name);//Emre değişim olmadı String immutable
           
            name=name.substring(2);//arrtık name=re;
            System.out.println(name);//re
            String newName=name.substring(2);//starts from index2 re/ suan bu re heap bellekte yaratıldı / re
            System.out.println(newName);//re
            
            //1
            StringBuilder str=new StringBuilder();//suan bos string haznesi olusturdum
            System.out.println(str.append("emre"));//atama yaptım yazdırdım / emre
            
            //2
            StringBuilder str1=new StringBuilder("Duman");//suan bos string haznesi olusturdum ve deger atadım
            System.out.println(str1);//Duman
            
            //3
            StringBuilder str2=new StringBuilder(5);//capacity
            str2.append("12345");
            str2.append("6789");//string builder mutable dır capacity 5ten 9a cıktı
            System.out.println(str2);//123456789 yazdırıdm
            

            
            StringBuilder str3=new StringBuilder("animals");
            //str3=(StringBuilder)str3.substring(3);// str3 StringBuilder type dır str3.substring() string typedır.
            String newString=str3.substring(0, 5);// string type =string type
            
            System.out.println(str3.indexOf("s"));//s nin index inin yazar - 6 
            System.out.println(str3.charAt(6));//6. indexteki char ı yazar - s
            System.out.println(str3.length());//7
            
            //delete()-deleteCharAt()-insert() methodu StringBuilder a hastır.oyüzden hemen kalıcı değiişiiklik olur
            System.out.println(str3.insert(0, 2));//0 indexine 1 yazar  1animals
            System.out.println(str3.delete(0, 1));//0 dan 1 e kadar sil 1 dahil değil - animals
            System.out.println(str3.deleteCharAt(6));//animal
            
            StringBuilder str4=new StringBuilder();
            System.out.println(str4.append("aaaaa").insert(1, "bb").insert(4,"ccc").deleteCharAt(7));//abbacccaaa- chain usulu denir- ethodlar pespese yazılır
           
          
            //
            String str5="0";
            int a=0;
            String s=Integer.toString(a);
            StringBuilder str6=new StringBuilder("0");
            /*
            if(str5==str6)//compileTime error DATA TİPİ FARKLI OLDUĞU İÇİN COMPLIE EDEMZ
                System.out.println("1");*/
            if(str5.equals(Integer.toString(a)))//true
                System.out.println("2");
            
            if(str5.equals(String.valueOf(str6)))//true - //StringBuilder data type ın yazılışını aldım ve Stringin içine koydum 
                System.out.println("2"); 
            
            if(str5.equals(str6.toString()))//true - //StringBuilder data type ın yazılışını aldım ve Stringin içine koydum 
                System.out.println("2");
            
        }
        
        
        
        static public void StringBuffer()//StringBuilder den farkı methodları synchronized dır
        {
            StringBuffer sb = new StringBuffer("abc");
                //public synchronized StringBuffer append(String str) {...}
                sb.append("def").append(sb);//sb = abcdefabcdef
                System.out.println("sb = " + sb); //cikti sb = abcdefabcdef olacaktir
            
            
            StringBuffer sb2 = new StringBuffer("0123456789");
                //public synchronized StringBuffer delete(int start, int end) { ... }	
                sb2.delete(4, 6);
		// index 0 dan baslayacaktir!
		// baslangic indexi dahil,(4)
		// bitis indexi dahil degildir (6)	
		System.out.println(sb2);//01236789
            
            StringBuilder sb3 = new StringBuilder("0123456789");
                //public StringBuffer insert(int offset, int i) { ... }
                sb3.insert(4, "----"); // 4.indexten sonra ekleme yap!(insert)
                System.out.println(sb3);//0123----456789

            StringBuffer sb4 = new StringBuffer("levent erguder");
                //public synchronized StringBuffer reverse() {...}
                sb4.reverse();
		System.out.println(sb4);//redugre tnevel
                
                
            StringBuffer sb5 = new StringBuffer("test string");
                //public synchronized String toString() {.. }
                //toString metodu ile StringBuffer ve StringBuffer objesinden String obje olustururuz.
		System.out.println(sb5.toString());//test string
                
                
                
                //StrinBuffer VS StringBuilder
                
            long startTime = System.currentTimeMillis();  
            
            StringBuffer sb01 = new StringBuffer("Java");  
            for (int i=0; i<10000000; i++){  
                sb.append("Tpoint");  
            }  
            System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
           
            startTime = System.currentTimeMillis();  
            StringBuilder sb02 = new StringBuilder("Java");  
            for (int i=0; i<10000000; i++){  
                sb2.append("Tpoint");  
            }  
            System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  
       
            /*
                Performance Test of StringBuffer and StringBuilder
                Time taken by StringBuffer: 305ms
                Time taken by StringBuilder: 278ms  fast because not synchronized
            
            
                StringBuffer is synchronized, StringBuilder is not.
                StringBuilder is faster than StringBuffer because it's not synchronized .
            
            
                StringBuilder is non-synchronized i.e. not thread safe.
                It means two threads can call the methods of StringBuilder simultaneously. 
                StringBuffer is less efficient than StringBuilder. 
                StringBuilder is more efficient than StringBuffer.
               

                StringBuffer                                             StringBuilder
                StringBuffer is synchronized i.e. thread safe.           StringBuilder is non-synchronized i.e. not thread safe.
                It means two threads can't call the methods of           It means two threads can call the methods of StringBuilder 
                StringBuffer simultaneously.                             simultaneously.
            */
        }  

        
    // </editor-fold> 
        
    //<editor-fold defaultstate="collapsed" desc=" Algorithm Questions 1-5">
        
       public static void AlgorithmQuestions()
       {
            //1 
            System.out.println("Decimal of 10 is: ");   decimalToBinary(10);  //1010
            System.out.println("Decimal of 21 is: ");  decimalToBinary(21); //10101
            
            //2
            createMatrix(5,5);
            
            //3
            Scanner tara = new Scanner(System.in);
            System.out.println("Satır sayısını giriniz");
            int satirSayisi = tara.nextInt();
            createCrossShape(satirSayisi);
            
            //4
            cardGame();
            
            //5
            ebobEkok(4,5);
            

       }

       
       //Decimal sayıları binary formatına çeviren java programını yazınız.
       //Program 30 sayısı için 1 1 1 1 0 çıktısını üretmeli, String kullanabilirsiniz.
       public static void decimalToBinary(int decimal)
       {    
            int binary[] = new int[40];    
            int index = 0;    
            while(decimal > 0)
            {    
                binary[index++] = decimal%2;    
                decimal = decimal/2;    
            }    

            for(int i = index-1;i >= 0;i--) {    
                System.out.print(binary[i]);    
            }   

             System.out.println();//new line  
       }    
     
       
       //: 5*5 bir matris olusturun ve bu matrisin elemanları 0 - 9 arasında rastgele sayılar olsun.
       // Bu matrisi ekrana    yazdıran ve çapraz elemanların toplamını gösteren programı yazınız.
       public static void createMatrix(int a, int b)
       {
            int[][] matrix = new int[a][b];
            int genelToplam = 0;

            for(int i=0; i<a; i++)
            {
                for(int j=0; j<b; j++)
                {
                    matrix[i][j] = (int) (Math.random() * 10);
                    System.out.print(matrix[i][j]+ "  ");
                }
                genelToplam= genelToplam + matrix[i][i];
                System.out.println();
            }

            System.out.println("Çapraz elemanların toplamı :"+genelToplam);
       }
       
       
       /*
        * X     X
        *  X   X
        *    X
        *  X   X
        * X     X
        *
       */
       public static void createCrossShape(int line)
       {
            for(int i=0; i<line; i++)
            {
                for(int j=0; j<line; j++)
                {
                    if(i==j || j==(line-i-1)){
                        System.out.print("x");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println(" ");
            }
       }
       
       
       //Iskambil destesini diziler ile olusturun. Sonrasında bu destedeki
       //elemanları karıştırın ve de ilk kullanıcıya hangi 4 kartın geldiğini
       //ekrana yazdırın.
       
       public static void cardGame()
       {
            String kartTurleri[] = {"Kupa","Maça","Karo","Sinek"};
            String kartNumaralari[] = {"As" , "2", "3", "4", "5", "6", "7", "8","9" ,"10", "J","Q","K"};
            int deste[]=new int[52];
            desteyiOlustur(deste);
            desteyiKaristir(deste);
            desteyiGoster(deste, kartTurleri, kartNumaralari);
       }
       
       private static void desteyiOlustur(int[] deste) 
       {
            for(int i=0; i<deste.length ; i++)
            {
               deste[i] = i ;
            }
            System.out.println(Arrays.toString(deste));
       }
       private static void desteyiKaristir(int[] deste)
       {
            for(int i=0; i<deste.length; i++)
            {
                int rastgeleIndex = (int)(Math.random() * deste.length);
                //swap işlemi var
                int gecici = deste[i];
                deste[i] = deste[rastgeleIndex];
                deste[rastgeleIndex] = gecici;
            }
            System.out.println(Arrays.toString(deste));

        }
        private static void desteyiGoster(int[] deste, String[] kartTurleri, String[] kartNumaralari) 
        {
            for(int i=0; i<4 ; i++)
            {
                String kartTuru = kartTurleri[deste[i] / 13];
                String kartNumarasi = kartNumaralari[deste[i] % 13];
                System.out.println(kartTuru + " " + kartNumarasi);
            }
        }
 
        
        //Verilen iki sayının en küçük ortak katını bulan uygulamayı yazınız.
        //Ekok(s1, s2)* ebob(s1,s2) = (s1*s2); buna uygun olacak şekilde bulunuz

        public static void ebobEkok(int birinciSayi , int ikinciSayi) 
        {
            //int ekok = klasikEkokBul(birinciSayi, ikinciSayi);
            //System.out.println(birinciSayi+" ile "+ikinciSayi+" ekoku :"+ekok);
            //int ebob = ebobBul(15, 45);
            //System.out.println("ebob : "+ebob);
            int ekok = ekokBul(birinciSayi, ikinciSayi);
            System.out.println("ekok : "+ekok);
            int ebob = ebobBul(birinciSayi, ikinciSayi);
            System.out.println("ebob:"+ebob);
        }
       
        private static int ekokBul(int birinciSayi, int ikinciSayi)
        {
            //ebob * ekok = s1 * s2 ;
            int ekok = (birinciSayi * ikinciSayi) / ebobBul(birinciSayi,ikinciSayi);
            return ekok;
        }
        
    private static int ebobBul(int birinciSayi, int ikinciSayi)
    {
        int ebob = 1;
        int kontrol = 2;
        while(kontrol <= birinciSayi && kontrol <= ikinciSayi)
        {
            if(birinciSayi % kontrol == 0 && ikinciSayi % kontrol ==0)
            {
                ebob = kontrol;
            }
            kontrol++;
        }
        
        if(ebob==1){
              System.out.println(birinciSayi +" ve " + ikinciSayi+ " aralarında asaldır");
        }
        else{
            System.out.println(birinciSayi +" ve " + ikinciSayi+ " sayılarının en büyük ortak böleni :"+ebob);
        }
        return ebob;
    }
    
    
    private static int klasikEkokBul(int birinciSayi, int ikinciSayi)
    {
        int buyuk = Math.max(birinciSayi,ikinciSayi);
        int ekok =0;
        for(int i = buyuk; i<= birinciSayi*ikinciSayi; i++)
        {
            if(i % birinciSayi == 0 && i% ikinciSayi ==0)
            {
                ekok = i;
                break;
            }
        }
        return ekok;
    }
    // </editor-fold> 

    //<editor-fold defaultstate="collapsed" desc=" Date/DateFormat/Calendar classes ">
        
    public static void date()
    {
        //LocalDate Classı
        //public final class LocalDate implements Temporal, TemporalAdjuster, ChronoLocalDate, Serializable 
        // Bugunun tarihini ekrana yazdiralim
        System.out.println(LocalDate.now());//2020-05-27

        // Bugunun zamanini saat, dakika, saniye ve salise olarak ekrana yazdiralim
        System.out.println(LocalTime.now());//12:16:58.333841

        // Bugunun tarihini ve zamanini ekrana yazdiralim
        System.out.println(LocalDateTime.now());//2020-05-27T12:16:58.334844100 Buradaki "T" tarih ile zamani ayirmak icin konuluyor.
        
                  
        
        
        //LocalDate
        LocalDate date = LocalDate.now();
        System.out.println(date);//2020-05-20
        System.out.println(date.plusDays(3));//2020-05-23
        System.out.println(date.plusDays(13));//2020-06-02 ==> Gun fazla olunca ay veya yil da degisir
        System.out.println(date.plusWeeks(2));//2020-06-16
        System.out.println(date.plusMonths(2));//2020-08-16
        System.out.println(date.plusYears(2));//2022-08-20

        System.out.println(date.minusDays(3));//2020-05-17
        System.out.println(date.minusWeeks(1));//2020-05-13
        System.out.println(date.minusMonths(2));//2020-03-20
        System.out.println(date.minusYears(4));//2016-05-20
        //Bu methodlar  kalıcı değişiklik yapmaz
                 
        
        //DateTimeFormatter
        date = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy"); 
        System.out.println(dtf.format(date));//20-May-2020	

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(dtf1.format(date));//20-05-2020

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy/M/dd");
        System.out.println(dtf2.format(date));//2020/5/20
        
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("Y/M/dd");
        System.out.println(dtf3.format(date));//2020/5/20
        
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("YYYY/M/DDD");
        System.out.println(dtf4.format(date));//2020/8/238

        //System.out.println(dtf.format(localTime));error
        //System.out.println(dtf.format(localDateTime));//error

        
        
        
        //LocalTime
        // Time Manipulation (Zamani degistirecegiz)		
        LocalTime time = LocalTime.now();
        System.out.println(time);//09:35:09.741468500

        //plus ve minus methodlarini saat, dakika ve saniye icin kullaniniz
        System.out.println(time.plusSeconds(35));
        System.out.println(time.plusMinutes(4));
        System.out.println(time.plusHours(2));

        System.out.println(time.minusSeconds(11));
        System.out.println(time.minusMinutes(3));
        System.out.println(time.minusHours(1));
        //Bu methodlar  kalıcı değişiklik yapmaz

        
        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("hh:mm");//HH kullanirsaniz 24 luk dilimi kullanir
        System.out.println(dtf5.format(time.plusHours(3)));//03:37
        
        DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("HH:mm");//HH kullanirsaniz 24 luk dilimi kullanir
        System.out.println(dtf6.format(time.plusHours(3)));//15:37
        
        DateTimeFormatter dtf7 = DateTimeFormatter.ofPattern("HH:mm:ss");//HH kullanirsaniz 24 luk dilimi kullanir
        System.out.println(dtf7.format(time.plusHours(3)));//15:37:28

        
        //Baska ulkenin local zamanini almak 	
        System.out.println(time.now(ZoneId.of("Asia/Istanbul")));//13:37:01.476955
                                                        
                     
        //Date Class
        Date date2 = new Date();
        System.out.println(date2.toString());//Fri May 01 15:39:53 EDT 2020
        System.out.println("Timestamp : " + date2.getTime());//Timestamp : 1588362039222

        
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println(df.format(date2));//2020/05/01
        
        Calendar takvim = new GregorianCalendar(1984, 01, 01);//Wed Feb 01 00:00:00 EST 1984
        Date tarih = takvim.getTime();
        System.out.println(tarih.toString());
    }
    // </editor-fold> 

    //<editor-fold defaultstate="collapsed" desc=" icice methodlar ekok-ebob">
        
        static public void icice_Methods()
        {
            int n1=10,n2=15;
            int ekok = ekokBul(n1,n2);
            System.out.println("ekok:"+ekok);	        
        }

	/*
	 * return ekok
	 */
	private static int ekokBul01(int num1, int num2) 
	{
		// TODO Auto-generated method stub
		
		int ekok =(num1 * num2) / ebobBul(num1,num2);
		return ekok;
	}

	private static int ebobBul02(int num1, int num2)	
	{
		// TODO Auto-generated method stub
		int ebob=1;
		int control=2;
		while(control <= num1 && control <=num2)
		{
			if(num1%control==0 && num2%control==0)
			{
				ebob=control;					
			}
			control++;
		}
		if (ebob==1)
			System.out.println("One of them or both numbers are prime ");
		else
			System.out.println("Ebob is:"+ebob);
			
		return ebob;
	}
        
        
    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" icice methodlar2 ">
        
        public static void icice_Methods2()
        {
            /*
            The int array is an array of integers where as the char array of printable characters. 
            The printwriter has the capability to print character arrays as this is how it prints 
            string anyway. The printwriter will therefore print them like a string, without 
            calling the toString() method to convert it to a string. 
            Converting an int array to a string returns a hash code,
            explaining why you get that output.
            */
            int [] a ={1,2,3}; System.out.println(a);//[I@2752f6e2
            char [] a2 ={69,70,71}; System.out.println(a2);//EFG !!!!!
            Scanner scan=new Scanner(System.in);
            System.out.print("Please enter the amount of students:");
            int studentNum=scan.nextInt();
            System.out.print("Please enter the amount of questions:");
            int questionNum=scan.nextInt();

            char [][] allAnswers=new char [studentNum][questionNum];//student answers	
            char [] answerKey= new char[questionNum];//answerkey

            createAnswerKey(answerKey);//randomAnswers();
            showAnswerKey(answerKey);
            
            System.out.println(answerKey.toString());//[C@458ad742
            System.out.println(answerKey);//CBA
            System.out.println(Arrays.toString(answerKey));//[C, B, A]
            
            put(allAnswers);	//randomAnswers();
            showAllAnswers(allAnswers);//of students
            System.out.println(Arrays.deepToString(allAnswers));
            
            compareStudent(answerKey,allAnswers);
        }
        
        public static char randomAnswers()//create random answers
	{
            int randomNum=(int)(65+(Math.random()*5));//65-66-67-68-69- A B C D E 
            char randomAnswer=(char) randomNum;
            return randomAnswer;	
	}

	private static void createAnswerKey(char [] array)//put random answers in a array
	{
            for(int i=0 ; i < array.length ; i++)
            {
                array[i]=randomAnswers();
            }
	}

	private static void showAnswerKey(char[] answerKey) 
	{
            System.out.println("Answer Key:");
            int count=1;
            for(char answer: answerKey)
            {
                System.out.printf("%d.Qestion's Answer is: %c%n",count,answer);
                count++;
            }
            System.out.println();
	}

	
	/*
	 * puts random answers of students
	 */
	private static void put(char[][] allAnswers)
	{
            for(int line=0 ; line<allAnswers.length ; line++)
            {
                for(int coloum=0 ; coloum<allAnswers[line].length ; coloum++)
                {
                    allAnswers[line][coloum]=randomAnswers();
                }

            }
	}

	
	private static void showAllAnswers(char[][] allAnswers) 
	{
            for(int line=0 ; line<allAnswers.length ; line++)
            {
                for(int coloum=0 ; coloum<allAnswers[line].length ; coloum++)
                {
                    System.out.printf("%d.Student's of %d.answer::%c%n",line+1,coloum+1,allAnswers[line][coloum]);
                }
                System.out.println();
            }
	}


	private static void compareStudent(char[] answerKey, char[][] allAnswers)
	{
            ArrayList <Integer > succesfulStudent=new ArrayList<>();
            
            for(int line=0 ; line<allAnswers.length ; line++)
            {
                int correctAnswer=0;
                for(int coloum=0 ; coloum<allAnswers[line].length ; coloum++)
                {
                    if(allAnswers[line][coloum] == answerKey[coloum])
                    {
                        correctAnswer++;
                        if(correctAnswer==answerKey.length)
                        {
                            succesfulStudent.add(line);
                        }
                    }
                }
                System.out.printf("The Number of %d.Student's correct answers:%d%n",line+1,correctAnswer);
            }      
            
            if(succesfulStudent.size()>0)
            {
                System.out.println("****Successful Students****");
                for(int i: succesfulStudent)
                    System.out.printf("%d. Student is succesful!%n",i);
            }
            else
                System.out.println("nobody is succeeded");
	}


       
    // </editor-fold>   
        
    //<editor-fold defaultstate="collapsed" desc=" icice methodlar3 ">

   static public void icice_Methods3()
   {
        System.out.println("Please Write a Sentence:");//pyhtondaki print() ile aynı
        Scanner Scan =new Scanner(System.in);
        String input=Scan.nextLine();//cümle yaz ve cümleyi String input'a ata
        
        byte[] adSoyadByte = input.getBytes();//stores bytes into array  
        System.out.println("byte[] adSoyadByte : "+Arrays.toString(adSoyadByte) );
       
        String sortedNameSurname=new String(sortByte(adSoyadByte));
        System.out.println(sortedNameSurname);
        FirstLetters(input);//String'i methodun içine koy
        reverseNameSurname(input);
   }
       
    public static void FirstLetters(String s)//bu method String bir değer return eder, s parametresi girdiğimiz cümleyi temsil eder
    {
        String fletters="";//bosluktan sonraki harfleri büyültüp buraya eklicem

        if(String.valueOf(s.charAt(0)) != " ")//Eğer ilk harf boşluk değilse 
        {        
            fletters=fletters.concat(String.valueOf(s.charAt(0)).toUpperCase());//madem String'in(cümlenin) ilk char'ı bosluk değil,cümlenin ilk char'ını fletters'a ekle
            System.out.println(tara(s,fletters));//girdiğin cümleyi tarayıp, bosluktan sonraki harfleri büyültüp  String fletters'a ekledi,
            //artık return edilmiş bu string değerinin print edelim
        }


        if(String.valueOf(s.charAt(0)).equals(" "))//Eğer cümlenin ilk harfi boşluk ile baslıyorsa
        {
            System.out.println(tara(s,fletters));//girdiğin cümleyi tarayıp, bosluktan sonraki harfleri büyültüp  String fletters'a ekledi,
                                                //artık return edilmiş bu string değerinin print edelim
        }
    }

    public static String tara(String s,String firstletters)//hem girdiğimiz cümleyi hem method içine yazdığım boş stringi parametere olarak aldı
    {
        for(int i=0 ; i<s.length()-1 ; i++)////cümleyi bastan  sona harf harf  gez
        {
            if(s.charAt(i)==' ')//eğer cümle içinde  bir bosluk ile karsılasırsa
            {                        
                if(s.endsWith(" "))//boslukla karsılasırsa ve eğer bu bosluk  cümlenin son char'ı ise hiç bir şey yapma
                {

                }
                else //eğer bu bosluk cümlenin son karakteri değilse
                {
                    firstletters=firstletters.concat(String.valueOf(s.charAt(i+1)).toUpperCase());//bosluktan sonraki char'ı String'e dönüştür, büyült, fletters String'ine ekle
                }
            }
        }//döngü bittik,yani cümleyi bastan sona gezdik
        return firstletters;//bas harfleri biriktiren stringi üstteki methoda return eder
    }
    
    static byte []sortByte(byte arr[]) 
    { 
        int n = arr.length;   
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
  
            // Swap the found minimum element with the first 
            // element 
            byte temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
            
        } 
        return arr;
    } 
  
 
    static void reverseNameSurname(String input)
    {
        
        char [] strAsCharArray = input.toCharArray();
        //String s=String.valueOf(strAsCharArray);
        System.out.println(strAsCharArray );//emre duman
        System.out.println(strAsCharArray + " - "+strAsCharArray.length);//[C@2ef5e5e3 - 10
        System.out.println(Arrays.toString(strAsCharArray) + " - "+strAsCharArray.length);//
        //[e, m, r, e,  , d, u, m, a, n] - 10
        
        byte [] strAsByteArray = input.getBytes(); 
        byte [] result = new byte [strAsByteArray.length]; //strAsCharArray.length da yazabiliridm
  
        // Store result in reverse order into the 
        // result byte[] 
        for (int i = 0; i<strAsByteArray.length; i++) 
            result[i]=strAsByteArray[strAsByteArray.length-i-1]; 
  
        System.out.println(new String(result)); 
    }
    

        // </editor-fold>    

    //<editor-fold defaultstate="collapsed" desc=" pass by value - pass by reference ">
    
    //Bir method'a variable yollandiginda Java o variable'in
    //kopyasini olusturur ve method'a kopyayi yollar bu yuzden variable'in
    //orjinal degeri method calistiktan sonra da ayni kalir.
    //Buna Pass By Value denir.

    //Pass by Refernece'da ise reference'in kopyasi olusturulur ve methoda yollanir
    //fakat reference'in kopyasi da kendisi gibi ayni object'i gosterdigi icin orjinal
    //deger degisir.
    
    void practiceOfIncrement()
    {
        int a=10;
        a=a++;//firstly assigns, then does post-increment
        System.out.println(a);//10
        
        int a1=10;
        a1=(a1++);//firstly assigns, then does post-increment
        System.out.println(a1);//10
        
        int a2=10;
        a2=++a2;//firstly does pre-increment, then assigns 
        System.out.println(a2);//11
        
        int a3=10;
        a3++;//does post-increment  a3 artık kutu 11 i refer ediyor
        /*11*/++a3;//12 - does pre-increment a3 artık kutu 12 i refer ediyor
        System.out.println(a3);//12
    }
    
    static int yyy=10; //bunun static olup olmaması passByValue olayını etkilemez
    //static nesne içerisinde işe yarar bu olayda yaramaz
    int xxx=20;
    
    int passByValue1(int a){ return ++a;}//içeri girdi sayı +1 arttı  return oldu
    int passByValue2(int a){ return a++;}//sayı girdi return oldu sonra +1 oldu
    
    //passByValue yani primitive data type'lar method içinden değiserek cıkmazlar
    
    void passByValue_Reference()
    {
        practiceOfIncrement();
        System.out.println(passByValue1(yyy)+"\n"+//11
                yyy//10
        );

        System.out.println(passByValue1(++yyy));//y burda direk arttırılıyor 10 11 oldu ve parametre olarak atandı
        System.out.println(passByValue2(yyy));//11
        System.out.println(yyy);//11
        System.out.println(++xxx);//21
        System.out.println(xxx);//21
       
    }
    

    
        
    static int x01=10;
    static public void passByValue(int x)
    {
        x++;
        System.out.println("x:"+x);//11
        System.out.println("x01:"+x01);//10
    }


    int [] dizi=new int[10];
    public void passByReference(int[] d )
    {
        d[1]=1;
        System.out.println(Arrays.toString(d));//[0, 1, 0, 0, 0, 0, 0, 0, 0, 0]
    }
    
    public void passByValueAndReference()
    {
        passByValue(x01);
        passByReference(dizi);//[0, 1, 0, 0, 0, 0, 0, 0, 0, 0]
        System.out.println(Arrays.toString(dizi));//[0, 1, 0, 0, 0, 0, 0, 0, 0, 0]
    }
    
        // </editor-fold>   


    public static void voidMethodWithReturn(){
        System.out.println("it has return keyword but returns nothing");
        return;

    }

}//end of class


//<editor-fold defaultstate="collapsed" desc=" settingPassword ">
        
        class setPassword
        {
            private static String symbol="!'^#+$%&/{([)]=}-_?*|";
            private static String password;
            private static int symbolNum;
            private static int digitNum;
            private static int upperCase;
            private static int lowerCase;
            private static boolean lenght;
            
            public static void putPassword()
            {
                System.out.println("PLEASE ENTER A PASSWORD");
                Scanner scan=new Scanner(System.in);
                password = scan.next();

                if(password.length()>=10)//at least 10 digits	
                {
                    lenght=true;
                    for(int i=0; i<password.length() ; i++)
                    {				
                        if(symbol.contains(password.substring(i, i+1)))
                            symbolNum++;

                        if(Character.isDigit(password.charAt(i)))//at least 1 digit						
                            digitNum++;

                        if(Character.isUpperCase(password.charAt(i)))//at least 1 uppercase
                            upperCase++;

                        if(Character.isLowerCase(password.charAt(i)))//at least 1 lowercase
                            lowerCase++;  	            
                    } 
                }

		if(lowerCase>0 && upperCase>0 && digitNum>0 && symbolNum>0 && lenght)
                    System.out.println("The password is valid");
		else
                    System.out.println("The password is not valid");
            }    
        }     
    // </editor-fold> 

//<editor-fold defaultstate="collapsed" desc="ARRAY-Class">

    class ARRAYshopping
    {
        String shoppingList[];
        String shoppingList2[];
        int itemNUM=0,limit;
        
        public ARRAYshopping(int capacity)
        {
            shoppingList=new String[capacity];
            this.limit=capacity;     
        }
        
        
        public void AddItems(String added)
        {
            if(itemNUM < limit)
            {
                shoppingList[itemNUM]=added;
                itemNUM++;
            }
            else
            {
              
            }
        }
          //1 2 3 4 5 - line2
        public void addItems_index(String added,int line)
        {
            if(line-1 <= itemNUM && line-1 >= 0 && itemNUM<=limit)
            {
                limit++;
                shoppingList=new String[limit];//listenin size ı 1 arttı

                

                for(int i=itemNUM-1; i>=line-1; i--)
                {
                    shoppingList[i+1]=shoppingList[i];
                }

                shoppingList[line-1]=added;
                itemNUM++;
            }
            else
            {
                System.out.println("wrong line!!!");
            }
        }
        
        public String maxItem()
        {
            String max=shoppingList[0];
            for(int i=0; i<itemNUM; i++)
            {
                if(shoppingList[i].compareToIgnoreCase(max)>0)
                {
                    max=shoppingList[i];
                }
            }
            
            return max;
        }   
        
        public String minItem()
        {
            String min=shoppingList[0];
            for(int i=0; i<itemNUM; i++)
            {
                if(shoppingList[i].compareToIgnoreCase(min)<0)
                {
                    min=shoppingList[i];
                }
            }
            
            return min;
        }
        
        public void swap(int i1,int i2)
        {
            String temp=shoppingList[i1-1];
            shoppingList[i1-1]=shoppingList[i2-1];
            shoppingList[i2-1]=temp;


        }
        
        public void sortOut()
        {
            Arrays.sort(shoppingList);
        }
        public void Del_item_fromBeginning()
        {
            if(itemNUM>0)
            {
                for(int i=0; i<itemNUM-1; i++)// 3 - 0 1 2 - 1 2 3
                {
                    shoppingList[i]=shoppingList[i+1];
                }
                itemNUM--;
            }
            else
            {
                System.out.println("There is no item on the list!!!");
            }
        }
             
        public void Del_item_fromEnd()
        {
            if(itemNUM>0)
            {
                itemNUM--;
                shoppingList[itemNUM]="";
            }
            else
            {
                System.out.println("There is no item on the list!!!");
            }
        }
         
        
        public void Del_item(int item)
        {
            if(itemNUM>0)
            {
                for(int i=item; i<itemNUM; i++)// 3 - 0 1 2 - 1 2 3
                {
                    shoppingList[i-1]=shoppingList[i];
                }
                itemNUM--;
            }
            else
            {
                System.out.println("There is no item on the list!!!");
            }
        }
   
        
        public void printList()
        {
            System.out.println("MY SHOPPING LIST\n--------------------");
            for(int i=0; i<itemNUM; i++)
            {
                System.out.println(shoppingList[i]);              
            }
        }
        
       
        
        }
    

    //</editor-fold>

//<editor-fold defaultstate="collapsed" desc="selection-sort">

class SelectionSort 
{ 
    void sort(int arr[]) 
    { 
        int n = arr.length; 
  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
  
            // Swap the found minimum element with the first 
            // element 
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
    } 
  
    // Prints the array 
    void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    }
    
}
    //</editor-fold>
