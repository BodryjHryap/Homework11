import java.time.*;

public class Main {
    public static void main(String[] args) {
        isALeapYear(2023);
        findOldDevice(0, 2023);
        calculateDelivery(95);
    }

    public static void isALeapYear(int year){
        if (( year % 400 == 0 ) || ( year % 4 == 0 && year % 100 != 0 )) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void findOldDevice(int clientOS, int clientDeviceYear) {
        int iOs = 0;
        int android = 1;
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear < currentYear && clientOS == android) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear < currentYear && clientOS == iOs) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if(clientDeviceYear >= currentYear && clientOS == android) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= currentYear && clientOS == iOs) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Поддерживаются только iOS и android");
        }
    }

    public static void calculateDelivery(int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance <= 20){
            System.out.println("На доставку потребуется: " + deliveryDays + " день");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60){
            deliveryDays += 1;
            System.out.println("На доставку потребуется: " + deliveryDays + " дня");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100){
            deliveryDays += 2;
            System.out.println("На доставку потребуется: " + deliveryDays + " дня");
        } else {
            System.out.println("Свыше 100км доставки нет");
        }
    }
}