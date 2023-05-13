public class Rectangle {
    public static void main(String[] args) {
        int a = 3;
        int b = 1;
        int c = 1;
        int d = 2;
        int e = 1;
        int f = 5;
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
        if (((a + c) <= f && b <= e && d <= e) || ((a + c) <= e && b <= f && d <= f)){
            System.out.println("Дома помещаются на участке");
        } else if (((a + d) <= f && b <= e && c <= e) || ((a + d) <= e && b <= f && c <= f)){
            System.out.println("Дома помещаются на участке");
        } else if (((b + c) <= f && a <= e && d <= e) || ((b + c) <= e && a <= f && d <= f)){
            System.out.println("Дома помещаются на участке");
        } else if (((b + d) <= f && a <= e && c <= e) || ((b + d) <= e && a <= f && c <= f)){
            System.out.println("Дома помещаются на участке");
        }else if ((minSum <= e && notMinSideAB <= f && notMinSideCD <= f) ||
                (minSum <= f && notMinSideAB <= e && notMinSideCD <= e)) {
            System.out.println("Дома помещаются на участке");
        } else {
            System.out.println("Дома не помещаются на участке");
        }
    }

}
