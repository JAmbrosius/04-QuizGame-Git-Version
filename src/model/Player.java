package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Player {

    //TODO Emin: Model um erreichte Punkte und ein Spieldatum+Uhrzeit erweitern Edit: Fertig

    private String name;
    private int level;
    private int punkte;
    private SimpleDateFormat datumzeit;
    private Date dnow;
    //Kommentar


    public Player(String name){
        this.datumzeit=new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        this.dnow=new Date();
        this.name = name;
        this.level = 1;
        this.punkte=0;
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

    public void setPunkte(int punkte) {
        this.punkte = punkte;
    }

    public String getDatumzeit() {
        String datumzeit1 = datumzeit.format(dnow);
        System.out.println("");
        return datumzeit1;
    }

    public int getPunkte() {
        return punkte;
    }
}
