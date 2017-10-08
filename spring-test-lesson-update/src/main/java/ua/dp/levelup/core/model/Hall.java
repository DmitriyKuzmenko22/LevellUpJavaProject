package ua.dp.levelup.core.model;

import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "HALLS")

public class Hall {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private File seatsAndRanges;


    @Column
    private int seatsNumberInHall;

    @Column
    private int rowsNumberInHall;

    public Hall(int seatsNumberInHall, int rowsNumberInHall) {
        this.seatsNumberInHall = seatsNumberInHall;
        this.rowsNumberInHall = rowsNumberInHall;
    }
}
