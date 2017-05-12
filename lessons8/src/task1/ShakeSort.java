package task1;

import java.util.ArrayList;

/**
 * Created by Fylhtq on 12.05.2017.
 */
public class ShakeSort {
    public static ArrayList shakeSort(ArrayList<Integer> arr)
    {
        int left = 0; // левая граница
        int right = arr.size() - 1; // правая граница

        do
        {
            //Сдвигаем к концу массива "тяжелые элементы"
            for (int i = left; i < right; i++)
            {
                if(arr.get(i) > arr.get(i+1))
                {
                    arr.get(i) ^= arr.get(i+1);
                    arr.get(i+1) ^= arr.get(i);
                    arr.get(i)^= arr.get(i+1);
                }
            }
            right--; // уменьшаем правую границу
            //Сдвигаем к началу массива "легкие элементы"
            for (int i = right; i > left ; i--)
            {
                if(arr.get(i) < arr.get(i-1))
                {
                    array[i] ^= array[i-1];
                    array[i-1] ^= array[i];
                    array[i] ^= array[i-1];
                }
            }
            left++; // увеличиваем левую границу
        } while (left <= right);
        return arr;
    }
}
