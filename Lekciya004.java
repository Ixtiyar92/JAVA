// import java.util.LinkedList;

// public class Lekciya004 {
//     public static void main(String[] args) {
//         LinkedList<Integer> ll = new LinkedList<Integer>();
//         ll.add(1);
//         ll.add(2);
//         ll.add(3);
//         System.out.println(ll);
//     }
// }


// import java.util.PriorityQueue;

// public class Lekciya004 {
//     public static void main(String[] args) {
//         PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
//         pq.add(123);
//         pq.add(3);
//         pq.add(13);
//         pq.add(1);
//         System.out.println(pq);
//         System.out.println(pq.poll());
//         System.out.println(pq.poll());
//         System.out.println(pq.poll());
//         System.out.println(pq.poll());
//         System.out.println(pq.poll());
//     }
// }

// import java.util.*;

// public class Lekciya004 {
//     public static void main(String[] args) {
//         Deque<Integer> deque = new ArrayDeque<>();
//         deque.addFirst(1); deque.addLast(2);
//         // deque.removeLast(); deque.removeLast();
//         deque.offerFirst(1); deque.offerLast(2);
//         deque.pollFirst(); deque.pollLast();
//         deque.getFirst(); deque.getLast();
//         deque.peekFirst(); deque.peekLast();
//         System.out.println(deque);
//     }
// }

import java.util.*;

public class Lekciya004 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(12);
        stack.push(123);
        System.out.println(stack.pop()); // 123
        System.out.println(stack.pop()); // 12
        System.out.println(stack.pop()); // 1
    }
}

