/**
 * Created by Дмитрий on 08.01.2017.
 */
public class Waiter extends Personal {
    private Bar bar;


    public Waiter(String name, int age, Bar bar) {
        super(name, age);
        this.bar = bar;
    }

    public void addOrder(String nameOfAlcohol, int amount) {
        for (int j = 0; j < bar.getAlcohol().length; j++) {
            if (bar.getAlcohol()[j] != null && bar.getAlcohol()[j].getName().equals(nameOfAlcohol)) { //проверяем есть ли такой алкоголь в баре
                for (int i = 0; i < bar.getOrders().length; i++) {
                    if (bar.getOrders()[i] == null) {
                        bar.setOrderById(new Orders(nameOfAlcohol, amount), i);
                        System.out.println("заказ добавлен на "+ nameOfAlcohol);
                        break;
                    }


                }
            }
            if (j==bar.getAlcohol().length && (bar.getAlcohol()[j] == null || !bar.getAlcohol()[j].getName().equals(nameOfAlcohol))){ //последний элемент массива, равен нулю, или имя не то, что нам нужно
                System.out.println("net takogo alkohola");
                break;

            }

        }
    }

    public void addTips(int amountTips){
        bar.setTips(bar.getTips()+amountTips);
        System.out.println("чаевые добавлены в кассу в сумме" + amountTips);
    }
}
