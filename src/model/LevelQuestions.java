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
            //TODO Hendrik: Fragen hinzufügen --Done--
            //Frage 1.1
            questions = new Question[5];
            String[] answers1 = new String[4];
            answers1[0] = "Ulf";
            answers1[1] = "10";
            answers1[2] = "55";
            answers1[3] = "25";
            questions[0] = new Question("Was ist 5+5?",answers1,"B");
            //Frage 1.2
            String[] answers2 = new String[4];
            answers2[0] = "4";
            answers2[1] = "8";
            answers2[2] = "16";
            answers2[3] = "44";
            questions[1] = new Question("Was ist 4^2?",answers2,"C");
            //Frage 1.3
            String[] answers3 = new String[4];
            answers3[0] = "g(x)=f(x+5)";
            answers3[1] = "g(x)=f(x)+5";
            answers3[2] = "g(x)=f(x)*5";
            answers3[3] = "g(x)=f(x*5)";
            questions[2] = new Question("Wie verschiebt man eine Funktion f um 5 Einheiten nach links?",answers3,"A");
            //Frage 1.4
            String[] answers4 = new String[4];
            answers4[0] = "Modell: Machen; View: Zeigen; Controller: Kontrollieren;";
            answers4[1] = "Modell: Speichern; View: Anzeigen; Controller: Verarbeitung";
            answers4[2] = "MVC: Mit viel Creativität";
            answers4[3] = "MVC: Möglichst viel Coden";
            questions[3] = new Question("Wie funktioniert das MVC-Modell?",answers4,"B");
            //Frage 1.5
            String[] answers5 = new String[4];
            answers5[0] = "Einleitung; Hauptteil; Schluss";//Alles
            answers5[1] = "Einleitung; Argumentation; Fazit";//Erörterung
            answers5[2] = "Text; Fazit";
            answers5[3] = "Ping-Pong oder Sanduhr";//Comment
            questions[4] = new Question("Wie ist jeder Text in jedem Fach aufgebaut?",answers5,"A");
        }else if(level == 2){
            //TODO Hendrik: Fragen hinzufügen --Done--
            questions = new Question[5];
            //Frage 2.1
            String[] answers1 = new String[4];
            answers1[0] = "Bei einem rechtwinkligen Dreieck";
            answers1[1] = "Bei einem gleichschenkligen Dreieck";
            answers1[2] = "Bei jedem Dreieck";
            answers1[3] = "Immer";
            questions[0] = new Question("Wann gilt der Satz des Pythagoras?",answers1,"A");
            //Frage 2.2
            String[] answers2 = new String[4];
            answers2[0] = "Herr Ambrosius";
            answers2[1] = "Frau Spickebom";
            answers2[2] = "Herr Kneblewski";
            answers2[3] = "Frau Bartels";
            questions[1] = new Question("Welcher Lehrer im KKG stellt die besten Klausuren? (Laut Wahl in Abizeitschrift 2016)",answers2,"A");
            //Frage 2.3
            String[] answers3 = new String[4];
            answers3[0] = "Force=mass+acceleration";
            answers3[1] = "Force=mass*acceleration";
            answers3[2] = "Kraft=volumen*beschleunigung";
            answers3[3] = "K=v^2";
            questions[2] = new Question("Was für eine Gleichung wird in der Regel für die Berechnung der Stärke einer Kraft genutzt?",answers3,"B");
            //Frage 2.4
            String[] answers4 = new String[4];
            answers4[0] = "x1/2=-p/2+-sqrt((p/2)^2-q)";
            answers4[1] = "x1/2=-p/2+-sqrt((p/2)^2+q)";
            answers4[2] = "x1/2=-p/2+-sqrt((p/2)^2-q)";
            answers4[3] = "c^2=p*q";
            questions[3] = new Question("Wie lautet die p-q-Formel?",answers4,"C");
            //Frage 2.5
            String[] answers5 = new String[4];
            answers5[0] = "A B C D E F G";
            answers5[1] = "C D E F G H I";
            answers5[2] = "E F G H I J K";
            answers5[3] = "G H I J K L M";
            questions[4] = new Question("Welcher der Buchstaben-Sätze gibt die Notennamen in der Musik an? (Englische Schreibweise)",answers5,"A");
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
            //TODO Niklas: Fragen hinzufügen
            questions = new Question[1];
            String[] answers1 = new String[4];
            answers1[0] = "HG";
            answers1[1] = "GadsA";
            answers1[2] = "KKG";
            answers1[3] = "STG";
            questions[0] = new Question("An welcher Schule findet der Info-LK statt?",answers1,"C");
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
