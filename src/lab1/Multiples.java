package lab1;

public class Multiples {
    public static void main(String[] args) {
        int count = multiples(1000,3,5);
        System.out.println(count);
    }

    public static int multiples(int n, int a, int b) {
        int count = 0;
        // Loop through numbers from 1 to 999
        for (int i = 1; i < n; i++) {
            if (i % a == 0 || i % b == 0) {
                count++;
            }
        }
        System.out.println("There are " + count + " multiples of 3 or 5 below 1000.");
        return count;
    }
}
