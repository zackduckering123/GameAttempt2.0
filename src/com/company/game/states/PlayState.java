package com.company.game.states;

import com.company.game.entity.Player;
import com.company.game.graphics.Font;
import com.company.game.graphics.Sprite;
import com.company.game.util.KeyHandler;
import com.company.game.util.MouseHandler;
import com.company.game.util.Vector2f;

import java.awt.*;

public class PlayState extends GameState{
    private Font font;
    private Player player;

    public PlayState(GameStateManager gsm){
        super(gsm);
        font = new Font("font/fontsheet.png", 16, 16);
        player = new Player(new Sprite("entity/playerSheet.png"), new Vector2f(300,300),80);
    }

    public void update(){
        player.update();
    }

    public void input(MouseHandler mouse, KeyHandler key) {
        player.input(mouse,key);
    }

    public void render(Graphics2D g){
        Sprite.drawArray(g, font, "THE GAME WORKS", new Vector2f(100,100), 32,32,32,0);
        player.render(g);
    }
}
