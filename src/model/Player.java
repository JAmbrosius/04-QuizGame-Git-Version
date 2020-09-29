package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Player {

    //TODO Emin: Model um erreichte Punkte und ein Spieldatum+Uhrzeit erweitern Edit: Fertig

    private String name;
    private int level;
    private int points;
    private SimpleDateFormat datumzeit;
    private Date dnow;
    //Kommentar


    public Player(String name){
        this.datumzeit=new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        this.dnow=new Date();
        this.name = name;
        this.level = 1;
        this.points =0;
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

    public void setPoints(int points) {
        this.points = points;
    }

    public String getDatumzeit() {
        String datumzeit1 = datumzeit.format(dnow);
        System.out.println("");
        return datumzeit1;
    }

    public int getPoints() {
        return points;
    }
}
