package entity;

import java.awt.image.BufferedImage;

public class Entity {
    //this is the super class for players
    public int x,y;
    public int speed;

    public BufferedImage up1,up2,down1,down2,left1,left2,right1,right2;
    public String direction;


    public int spriteCounter = 0;
    public int spriteNum = 1;

    //again coordinates and movement speed defined
}
