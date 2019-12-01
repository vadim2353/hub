import java.util.Random;
import java.util.Scanner;

public class Now {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int c = scaner.nextInt();
        Random random = new Random();
        if (c < 0) {
            System.out.print("neverno zadaniy masiv");
        } else if (c == 0) {
            System.out.print("neverno zadaniy masiv");
        } else if (c % 2 != 0) {
            System.out.print("neverno zadaniy masiv");
        } else if (c % 2 == 0) {
            int[] arr = new int[c];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(15);
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            int t = 0;
            for (int j = 0; j < arr.length; j++) {
                t += arr[j];
            }
            int polovina = c / 2;
            int sum = 0;
            for (int i = 0; i < arr.length - polovina; i++) {
                sum += arr[i];
            }
            int sum2 = 0;
            sum2 = t - sum;
            if (sum > sum2) {
                System.out.print("suma pervoy polovini bolshe");
            } else if (sum < sum2) {
                System.out.print("summa vtoroy polovini bolshe");
            } else if (sum == sum2) {
                System.out.print("dve storoni rovni");
            }
        }
    }
}