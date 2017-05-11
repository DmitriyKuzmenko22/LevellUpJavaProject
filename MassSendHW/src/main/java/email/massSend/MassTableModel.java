package email.massSend;

import lombok.Data;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Дмитрий on 11.05.2017.
 */
public class MassTableModel extends AbstractTableModel {
    private String[] columns = {"ID",
            "packet_Name",
            "load_Date",
            "assigned_to_user",
    };

    private List<PacketSend> packetSends = new ArrayList<>();


    public void setPacketSend (List<PacketSend> packetSends){
        this.packetSends = packetSends;
    }

    public List<PacketSend> getPacketSend() {
        return packetSends;
    }


    @Override
    public String getColumnName(int column) {
        return columns[column];//возращает имена колонок
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex != 0;// можно ли редактировать айди
    }

    @Override
    public int getRowCount() {
        return packetSends.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) { // для редактирования конкретной строки и колонки выбранной
        PacketSend packetSend = packetSends.get(rowIndex);
        switch (columnIndex){
            case 1 : return packetSend.getPacketName();
            case 2 : return packetSend.getLoadDate();
            case 3 : return packetSend.getAssignedTo();
            default: return packetSend.getId();
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) { // для установки значения
        PacketSend packetSend = packetSends.get(rowIndex);
        System.out.println(aValue+" "+columnIndex);
        switch (columnIndex){
            case 1 : packetSend.setPacketName((String) aValue);break;
            case 2 : packetSend.setLoadDate((Date) aValue);break;
            case 3 : packetSend.setAssignedTo((Long) aValue);break;
        }
    }

    public PacketSend getSelectedRowData(int rowIndex) {
        return packetSends.get(rowIndex);
    }
}
