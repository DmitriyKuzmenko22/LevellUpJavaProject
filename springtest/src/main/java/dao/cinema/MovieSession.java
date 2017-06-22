package dao.cinema;

import com.google.gson.Gson;

import java.util.Date;

/**
 * Created by Дмитрий on 22.06.2017.
 */
public class MovieSession {

    private long idMovieSession;

    private Date date;

    private long idRoom;

    private long standartPrice;

    private long premiumPrice;

    public MovieSession(long idMovieSession, Date date,long idRoom, long standartPrice, long premiumPrice) {
        this.idMovieSession = idMovieSession;
        this.date = date;
        this.idRoom=idRoom;
        this.standartPrice = standartPrice;
        this.premiumPrice = premiumPrice;
    }

    public long getIdMovieSession() {
        return idMovieSession;
    }

    public void setIdMovieSession(long idMovieSession) {
        this.idMovieSession = idMovieSession;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(long idRoom) {
        this.idRoom = idRoom;
    }

    public long getStandartPrice() {
        return standartPrice;
    }

    public void setStandartPrice(long standartPrice) {
        this.standartPrice = standartPrice;
    }

    public long getPremiumPrice() {
        return premiumPrice;
    }

    public void setPremiumPrice(long premiumPrice) {
        this.premiumPrice = premiumPrice;
    }



    @Override
    public String toString() {
        return "MovieSession{" +
                "idMovieSession=" + idMovieSession +
                ", date=" + date +
                ", idRoom=" + idRoom +
                ", standartPrice=" + standartPrice +
                ", premiumPrice=" + premiumPrice +
                '}';
    }
}
