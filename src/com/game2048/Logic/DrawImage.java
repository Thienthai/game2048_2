package com.game2048.Logic;

import com.game2048.Constants;
import com.game2048.Controller.DrawUtils;
import com.game2048.Model.*;
import com.game2048.Model.Point;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by praewpatjiradecha on 9/16/2017 AD.
 */
public class DrawImage {

    private BufferedImage tileImage;
    private Color background;
    private Color text;
    private boolean canCombine = true;
    private Font font;
    private Tile tile;
    private Point slideTo;

    public Point getSlideTo() {
        return slideTo;
    }

    public void setSlideTo(Point slideTo) {
        this.slideTo = slideTo;
    }

    private void setTile(int value, int x, int y){
        Tile tile = new Tile(value, x, y);
        slideTo = new com.game2048.Model.Point(x,y);
        tileImage = new BufferedImage(Constants.WIDTH,Constants.HEIGHT,BufferedImage.TYPE_INT_RGB);
    }

    private void drawImage(){
        Graphics2D g = (Graphics2D)tileImage.getGraphics();

        int value = tile.getValue();
        if(value == 2){
            background = new Color(0xe9e9e9);
            text = new Color(0x000000);
        }else if(value == 4){
            background = new Color(0xe6daab);
            text = new Color(0x000000);
        }else if(value == 8){
            background = new Color(0xf79d3d);
            text = new Color(0xffffff);
        }else if(value == 16){
            background = new Color(0xf28007);
            text = new Color(0xffffff);
        }else if(value == 32){
            background = new Color(0xf55e3b);
            text = new Color(0xffffff);
        }else if(value == 64){
            background = new Color(0xff0000);
            text = new Color(0xffffff);
        }else if(value == 128){
            background = new Color(0xe9de84);
            text = new Color(0xffffff);
        }else if(value == 256){
            background = new Color(0xf6e873);
            text = new Color(0xffffff);
        }else if(value == 512){
            background = new Color(0xf5e555);
            text = new Color(0xffffff);
        }else if(value == 1024){
            background = new Color(0xf7e12c);
            text = new Color(0xffffff);
        }else if(value == 2048){
            background = new Color(0xffe400);
            text = new Color(0xffffff);
        }else{
            background = Color.black;
            text = Color.white;
        }

        g.setColor(new Color(0,0,0,0));
        g.fillRect(0,0, Constants.WIDTH,Constants.HEIGHT);

        g.setColor(background);
        g.fillRoundRect(0,0,Constants.WIDTH,Constants.HEIGHT,Constants.ARC_WIDTH,Constants.ARC_HEIGHT);

        g.setColor(text);

        if(value <= 64){
            font = Game.main.deriveFont(36f);
        }else{
            font = Game.main;
        }
        g.setFont(font);

        int drawX = Constants.WIDTH / 2 - DrawUtils.getMessageWidth(""+value,font,g)/2;
        int drawY = Constants.HEIGHT / 2 + DrawUtils.getMessageHeight(""+value,font,g)/2;
        g.drawString(""+value,drawX,drawY);
        g.dispose();
    }

    public void update(){

    }

    public void render(Graphics2D g){
        g.drawImage(tileImage, tile.getX(), tile.getY(), null);
    }

    public boolean canCombine(){
        return canCombine;
    }

    public void setCanCombine(boolean canCombine){
        this.canCombine = canCombine;
    }
}
