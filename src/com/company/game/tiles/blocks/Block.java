package com.company.game.tiles.blocks;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import com.company.game.util.Vector2f;
import com.company.game.util.AABB;


public abstract class Block {
    protected int w;
    protected int h;

    protected BufferedImage img;
    protected Vector2f pos;

    public Block(int w, int h, BufferedImage img, Vector2f pos) {
        this.w = w;
        this.h = h;
        this.img = img;
        this.pos = pos;
    }
    public abstract boolean update(AABB p);

    public void render(Graphics2D g){
        g.drawImage(img, (int)pos.getWorldVar().x,(int)pos.getWorldVar().y, w, h, null);
    }
}
