package javaDocumentation;

/**
 *  @author dumanem
 *  @version 1.0
 *  @see JavadocExp
 *
 *  JavadocExp Class has two instance
 */
public class JavadocExp {

    /**
     * a represent the coordinate of (a,b) pair for 2d space.
     */
    int a;

    /**
     * first sentence is always displayed summary section.
     * second and more sentence are displayed in detail section on html
     */
    int b;


    /**
     * JavadocExp default constructor
     */
    public JavadocExp() {
    }

    /**
     *
     * @param a
     * @param b
     */
    public JavadocExp(int a, int b) {
        this.b = b;
    }

    /**
     *
     * @return a
     */
    public int getA() {
        return a;
    }

    /**
     *
     * @param a
     */
    public void setA(int a) {
        this.a = a;
    }


    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    /**
     *
     * @return a+b
     */
    @Override
    public String toString() {
        return "JavadocExp{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    /**
     * javadoc is a tool for generating documentation from your source code
     * bunch of html files that together crate a website
     *javac runs codes
     * javadoc deal with comments
     * javadoc comment has two parts seperated by a space
     * part1: description
     * part2: tag list
     *
     * main method create object of JavadocExp Class in JavadocExp.java
     * How to run javadoc:
     * 1. cmd line:  javadoc -d folderNameOfWillBeCreated srcfolderpath
     *   javadoc -d filename srcpath -version -author -> to see author and version on html
     *    javadoc -d filename srcpath -version -author -private -> to see private methods' fields' javadoc
     * 2. IntelliJ
     *    Tools>Generate Javadoc
     *      create a file
     *
     *      daha önceden proje levelinde javaDoc diye directory olusturdum sonra onu sectim
     *
     *
     * not to take warnings add description after tags
     * @param args description
     */
    public static void main(String[] args)
    {
        JavadocExp javadocExp =new JavadocExp();
        System.out.println(javadocExp);
        System.out.println(javadocExp.a);

    }
}
