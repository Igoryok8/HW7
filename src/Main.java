public class Main {
    public static void main(String[] args) {

        System.out.println("Домашнее задание 1");
        System.out.println("Задание 1");
for (int i =1; i <=10; i++) {
    System.out.println( + i);
}
        System.out.println("Задание 2");
        for (int i =10; i >=1; i--) {
            System.out.println(+i);
        }
        System.out.println("Задание 3");
        for (int i =0; i <=17; i=i+2) {
            System.out.println(+i);
        }
        System.out.println("Задание 4");
        for (int i =10; i >=-10; i--) {
            System.out.println(+i);
        }
        System.out.println("Домашнее задание 2");
        System.out.println("Задание 1");
        for (int i =1904; i <=2096; i=i+4) {
            System.out.println("Высокосный год " + i);
        }
        System.out.println("Задание 2");
        for (int i =7; i <=98; i=i+7) {
            System.out.println( + i);
        }
        System.out.println("Задание 3");
        for (int i =1; i <=512; i=i*2) {
            System.out.println( + i);
        }
        System.out.println("Домашнее задание 3");
        System.out.println("Задание 1");
        int deposit =29000;
        int total =0;
        for (int i =1; i <=12; i++) {
            total = total + deposit;
            System.out.println("Месяц " + i + " ,сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Задание 2");
double percent = 12;
double annualRatet = percent/100;
double monthPercent = annualRatet/12;
double sum =0;

        for (int i =1; i <=12; i++) {
            sum = (sum +deposit) *(1+ monthPercent);

            System.out.println("Месяц " + i + " ,сумма накоплений равна " + sum + " рублей");
        }
    }
}