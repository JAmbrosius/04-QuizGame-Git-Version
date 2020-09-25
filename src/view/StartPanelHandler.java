package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartPanelHandler {
    private MainView mainView;
    private JPanel panel;
    private JTextField textField1;
    private JButton play;

    public StartPanelHandler(MainView mainView) {
        createButtons();
        this.mainView = mainView;
    }

    public JPanel getPanel(){
        return panel;
    }

    private void createButtons(){
        play.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startGameClicked();
            }
        });
    }

    private void startGameClicked(){
        String name = textField1.getText();
        mainView.play(name);
    }
}
