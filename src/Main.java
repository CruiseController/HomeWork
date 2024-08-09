//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.ArrayList;
import java.util.*;
public class Main {
    public static void main(String[] args) {
//       // 1 - Массив случайных чисел
//        int[] randomArray = new int[7];
//        for(int i = 0; i < randomArray.length; i++) {
//           randomArray[i] = (int) (Math.random() * 10);
//        };
//    int min = randomArray[0];
//    for (int i = 0; i < randomArray.length; i++) {
//        if (min > randomArray[i]) {
//            min = randomArray[i];
//        }
//    }
//    int max = randomArray[0];
//    for (int i = 0; i < randomArray.length; i++) {
//        if (max < randomArray[i]) {
//            max = randomArray[i];
//        }
//    }
//    double avarage = 0;
//    for (int i = 0; i < randomArray.length; i++) {
//        avarage += randomArray[i]/randomArray.length;
//    }
//        System.out.println("Минимальное значение: " + min);
//        System.out.println("Среднее значение: " + avarage);
//        System.out.println("Максимальное значение: " + max);
//
//        // 2 - Массив целых чисел + сортировка по возрастанию
//
//        int[] intArray = new int[33];
//        for(int i = 0; i < intArray.length; i++) {
//            intArray[i] = (int) (Math.random() * 10);
//        }
//        Arrays.sort(intArray);
//        for(int value : intArray) {
//            System.out.println(value + ", ");
//        }
//
//     3 - Двухмерный массив + сортировка по убыванию
        int[][] multiDArray = new int[3][3];
        for (int i = 0; i < multiDArray.length; i++) {
            for (int k = 0; k < multiDArray[i].length; k++) {
                multiDArray[i][k] = (int) (Math.random() * 100);

            }
            Arrays.sort(multiDArray[i]);
        }
        System.out.println(Arrays.deepToString(multiDArray));

//
//        // 4 - Простые числа
//for(int i = 2; i < 100; i++) {
//    boolean isPrime = true;
//    for(int j = 2; j < i; j++) {
//        if (i % j == 0) {
//            isPrime = false;
//            break;
//        }
//    }
//    if(isPrime) {
//        System.out.println(i);
//    }
//
//}

        // 5 - Массив и число

//        int[] simpleArray = new int[8];
//int number = 3;
//for(int i = 0; i < simpleArray.length; i++) {
//    simpleArray[i] = (int) (Math.random() * 10);
//    //System.out.println(simpleArray[i]);
//    if(simpleArray[i] == number) {
//        simpleArray = ArrayUtils.removeElement(simpleArray, number);
//            }
//    System.out.println(simpleArray[i]);
//   }
   }
}


