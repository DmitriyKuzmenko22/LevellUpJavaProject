package view;

import view.impl.CreateCitizenDialog;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Дмитрий on 12.01.2017.
 */
public class CitizenTablePanel extends JPanel implements Action {

    private final JTable table;

    private final CreateCitizenDialog dialog;

    private final CitizenTableModelContainer tableContainer;

    //Constructor

    public CitizenTablePanel() {

        this.tableContainer = new CitizenTableModelContainer();

        this.table = new JTable(tableContainer);

        this.dialog = new CreateCitizenDialog();

        setName("Citizen Tab");

        init();

    }

    private void init() {

        JScrollPane scrollPane = new JScrollPane(table);

        scrollPane.setSize(new Dimension(595, 300));

        add(scrollPane);

        setSize(new Dimension(595, 300));

    }
}

