public class Main {
    public static void main(String[] args) {
        System.out.println("Билет 3. Задача");
//  Напишите программу, которая разделяет любую строку на две части ровно пополам по количеству символов.
        String s = "Разделить строчку пополам";

        if (s.length() % 2 == 0) {

            System.out.println("Первая половина строки: " + s.substring(0, s.length() / 2));
            System.out.println("Вторая половина строки: " + s.substring(s.length() / 2, s.length()));
        } else {

            String s1 = s + " ";
            System.out.println("Первая половина строки: " + s1.substring(0, s1.length() / 2));
            System.out.println("Вторая половина строки: " + s1.substring(s1.length() / 2, s1.length()));
            System.out.println(s1.length());
        }
    }
}