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
    private JLabel playerScore;
    private JProgressBar progressBar1;
    private JButton button5050;

    private MainController mainController;
    private MainView mainView;

    public GamePanelHandler(MainController mainController, MainView mainView){
        this.mainController = mainController;
        this.mainView = mainView;
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
        //TODO Niclas: Knöpfe für 50/50 mit passendem Aufruf beim MainController (Methoden im MC schreibt Max)
        button5050.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] abc;
                abc = new String[4];
                abc[0] = "A";
                abc[1] = "B";
                abc[2] = "C";
                abc[3] = "D";
                String answersF[] = mainController.useJoker(abc);
                button5050.setVisible(false);
                answerA.setVisible(false);
                answerB.setVisible(false);
                answerC.setVisible(false);
                answerD.setVisible(false);
                for (int i = 0; i < 2; i++) {
                    if (answersF[i].equals("A")) {
                        answerA.setVisible(true);
                    }
                    if (answersF[i].equals("B")) {
                        answerB.setVisible(true);
                    }
                    if (answersF[i].equals("C")) {
                        answerC.setVisible(true);
                    }
                    if (answersF[i].equals("D")) {
                        answerD.setVisible(true);
                    }
                }
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
        answerA.setVisible(true);
        answerB.setVisible(true);
        answerC.setVisible(true);
        answerD.setVisible(true);
        answerA.setText(qA[1]);
        answerB.setText(qA[2]);
        answerC.setText(qA[3]);
        answerD.setText(qA[4]);

        updateGui();
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
            if(mainController.getPlayerLevel()<=15) {
                updateQuestionAndAnswers();     //Unbedingt die GUI aktualisieren!
            }else{
                mainView.end();
            }
        }else{  //sonst werden die Knöpfe ausgeschaltet etc.
            answerA.setEnabled(false);
            answerB.setEnabled(false);
            answerC.setEnabled(false);
            answerD.setEnabled(false);
            moderator.setText("Schade, du hast verloren.");

            mainView.end();
        }
    }

    //TODO Simon: View um eine Punkteanzeige und eine Progressbar erweitern // Fertig
    public void updateGui(){
        if(mainController.getPlayerLevel()<progressBar1.getMaximum()) {
            progressBar1.setValue(mainController.getPlayerLevel() - 1);
        }else{
            progressBar1.setValue(progressBar1.getMaximum());
        }
        playerScore.setText(String.valueOf(mainController.getPlayerpoints()));
    }

}
