package assignment1;

public class Number {
    int[] f;  // to store the number array
    int y;



    public Number(int n) {
        f = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            f[i] = -1;

        }
        y = n;
    }

    /**
     /* Give n and return a array of Fibonacci Serices
     /* 0, 1, 2, ...
     /* @parameter n
     */
    int[] fibonacci() {
        fibonacciHelper(y);
        return f;
    }
    int fibonacciHelper(int n) {
        if (f[n] != -1) {
            return f[n];
        }
        if (n == 0) {
            f[n] = 0;
            return f[n];
        }
        if (n == 1) {
            f[n] = 1;
            return f[n];
        }
        f[n] = fibonacciHelper(n - 1) + fibonacciHelper(n - 2);
        return f[n];
    }
    void factor() {
        f[0] = 1;
        for (int i = 1; i <= y; i++) {
            f[i] = f[i - 1] * i;
        }
    }

    boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }


        return true;

    }
    void printPrime(){
        for (int i = 0; i <= y; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    int power(int x, int y) {
        if (y == 0) {
            return 1;
        }

        if (y % 2 == 0) {
            int temp = power(x, y/ 2);
            return temp * temp;
        }
        int temp = power(x, y/ 2);
        return x * temp * temp;


    }
    int digit() {
        if (y == 0) return 1;
        int temp = y;
        int count = 0;
        while (temp != 0) {
            temp /= 10;

            count++;
        }
        return count;
    }

    boolean isAmstrong() {
        int count = digit();


        int sum = 0;
        int temp = y;
        while (temp != 0) {
            int digit = temp % 10;


            sum += power(digit, count);



            temp = temp / 10;
        }


        return sum == y;
    }


    int[] toDigitArray() {
        int count = digit();
        int[] array = new int[count];
        int temp = y;
        for (int i = 0; i < count; i++) {

            int digit = temp % 10;
            array[i] = digit;


            temp /= 10;
        }
        return array;
    }

    boolean isPalindrom() {
        int[] array = toDigitArray();
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            if (array[left] == array[right]) {
                left++;
                right--;
            } else {
                return false;
            }
        }



        return true;
    }
    public static void main(String[] args) {

        int n = 1;
        Number f = new Number(n);
        System.out.println(f.isPalindrom());
//        for (int i : f.f) {
//            System.out.println(i);
//        }
    }
}
