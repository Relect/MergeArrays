import java.util.Arrays;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1};
        int[] arr2 = {};
        int[] arr = mergeArrays(arr1,arr2);
        for (int num:arr){
            System.out.print(num+" ");
        }
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        //твой код здесь
        int[] c = new int[a1.length + a2.length];

        int i = 0, j = 0;
        for (int k = 0; k < c.length; k++) {

            if (i > a1.length-1) {
                c[k] = a2[j];
                j++;
            }
            else if (j > a2.length-1) {
                c[k] = a1[i];
                i++;
            }
            else if (a1[i] < a2[j]) {
                c[k] = a1[i];
                i++;
            }
            else {
                c[k] = a2[j];
                j++;
            }
        }
        return c;
    }
}