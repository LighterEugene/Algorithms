public class palindrome {
        public static void main(String[] args) {
            String word = "radar";
            if (isPalindrome(word)) {
                System.out.println(word + " is a palindrome.");
            } else {
                System.out.println(word + " is not a palindrome.");
            }
        }

        // Рекурсивный метод для проверки, является ли строка палиндромом
        public static boolean isPalindrome(String str) {
            // Если длина строки 0 или 1, то это палиндром
            if (str.length() <= 1) {
                return true;
            }
            // Сравниваем первый и последний символы
            if (str.charAt(0) != str.charAt(str.length() - 1)) {
                return false;
            }
            // Рекурсивно проверяем подстроку без первого и последнего символов
            return isPalindrome(str.substring(1, str.length() - 1));
        }
    }


