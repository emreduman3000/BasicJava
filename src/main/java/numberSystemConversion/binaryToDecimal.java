package numberSystemConversion;

public class binaryToDecimal {

    public static void main(String[] args)
    {
        binarytoDecimal1();
        binarytoDecimal2("1111");
        getDecimal(1010);
    }


    public static void binarytoDecimal1()
    {
        String string="1010";

        int decimal=Integer.parseInt(string,2);
        System.out.println(decimal);
    }

    public static void binarytoDecimal2(String binary)
    {
        System.out.println(Integer.parseInt(binary,2));
        System.out.println(Integer.parseInt("1010",2));
    }

    public static int getDecimal(int binary)
    {
        int decimal = 0;
        int n = 0;
        while(true){
            if(binary == 0){
                break;
            } else {
                int temp = binary%10;
                decimal += temp*Math.pow(2, n);
                binary = binary/10; //101/10=10
                n++;
            }
        }
        return decimal;
    }
}
