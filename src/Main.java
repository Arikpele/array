import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // task1();
        // task2();
        task3();
        task4();

    }

    //Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new.
    public static void task1() {
        System.out.println("задача 1");
        {
            int[] weigth = new int[3];
            weigth[0] = 1;
            weigth[1] = 2;
            weigth[2] = 3;
            for (int i = 0; i < weigth.length; i++) {
                System.out.println(weigth[i]);
            }
            //Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986.
            // Массив сразу заполните значениями.
            {
                double[] x = {1.57, 7.654, 9.986};
                for (int i = 0; i < x.length; i++) {
                    System.out.println(x[i]);
                }
                //Произвольный массив. Тип и количество данных определите сами.
                // Самостоятельно выберите способ создания массива:
                // с помощью ключевого слова или сразу заполненный элементами
                int[] man = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
                {
                    System.out.println(Arrays.toString(man));
                }
            }
        }
    }

    //Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую.
    // В конце строки запятую ставить не надо.
    public static void task2() {
        System.out.println("задача 2");
        int[] weigth = new int[3];
        {
            //System.out.println(Arrays.toString(weigth));
        }
        double[] x = {1.57, 7.654, 9.986};
        {
            System.out.println(Arrays.toString(x));
        }
    }

    //Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую.
// В конце строки запятую ставить не надо.
    public static void task3() {
        System.out.println("задача 3");
        int[] weigth = {3, 2, 1};
        System.out.println(Arrays.toString(weigth));
        double[] weigthX = {9.986, 7.654, 1.57};
        System.out.println(Arrays.toString(weigthX));

    }

    //Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными
    // (нужно прибавить 1).
    public static void task4() {
        System.out.println("задача 4");
        int[] weigth = {1, 2, 3};
        for (int i = 0; i < weigth.length; i++) {
            if (weigth[i]%2!=0)
            System.out.println((weigth[i]) + 1);
        }
    }
}



