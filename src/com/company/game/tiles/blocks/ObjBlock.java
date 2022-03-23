package com.company.game.tiles.blocks;

import com.company.game.util.AABB;
import com.company.game.util.Vector2f;

import java.awt.*;
import java.awt.image.BufferedImage;

public class ObjBlock extends Block{

    public ObjBlock(int w, int h, BufferedImage img, Vector2f pos) {
        super(w, h, img, pos);
    }

    @Override
    public boolean update(AABB p) {
        return true;
    }

    @Override
    public void render(Graphics2D g) {
        super.render(g);
        g.setColor(Color.white);
        g.drawRect((int)pos.getWorldVar().x,(int)pos.getWorldVar().y, w, h);
    }
}
