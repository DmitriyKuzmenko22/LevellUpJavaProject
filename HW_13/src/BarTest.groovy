import spock.lang.Specification

/**
 * Created by Дмитрий on 14.01.2017.
 */
class BarTest extends Specification {
    def "add&del barmen & waiter"() {
        given: "aaa personal"
        Bar bar = new Bar();

        when: "try to add one barman"
        bar.addPersonal("Vasya",24,"официант","svf",bar)
        bar.addPersonal("Vasya",24,"официант","svf",bar)
        bar.addPersonal("Vasya",24,"официант","svf",bar)
        bar.addPersonal("Illa",22,"бармен","vfvf",bar)
        bar.addPersonal("Illa",22,"бармен","vfvf",bar)
        bar.addPersonal("Illa",22,"бармен","vfvf",bar)
        bar.dellPersonal("Illa","бармен")

        then: "check current array size"
        bar.getCurentWaitersNumber() == 3
        bar.getCurentBarmansNumber() == 2
        bar.waiter[1].getName()=="Vasya"

        when: "del personal"
        bar.dellPersonal("Vasya","официант")

        then: "check current array size"
        bar.getCurentWaitersNumber()==2
    }

    def "Add bar"() {
        given: "add zapas bar"
        Bar bar = new Bar();

        when: "add zapas"
        bar.addZapasBara("Vodka", 10, 15, 20)

        then: "amount bar and detail"
        bar.alcohol[0].amount == 10;
        bar.alcohol[0].name == "Vodka";
        bar.alcohol[1] == null;
        bar.curentAlcoholNumber == 1

        when: "add bara a few drinks"
        bar.addZapasBara("KrovMary", 5, 20, 50)
        bar.addZapasBara("Whiski", 7, 5, 40)

        then: "amount and detail"
        bar.alcohol[1].amount == 5;
        bar.alcohol[1].name == "KrovMary"
        bar.alcohol[1].cost == 50;
        bar.alcohol[1].volume == 20
        bar.curentAlcoholNumber == 3
        bar.alcohol[2].name == "Whiski"
        bar.alcohol[99] == null;
    }
        def "added hj order"(){
            given:"add zapas and personal"
            Bar bar=new Bar();
            bar.addZapasBara("Vodka",20,20,30)
            bar.addZapasBara("KrovMary",10,30,40)
            bar.addPersonal("Petro",29,"официант","ooe",bar)
            bar.addPersonal("Anton",21,"бармен","ooe",bar)

            when:"aded order"
            bar.addOrders(0,"KrovMary",2)
            bar.addOrders(0,"Vodka",5)

            then:"What orders list"
            bar.orders[0].getAmount()==2
            bar.orders[0].getTitle()=="KrovMary"
            bar.orders[1].getTitle()=="Vodka"
            bar.orders[1].getAmount()==5





        }

    }
