package ua.dp.levelup.core.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TICKETS")
public class Ticket {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long ticketId;
  @Column
  private double price;
  @Column
  private long movieSessionId;
 /* @ManyToOne
  private Order order;*/
  @Column
  private int lineNumber;
  @Column
  private int seatNumber;
  @Column
  private int hallId;

  public Ticket(double price, long movieSessionId, /*Order order,*/ int lineNumber,int seatNumber) {
    this.price = price;
    this.movieSessionId = movieSessionId;
    /*this.order = order;*/
    this.lineNumber=lineNumber;
    this.seatNumber=seatNumber;
  }

  public Long getTicketId() {
    return ticketId;
  }

  public void setTicketId(Long ticketId) {
    this.ticketId = ticketId;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public long getMovieSessionId() {
    return movieSessionId;
  }

  public void setMovieSessionId(long movieSessionId) {
    this.movieSessionId = movieSessionId;
  }
/*

  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }
*/

  public int getLineNumber() {
    return lineNumber;
  }

  public void setLineNumber(int lineNumber) {
    this.lineNumber = lineNumber;
  }

  public int getSeatNumber() {
    return seatNumber;
  }

  public void setSeatNumber(int seatNumber) {
    this.seatNumber = seatNumber;
  }
}
