package task1;

import java.util.Collection;
import java.util.List;

/**
 * Created by Fylhtq on 09.05.2017.
 */
public class CollectionSort {

    public static void main(String[] args) {

    }
    public static void insertionToSort(List arr) {
        int temp, j;
        for(int i = 0; i < arr.size()- 1; i++){
            if (arr.get(i) > arr.get(i + 1)) {
                temp = arr.get(i + 1);
                arr.get(i+1) = arr.set(i);
                j = i;
                while (j > 0 && temp < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr.get(j) = temp;
            }
        }
}
