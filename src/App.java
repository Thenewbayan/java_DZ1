// Задание

// 1) Вычислить сумма чисел от 1 до n
// 2) Вывести все простые числа от 1 до 1000
// 3) Реализовать простой калькулятор

import java.util.Scanner;
import java.util.Collection;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // task1
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of summ: ");
        int numberToSumm = in.nextInt();
        GetSumm(numberToSumm);

        // //task2
        System.out.println("Enter number of simple: ");
        int number = in.nextInt();
        Collection<Integer> simpleList = GetSimpleNumbers(number);
        printList(simpleList);

        // task3
        Calculator(1, '+', 1);

    }

    private static void printList(Collection<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int num = ((ArrayList<Integer>) list).get(i);
            System.out.print(num + "; ");
        }
    }

    private static Collection<Integer> GetSimpleNumbers(int number) {
        Collection<Integer> simpleNumbers = new ArrayList<>();
        simpleNumbers.add(1);
        simpleNumbers.add(2);
        int deviderCount = 0;
        for (int i = 3; i <= number; i = i + 2) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    deviderCount = deviderCount + 1;
                }

            }
            if (deviderCount < 3) {
                simpleNumbers.add(i);
            }
            deviderCount = 0;
        }
        return simpleNumbers;
    }

    private static void GetSumm(int number) {
        int summ = 0;
        for (int i = 0; i <= number; i++) {
            summ = summ + i;
        }
        System.out.println(summ);

    }

    private static void Calculator(int number1, char opper, int number2) {
        // double result=0;
        if (opper == '+') {
            double result = number1 + number2;
            System.out.print(result);
        }
        if (opper == '-') {
            double result = number1 - number2;
            System.out.print(result);
        }
        if (opper == '*') {
            double result = number1 * number2;
            System.out.print(result);
        }
        if (opper == '/') {
            double result = number1 / number2;
            System.out.print(result);
        }
    }
}
