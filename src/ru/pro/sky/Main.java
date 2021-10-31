package ru.pro.sky;

public class Main {
    // метод печати разделителя
    public static void printSeparator () {
        System.out.println("==============");
        System.out.println("-------------- ");
                    }
    // нужно теперь сделать метод,суммирующий ячейки массива
    public static void printIssues (int issueCount){
        System.out.println(issueCount);
    }

    public static int sum(int[] numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];

        }
        return sum;
    }

    public static void main(String[] args) {
        int[] issuesByMonths = {4, 6, 7, 9, 2, 5, 12, 3, 7, 10, 6, 7, 1, 8};
        //System.out.println("=====");
        printSeparator();
        for (int i = 0; i < issuesByMonths.length; i++) {
            printIssues(issuesByMonths[i]);
            // теперь нам нужно писать разделитель == между каждым третьим месяцем
            // поскольку цикл начинается с 0, то нам нужно в условии прописать (i+1)
            // если прописать просто i, то программа напечатает == не по трём месяца,
            // а сначала напишет первую ячейку, разделитель, 2+3+4 ячейку.
            if ((i+1)%3 == 0) {
                // внутри фигурных скобок пишем, что условный оператор должен делать
                //System.out.println("=====");
                // теперь нужно для удобства создать метод, к-ый будет печатать разделитель, см. выше
                // Однако метод нельзя делать внутри другого метода, поэтому надо выйти из метода Main
                printSeparator();
            }
        }
       printSeparator();
        int total = sum(issuesByMonths);
        printIssues(total);


    }
}


