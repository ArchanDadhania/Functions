import java.util.Scanner;

public class ChakePrime {

    public static boolean chakenumberisprime(int n)
    {
        int div = 2;
        while (div <= n/2)
        {
            if (n%div==0)
            {
                return false;  //not prime number
            }
            div = div +1;
        }
        return true;  // prime number
    }

    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        System.out.println(chakenumberisprime(n));
    }
}
