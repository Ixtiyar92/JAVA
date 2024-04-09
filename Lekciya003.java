// public class Lekciya003 {
    // public static void main(String[] args) {
    //     System.out.println(Sum(1, 2));
    //     System.out.println(Sum(1.0, 2));
    //     System.out.println(Sum(1, 2.0));
    //     System.out.println(Sum(1.2, 2.1));
    // }
    // static Object Sum(Object a, Object b) {
    //     if (a instanceof Double && b instanceof Double) {return (Object)((Double) a + (Double) b);
    //     } else if(a instanceof Integer && b instanceof Integer) {return (Object)((Integer) a + (Integer) b);
    //     } else return 0;
    // }

//     static int[] AddItem(int[] array, int item) {
//         int length = array.length;
//         int[] temp = new int[length + 1];
//         System.arraycopy(array, 0, temp, 0, length);
//         temp[length] = item;
//         return temp;
//     }
//     public static void main(String[] args) {
//         int[] a = new int[] { 0, 9 };
//         for (int i : a) { System.out.printf("%d ", i); }
//         a = AddItem(a, 2);
//         a = AddItem(a, 3);
//         for (int j : a) { System.out.printf("%d ", j); }
//    }
// }

// import java.util.Arrays;
// import java.util.List;

// public class Lekciya003 {
//     public static void main(String[] args) {        
//         // int day = 29;
//         // int month = 9;
//         // int year = 1990;
//         // Integer[] date = { day, month, year };
//         // List<Integer> d = Arrays.asList(date);
//         // System.out.println(d); // [29, 9, 1990]

//         StringBuilder day = new StringBuilder("28");
//         StringBuilder month = new StringBuilder("9");
//         StringBuilder year = new StringBuilder("1990");
//         StringBuilder[] date = { day, month, year };
//         List<StringBuilder> d = Arrays.asList(date);
//         System.out.println(d);
//     }
// }

import java.util.*;
public class Lekciya003 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 12, 123, 1234, 12345);
        for (int item : list) { System.out.println(item); }
        Iterator<Integer> col = list.iterator();
        while (col.hasNext()) {
            //System.out.println(col.next());
            col.next();
            col.remove();
        }
    }
}
