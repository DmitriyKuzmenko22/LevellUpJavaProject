package dao.cinema;

/**
 * Created by Дмитрий on 22.06.2017.
 */
public class Order {

    private long id;

    private long valueTicket;

    private long idSeance;

    private long summ;

    public Order(long id, long valueTicket, long idSeance, long summ) {
        this.id = id;
        this.valueTicket = valueTicket;
        this.idSeance = idSeance;
        this.summ = summ;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getValueTicket() {
        return valueTicket;
    }

    public void setValueTicket(long valueTicket) {
        this.valueTicket = valueTicket;
    }

    public long getIdSeance() {
        return idSeance;
    }

    public void setIdSeance(long idSeance) {
        this.idSeance = idSeance;
    }

    public long getSumm() {
        return summ;
    }

    public void setSumm(long summ) {
        this.summ = summ;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", valueTicket=" + valueTicket +
                ", idSeance=" + idSeance +
                ", summ=" + summ +
                '}';
    }
}
