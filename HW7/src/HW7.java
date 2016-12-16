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

    public static String isTwo(int Mast,int number) {

        if (Mast <= 4 && Mast >= 0) {
            switch (Mast) {

                case 1:
                    return "Пики"+getTwo2(number);

                case 2:
                    return "Трефы"+getTwo2(number);

                case 3:
                    return "Бубны"+getTwo2(number);

                case 4:
                    return "Червы"+getTwo2(number);


            }
        } else {
            System.err.println("У нас всего четыре масти");
        } return null;
    }


    public static String getTwo2(int number) {
        if (number >= 6 && number <= 14) {
            switch (number) {
                case 6:
                    return " шестерка";

                case 7:
                    return " семерка";

                case 8:
                    return " восьмерка";

                case 9:
                    return " девятка";

                case 10:
                    return " десяточка";

                case 11:
                    return " валет";

                case 12:
                    return " дама";

                case 13:
                    return " король";

                case 14:
                    return " туз";

            }

        } else if (number < 6) {
            System.err.println(" Достоинства карт начинаются от 6");

        } else if (number > 14) {
            System.err.println(" Достоинства карт не могут былть больше 14");
        }
         return null;
    }
}





