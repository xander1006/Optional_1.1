import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        System.out.println("Vvedite kol-vo chisel: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();                        //запрос количества вводимых чисел

        System.out.println("Vvedite chisla: ");
        ArrayList <Integer> arrayList = new ArrayList<>(); //регистрация массива для вводимых чисел
        int i = 1;
        while (i <= number){                                //цикл количества запусков скана вводимых чисел
            arrayList.add(scan.nextInt());
            i++;
        }
        String lengthStr =String.valueOf(arrayList.get(0)); //Получаем значение первого элемента массива в String
        int line;
        int min = lengthStr.length();                       //принимает длину первого значение для дальнейшего сравнения
        int max = 1;
        for (Integer len:arrayList) {                       //цикл сравнения всех элементов массива с min и max
            lengthStr = String.valueOf(len);
            line = lengthStr.length();
            if (line < min){
                min = line; }
            if (line > max) {
                max = line;
                }
            }
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
    }
}