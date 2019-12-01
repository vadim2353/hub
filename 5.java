import java.util.Random;

public class Now {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] arr2 = new int[5];
        Random random = new Random();
        int a = 0;
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(15);
            System.out.print(" " + arr[i]);
            a +=arr [i];
            c = a / 5;
        }
        System.out.println();
        int a2 = 0;
        int c2 = 0;
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = random.nextInt(15);
            System.out.print(" " + arr2[i]);
            a2 += arr2[i];
            c2 = a2 / 5;
        }
        System.out.println();
        if (c > c2) {
            System.out.print("1 massiv bolshe");
        }
            else if (c < c2) {
                System.out.print("2 massiv bolshe");}
                else {
                    System.out.print("massivi rovni");
            }
    }
}