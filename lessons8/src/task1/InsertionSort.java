package task1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Fylhtq on 12.05.2017.
 */
public class InsertionSort {



    public static ArrayList insertionToSort(ArrayList<Integer> list) {
        int i, j;
        for (i = 0; i < list.size(); i++) {
            Integer tmp = list.get(i);
            j = i;
            while ((j > 0) && (list.get(j -1) > tmp)){
                list.set(j, list.get(j -1));
                j--;
            }
            list.set(j, tmp);
        }
        return list;
    }
}

