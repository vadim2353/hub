import java.util.Random;

public class Now {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(9);
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        int[] arr2 = new int[10];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = random.nextInt(9);
            System.out.print(" " + arr2[i]);
        }
        System.out.println();
        double[] arr3 = new double[10];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = (double)arr[i] / arr2[i];
            System.out.print(" " + arr3[i]);
        }
        System.out.println();
        int kolichestvo = 0;
        for (int i = 0; i < arr3.length; i++) {
            if ( (int) arr3[i] > 0) {
                kolichestvo += (int) arr3[i];
            }
        }
        System.out.print(kolichestvo);
    }
}