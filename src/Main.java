//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int[] randomArray = new int[7];
        for(int i = 0; i < randomArray.length; i++) {
           randomArray[i] = (int) (Math.random() * 10);
        };
    int min = randomArray[0];
    for (int i = 0; i < randomArray.length; i++) {
        if (min > randomArray[i]) {
            min = randomArray[i];
        }
    }
    int max = randomArray[0];
    for (int i = 0; i < randomArray.length; i++) {
        if (max < randomArray[i]) {
            max = randomArray[i];
        }
    }
    double avarage = 0;
    for (int i = 0; i < randomArray.length; i++) {
        avarage += randomArray[i]/randomArray.length;
    }
        System.out.println("Минимальное значение: " + min);
        System.out.println("Среднее значение: " + avarage);
        System.out.println("Максимальное значение: " + max);
    }
}