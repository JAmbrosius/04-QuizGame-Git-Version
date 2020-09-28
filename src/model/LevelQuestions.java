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
            questions = new Question[1];
            String[] answers1 = new String[4];
            answers1[0] = "HG";
            answers1[1] = "GadsA";
            answers1[2] = "KKG";
            answers1[3] = "STG";
            questions[0] = new Question("An welcher Schule findet der Info-LK statt?",answers1,"C");
        }else if(level == 4){
            //TODO Robin: Fragen hinzufügen
            questions = new Question[1];
            String[] answers1 = new String[4];
            answers1[0] = "HG";
            answers1[1] = "GadsA";
            answers1[2] = "KKG";
            answers1[3] = "STG";
            questions[0] = new Question("An welcher Schule findet der Info-LK statt?",answers1,"C");
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
            answers1[0] = "HG";
            answers1[1] = "GadsA";
            answers1[2] = "KKG";
            answers1[3] = "STG";
            questions[0] = new Question("An welcher Schule findet der Info-LK statt?",answers1,"C");
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
            answers1[0] = "HG";
            answers1[1] = "GadsA";
            answers1[2] = "KKG";
            answers1[3] = "STG";
            questions[0] = new Question("An welcher Schule findet der Info-LK statt?",answers1,"C");
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
            answers1[0] = "HG";
            answers1[1] = "GadsA";
            answers1[2] = "KKG";
            answers1[3] = "STG";
            questions[0] = new Question("An welcher Schule findet der Info-LK statt?",answers1,"C");
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
