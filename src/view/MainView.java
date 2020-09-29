package view;

import control.MainController;

import javax.swing.*;

public class MainView extends JFrame {

    // Attribute

    // Referenzen
    private MainController mainController;
    private JPanel startPanel, gamePanel, endPanel;

    /**
     * Konstruktor
     * @param mainController Ein Referenz auf ein Controller-Objekt.
     */
    public MainView(MainController mainController) {

        this.mainController = mainController;
        this.startPanel = new StartPanelHandler(this).getPanel();

        this.getContentPane().add(startPanel);

        this.setLocation(50,50);
        this.setSize(1000,750);
        this.setResizable(false);
        this.setTitle("Quit-Game-Template");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void play(String name){
        mainController.createPlayer(name);

        this.getContentPane().removeAll();
        this.getContentPane().invalidate();

        this.gamePanel = new GamePanelHandler(mainController, this).getPanel();

        this.getContentPane().add(gamePanel);
        this.getContentPane().revalidate();
    }

    public void end(){
        this.getContentPane().removeAll();
        this.getContentPane().invalidate();

        this.endPanel = new EndPanelHandler(this, mainController).getPanel();

        this.getContentPane().add(endPanel);
        this.getContentPane().revalidate();
    }

    //TODO Niklas: Panel für Highscore anlegen und über die MainView aufrufbar machen
}
