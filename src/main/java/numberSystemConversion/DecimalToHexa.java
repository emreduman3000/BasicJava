package numberSystemConversion;

public class DecimalToHexa {

    public static void main(String[] args) {
        decimalToHexa();

        System.out.println("Hexadecimal of 10 is: "+toHex(10));
        System.out.println("Hexadecimal of 15 is: "+toHex(15));
        System.out.println("Hexadecimal of 289 is: "+toHex(289));

    }

    public static void decimalToHexa() {
        System.out.println(Integer.toHexString(10));
        System.out.println(Integer.toHexString(15));
        System.out.println(Integer.toHexString(289));
    }
    public static String toHex(int decimal){
        int rem;
        String hex="";
        char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(decimal>0)
        {
            rem=decimal%16;
            hex=hexchars[rem]+hex;
            decimal=decimal/16;
        }
        return hex;
    }

}
