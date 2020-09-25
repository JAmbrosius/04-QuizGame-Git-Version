package control;

import model.Player;

public class MainController {

    //Referenzen
    private Player player;
    private QuestionHandler questionHandler;
    private String rightAnswer;

    public MainController(){
        questionHandler = new QuestionHandler();
    }

    public void createPlayer(String name){
        player = new Player(name);
    }

    public String getPlayerName(){
        return player.getName();
    }

    public int getPlayerLevel(){
        return player.getLevel();
    }

    //TODO Schreiben und Lesen der Spielerpunkte hinzufügen

    //TODO Auslesen des Spieldatums+Uhrzeit hinzufügen

    public String[] getQuestionAndAnswers(){
        String[] question = questionHandler.getRandomQuestions(getPlayerLevel());

        String[] output = new String[5];
        output[0] = question[0];
        output[1] = question[1];
        output[2] = question[2];
        output[3] = question[3];
        output[4] = question[4];

        rightAnswer = question[5];

        return output;
    }

    public boolean answer(String chosenAnswer){
        if(chosenAnswer.equals(rightAnswer)){
            player.setLevel(getPlayerLevel() + 1);
            return true;
        }
        return false;
    }

    //TODO Highscore verwalten über eine *.txt-Datei

    //TODO 50/50-Joker einsetzen mit Punkt-Reduktion beim player-Objekt
}
