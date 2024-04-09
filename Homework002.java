//Задача
// Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder и/или String. Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

// Дополнительные задания
// Дана json-строка (можно сохранить в файл и читать из файла)
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

// *Сравнить время выполнения замены символа "а" на "А" любой строки содержащей >1000 символов средствами String и StringBuilder.

public class Homework002 {
    public static void main(String[] args) {

        StringBuilder builder1 = new StringBuilder("select * from students where ");
        StringBuilder builder2 = new StringBuilder("{\"name\":\"Ivanov\"," +
                " \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}");

        builder2.delete(0,2);
        builder2.delete(builder2.length()-2,builder2.length());
        changeSymbol(builder2, "\"", "");
        changeSymbol(builder2, ":", "=");

        while (builder2.indexOf("null")!=-1){
            if(builder2.lastIndexOf(",", builder2.indexOf("null")) == -1){
                builder2.delete(0, builder2.indexOf("null")+5);
            }
            else {
                builder2.delete(builder2.lastIndexOf(",", builder2.indexOf("null")), builder2.indexOf("null")+4);
            }

        }

        System.out.println(builder1.append(builder2));
    }

    public static StringBuilder changeSymbol(StringBuilder builder, String x, String y){
        while (builder.indexOf(x) != -1){
            builder.replace(builder.indexOf(x), builder.indexOf(x)+1, y);
        }
        return builder;
    }
}
