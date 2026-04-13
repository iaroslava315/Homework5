
void main() {
    IO.println("Hello and welcome!");

// Task 1
    {
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Такого варианта не сущестует");
        }
    }


//  Task 2
    {
        int clientOS = 0;
        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Такого варианта не сущестует");
        }
    }


//   Task 3
    {
        int year = 2021;
        if ((year > 1584) && (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else if (year > 1584) {
            System.out.println(year + " год не является високосным");
        } else {
            System.out.println("Год должен быть больше 1584");
        }
    }


//     Task 4
    {
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance < 20) {
        System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryDays += 1;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            deliveryDays +=2;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставки нет");
        }
    }


    //    Task 5
    {
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println(monthNumber + " месяц принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " месяц принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " месяц принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " месяц принадлежит к сезону осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}
