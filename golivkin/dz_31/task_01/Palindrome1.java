package golivkin.dz_31.task_01;
//Написать реализацию проверки строки на палиндром:
// 1 Перемещение с обоих концов строки одновременно.
import java.util.Scanner;

public class Palindrome1 {
    public static void main(String[] args) {
        System.out.println("Введите слово для проверки:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        System.out.println(isPalindrome(s));
    }

    public static Boolean isPalindrome(String s){
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }


}
