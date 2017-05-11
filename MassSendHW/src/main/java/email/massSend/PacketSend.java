package email.massSend;

import email.frameApp.UserAndPass;
import lombok.*;

import javax.persistence.*;
import java.io.File;
import java.util.Date;

/**
 * Created by Дмитрий on 09.05.2017.
 */
@Entity
@Table(name="PacketSend")
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
    private Date loadDate;

    @JoinColumn(name = "assigned_to_user")
    private Long assignedTo;

    @Column
    private File file;

    public PacketSend(String packetName, Date loadDate, Long assignedTo, File file) {
        this.packetName = packetName;
        this.loadDate = loadDate;
        this.assignedTo = assignedTo;
        this.file = file;
    }

    public PacketSend() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPacketName() {
        return packetName;
    }

    public void setPacketName(String packetName) {
        this.packetName = packetName;
    }

    public Date getLoadDate() {
        return loadDate;
    }

    public void setLoadDate(Date loadDate) {
        this.loadDate = loadDate;
    }

    public Long getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(Long assignedTo) {
        this.assignedTo = assignedTo;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}

