public class FunctionCalling {
    public static int sum(int a, int b)
    {
        int result = a+b;
        return result;
    }

    public static void increment(int n)
    {
        n++;
        System.out.println("Increment: " +n);
    }

    public static void main(String[] args) {
        int n = 10;
        increment(n);
        System.out.println("Main: " +n);
    }
}
