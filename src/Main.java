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
        while (i <= number){                                //цикл запусков скана вводимых чисел
            arrayList.add(scan.nextInt());
            i++;
        }
        int min = String.valueOf(arrayList.get(0)).length();       //принимает длину первого элемента массива для дальнейшего сравнения
        int line;
        int minNum = arrayList.get(0);                             //принимает значение первого элемента массива
        int maxNum =0;
        int max = 0;

        for (int len = 0; len < arrayList.size(); len++) {         //цикл сравнения всех элементов массива с min и max
            line = String.valueOf(arrayList.get(len)).length();   //принимает длину элементов массива

            if (line <= min){                                   //сравнение минимального значение
                min = line;
                minNum = arrayList.get(len);
            }

            if (line >= max) {                                  //сравнение максимального значения
                max = line;
                maxNum = arrayList.get(len);
            }
            }
        System.out.println("Minimum = " + min + "   " + minNum);
        System.out.println("Maximum = " + max + "   " + maxNum);
    }
}