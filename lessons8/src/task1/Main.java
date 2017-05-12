package task1;

import java.util.ArrayList;

import static task1.InsertionSort.insertionToSort;
import static task1.ShakeSort.shakeSort;

/**
 * Created by Fylhtq on 12.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr1.add(23);
        arr1.add(12);
        arr1.add(45);
        arr1.add(7);
        insertionToSort(arr1);
       // shakeSort(arr2);
        for (int i = 0; i <arr1.size() ; i++) {
            System.out.println(arr1.get(i));
           // System.out.println(arr2.get(i));
        }

    }


}
