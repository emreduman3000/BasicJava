package numberSystemConversion;

public class hexaToDecimal {
    public static void main(String[] args) {

        hexaToDecimal1();
        hexatoDecimal2();

        System.out.println("Decimal of a is: "+getDecimal("a"));
        System.out.println("Decimal of f is: "+getDecimal("f"));
        System.out.println("Decimal of 121 is: "+getDecimal("121"));

    }

    public static void hexaToDecimal1()
    {
        String hex="a";
        int decimal=Integer.parseInt(hex,16);
        System.out.println(decimal);
    }

    public static void hexatoDecimal2()
    {
        System.out.println(Integer.parseInt("a",16));//10
        System.out.println(Integer.parseInt("f",16));//15
        System.out.println(Integer.parseInt("121",16));
    }

    public static int getDecimal(String hex){
        String digits = "0123456789ABCDEF";
        hex = hex.toUpperCase();
        int val = 0;
        for (int i = 0; i < hex.length(); i++)
        {
            char c = hex.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        return val;
    }
}
