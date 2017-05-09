package email.frameApp;

import lombok.*;

import javax.persistence.*;
import java.io.File;

/**
 * Created by Дмитрий on 09.05.2017.
 */
@Table(name="PacketSend")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PacketSend {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_packet")
    private long id;

    @Column(name = "packet_name")
    private String packetName;

    @Column(name = "load_date")
    private Data loadDate;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "assigned_to_user")
    private UserAndPass assignedTo;

    @Column
    private File file;

    public PacketSend(String packetName, Data loadDate, UserAndPass assignedTo, File file) {
        this.packetName = packetName;
        this.loadDate = loadDate;
        this.assignedTo = assignedTo;
        this.file = file;
    }
}

