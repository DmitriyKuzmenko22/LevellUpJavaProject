package email.frameApp;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Дмитрий on 08.05.2017.
 */
public class UserTableModel extends AbstractTableModel {
    private String[] columns = {"ID",
            "name",
            "password",
            "account type",
           };

    private List<UserAndPass> userList = new ArrayList<>();


    public void setUserList (List<UserAndPass> userList){
        this.userList = userList;
    }

    public List<UserAndPass> getUserList() {
        return userList;
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
        return userList.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) { // для редактирования конкретной строки и колонки выбранной
        UserAndPass user = userList.get(rowIndex);
        switch (columnIndex){
            case 1 : return user.getName();
            case 2 : return user.getPassword();
            case 3 : return user.getRoleAccount();
            default: return user.getId();
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) { // для установки значения
        UserAndPass user = userList.get(rowIndex);
        System.out.println(aValue+" "+columnIndex);
        switch (columnIndex){
            case 1 : user.setName((String) aValue);break;
            case 2 : user.setPassword((String) aValue);break;
            case 3 : user.setRoleAccount((String)aValue);break;
        }
    }

    public UserAndPass getSelectedRowData(int rowIndex) {
        return userList.get(rowIndex);
    }
}
