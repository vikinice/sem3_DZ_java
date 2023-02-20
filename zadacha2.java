/* Пусть дан произвольный список целых чисел, удалить из него четные числа*/

import java.util.ArrayList;
import java.util.Random;

public class zadacha2 {
    public static void main(String[] args) {
        ArrayList<Integer> num_arr = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            num_arr.add(i, rnd.nextInt(100) + 1);
        }
        System.out.println("Заданный массив: " + num_arr);
        for (int i = 0; i < num_arr.size(); i++) {
            if (num_arr.get(i) % 2 == 0) {
                num_arr.remove(i);
                i--;
            }
        }

        System.out.println("Этот массив БЕЗ четных чисел: " + num_arr + "\n");
    }
}
