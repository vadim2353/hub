import java.util.Random;

public class Now {
    public static void main(String[] args) {
        int[] arr = new int[20];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20);
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        int c;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 2 != 0) {
                arr[j] = 0;
            }
            System.out.print(" " + arr[j]);
        }
    }
}