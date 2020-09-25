package view;

import control.MainController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamePanelHandler {
    private JPanel panel;
    private JLabel playerName;
    private JLabel playerLevel;
    private JTextArea questionArea;
    private JButton answerA;
    private JButton answerB;
    private JButton answerC;
    private JButton answerD;
    private JTextArea moderator;

    private MainController mainController;

    public GamePanelHandler(MainController mainController){
        this.mainController = mainController;
        playerName.setText(mainController.getPlayerName());
        playerLevel.setText(String.valueOf(mainController.getPlayerLevel()));
        createButtons();

        updateQuestionAndAnswers();
        moderator.setText("Hallo " + playerName.getText() + "! Herzlich willkommen beim Quiz-Game! \nIch wünsche viel Erfolg. \n\nBeantworte die erste Frage!");

    }

    public JPanel getPanel(){
        return panel;
    }

    private void createButtons(){
        answerA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleAnswer("A");
            }
        });
        answerB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleAnswer("B");
            }
        });
        answerC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleAnswer("C");
            }
        });
        answerD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleAnswer("D");
            }
        });
    }

    /**
     * Eine neue Frage samt Antworten wird vom MainController-Objekt herangezogen.
     * Die Informationen werden an die passenden Stellen im Panel geschrieben.
     */
    public void updateQuestionAndAnswers(){
        String[] qA = mainController.getQuestionAndAnswers();
        questionArea.setText(qA[0]);
        answerA.setText(qA[1]);
        answerB.setText(qA[2]);
        answerC.setText(qA[3]);
        answerD.setText(qA[4]);
    }

    /**
     * Wird von jedem Button mit der entsprechenden Antwort aufgerufen.
     * Die Antwort wird an das MainController-Objekt weitergeleitet.
     * Bei einer richtigen Antwort wird der Nutzer beglückwünscht und eine neue Frage herangezogen.
     * Bei einer falschen Antwort werden die Buttons ausgeschaltet und der Moderator verkündet das Ende.
     * @param answer
     */
    public void handleAnswer(String answer){
        if(mainController.answer(answer)){ //Falls Antwort korrekt, dann..
            moderator.setText("Richtig! Auf zur nächsten Frage!");
            playerLevel.setText(String.valueOf(mainController.getPlayerLevel()));
            updateQuestionAndAnswers();     //Unbedingt die GUI aktualisieren!
        }else{  //sonst werden die Knöpfe ausgeschaltet etc.
            answerA.setEnabled(false);
            answerB.setEnabled(false);
            answerC.setEnabled(false);
            answerD.setEnabled(false);
            moderator.setText("Schade, du hast verloren.");
        }
    }

    //TODO View um eine Punkteanzeige und eine Progressbar erweitern
}
