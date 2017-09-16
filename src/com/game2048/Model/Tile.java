package com.game2048.Model;

import java.awt.*;
import java.awt.image.BufferedImage;

import com.game2048.Constants;
import com.game2048.Controller.DrawUtils;

public class Tile {



    private int value;
    private BufferedImage tileImage;



    private int x;
    private int y;


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Tile(){}

    public Tile(int value, int x, int y){
        this.value = value;
        this.x = x;
        this.y = y;
    }


    public void update(){}

    public int getValue(){
        return value;
    }

    public void setValue(int value){
        this.value = value;
    }



}
