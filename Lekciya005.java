// import java.util.*;

// public class Lekciya005 {
//     public static void main(String[] args) {
//         Map<Integer, String> db = new HashMap<>();
//         db.put(1, "один"); System.out.println(db);
//         db.put(2, "два"); System.out.println(db);
//         db.put(3, "три"); System.out.println(db);
//         db.put(31, "три один"); System.out.println(db);
//         db.put(13, "один три"); System.out.println(db);
//         db.put(null, "!null"); System.out.println(db);
//         db.put(null, null); System.out.println(db);
//     }
// }


// Работа с парами
// import java.util.*;
// public class Lekciya005 {
//     public static void main(String[] args) {
//         Map<Integer, String> db = new HashMap<>();
//         db.putIfAbsent(1, "один");
//         db.put(2, "два");
//         db.put(3, "три");
//         System.out.println(db);

//         for (var item : db.entrySet()) {
//             System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
//         }
//     }
// }


// Как ускорить работу
// import java.util.*;
// public class Lekciya005 {
//     public static void main(String[] args) {
//         Map<Integer,String> map1 = new HashMap<>();
//         Map<Integer,String> map2 = new HashMap<>(9);
//         Map<Integer,String> map3 = new HashMap<>(9, 1.0f);
//     }
// }


// import java.util.*;
// public class Lekciya005 {
//     public static void main(String[] args) {
//         TreeMap<Integer,String> tMap = new TreeMap<>();
//         tMap.put(1,"один"); System.out.println(tMap);
//         // {1=один}
//         tMap.put(6,"шесть"); System.out.println(tMap);
//         // {1=один, 6=шесть}
//         tMap.put(4,"четыре"); System.out.println(tMap);
//         // {1=один, 4=четыре, 6=шесть}
//         tMap.put(3,"три"); System.out.println(tMap);
//         // {1=один, 3=три, 4=четыре, 6=шесть}
//         tMap.put(2,"два"); System.out.println(tMap);
//         // {1=один, 2=два, 3=три, 4=четыре, 6=шесть}
//     }
// }

// import java.util.*;
// public class Lekciya005 {
//     public static void main(String[] args) {
//         Map<Integer,String> linkmap = new LinkedHashMap<>();
//         linkmap.put(11, "один один");
//         linkmap.put(1, "два");
//         linkmap.put(2, "один");
//         System.out.println(linkmap); // {11=один один, 1=два, 2=один}
//         Map<Integer,String> map = new HashMap<>();
//         map.put(11, "один один");
//         map.put(2, "два");
//         map.put(1, "один");
//         System.out.println(map); // {1=один, 2=два, 11=один один}
//     }
// }

import java.util.*;
public class Lekciya005 {
    public static void main(String[] args) {
        Map<Integer,String> table = new Hashtable<>();
        table.put(1, "два");
        table.put(11, "один один");
        table.put(2, "один");
        System.out.println(table); // {2=один, 1=два, 11=один один}
        // table.put(null, "один"); // java.lang.NullPointerException
    }
}
