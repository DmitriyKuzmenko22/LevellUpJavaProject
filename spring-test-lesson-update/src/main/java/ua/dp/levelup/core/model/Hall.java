package ua.dp.levelup.core.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by Дмитрий on 10.07.2017.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "HALL_BOOKING")

public class Hall {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long hallId;

    private long row;
    private long place;

    public Hall(long row, long place) {
        this.row = row;
        this.place = place;
    }
}
