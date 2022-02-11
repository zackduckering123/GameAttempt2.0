package com.company.game.states;

import com.company.game.graphics.Font;
import com.company.game.util.KeyHandler;
import com.company.game.util.MouseHandler;

import java.awt.*;

public class PlayState extends GameState{
    private  Font font;

    public PlayState(GameStateManager gsm){
        super(gsm);
font = new Font("font/fontSheet.png.png", 16, 16);
    }

    public void update(){

    }

    public void input(MouseHandler mouse, KeyHandler key) {
        if(key.up.down){
            System.out.println("'W' is being pressed");
        }
    }

    public void render(Graphics2D g){


    }
}
