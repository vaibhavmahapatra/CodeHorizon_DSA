import java.util.* ;
public class Sort_012
{
    public static void sort012(int[] arr) {
        //Write your code here
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    int temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    int temp2 = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp2;
                    high--;
                    break;
            }
        }
    }
}
