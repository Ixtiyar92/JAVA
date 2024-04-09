// import java.util.HashSet;
// import java.util.Set;

// public class Lekciya006 {
//     public static void main(String[] args) {
//         Set<Integer> set = new HashSet<>();
//         set.add(1); set.add(12); set.add(123);
//         set.add(1234); set.add(1234);
//         System.out.println(set.contains(12)); // true
//         set.add(null);
//         System.out.println(set.size()); // 5
//         System.out.println(set); // [null, 1, 1234, 123, 12]
//         set.remove(12);
//         for (var item : set) System.out.println(item); // null 1 1234 123
//         set.clear();
//         System.out.println(set); // []
//     }
// }


// import java.util.Arrays;
// import java.util.HashSet;

// public class Lekciya006 {
//     public static void main(String[] args) {
//         var a = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7));
//         var b = new HashSet<>(Arrays.asList(2,3,5,7,11,13,17));
//         var u = new HashSet<Integer>(a); u.addAll(b);
//         var r = new HashSet<Integer>(a); r.retainAll(b);
//         var s = new HashSet<Integer>(a); s.removeAll(b);
//         System.out.println(a); // [1, 2, 3, 4, 5, 6]
//         System.out.println(b); // [17, 2, 3, 5, 7, 11]
//         System.out.println(u); // [1, 17, 2, 3, 4, 5, 6, 11]
//         System.out.println(r); // [2, 3, 5, 7]
//         System.out.println(s); // [1, 4, 6]
//     }
// }


// import java.util.Arrays;
// import java.util.TreeSet;

// public class Lekciya006 {
//     public static void main(String[] args) {
//         var a = new TreeSet<>(Arrays.asList(1,7,2,3,6,4,5));
//         var b = new TreeSet<>(Arrays.asList(13,3,17,7,2,11,5));
//         System.out.println(a); // [1, 2, 3, 4, 5, 6, 7]
//         System.out.println(b); // [2, 3, 5, 7, 11, 13, 17]
//         System.out.println(a.contains(1)); // true
//     }
// }


// import java.util.Arrays;
// import java.util.LinkedHashSet;

// public class Lekciya006 {
//     public static void main(String[] args) {
//         var a = new LinkedHashSet<>(Arrays.asList(1,7,2,3,6,4,5));
//         var b = new LinkedHashSet<>(Arrays.asList(13,3,17,7,2,11,5));
//         a.add(28);
//         System.out.println(a); // [1, 7, 2, 3, 6, 4, 5, 28]
//         System.out.println(b); // [13, 3, 17, 7, 2, 11, 5]
//     }
// }

import java.util.Arrays;
import java.util.HashSet;

public class Lekciya006 {
    public static void main(String[] args) {
        Worker w1 = new Worker();
        w1.firstName = "Имя_1";
        w1.lastName = "Фамилия_1";
        w1.salary = 100;
        w1.id = 1000;

        Worker w4 = new Worker();
        w4.firstName = "Имя_1";
        w4.lastName = "Фамилия_1";
        w4.salary = 100;
        w4.id = 1000;

        Worker w2 = new Worker();
        w2.firstName = "Имя_2";
        w2.lastName = "Фамилия_2";
        w2.salary = 200;
        w2.id = 2000;

        Worker w3 = new Worker();
        w3.firstName = "Имя_3";
        w3.lastName = "Фамилия_3";
        w3.salary = 300;
        w3.id = 3000;

        System.out.println(w1.toString());
        System.out.println(w2);
        System.out.println(w3);
        System.out.println(w4);

        System.out.println(w1 == w4);
        System.out.println(w1.equals(w4));
        var workers = new HashSet<Worker>(Arrays.asList(w1, w2, w3));
        System.out.println(workers.contains(w4));
    }
}
