import java.util.Scanner;

public class Seminar002_Task1{
    public static void main(String[] args){
// Напишите программу, чтоб проверить являются ли две данные строки вращением друг друга (вхождение в обратном порядке)
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String str1 = in.nextLine();
        System.out.println("Введите вторую строку: ");
        String str2 = in.nextLine();
        StringBuilder builder = new StringBuilder(str2);
        str2 = builder.reverse().toString();
        if (str1.equals(str2)) {
           System.out.println("Да"); 
        } else {
            System.out.println("Нет");
        }
        }
    }