import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        //задача 1
        byte clientOS = 0;
        switch (clientOS) {
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            default:
                System.out.println("Ошибка ввода");
        }

        //задача 2
        int clientDeviceYear = 2014;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        //задача 3
        int year = 2100;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

        // задача 4
        int deliveryDistance = -15;
        if (deliveryDistance < 0) {
            System.out.println("Не верно введено расстояние. Не может быть отрицательным числом.");
        } else {
            int deliveryDays = 1;
            int distantDifference = deliveryDistance - 20;
            if (distantDifference < 0) {
                System.out.println("Потребуется дней: " + deliveryDays);
            } else {
                int deliveryRatio = distantDifference / 40 + 2;
                System.out.println("Потребуется дней: " + deliveryRatio);

            }
        }

        //задание 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Номер месяца больше 12");

        }
        // задание 6
        int age = 19;
        int salary = 58_000;
        int ageElderLimit = 3 * salary;
        int ageYongerLimit = 2 * salary;
        double overSalaryLimit = 1.2;
        double overSalaryLimit2 = 1.5;

        if (age >= 23 && salary < 50_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + ageElderLimit + " рублей");
        } else if (age >= 23 && salary >= 50_000 && salary < 80_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (int) (ageElderLimit * overSalaryLimit) + " рублей");
        } else if (age >= 23 && salary >= 80_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (int) (ageElderLimit * overSalaryLimit2) + " рублей");
        } else if (age < 23 && salary < 50_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + ageYongerLimit + " рублей");
        } else if (age < 23 && salary >= 50_000 && salary < 80_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (int) (ageYongerLimit * overSalaryLimit) + " рублей");
        } else {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (int) (ageYongerLimit * overSalaryLimit2) + " рублей");
        }

        // задание 7
        int age1 = 25;
        double salary2 = 60_000;
        double wantedSum = 330_000;
        double basePercent = 10;
        boolean isMoreThan30 = (age1 >= 30);
        boolean isLessThan23 = (age1 < 23);
        boolean isBeetween23_30 = (age1 >= 23 && age1 < 30);
        boolean isSalaryMore80 = (salary2 > 80_000);
        double maxDuty = 0.5 * salary2;
        double creditPayment;
        double dutyMore80 = basePercent - 0.7;
        double dutyLess23 = basePercent + 1;
        double dutyBetween23_30 = basePercent + 0.5;
        int period = 12;
        if (isMoreThan30 && !isSalaryMore80) {
            creditPayment = (wantedSum + wantedSum * basePercent / 100) / period;
            if (maxDuty > creditPayment) {
                System.out.println("Максимальный платеж при ЗП " + salary2 + " равен " + maxDuty + " рублей. Платеж по кредиту " + creditPayment + " рублей. Одобрено.");
            } else {
                System.out.println("Максимальный платеж при ЗП " + salary2 + " равен " + maxDuty + " рублей. Платеж по кредиту " + creditPayment + " рублей. Отказано.");
            }
        }
        if (isMoreThan30 && isSalaryMore80) {
            creditPayment = (wantedSum + wantedSum * dutyMore80 / 100) / period;
            if (maxDuty > creditPayment) {
                System.out.println("Максимальный платеж при ЗП " + salary2 + " равен " + maxDuty + " рублей. Платеж по кредиту " + creditPayment + " рублей. Одобрено.");
            } else {
                System.out.println("Максимальный платеж при ЗП " + salary2 + " равен " + maxDuty + " рублей. Платеж по кредиту " + creditPayment + " рублей. Отказано.");
            }
        }
        if (isLessThan23 && !isSalaryMore80) {
            creditPayment = (wantedSum + wantedSum * dutyLess23 / 100) / period;
            if (maxDuty > creditPayment) {
                System.out.println("Максимальный платеж при ЗП " + salary2 + " равен " + maxDuty + " рублей. Платеж по кредиту " + creditPayment + " рублей. Одобрено.");
            } else {
                System.out.println("Максимальный платеж при ЗП " + salary2 + " равен " + maxDuty + " рублей. Платеж по кредиту " + creditPayment + " рублей. Отказано.");
            }
        }
        if (isLessThan23 && isSalaryMore80) {
            creditPayment = (wantedSum + wantedSum * (dutyLess23 - 0.7) / 100) / period;
            if (maxDuty > creditPayment) {
                System.out.println("Максимальный платеж при ЗП " + salary2 + " равен " + maxDuty + " рублей. Платеж по кредиту " + creditPayment + " рублей. Одобрено.");
            } else {
                System.out.println("Максимальный платеж при ЗП " + salary2 + " равен " + maxDuty + " рублей. Платеж по кредиту " + creditPayment + " рублей. Отказано.");
            }
        }
        if (isBeetween23_30 && !isSalaryMore80) {
            creditPayment = (wantedSum + wantedSum * dutyBetween23_30 / 100) / period;
            if (maxDuty > creditPayment) {
                System.out.println("Максимальный платеж при ЗП " + salary2 + " равен " + maxDuty + " рублей. Платеж по кредиту " + creditPayment + " рублей. Одобрено.");
            } else {
                System.out.println("Максимальный платеж при ЗП " + salary2 + " равен " + maxDuty + " рублей. Платеж по кредиту " + creditPayment + " рублей. Отказано.");
            }
        }
        if (isBeetween23_30 && isSalaryMore80) {
            creditPayment = (wantedSum + wantedSum * (dutyBetween23_30 - 0.7) / 100) / period;
            if (maxDuty > creditPayment) {
                System.out.println("Максимальный платеж при ЗП " + salary2 + " равен " + maxDuty + " рублей. Платеж по кредиту " + creditPayment + " рублей. Одобрено.");
            } else {
                System.out.println("Максимальный платеж при ЗП " + salary2 + " равен " + maxDuty + " рублей. Платеж по кредиту " + creditPayment + " рублей. Отказано.");
            }
        }

    }

}