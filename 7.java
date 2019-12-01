import java.util.Random;

public class Now {
    public static void main(String[] args) {
        int[] arr = new int[12];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(15);
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        int max = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println(index);
    }
}