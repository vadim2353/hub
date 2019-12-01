public class Now {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        for (int j = arr.length-1; j >= 0; j--) {
            if (0 != j % 2) {
                System.out.print(" " + arr[j]);
            }
        }
      /*  for (int j = 0; j < arr.length; j++) {
            if (0 != j % 2) {                         вывод массива от 1 до 99
                System.out.print(" " + arr[j]);
            }
        }*/
    }
}