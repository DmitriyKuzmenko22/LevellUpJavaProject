package ua.dp.levelup.core.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.*;
import org.hibernate.annotations.Type;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

/**
 * @author Alexandr Shegeda on 23.06.17.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "MOVIE_SESSIONS")
public class MovieSession {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long movieSessionId;
  private long filmId;
  /*
    @DateTimeFormat(pattern = "dd-MM-yyyy")
  */
  @Temporal(TemporalType.DATE)
  private Date sessionStartDate;
  @Temporal(TemporalType.TIME)
  private Date sessionStartTime;
  private int hallNumber;
  private double standardTicketPrice;
  private double comfortTicketPrice;


  public MovieSession(long filmId, Date sessionStartDate, Date sessionStartTime, int hallNumber, double standardTicketPrice, double comfortTicketPrice) {
    this.filmId = filmId;
    this.sessionStartDate = sessionStartDate;
    this.sessionStartTime = sessionStartTime;
    this.hallNumber = hallNumber;
    this.standardTicketPrice = standardTicketPrice;
    this.comfortTicketPrice = comfortTicketPrice;
  }

  public Long getMovieSessionId() {
    return movieSessionId;
  }

  public void setMovieSessionId(Long movieSessionId) {
    this.movieSessionId = movieSessionId;
  }

  public long getFilmId() {
    return filmId;
  }

  public void setFilmId(long filmId) {
    this.filmId = filmId;
  }

  public Date getSessionStartDate() {
    return sessionStartDate;
  }

  public void setSessionStartDate(Date sessionStartDate) {
    this.sessionStartDate = sessionStartDate;
  }

  public Date getSessionStartTime() {
    return sessionStartTime;
  }

  public void setSessionStartTime(Date sessionStartTime) {
    this.sessionStartTime = sessionStartTime;
  }

  public int getHallNumber() {
    return hallNumber;
  }

  public void setHallNumber(int hallNumber) {
    this.hallNumber = hallNumber;
  }

  public double getStandardTicketPrice() {
    return standardTicketPrice;
  }

  public void setStandardTicketPrice(double standardTicketPrice) {
    this.standardTicketPrice = standardTicketPrice;
  }

  public double getComfortTicketPrice() {
    return comfortTicketPrice;
  }

  public void setComfortTicketPrice(double comfortTicketPrice) {
    this.comfortTicketPrice = comfortTicketPrice;

  }
}
