package control;

import model.Player;

import java.util.Arrays;

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

    //TODO Marie: Schreiben und Lesen der Spielerpunkte hinzufügen
    public void setPlayerpoints(int p) {player.setPunkte(p);}

    public int getPlayerpoints(){return player.getPunkte();}

    //TODO Leyla: Auslesen des Spieldatums+Uhrzeit hinzufügen
    public String getPlayerDatumZeit(){
        return player.getDatumzeit();
    }
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

    //TODO Erik: Highscore verwalten über eine *.txt-Datei

    private static String[] push(String[] array, String push) {
        String[] longer = new String[array.length + 1];
        System.arraycopy(array, 0, longer, 0, array.length);
        longer[array.length] = push;
        return longer;
    }

    //TODO Max: 50/50-Joker einsetzen mit Punkt-Reduktion beim player-Objekt
    public String[] useJoker(String rightAnswer, String[] answers) {
        String[] questionsWithoutRA = new String[3];
        for(String a: answers) {
            if(!a.equals(rightAnswer)) {
                push(questionsWithoutRA, a);
            }
        }
        player.setPoints(player.getPoints() - player.getLevel() / 2);
        return new String[] {rightAnswer, questionsWithoutRA[(int)Math.round(Math.random()*3)]};
    }
}
