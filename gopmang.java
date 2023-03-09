import java.util.Scanner;

public class gopmang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[2];
        int[] array2 = new int[3];
        int[] array3 = new int[5];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Nhap phan tu thu :" + i + " mang 1");
            int element = scanner.nextInt();
            array1[i] = element;
        }
        for (int j = 0; j < array2.length; j++) {
            System.out.println("Nhap phan tu thu :" + j + " mang 2");
            int element2 = scanner.nextInt();
            array2[j] = element2;
        }
            for (int m = 0; m < array1.length; m++) {
               array3[m] = array1[m];
            }
            for (int n = 0; n < array2.length; n++) {
                array3[array1.length + n] = array2[n];
            }

            for (int k = 0; k < array3.length; k++) {
                System.out.println("phan tu array 3 :" + array3[k]);
            }

}}
