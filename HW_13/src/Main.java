import java.util.Arrays;

/**
 * Created by Дмитрий on 08.01.2017.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Bar bar=new Bar();
        bar.addPersonal("Василий",72,"официант","kopal",bar);
        bar.addPersonal("Антон",65,"бармен","kopal",bar);
        bar.addPersonal("Светлана",32,"бармен","kopal",bar);
        bar.addPersonal("Екатерина",27,"официант","kopal",bar);
        bar.addPersonal("Маргарита",25,"официант","kopal",bar);

        //bar.addZapasBara("Pivo",5,10,10);
       bar.addZapasBara("Vodka",2,10,15);
        bar.addZapasBara("KrovMary",10,10,7);
//        bar.addZapasBara("Vodka",1,10,7);

        bar.addOrders(0,"KrovMary",2);
        bar.addOrders(0,"Vodka",1);
        bar.addOrders(2,"Vodbgbgreka",1);

        bar.dellPersonal("Маргарита","официант");
        bar.tipsForPersonal(20);

        bar.perfomOrder(bar,1);


        //System.out.println(bar.getDrink("Vodka"));
       // System.out.println(bar.getDrinkByName("Vodka"));
//

        }
   }

