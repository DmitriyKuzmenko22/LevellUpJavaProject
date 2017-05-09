package testFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

/**
 * Created by Дмитрий on 06.05.2017.
 */
public class Listener implements ActionListener {
    private String str;

    public Listener(String str){
        this.str = str;
    }
    @Override
    public void actionPerformed(ActionEvent event) {
        String url = "jdbc:sqlserver://localhost\\MSSQLSERVER;database=Test;integratedSecurity=false;";
        Properties properties = new Properties();
        properties.setProperty("user", str);
        properties.setProperty("password", "090387");
        properties.setProperty("characterEncoding", "UTF-8");
        properties.setProperty("useUnocode", "true");
       // DBconnection connect = new DBconnection(url, properties);
       // connect.init();
        System.out.print("connect!!!");
    }
}
