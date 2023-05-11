public class Rectangle {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 1;
        int d = 1;
        int e = 3;
        int f = 3;
        // нахожу минимальную сумму сторон прямоугольков, но главвное 2 не минмальных стороны
        int minSum = 0;
        int notMinSideAB = 0;
        int notMinSideCD = 0;
        if ((a + c) <= (a + d) && (a + c) <= (b + c) && (a + c) <= (b + d)) {
            minSum = a + c;
            notMinSideAB = b;
            notMinSideCD = d;
        } else if ((a + d) <= (a + c) && (a + d) <= (b + c) && (a + d) <= (b + d)) {
            minSum = a + d;
            notMinSideAB = b;
            notMinSideCD = c;
        } else if ((b + c) <= (a + c) && (b + c) <= (a + d) && (b + c) <= (b + d)) {
            minSum = b + c;
            notMinSideAB = a;
            notMinSideCD = d;
        } else if ((b + d) <= (a + c) && (b + d) <= (a + d) && (b + d) <= (b + c)) {
            minSum = b + d;
            notMinSideAB = a;
            notMinSideCD = c;
        }
        //вывод результата
        if ((minSum <= e && notMinSideAB <= f && notMinSideCD <= f) ||
                (minSum <= f && notMinSideAB <= e && notMinSideCD <= e)) {
            System.out.println("Дома помещаются на участке");
        } else {
            System.out.println("Дома не помещаются на участке");
        }
    }

}
