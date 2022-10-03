import java.util.Scanner;

import static java.lang.System.out;

public class Lesson_4 {
    public static void main(String[] args) {
        out.println("Задача 0");
        out.println("Введите число: ");
        Scanner taskNull = new Scanner(System.in);
        int numberToSearch = taskNull.nextInt();
        int[] massiveNull = new int[]{10, 15, 16, 25, 65, 1, 3};
        boolean isPresent = checkIsPresent(massiveNull, numberToSearch);
        if (isPresent) {
            out.printf("Число %d присутствует в масиве.%n", numberToSearch);
        }else {
            out.printf("Число %d НЕ присутствует в масиве.%n", numberToSearch);
        }
      out.println("\n");

        out.println("Нажмите любю кнопку для перехода на следующую задачу \n");
        Scanner enter = new Scanner(System.in);
        String enterOne = enter.nextLine();

        out.println("Задача 1");
        out.println("Введите колличество чисел цикла: ");
        Scanner taskTwo = new Scanner(System.in);
        int [] numberToSearchOne = new int [taskTwo.nextInt()]; // колличество чисел массива

        for (int i = 0; i < numberToSearchOne.length; i++) {
            numberToSearchOne[i] = (int) (Math.random() * 1000);
        }
        out.print("Введённый вами цикл: ");
        printArray(numberToSearchOne);
    }

    private static boolean checkIsPresent(int[] array, int number) { // Для первого задания

        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                return true;
            }
        }
        return false;
    }

    private static void printArray(int[] array) { // Для второго задания
        out.print("[");
        for (int i = 0; i < array.length; i++) {

            if (i != array.length -1)
                out.print(array[i] + ", ");
            else out.print(array[i] + "]");
        }

    }

}




