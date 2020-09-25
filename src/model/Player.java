package model;

public class Player {

    //TODO Model um erreichte Punkte und ein Spieldatum+Uhrzeit erweitern

    private String name;
    private int level;

    public Player(String name){
        this.name = name;
        this.level = 1;
    }

    public String getName(){
        return name;
    }

    public int getLevel(){
        return level;
    }

    public void setLevel(int newLevel){
        level = newLevel;
    }
}
