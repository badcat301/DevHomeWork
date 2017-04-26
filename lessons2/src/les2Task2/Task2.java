package les2Task2;

import java.util.Arrays;

/**
 * Created by Fylhtq on 20.04.2017.
 */
public class Task2 {
    public static void main(String[] args) {

        int[] array1 = randomGenArray(10,100);
        int[] array2 = randomGenArray(10,100);
        System.out.println(Arrays.toString(bSort(array1)));
        System.out.println(Arrays.toString(qSort(array2,0,array2.length-1)));


    }

    private static int[] randomGenArray(int arrayIndex, int maxValue) {
        int array[] = new int[arrayIndex];
        for (int i = 0; i < array.length ; i++) {

            array[i] = (int)(Math.random()* maxValue);


        }
        return array;
    }
    private static int[] bSort(int[] array) {
        for (int i = array.length-1; i>=0;i--) {
            for (int j = 0; j < i; j++) {
                if(array[j]>array [j+1]){
                    int t = array[j];
                    array[j] = array[j+1];
                    array[j+1] =t;
                }

            }

        }

        return array;
    }
    private static int[] qSort(int[] array, int arrayStart,int arrayEnd){
        int half = arrayStart+(arrayEnd-arrayStart)/2;
        int basis = array[half];
        int i = arrayStart,j = arrayEnd;
        while(i <= j){
            while (array[i] < basis) i++;
            while (array[j]>basis) j--;
            if(i <= j){
                int tmp =array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
            }
        }
        if(arrayStart<j) qSort(array,arrayStart,j);
        if(arrayEnd>i)qSort(array,i,arrayEnd);
        return array;
    }
}
