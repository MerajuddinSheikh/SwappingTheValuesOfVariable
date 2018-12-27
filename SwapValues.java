package swapingthevalues;

public class SwapValues {
    public static void main(String[] args) {

        // Declaring two Variables.
        int x = 10;
        int y = 20;
        System.out.println("values before swap");
        //Getting the result without declaring new variables
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("values after swap");
        System.out.println(x);
        System.out.println(y);


    }
}
