/**
 * Created by Дмитрий on 08.01.2017.
 */
public class Barman extends Personal {

    private String exclusiveCoctail;
    private Bar bar;


    public Barman(String name, int age, String exclusiveCoctail, Bar bar) {
        super(name, age);
        this.bar = bar;
        this.exclusiveCoctail = exclusiveCoctail;

    }

    public void performOrder() {
      for (int i=0;i<bar.getOrders().length && bar.getOrders()[i]!= null;i++){
                System.out.println("Заказ на " + bar.getOrders()[i].getAmount() + " бутылок напитка " +  bar.getOrders()[i].getTitle() + " выполнен");
                bar.setOrderById(null,i);
        }
    }
}