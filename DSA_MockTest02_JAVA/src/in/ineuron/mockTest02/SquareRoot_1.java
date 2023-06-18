package in.ineuron.mockTest02;

public class SquareRoot_1 {
    public static int mySqrt(int x) {
        if (x == 0)
            return 0;

        long left = 1;
        long right = x;

        while (left < right) {
            long mid = left + (right - left) / 2;

            if (mid * mid > x)
                right = mid;
            else
                left = mid + 1;
        }

        return (int) (left - 1);
    }

    public static void main(String[] args) {
        int x = 8;
        int result = mySqrt(x);
        System.out.println("Square root of " + x + " is " + result);
    }
}
