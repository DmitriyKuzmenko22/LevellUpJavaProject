
public class Bar {
    private Waiter waiter[] = new Waiter[3];
    private int curentWaitersNumber;
    private Barman barman[] = new Barman[5];
    private int curentBarmansNumber;
    private String barName;
    public Alcohol alcohol[] = new Alcohol[100];
    private int curentAlcoholNumber;
    private int tips;

    //_________________________________________//
    private Orders[] orders = new Orders[100];


    //__________________________________//

    public int getDrink(String nameAlcohol){
        for (int i=0;i<alcohol.length;i++){
           if(alcohol[i].getName().equals(nameAlcohol))
                return alcohol[i].getAmount();
            }
        return -1;
    }

    public Alcohol getDrinkByName(String nameAlcohol){
        for (int i=0;i<alcohol.length;i++){
            if(alcohol[i].getName().equals(nameAlcohol))
                return alcohol[i];
        }
        return null;
    }


    public void addOrders(int waiterID, String nameAlcohol, int amount) {
        if (waiter[waiterID] != null) waiter[waiterID].addOrder(nameAlcohol, amount);
    }

    public void perfomOrder(Bar bar,int barmanId){
        if (barman[barmanId]!=null) {
            barman[barmanId].performOrder();
        } else System.out.println("такого бармена нет " + barmanId);

    }


    public void decreaseAlcoholValue(String nameOfAlcohol, int amount) { //уменьшаем количество алкоголя в баре после выполнения заказа
        for (int i = 0; i < alcohol.length && alcohol[i] != null; i++) {
            if (nameOfAlcohol.equals(alcohol[i].getName())) {
                alcohol[i].setAmount(alcohol[i].getAmount() - amount);
                if (alcohol[i].getAmount() == 0) {
                    alcohol[i] = null;
                }
            }
        }
    }

    public void addZapasBara(String Alcoholname, int amount, double volume, int cost) {
        boolean isAdded = false;
        for (int i = 0; i < alcohol.length && alcohol[i] != null; i++) {
            if (alcohol[i].getName().equals(Alcoholname)) {
                alcohol[i].setAmount(alcohol[i].getAmount() + amount);
                isAdded = true;
                System.out.println("Добавлено количество алкоголя " + Alcoholname);
                break;
            }
        }
        if (isAdded == false) {
            for (int j = 0; j < amount; j++) {
                if (alcohol[j] == null) {
                    alcohol[j] = new Alcohol(Alcoholname, amount, volume, cost);
                    curentAlcoholNumber++;
                    System.out.println("Добавлен алкоголь " + Alcoholname);

                }
            }
        }
    }

    public void tipsForPersonal() {
        System.out.println("Каждому бармену сумма чаевых - " + tips / curentBarmansNumber);
        tips = 0;
    }

    public void addPersonal(String name, int age, String position, String exclusiveCoctail, Bar bar) throws NotExistBarException {
        if (bar==null) throw new NotExistBarException("For creating new employee was passed not");
        switch (position) {
            case "бармен":
                if (curentBarmansNumber < barman.length) {
                    for (int i = 0; i < barman.length; i++) {
                        if (barman[i] == null) {
                            this.barman[i] = new Barman(name, age, exclusiveCoctail, bar);
                            System.out.println(name + " новый бармен, записан в журнал под номером " + i);
                            curentBarmansNumber++;
                            break;
                        }
                    }
                } else System.out.println("бармены не требутся");
                break;
            case "официант":
                if (curentWaitersNumber < waiter.length) {
                    for (int j = 0; j < waiter.length; j++) {
                        if (waiter[j] == null) {
                            this.waiter[j] = new Waiter(name, age, bar);
                            System.out.println("официант с именем " + name + " добавлен в журанл под номером " + j);
                            curentWaitersNumber++;
                            break;
                        }
                    }
                } else System.out.println("официанты не требутся");
                break;

        }
    }

    public void dellPersonal(String name, String position) {
        switch (position) {
            case "бармен":
                if (curentBarmansNumber > 0) {
                    for (int i = 0; i < barman.length; i++) {
                        if (barman[i] != null && barman[i].getName().equals(name)) {
                            barman[i] = null;
                            curentBarmansNumber--;
                            System.out.println(name + " бармен уволен");
                            break;
                        }

                    }
                }
                break;
            case "официант":
                if (curentWaitersNumber > 0) {
                    for (int j = 0; j < waiter.length; j++) {
                        if (waiter[j] != null && waiter[j].getName().equals(name)) {
                            waiter[j] = null;
                            curentWaitersNumber--;
                            System.out.println(name + " официант уволен");
                            break;
                        }
                    }
                }
                break;
            default:
                System.out.println("чет не то");

        }

    }


    public Waiter[] getWaiter() {
        return waiter;
    }

    public void setWaiter(Waiter[] waiter) {
        this.waiter = waiter;
    }

    public int getCurentWaitersNumber() {
        return curentWaitersNumber;
    }

    public void setCurentWaitersNumber(int curentWaitersNumber) {

        this.curentWaitersNumber = curentWaitersNumber;
    }

    public Barman[] getBarman() {
        return barman;
    }

    public void setBarman(Barman[] barman) {
        this.barman = barman;
    }

    public int getCurentBarmansNumber() {
        return curentBarmansNumber;
    }

    public void setCurentBarmansNumber(int curentBarmansNumber) {
        this.curentBarmansNumber = curentBarmansNumber;
    }

    public String getBarName() {
        return barName;
    }

    public void setBarName(String barName) {
        this.barName = barName;
    }

    public Alcohol[] getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(Alcohol[] alcohol) {
        this.alcohol = alcohol;
    }

    public int getCurentAlcoholNumber() {
        return curentAlcoholNumber;
    }

    public void setCurentAlcoholNumber(int curentAlcoholNumber) {
        this.curentAlcoholNumber = curentAlcoholNumber;
    }

    public int getTips() {
        return tips;
    }

    public void setTips(int tips) {
        this.tips = tips;
    }

    public Orders[] getOrders() {
        return orders;
    }


    public void setOrderById(Orders orders, int id) {
        this.orders[id] = orders;
    }

    class NotExistBarException extends Exception {
        public NotExistBarException(String s) {
            System.out.println("For creating new employee was passed not");
        }
    }
}

