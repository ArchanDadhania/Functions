import java.util.Scanner;

public class FactorialWith2Fun {

    public static int Factorial(int num)
    {
        int fact =1;
        for (int i=1;i<=num;i++)
        {
            fact = fact * i;
        }
        return fact;
    }

    public static int ncr(int n , int r)
    {
        int factN = Factorial(n);
        int factR = Factorial(r);
        int facNR = Factorial(n-r);
        int result = factN / (factR*facNR);
       // System.out.println(result);
        return result;
    }




    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int r = scan.nextInt();
      //  int result = ncr(n,r);
        System.out.println(ncr(n,r));
    }
}
