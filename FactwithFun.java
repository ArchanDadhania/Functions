import java.util.Scanner;

public class FactwithFun {
    public static int Factorial(int num)
    {
        int fact = 1;
        for(int i=1; i<=num;i++)
        {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int r = scan.nextInt();

        int factN = Factorial(n);
        int factR = Factorial(r);
        int factNR = Factorial(n-r);

        int result = factN / (factR*factNR);

        System.out.println(result);
    }

}
