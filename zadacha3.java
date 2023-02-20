/* Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.*/



import java.util.ArrayList;
import java.util.Random;


public class zadacha3 {
    public static void main(String[] args) {
        ArrayList<Integer> num2_arr = new ArrayList<>(); 
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            num2_arr.add(i, rnd.nextInt(100) + 1);
        }
        System.out.println("Задан массив: " + num2_arr + "\n");
        int min = num2_arr.get(0);
        int max = num2_arr.get(0);
        int sum = 0;

        for (int i = 0; i < num2_arr.size(); i++) {
            max = max < num2_arr.get(i) ? num2_arr.get(i) : max;
            min = min > num2_arr.get(i) ? num2_arr.get(i) : min;
            sum += num2_arr.get(i);
        }
        System.out.println("Максимальное число: " + max + "\nМинимальное число: " + min +"\nСреднее ариф.: " + sum / num2_arr.size());

    }
}