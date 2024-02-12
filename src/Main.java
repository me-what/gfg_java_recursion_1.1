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

    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }
}