package model;

public class LevelQuestions {

    private Question[] questions;

    public LevelQuestions(int level){
        createQuestions(level);
    }

    public Question getRandomQuestion(){
        int random = (int)(Math.random()*questions.length);
        Question q = questions[random];
        return q;
    }

    private void createQuestions(int level){
        if(level == 1){
            //TODO Hendrik: Fragen hinzufügen
            questions = new Question[1];
            String[] answers1 = new String[4];
            answers1[0] = "HG";
            answers1[1] = "GadsA";
            answers1[2] = "KKG";
            answers1[3] = "STG";
            questions[0] = new Question("An welcher Schule findet der Info-LK statt?",answers1,"C");
        }else if(level == 2){
            //TODO Hendrik: Fragen hinzufügen
            questions = new Question[1];
            String[] answers1 = new String[4];
            answers1[0] = "HG";
            answers1[1] = "GadsA";
            answers1[2] = "KKG";
            answers1[3] = "STG";
            questions[0] = new Question("An welcher Schule findet der Info-LK statt?",answers1,"C");
        }else if(level == 3){
            //TODO Robin: Fragen hinzufügen
            questions = new Question[4];
            String[] answers1 = new String[4];
            answers1[0] = "Blutausfluss aus Ohren und Nase";
            answers1[1] = "Bittermandelgeruch";
            answers1[2] = "verblassende Pupillen";
            answers1[3] = "A & B";
            //50/50-joker...
            questions[0] = new Question("Was ist neben der Verfärbung von Lippen und Fingernägeln ein Anzeichen einer Zyankalivergiftung?",answers1,"B");

            String[] answers2 = new String[4];
            answers1[0] = "1";
            answers1[1] = "2";
            answers1[2] = "3";
            answers1[3] = "4";
            questions[1] = new Question("Test?",answers2,"A");

            String[] answers3 = new String[4];
            answers1[0] = "78";
            answers1[1] = "56";
            answers1[2] = "52";
            answers1[3] = "22";
            questions[2] = new Question("Wieviele Karten befinden sich in einem Tarot-Deck?",answers3,"A");

            String[] answers4 = new String[4];
            answers1[0] = "1a";
            answers1[1] = "2b";
            answers1[2] = "3c";
            answers1[3] = "4d";
            questions[3] = new Question("...?",answers4,"A");

        }else if(level == 4){
            //TODO Robin: Fragen hinzufügen
            questions = new Question[1];
            String[] answers1 = new String[4];
            answers1[0] = "24-48";
            answers1[1] = "2-4";
            answers1[2] = "2-48";
            answers1[3] = "26-52";
            questions[0] = new Question("Nach ca. wie viel Stunden nach dem Tod lösst sich die Leichenstarre?",answers1,"A");

        }else if(level == 5){
            //TODO Niklas: Fragen hinzufügen -- erledigt
            questions = new Question[1];
            String[] answers1 = new String[4];
            answers1[0] = "E=mc²";
            answers1[1] = "a²+b²=c²";
            answers1[2] = "a²*b²=c²";
            answers1[3] = "Was ist das?";
            questions[0] = new Question("Wie lautet der Satz des Pythagoras?",answers1,"B");
        }else if(level == 6){
            //TODO Leyla: Fragen hinzufügen
            questions = new Question[1];
            String[] answers1 = new String[4];
            answers1[0] = "HG";
            answers1[1] = "GadsA";
            answers1[2] = "KKG";
            answers1[3] = "STG";
            questions[0] = new Question("An welcher Schule findet der Info-LK statt?",answers1,"C");
        }else if(level == 7){
            //TODO Marie: Fragen hinzufügen
            questions = new Question[1];
            String[] answers1 = new String[4];
            answers1[0] = "mit horizontalen Pupillen";
            answers1[1] = "keine Ahnung so komische halt";
            answers1[2] = "mit vertikalen Pupillen";
            answers1[3] = "Ziegen machen mir Angst";
            questions[0] = new Question("Was für Augen haben Ziegen?",answers1,"A");
        }else if(level == 8){
            //TODO Kacper: Fragen hinzufügen
            questions = new Question[1];
            String[] answers1 = new String[4];
            answers1[0] = "HG";
            answers1[1] = "GadsA";
            answers1[2] = "KKG";
            answers1[3] = "STG";
            questions[0] = new Question("An welcher Schule findet der Info-LK statt?",answers1,"C");
        }else if(level == 9){
            //TODO Mohammed: Fragen hinzufügen
            questions = new Question[1];
            String[] answers1 = new String[4];
            answers1[0] = "HG";
            answers1[1] = "GadsA";
            answers1[2] = "KKG";
            answers1[3] = "STG";
            questions[0] = new Question("An welcher Schule findet der Info-LK statt?",answers1,"C");
        }else if(level == 10){
            //TODO Emre: Fragen hinzufügen
            questions = new Question[1];
            String[] answers1 = new String[4];
            answers1[0] = "HG";
            answers1[1] = "GadsA";
            answers1[2] = "KKG";
            answers1[3] = "STG";
            questions[0] = new Question("An welcher Schule findet der Info-LK statt?",answers1,"C");
        }else if(level == 11){
            //TODO Ömer: Fragen hinzufügen
            questions = new Question[1];
            String[] answers1 = new String[4];
            answers1[0] = "Ja";
            answers1[1] = "Nein";
            answers1[2] = "Nur wenn man nicht hinguckt";
            answers1[3] = "Ich weiß es nicht";
            questions[0] = new Question("Kann ein Baum fliegen ?",answers1,"B");
        }else if(level == 12){
            //TODO Ambro: Fragen hinzufügen
            questions = new Question[1];
            String[] answers1 = new String[4];
            answers1[0] = "HG";
            answers1[1] = "GadsA";
            answers1[2] = "KKG";
            answers1[3] = "STG";
            questions[0] = new Question("An welcher Schule findet der Info-LK statt?",answers1,"C");
        }else if(level == 13){
            //TODO Ambro: Fragen hinzufügen
            questions = new Question[1];
            String[] answers1 = new String[4];
            answers1[0] = "HG";
            answers1[1] = "GadsA";
            answers1[2] = "KKG";
            answers1[3] = "STG";
            questions[0] = new Question("An welcher Schule findet der Info-LK statt?",answers1,"C");
        }else if(level == 14){
            //TODO Ambro: Fragen hinzufügen
            questions = new Question[1];
            String[] answers1 = new String[4];
            answers1[0] = "Direktes Internet";
            answers1[1] = "Proxy";
            answers1[2] = "Windows-Zugangssperre";
            answers1[3] = "Bios-Passwort";
            questions[0] = new Question("Was muss in den Info-Räumen eingestellt sein, damit Git läuft?",answers1,"A");
        }else if(level == 15){
            //TODO Ambro: Fragen hinzufügen
            questions = new Question[1];
            String[] answers1 = new String[4];
            answers1[0] = "HG";
            answers1[1] = "GadsA";
            answers1[2] = "KKG";
            answers1[3] = "STG";
            questions[0] = new Question("An welcher Schule findet der Info-LK statt?",answers1,"C");
        }
    }
}
