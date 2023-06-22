package DZ4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class DZ41 {
    public static void main(String[] args) {
        //task02();
        task();
    }

    private static void task() {
        // 1111111111111111111111111111111111111111111111111111111111111111111
        // Реализовать консольное приложение, которое:
        // Принимает от пользователя и “запоминает” строки.
        // Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
        // Если введено revert, удаляет предыдущую введенную строку из памяти.
        List<String> userList = new LinkedList<>();
        Scanner myScanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите любую строку: ");
            String userString = myScanner.nextLine();
            userList.add(userString);
            if (userString.equalsIgnoreCase("print")) {
                userList.remove(userList.size()-1);
                List<String> newList = new LinkedList<>();
                for (int i = userList.size()-1; i >= 0 ; i--) {
                    newList.add(userList.get(i));
                }
                System.out.println(newList);
            } else if (userString.equalsIgnoreCase("revert")){
                userList.remove(userList.size()-1);
                userList.remove(userList.size()-1);
            } else if (userString.equalsIgnoreCase("stop")) {
                break;
            }
        }
    }

    private static void task02() {
        // Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
        List<Integer> listOfNumbers = new LinkedList<>();
        Collections.addAll(listOfNumbers,1,2,3,4,5);
        System.out.println(listOfNumbers);
        for (int i = listOfNumbers.size()-1; i >= 0; i--) {
            System.out.print(listOfNumbers.get(i) + " ");
        }
    }
}
