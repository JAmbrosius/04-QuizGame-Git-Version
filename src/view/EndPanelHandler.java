package view;

import control.MainController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EndPanelHandler {

    private JPanel panel;
    private JButton restartButton;
    private JButton closeButton;
    private JLabel scoreLabel;
    private JLabel levelLabel;
    private JLabel nameLabel;
    private MainController mainController;
    private MainView mainView;

    public EndPanelHandler(MainView mainView, MainController mainController) {
        this.mainView = mainView;
        this.mainController = mainController;

        scoreLabel.setText(String.valueOf(mainController.getPlayerpoints()));
        levelLabel.setText(String.valueOf(mainController.getPlayerLevel()-1));
        nameLabel.setText(mainController.getPlayerName());
        createListeners();
    }

    private void createListeners(){
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainView.dispose();
            }
        });
        restartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainView.play(mainController.getPlayerName());
            }
        });
    }

    public JPanel getPanel(){return panel;}
}
