/**
 * Created by Dmitriy on 27.11.2016.
 */
public enum Months {

    January(1,29,"January","Январь"),
    February(2,28,"February","Февраль"),
    March(3,31,"March","Март"),
    April(4,30,"April","Апрель"),
    May(5,31,"May","Май"),
    June(6,30,"June","Июнь"),
    July(7,31,"July","Мюль"),
    August(8,31,"August","Август"),
    September(9,30,"September","Сентябрь"),
    October(10,31,"October","Октябрь"),
    November(11,30,"November","Ноябрь"),
    December(12,31,"December","Декабрь");

    int numberMonth;
    int daysMonth;
    String NameEn;
    String NameRu;

    Months(int numberMonth, int daysMonth, String nameEn, String nameRu) {
        this.numberMonth = numberMonth;
        this.daysMonth = daysMonth;
        NameEn = nameEn;
        NameRu = nameRu;
    }

    public int getDaysMonth() {
        return daysMonth;
    }

    public int getNumberMonth() {
        return numberMonth;
    }

    public String getNameEn() {
        return NameEn;
    }

    public String getNameRu() {
        return NameRu;
    }
}
