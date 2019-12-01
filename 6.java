import java.util.Random;

public class Now {
    public static void main(String[] args) {
        int[] arr = new int[4];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[0] >= arr[1] && arr[1] >= arr[2] && arr[2] >= arr[3]) {
               System.out.print("massiv ubivayushichiy");
               break;
            }
            else {
               System.out.print("ne verniy massiv");
               break;
            }
        }
    }
}