import java.util.Random;
import java.util.Scanner;

public class Now {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int n = scaner.nextInt();
        Random random = new Random();
        if (n < 3) {
            System.out.print("chislo menshe 3 vvedite eshe raz");
        } else {
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(n);
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            int j = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    j = j + 1; // узнаем какой длинной будет наш второйй массив
                }
            }
            int[] arr2 = new int[j];
            int c = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0){
                    for (int p = 0; p < arr2.length; p++){
                        arr2[p] = arr[i];
                        c = arr2[p]; // заполн€ем второй массив четными элементами первого масива
                    }
                    System.out.print(c + " ");
                }
            }
        }
    }
}