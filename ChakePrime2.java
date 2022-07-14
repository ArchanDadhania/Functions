import java.util.Scanner;

public class ChakePrime2 {

    public static boolean chakeprime2(int n)
    {
        int div = 2;
        boolean isPrime = true;

        while (div<=n/2)
        {
            if (n%div == 0)
            {
                isPrime = false;
                break;
            }
            div = div +1;
        }
       /* if(isPrime)
        {
            return true;
        }else {
            return false;
        }*/
        return isPrime;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(chakeprime2(n));
    }
}
