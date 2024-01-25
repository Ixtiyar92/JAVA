// public class Seminar001 {
//     public static void main(String[] args){
//         int[] ints = new int[12];
//         String s1 = "Hello world!";
//         s1 += '!';
//         System.out.println(s1);
//     }
// }


// public class Seminar001 {
//     public static void main(String[] args){
//         int[] ints = new int[12];
//         String s1 = "Hello world!";
//         s1 += s1.replace("l", "A");
//         System.out.println("Привет!".repeat(3));
//         System.out.println(s1);
//     }
// }


// public class Seminar001 {
//     public static void main(String[] args){
//         int[] ints = new int[16];
        
//         int[] tmp = new int[ints.length+1];
//         for (int j = 0; j < ints.length; j++) {
//             tmp[j] = ints[j]; // по сути, копирование элементов одного массива в другой
//         }
//         ints = tmp; // а это переименование
//         System.out.println();
//     }
// }

import java.util.Arrays;
import java.util.Random;

public class Seminar001 {

    public static void main(String[] args){

        int i = 'g';
        long l;
        short s;
        byte b;
        char ch = 124;
        float f;
        double d;
        boolean aBoolean = false;
        // ____________________________________
        int[] ints = new int[16];
        int[] ints2 = new int[16];

//        i = ints[25];
        int[] tmp = new int[ints.length + ints2.length];
        for (int j = 0; j < ints.length; j++) tmp[j] = ints[j];
        ints = tmp;
        int y=0;

        String s1 = "Hello Woprld!";
        s1 += s1.replace("l", "A");
        System.out.println(
                "РџСЂРёРІРµС‚!"
                        .repeat(3)
                        .length());

        System.out.println();

        i = 0;
        for (int j=0, k=100;j<10 & k>0;j++,k-=6,i++);

        if (aBoolean) {

        }

        System.out.println(i);
        Random random = new Random();

        for (int j = 0; j < ints2.length; j++) {
            ints2[j] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(ints2));


        getInt(4);

        int[] ints1;

    }


    private static int getInt(int inputNumber){return inputNumber;}

    }