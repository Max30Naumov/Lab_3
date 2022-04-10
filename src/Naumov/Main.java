package Naumov;

import java.util.*;

public class Main
{

    public static void main(String[] args) {

        task12("test", 4);

        task35("testtesttest", "te");

        task1('C');
    }

    /**
     * 12. Дана непустая строка S и целое число N (> 0). Вывести строку, содержащую символы
     * строки S, между которыми вставлено по N символов «*» (звездочка).
     */
    private static void task12(String S, int N) {
        // Проходимся по всем элементам
        for (int i = 0; i < S.length(); i++) {
            // Выводим на экран текущий символ строки
            System.out.print(S.charAt(i));
            // N раз в цикле
            for (int j = 0; j < N; j++) {
                // Выводим на экран символ «*»
                System.out.print("*");
            }
        }
        // Печатаем новую строку (чтобы следующее задание не слипалось)
        System.out.println("");
    }

    /**
     * 35. Даны строки S и S0. Удалить из строки S все подстроки, совпадающие с S0.
     * Если совпадающих подстрок нет, то вывести строку S без изменений.
     */
    private static void task35(String S, String S0) {
        // Выводим на экран строку, где все совпадения подстрок заменены на пустоту
        System.out.print(S.replace(S0, ""));
        System.out.println("");
    }

    /**
     * 1. Дан символ C. Вывести его код (т. е. номер в кодовой таблице).
     */
    private static void task1(char str) {
        // Переводим символ в интеджер и выводим -- код символа
        System.out.print((int) str);
        System.out.println("");
    }


}
