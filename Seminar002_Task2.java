public class Seminar002_Task2{
    public static void main(String[] args){
// Напишите программу, чтобы в выражении 3+53=56 заменить '=' словом 'равно'
    StringBuilder builder = new StringBuilder("3+53=56");
    
    String s = builder.toString(); // первый способ перевести в строку и методами String решить
    System.out.println(s.replace("=", " равно "));

    int x = builder.indexOf("=");// второй способ методами StringBuilder решить
    System.out.println(builder.replace(x, x+1, " равно "));
        }
    }