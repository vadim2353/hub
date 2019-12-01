import java.util.Random;

public class Now {
    public static void main(String[] args) {
        int[] arr = new int[15];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(99);
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        int c;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 2 == 0) {
                c = j;
                System.out.print(" " + c);
            }
        }
    }
}