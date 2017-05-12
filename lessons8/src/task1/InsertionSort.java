package task1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Fylhtq on 12.05.2017.
 */
public class InsertionSort {



    public static ArrayList insertionToSort(ArrayList<Integer> arr) {
        int temp, j;
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) > arr.get(i + 1)) {
                temp = arr.get(i + 1);
                arr.set(i,i+1);
                j = i;
                while (j > 0 && temp < arr.get(j - 1)) {
                    arr.set(j - 1,temp);
                    j--;
                }

            }

        }
        return arr;
    }
}

