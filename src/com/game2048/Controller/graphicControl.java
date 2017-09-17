package com.game2048.Controller;

import com.game2048.Model.CreateGraphic;
import com.game2048.Model.Tile;

import java.awt.*;
import java.awt.image.BufferedImage;

public class graphicControl {
    public void controlCreateGraphic(BufferedImage gameBoard){
        CreateGraphic create = new CreateGraphic();
        create.createBoardImage(gameBoard);
    }

    public void controlRender(Graphics2D g, BufferedImage finalBoard, Tile[][] board, BufferedImage gameBoard, int x, int y){
        CreateGraphic create = new CreateGraphic();
        create.GraphicRender(g,finalBoard,board,gameBoard,x,y);
    }
}
