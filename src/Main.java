public class Main {
    public static void main(String[] args) {
        Rec f = new Rec();

        System.out.println("Factorial of 3 is "
                + f.fact(3));
        System.out.println("Factorial of 4 is "
                + f.fact(4));
        System.out.println("Factorial of 5 is "
                + f.fact(5));

        int result = sum(10);
        System.out.println(result);

        System.out.println("Factorial of " + 3 + " " + Fib(3));
        System.out.println("Factorial of " + 4 + " " + Fib(4));
        System.out.println("Factorial of " + 5 + " " + Fib(5));

        int test = 3;
        printFun(test);
        System.out.println();

        int result2 = sum(5, 10);
        System.out.println(result2);
    }

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    static int Fib(int N)
    {
        if (N == 0 || N == 1)
            return N;
        return Fib(N - 1) + Fib(N - 2);
    }

    static void printFun(int test)
    {
        if (test < 1)
            return;
        else {
            System.out.printf("%d ", test);
            printFun(test - 1);

            System.out.printf("%d ", test);
            return;
        }
    }

    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }
}