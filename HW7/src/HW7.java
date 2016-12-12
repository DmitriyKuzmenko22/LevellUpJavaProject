public class HW7 {

    public static int isOneA(int month) {
        System.out.println("Введите номер месяца: ");
        //int month=2;
        switch (month) {

            case 1:
                System.out.println("В Январе 31 день");
                break;

            case 3:
                System.out.println("В Марте 31 день");
                break;

            case 4:
                System.out.println("В Апреле 30 дней");
                break;

            case 5:
                System.out.println("В Мае 31 дней");
                break;

            case 6:
                System.out.println("В Июне 30 дней");
                break;

            case 7:
                System.out.println("В Июле 31 дней");
                break;

            case 8:
                System.out.println("В Августе 31 дней");
                break;

            case 9:
                System.out.println("В Сентябре 30 дней");
                break;

            case 10:
                System.out.println("В Окрябре 31 дней");
                break;

            case 11:
                System.out.println("В Ноябре 30 дней");
                break;

            case 12:
                System.out.println("В Декабре 31 дней");
                break;
            default:
                System.out.println("Нет такого месяца:(");
        }
        return month;
    }



}
